package mx.izzi.admintool.dao.impl;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.GregorianCalendar;

import org.apache.axis.AxisFault;
import org.apache.log4j.Logger;

import mx.izzi.admintool.dao.CpeDAO;
import mx.izzi.admintool.util.DetermineNode;
import tv.mirada.www.iris.core.CPE.messages.CreateCustomerPremisesEquipmentRequest;
import tv.mirada.www.iris.core.CPE.messages.DeleteCustomerPremisesEquipmentRequest;
import tv.mirada.www.iris.core.CPE.messages.FindCustomerPremisesEquipmentRequest;
import tv.mirada.www.iris.core.CPE.messages.FindCustomerPremisesEquipmentResponse;
import tv.mirada.www.iris.core.types.CustomerPremisesEquipment;
import tv.mirada.www.iris.core.types.DevicesServiceLocator;
import tv.mirada.www.iris.core.types.DevicesSoap11Stub;
import tv.mirada.www.iris.core.types.OperatorSubscriberId;

public class CpeDAOImpl implements CpeDAO {

	private Logger log = Logger.getLogger(this.getClass());

	@Override
	public boolean deleteCPE(String irisId) {
		return deleteCPE(irisId, "mex");
	}

	@Override
	public boolean deleteCPE(String irisId, String node) {
		DeleteCustomerPremisesEquipmentRequest request = deleteCPERequest(irisId);

		try{
			getStub(node).deleteCustomerPremisesEquipment(request);
		}catch(RemoteException re){
			log.error(re.getMessage());
			return false;
		}
		return true;
	}

	@Override
	public boolean addCPE(String account, String hardwareId, String type) {
		return addCPE(account, hardwareId, type, "mex");
	}

	@Override
	public boolean addCPE(String account, String hardwareId, String type, String node) {
		CreateCustomerPremisesEquipmentRequest request = addCPERequest(account, hardwareId, type);

		try{
			getStub(node).createCustomerPremisesEquipment(request);
		}catch(RemoteException re){
			log.error(re.getMessage());
			return false;
		}

		return true;
	}

	@Override
	public FindCustomerPremisesEquipmentResponse findCPE(String hardwareId, String node){
		FindCustomerPremisesEquipmentRequest request = findCPERequest(hardwareId);
		try{
			return getStub(node).findCustomerPremisesEquipment(request);
		}catch(RemoteException re){
			log.error(re.getMessage());
		}
		return null;
	}

	private DeleteCustomerPremisesEquipmentRequest deleteCPERequest(String irisId){
		DeleteCustomerPremisesEquipmentRequest request = new DeleteCustomerPremisesEquipmentRequest();
		request.setIrisId(Long.parseLong(irisId));
		return request;
	}

	private CreateCustomerPremisesEquipmentRequest addCPERequest(String account, String hardwareId, String type){
		CreateCustomerPremisesEquipmentRequest request = new CreateCustomerPremisesEquipmentRequest();

		CustomerPremisesEquipment device = new CustomerPremisesEquipment();
		device.setHardwareId(hardwareId);
		device.setOperatorId(new OperatorSubscriberId("IZZI", account));
		device.setType(type);
		device.setCreationDatetime(new GregorianCalendar());

		request.setCustomerPremisesEquipment(device);
		return request;
	}

	private FindCustomerPremisesEquipmentRequest findCPERequest(String hardwareId){
		return new FindCustomerPremisesEquipmentRequest(null, hardwareId);
	}

	private DevicesSoap11Stub getStub(String node){
		DevicesSoap11Stub ds = null;

		try{
			ds = new DevicesSoap11Stub(new URL(DetermineNode.getService(node, "device")), new DevicesServiceLocator());
		}catch(MalformedURLException mURLE){
			log.error(mURLE.getMessage());
		}catch(AxisFault af){
			log.error(af.getMessage());
		}catch(Exception e){
			log.error(e.getMessage());
		}

		return ds;
	}
}
