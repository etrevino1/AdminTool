package mx.izzi.admintool.dao;

import tv.mirada.www.iris.core.CPE.messages.FindCustomerPremisesEquipmentResponse;

public interface CpeDAO {
	public boolean deleteCPE(String irisId);
	public boolean addCPE(String account, String hardwareId, String type);
	
	public boolean deleteCPE(String irisId, String node);
	public boolean addCPE(String account, String hardwareId, String type, String node);
	
	public FindCustomerPremisesEquipmentResponse findCPE(String hardwareId, String node);
}
