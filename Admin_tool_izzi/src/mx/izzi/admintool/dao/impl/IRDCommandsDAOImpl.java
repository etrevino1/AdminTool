package mx.izzi.admintool.dao.impl;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import org.apache.axis.AxisFault;
import org.apache.log4j.Logger;

import mx.izzi.admintool.dao.IRDCommandsDAO;
import mx.izzi.admintool.util.DetermineNode;
import tv.mirada.www.iris.core.ird.messages.DisableSTBRequest;
import tv.mirada.www.iris.core.ird.messages.EnableSTBRequest;
import tv.mirada.www.iris.core.ird.messages.Message;
import tv.mirada.www.iris.core.ird.messages.RebootSTBRequest;
import tv.mirada.www.iris.core.ird.messages.ResetPINRequest;
import tv.mirada.www.iris.core.ird.messages.RestoreClass;
import tv.mirada.www.iris.core.ird.messages.RestoreSTBRequest;
import tv.mirada.www.iris.core.ird.messages.ShowOSDMessageRequest;
import tv.mirada.www.iris.core.types.IrdServiceLocator;
import tv.mirada.www.iris.core.types.IrdSoap11Stub;

public class IRDCommandsDAOImpl implements IRDCommandsDAO {

	private Logger log = Logger.getLogger(this.getClass());

	@Override
	public void resetPin(String hardwareId, String node){
		ResetPINRequest request = getResetPinRequest(hardwareId);
		try{
			getStub(node).resetPIN(request);
		}catch(RemoteException re){
			log.error(re.getMessage());
		}
	}

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
	public void disableSTB(String hardwareId, String node){
		DisableSTBRequest request = getDisableSTBRequest(hardwareId);
		try{
			getStub(node).disableSTB(request);
		}catch(RemoteException re){
			log.error(re.getMessage());
		}
		log.info("IRDCommandsDAOImpl - disableSTB: " + hardwareId);
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

	@Override
	public void showOSDMessage(String message, String hardwareId, boolean blocking, String node){
		ShowOSDMessageRequest request = getShowOSDMessageRequest(message, hardwareId, blocking);
		try{
			getStub(node).showOSDMessage(request);
		}catch(RemoteException re){
			log.error(re.getMessage());
		}
		log.info("IRDCommandsDAOImpl - showOSDMessage: " + hardwareId + ", " + message + ", " + node);
	}

	@Override
	public void restoreSTB(String hardwareId, RestoreClass restoreClass, String node){
		log.debug("IRDommandsDAO - restoreSTB" + restoreClass);
		RestoreSTBRequest request = getRestoreSTBRequest(hardwareId, restoreClass);
		try{
			getStub(node).restoreSTB(request);
		}catch(AxisFault af){
			log.error(af.getMessage());
			af.printStackTrace();
		}catch(RemoteException re){
			log.error(re.getMessage());
			re.printStackTrace();
		}
		log.info("IRDommandsDAO - restoreSTB: " + hardwareId + ", " + restoreClass.toString());
	}

	private ResetPINRequest getResetPinRequest(String hardwareId){
		return new ResetPINRequest(hardwareId, null, null);
	}

	private EnableSTBRequest getEnableSTBRequest(String hardwareId){
		return new EnableSTBRequest(hardwareId);
	}

	private DisableSTBRequest getDisableSTBRequest(String hardwareId){
		Short sh1 = 40;
		return new DisableSTBRequest(hardwareId, sh1, new Message[]{new Message("SPA", "Servicio suspendido. No tenemos registro de tu ultimo pago. Paga con el izzi app, em izzi.mx o llama al 01800 120 5000.")});
	}

	private RebootSTBRequest getRebootSTBRequest(String hardwareId){
		RebootSTBRequest request = new RebootSTBRequest();
		request.setHardwareId(hardwareId);
		return request;
	}

	private RestoreSTBRequest getRestoreSTBRequest(String hardwareId, RestoreClass restoreClass){
		return new RestoreSTBRequest(hardwareId, restoreClass);
	}

	private ShowOSDMessageRequest getShowOSDMessageRequest(String messageText, String hardwareId, boolean blocking){
		Short sh1 = 30;
		ShowOSDMessageRequest request = new ShowOSDMessageRequest(hardwareId, blocking, sh1, new Message[]{new Message("SPA", messageText)});
		return request;
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
