package mx.izzi.admintool.business.impl;

import java.sql.Timestamp;
import java.util.Calendar;

import org.apache.log4j.Logger;

import mx.izzi.admintool.business.IRDBusiness;
import mx.izzi.admintool.dao.IRDCommandsDAO;
import mx.izzi.admintool.dblog.business.impl.LogUserOperationBusinessImpl;
import mx.izzi.admintool.dblog.dto.LogUserOperationDTO;
import mx.izzi.admintool.exception.NDSTransformationTVIException;
import mx.izzi.admintool.util.NDSTransformationTVI;
import tv.mirada.www.iris.core.ird.messages.RestoreClass;
import tv.mirada.www.iris.core.types.CustomerPremisesEquipment;

public class IRDBusinessImpl extends LogUserOperationBusinessImpl implements IRDBusiness {

	private Logger logger= Logger.getLogger(this.getClass());

	private IRDCommandsDAO iRDCommandsDAO = null;

	@Override
	public void resetPin(String hardwareId, String node) throws NDSTransformationTVIException{
		if(hardwareId.length() == 16){
			if(node.equals("mty")){
				hardwareId = NDSTransformationTVI.createNDSChipID(hardwareId);
			}
			iRDCommandsDAO.resetPin(hardwareId, node);
		}
	}
	
	@Override
	public void enableCPE(CustomerPremisesEquipment equipo, String node, String user) throws NDSTransformationTVIException{
		if(equipo.getHardwareId().length() == 16){
			String hardwareId = equipo.getHardwareId();
			if(node.equals("mty")){
				hardwareId = NDSTransformationTVI.createNDSChipID(hardwareId);
			}
			enableSTB(hardwareId, node, user);
			rebootSTB(hardwareId, node, user);
		}
	}

	@Override
	public void enableSTB(String hardwareId, String node, String user) throws NDSTransformationTVIException{
		logger.debug("IRDBusinessImpl - enableSTB: " + hardwareId);
		if(hardwareId.length() == 16){
			if(node.equals("mty")){
				hardwareId = NDSTransformationTVI.createNDSChipID(hardwareId);
			}
			logUserOperation(new LogUserOperationDTO(user, "enableSTB", "enableSTB : " + hardwareId, new Timestamp(Calendar.getInstance().getTimeInMillis())));
			iRDCommandsDAO.enableSTB(hardwareId, node);
		}
	}

	@Override
	public void disableCPE(CustomerPremisesEquipment equipo, String node, String user) throws NDSTransformationTVIException{
		String hardwareId = equipo.getHardwareId();
		if(hardwareId.length() == 16){
			if(node.equals("mty")){
				hardwareId = NDSTransformationTVI.createNDSChipID(hardwareId);
			}
			disableSTB(hardwareId, node, user);
		}
	}

	@Override
	public void disableSTB(String hardwareId, String node, String user) throws NDSTransformationTVIException{
		logger.debug("IRDBusinessImpl - disableSTB: " + hardwareId);
		if(hardwareId.length() == 16){
			if(node.equals("mty")){
				hardwareId = NDSTransformationTVI.createNDSChipID(hardwareId);
			}
			logUserOperation(new LogUserOperationDTO(user, "disableSTB", "disableSTB : " + hardwareId, new Timestamp(Calendar.getInstance().getTimeInMillis())));
			iRDCommandsDAO.disableSTB(hardwareId, node);
		}
	}

	@Override
	public void sendMessage(String message, String hardwareId, boolean blocking, String node, String user) throws NDSTransformationTVIException{
		logger.debug("IRDBusinessImpl - sendMessage");
		if(node.equals("mty")){
			hardwareId = NDSTransformationTVI.createNDSChipID(hardwareId);
		}
		iRDCommandsDAO.showOSDMessage(message, hardwareId, blocking, node);
	}

	@Override
	public void rebootSTB(String hardwareId, String node, String user) throws NDSTransformationTVIException{
		logger.debug("IRDBusinessImpl - rebootSTB");
		if(node.equals("mty")){
			hardwareId = NDSTransformationTVI.createNDSChipID(hardwareId);
		}
		iRDCommandsDAO.rebootSTB(hardwareId, node);
	}

	@Override
	public void restoreSTB(String hardwareId, String restoreClass, String node, String user) throws NDSTransformationTVIException{
		logger.debug("IRDBusinessImpl - restoreSTB");
		if(node.equals("mty")){
			hardwareId = NDSTransformationTVI.createNDSChipID(hardwareId);
		}
		iRDCommandsDAO.restoreSTB(hardwareId, RestoreClass.fromValue(restoreClass), node);
	}

	public void setiRDCommandsDAO(IRDCommandsDAO iRDCommandsDAO) {
		this.iRDCommandsDAO = iRDCommandsDAO;
	}

}
