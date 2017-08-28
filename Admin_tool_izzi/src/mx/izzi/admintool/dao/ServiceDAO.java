package mx.izzi.admintool.dao;

import tv.mirada.www.iris.core.service.messages.SubscribeToPackageResponse;

public interface ServiceDAO {
	public boolean deletePackage(String irisId);
	public SubscribeToPackageResponse addPackage(String account, String irisPackage);
	
	public boolean deletePackage(String irisId, String region);
	public SubscribeToPackageResponse addPackage(String account, String irisPackage, String hardwareId, String region);
}
