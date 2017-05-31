package mx.izzi.admintool.business;

import mx.izzi.admintool.exception.CPEException;
import mx.izzi.admintool.exception.NDSTransformationTVIException;
import tv.mirada.www.iris.core.types.CustomerPremisesEquipment;

public interface CpeBusiness {
	public boolean deleteCPE(String irisId, String node, String user) throws NDSTransformationTVIException;
	public boolean addCPE(String account, String hardwareId, String type, String node, String user) throws NDSTransformationTVIException;
	public CustomerPremisesEquipment findCPE(String hardwareId, String node) throws CPEException, NDSTransformationTVIException;
}
