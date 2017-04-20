package mx.izzi.admintool.business;

import tv.mirada.www.iris.core.types.CustomerPremisesEquipment;

public interface IRDBusiness {
	public void enableCPE(CustomerPremisesEquipment equipo, String node, String user);
	public void enableSTB(String hardwareId, String node, String user);
	public void disableCPE(CustomerPremisesEquipment equipo, String node, String user);
	public void disableSTB(String hardwareId, String node, String user);
	public void rebootSTB(String hardwareId, String node, String user);
	public void restoreSTB(String hardwareId, String restoreClass, String node, String user);
	public void sendMessage(String message, String hardwareId, boolean blocking, String node, String user);
}
