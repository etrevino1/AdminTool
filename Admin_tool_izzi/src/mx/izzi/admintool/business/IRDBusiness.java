package mx.izzi.admintool.business;

import mx.izzi.admintool.exception.NDSTransformationTVIException;
import tv.mirada.www.iris.core.types.CustomerPremisesEquipment;

public interface IRDBusiness {
	public void resetPin(String hardwareId, String node) throws NDSTransformationTVIException;
	public void enableCPE(CustomerPremisesEquipment equipo, String node, String user) throws NDSTransformationTVIException;
	public void enableSTB(String hardwareId, String node, String user) throws NDSTransformationTVIException;
	public void disableCPE(CustomerPremisesEquipment equipo, String node, String user) throws NDSTransformationTVIException;
	public void disableSTB(String hardwareId, String node, String user) throws NDSTransformationTVIException;
	public void rebootSTB(String hardwareId, String node, String user) throws NDSTransformationTVIException;
	public void restoreSTB(String hardwareId, String restoreClass, String node, String user) throws NDSTransformationTVIException;
	public void sendMessage(String message, String hardwareId, boolean blocking, String node, String user) throws NDSTransformationTVIException;
}
