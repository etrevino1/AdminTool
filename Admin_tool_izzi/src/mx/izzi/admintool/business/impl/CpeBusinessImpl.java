package mx.izzi.admintool.business.impl;

import org.apache.log4j.Logger;

import mx.izzi.admintool.business.CpeBusiness;
import mx.izzi.admintool.dao.CpeDAO;
import tv.mirada.www.iris.core.types.CustomerPremisesEquipment;

public class CpeBusinessImpl implements CpeBusiness {

	private Logger log = Logger.getLogger(this.getClass());
	
	private CpeDAO cpeDAO = null;
	
	@Override
	public boolean deleteCPE(String irisId, String node) {
		log.debug("Delete CPE:" + irisId);
		return this.cpeDAO.deleteCPE(irisId, node);
	}
	
	@Override
	public boolean addCPE(String account, String hardwareId, String type, String node) {
		log.debug("Add CPE:" + hardwareId);
		return this.cpeDAO.addCPE(account, hardwareId, type, node);
	}
	
	@Override
	public CustomerPremisesEquipment findCPE(String hardwareId, String node){
		log.debug("CpeBusinessImpl - findCPE: hardwareId: " + hardwareId + ", node: " + node);
		return cpeDAO.findCPE(hardwareId, node).getCustomerPremisesEquipment();
	}

	public void setCpeDAO(CpeDAO cpeDAO) {
		this.cpeDAO = cpeDAO;
	}

	
}
