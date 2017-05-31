package mx.izzi.admintool.business.impl;

import java.sql.Timestamp;
import java.util.Calendar;

import org.apache.log4j.Logger;

import mx.izzi.admintool.business.CpeBusiness;
import mx.izzi.admintool.dao.CpeDAO;
import mx.izzi.admintool.dblog.business.impl.LogUserOperationBusinessImpl;
import mx.izzi.admintool.dblog.dto.LogUserOperationDTO;
import mx.izzi.admintool.exception.CPEException;
import mx.izzi.admintool.exception.NDSTransformationTVIException;
import mx.izzi.admintool.util.NDSTransformationTVI;
import tv.mirada.www.iris.core.types.CustomerPremisesEquipment;

public class CpeBusinessImpl extends LogUserOperationBusinessImpl implements CpeBusiness {

	private Logger log = Logger.getLogger(this.getClass());
	
	private CpeDAO cpeDAO = null;
	
	@Override
	public boolean deleteCPE(String irisId, String node, String user) {
		log.debug("Delete CPE:" + irisId);
		logUserOperation(new LogUserOperationDTO(user, "delete", "delCPE: " + irisId, new Timestamp(Calendar.getInstance().getTimeInMillis())));
		return this.cpeDAO.deleteCPE(irisId, node);
	}
	
	@Override
	public boolean addCPE(String account, String hardwareId, String type, String node, String user) throws NDSTransformationTVIException{
		log.debug("Add CPE:" + hardwareId);
		if(node.equals("mty")){
			hardwareId = NDSTransformationTVI.createNDSChipID(hardwareId);
		}
		logUserOperation(new LogUserOperationDTO(user, "add", "addCPE: " + hardwareId, new Timestamp(Calendar.getInstance().getTimeInMillis())));
		return this.cpeDAO.addCPE(account, hardwareId, type, node);
	}
	
	@Override
	public CustomerPremisesEquipment findCPE(String hardwareId, String node) throws CPEException, NDSTransformationTVIException{
		log.debug("CpeBusinessImpl - findCPE: hardwareId: " + hardwareId + ", node: " + node);
		if(node.equals("mty")){
			hardwareId = NDSTransformationTVI.createNDSChipID(hardwareId);
		}
		return cpeDAO.findCPE(hardwareId, node).getCustomerPremisesEquipment();
	}

	public void setCpeDAO(CpeDAO cpeDAO) {
		this.cpeDAO = cpeDAO;
	}

	
}
