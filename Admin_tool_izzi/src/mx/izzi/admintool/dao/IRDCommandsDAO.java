package mx.izzi.admintool.dao;

import tv.mirada.www.iris.core.ird.messages.RestoreClass;

public interface IRDCommandsDAO {
	public void enableSTB(String hardwareId);
	public void rebootSTB(String hardwareId); 
	
	public void enableSTB(String hardwareId, String node);
	public void disableSTB(String hardwareId, String node);
	public void rebootSTB(String hardwareId, String node); 
	public void restoreSTB(String hardwareId, RestoreClass restoreClass, String node);
	public void showOSDMessage(String message, String hardwareId, boolean blocking, String node);
}
