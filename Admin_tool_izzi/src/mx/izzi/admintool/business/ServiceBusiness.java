package mx.izzi.admintool.business;

import tv.mirada.www.iris.core.service.messages.SubscribeToPackageResponse;

public interface ServiceBusiness {
	public boolean deletePackage(String irisId, String node);
	public SubscribeToPackageResponse addPackage(String account, String irisPackage, String node);
	
}
