package mx.izzi.admintool.business.impl;

import org.apache.log4j.Logger;

import mx.izzi.admintool.business.IRDBusiness;
import mx.izzi.admintool.dao.IRDCommandsDAO;
import tv.mirada.www.iris.core.types.CustomerPremisesEquipment;

public class IRDBusinessImpl implements IRDBusiness {

	private Logger logger= Logger.getLogger(this.getClass());
	
	private IRDCommandsDAO iRDCommandsDAO = null;

	@Override
	public void activateCPE(CustomerPremisesEquipment equipo, String node){
		if(equipo.getHardwareId().length() == 16){
			iRDCommandsDAO.enableSTB(equipo.getHardwareId(), node);
			iRDCommandsDAO.rebootSTB(equipo.getHardwareId(), node);
		}
	}

	@Override
	public void sendMessage(String message, String hardwareId, String node){
		logger.debug("IRDBusinessImpl - sendMessage");
		this.iRDCommandsDAO.showOSDMessage(message, hardwareId, node);
	}
	
	public void setiRDCommandsDAO(IRDCommandsDAO iRDCommandsDAO) {
		this.iRDCommandsDAO = iRDCommandsDAO;
	}
}
