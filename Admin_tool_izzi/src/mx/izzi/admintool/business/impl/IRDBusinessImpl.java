package mx.izzi.admintool.business.impl;

import java.sql.Timestamp;
import java.util.Calendar;

import org.apache.log4j.Logger;

import mx.izzi.admintool.business.IRDBusiness;
import mx.izzi.admintool.dao.IRDCommandsDAO;
import mx.izzi.admintool.dblog.business.impl.LogUserOperationBusinessImpl;
import mx.izzi.admintool.dblog.dto.LogUserOperationDTO;
import tv.mirada.www.iris.core.ird.messages.RestoreClass;
import tv.mirada.www.iris.core.types.CustomerPremisesEquipment;

public class IRDBusinessImpl extends LogUserOperationBusinessImpl implements IRDBusiness {

	private Logger logger= Logger.getLogger(this.getClass());

	private IRDCommandsDAO iRDCommandsDAO = null;

	@Override
	public void enableCPE(CustomerPremisesEquipment equipo, String node, String user){
		if(equipo.getHardwareId().length() == 16){
			enableSTB(equipo.getHardwareId(), node, user);
			rebootSTB(equipo.getHardwareId(), node, user);
		}
	}

	@Override
	public void enableSTB(String hardwareId, String node, String user){
		logger.debug("IRDBusinessImpl - enableSTB: " + hardwareId);
		if(hardwareId.length() == 16){
			logUserOperation(new LogUserOperationDTO(user, "enableSTB", "enableSTB : " + hardwareId, new Timestamp(Calendar.getInstance().getTimeInMillis())));
			iRDCommandsDAO.enableSTB(hardwareId, node);
		}
	}

	@Override
	public void disableCPE(CustomerPremisesEquipment equipo, String node, String user){
		if(equipo.getHardwareId().length() == 16){
			disableSTB(equipo.getHardwareId(), node, user);
		}
	}

	@Override
	public void disableSTB(String hardwareId, String node, String user){
		logger.debug("IRDBusinessImpl - disableSTB: " + hardwareId);
		if(hardwareId.length() == 16){
			logUserOperation(new LogUserOperationDTO(user, "disableSTB", "disableSTB : " + hardwareId, new Timestamp(Calendar.getInstance().getTimeInMillis())));
			iRDCommandsDAO.disableSTB(hardwareId, node);
		}
	}

	@Override
	public void sendMessage(String message, String hardwareId, boolean blocking, String node, String user){
		logger.debug("IRDBusinessImpl - sendMessage");
		iRDCommandsDAO.showOSDMessage(message, hardwareId, blocking, node);
	}

	@Override
	public void rebootSTB(String hardwareId, String node, String user){
		logger.debug("IRDBusinessImpl - rebootSTB");
		iRDCommandsDAO.rebootSTB(hardwareId, node);
	}

	@Override
	public void restoreSTB(String hardwareId, String restoreClass, String node, String user){
		logger.debug("IRDBusinessImpl - restoreSTB");
		iRDCommandsDAO.restoreSTB(hardwareId, RestoreClass.fromValue(restoreClass), node);
	}

	public void setiRDCommandsDAO(IRDCommandsDAO iRDCommandsDAO) {
		this.iRDCommandsDAO = iRDCommandsDAO;
	}

}
