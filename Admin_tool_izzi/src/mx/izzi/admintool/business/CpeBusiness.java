package mx.izzi.admintool.business;

import mx.izzi.admintool.exception.CPEException;
import tv.mirada.www.iris.core.types.CustomerPremisesEquipment;

public interface CpeBusiness {
	public boolean deleteCPE(String irisId, String node);
	public boolean addCPE(String account, String hardwareId, String type, String node);
	public CustomerPremisesEquipment findCPE(String hardwareId, String node) throws CPEException;
}
