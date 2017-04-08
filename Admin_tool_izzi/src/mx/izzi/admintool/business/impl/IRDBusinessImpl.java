package mx.izzi.admintool.business.impl;

import org.apache.log4j.Logger;

import mx.izzi.admintool.business.IRDBusiness;
import mx.izzi.admintool.dao.IRDCommandsDAO;
import tv.mirada.www.iris.core.ird.messages.RestoreClass;
import tv.mirada.www.iris.core.types.CustomerPremisesEquipment;

public class IRDBusinessImpl implements IRDBusiness {

	private Logger logger= Logger.getLogger(this.getClass());
	
	private IRDCommandsDAO iRDCommandsDAO = null;

	@Override
	public void enableCPE(CustomerPremisesEquipment equipo, String node){
		if(equipo.getHardwareId().length() == 16){
			enableSTB(equipo.getHardwareId(), node);
			rebootSTB(equipo.getHardwareId(), node);
		}
	}
	
	@Override
	public void enableSTB(String hardwareId, String node){
		logger.debug("IRDBusinessImpl - enableSTB: " + hardwareId);
		if(hardwareId.length() == 16){
			iRDCommandsDAO.enableSTB(hardwareId, node);
		}
	}

	@Override
	public void disableCPE(CustomerPremisesEquipment equipo, String node){
		if(equipo.getHardwareId().length() == 16){
			iRDCommandsDAO.disableSTB(equipo.getHardwareId(), node);
		}
	}
	
	@Override
	public void sendMessage(String message, String hardwareId, boolean blocking, String node){
		logger.debug("IRDBusinessImpl - sendMessage");
		this.iRDCommandsDAO.showOSDMessage(message, hardwareId, blocking, node);
	}
	
	@Override
	public void rebootSTB(String hardwareId, String node){
		logger.debug("IRDBusinessImpl - rebootSTB");
		this.iRDCommandsDAO.rebootSTB(hardwareId, node);
	}
	
	public void restoreSTB(String hardwareId, String restoreClass, String node){
		logger.debug("IRDBusinessImpl - restoreSTB");
		iRDCommandsDAO.restoreSTB(hardwareId, RestoreClass.fromValue(restoreClass), node);
	}
	
	public void setiRDCommandsDAO(IRDCommandsDAO iRDCommandsDAO) {
		this.iRDCommandsDAO = iRDCommandsDAO;
	}

}
