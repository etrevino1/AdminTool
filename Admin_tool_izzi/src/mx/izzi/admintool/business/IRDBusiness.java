package mx.izzi.admintool.business;

import tv.mirada.www.iris.core.types.CustomerPremisesEquipment;

public interface IRDBusiness {
	public void enableCPE(CustomerPremisesEquipment equipo, String node);
	public void enableSTB(String hardwareId, String node);
	public void disableCPE(CustomerPremisesEquipment equipo, String node);
	public void rebootSTB(String hardwareId, String node);
	public void restoreSTB(String hardwareId, String restoreClass, String node);
	public void sendMessage(String message, String hardwareId, boolean blocking, String node);
}
