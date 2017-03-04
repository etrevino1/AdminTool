package mx.izzi.admintool.business.impl;

import java.util.List;

import mx.izzi.admintool.business.IRDBusiness;
import mx.izzi.admintool.business.SubscriberBusiness;
import mx.izzi.admintool.dao.IRDCommandsDAO;
import tv.mirada.www.iris.core.types.CustomerPremisesEquipment;

public class IRDBusinessImpl implements IRDBusiness {

	private IRDCommandsDAO iRDCommandsDAO = null;

	@Override
	public void activateCPE(CustomerPremisesEquipment equipo, String node){
		if(equipo.getHardwareId().length() == 16){
			iRDCommandsDAO.enableSTB(equipo.getHardwareId(), node);
			iRDCommandsDAO.rebootSTB(equipo.getHardwareId(), node);
		}
	}

	public void setiRDCommandsDAO(IRDCommandsDAO iRDCommandsDAO) {
		this.iRDCommandsDAO = iRDCommandsDAO;
	}
}
