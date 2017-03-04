package mx.izzi.admintool.dao.impl;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import org.apache.axis.AxisFault;
import org.apache.log4j.Logger;

import mx.izzi.admintool.dao.IRDCommandsDAO;
import mx.izzi.admintool.util.DetermineNode;
import tv.mirada.www.iris.core.ird.messages.EnableSTBRequest;
import tv.mirada.www.iris.core.ird.messages.RebootSTBRequest;
import tv.mirada.www.iris.core.types.IrdServiceLocator;
import tv.mirada.www.iris.core.types.IrdSoap11Stub;

public class IRDCommandsDAOImpl implements IRDCommandsDAO {

	private Logger log = Logger.getLogger(this.getClass());

	@Override
	public void enableSTB(String hardwareId) {
		enableSTB(hardwareId, "mex");
	}
	
	@Override
	public void enableSTB(String hardwareId, String node) {
		EnableSTBRequest request = getEnableSTBRequest(hardwareId);
		try{
			getStub(node).enableSTB(request);
		}catch(RemoteException re){
			log.error(re.getMessage());
		}
		log.info("IRDCommandsDAOImpl - enableSTB: " + hardwareId);
	}

	@Override
	public void rebootSTB(String hardwareId) {
		rebootSTB(hardwareId, "mex");
	}
	
	@Override
	public void rebootSTB(String hardwareId, String node) {
		RebootSTBRequest request = getRebootSTBRequest(hardwareId);

		try{
			getStub(node).rebootSTB(request);
		}catch(RemoteException re){
			log.error(re.getMessage());
		}
		log.info("IRDCommandsDAOImpl - rebootSTB: " + hardwareId);
	}

	private EnableSTBRequest getEnableSTBRequest(String hardwareId){
		return new EnableSTBRequest(hardwareId);
	}

	private RebootSTBRequest getRebootSTBRequest(String hardwareId){
		RebootSTBRequest request = new RebootSTBRequest();
		request.setHardwareId(hardwareId);
		return request;

	}

	private IrdSoap11Stub getStub(){
		return getStub("mex");
	}

	private IrdSoap11Stub getStub(String node){
		try{
			return new IrdSoap11Stub(new URL(DetermineNode.getService(node, "ird")), new IrdServiceLocator());
		}catch(AxisFault af){
			log.error(af.getMessage());
		}catch(MalformedURLException mURLe){
			log.error(mURLe.getMessage());
		}catch(Exception e){
			log.error(e.getMessage());
		}
		return null;
	}
}
