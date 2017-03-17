package mx.izzi.admintool.business;

import tv.mirada.www.iris.core.types.CustomerPremisesEquipment;

public interface IRDBusiness {
	public void enableCPE(CustomerPremisesEquipment equipo, String node);
	public void disableCPE(CustomerPremisesEquipment equipo, String node);
	public void sendMessage(String message, String hardwareId, boolean blocking, String node);
}
