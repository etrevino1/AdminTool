package mx.izzi.admintool.admin.service.business;

import java.util.List;

import mx.izzi.admintool.admin.service.dto.ServicePackageDTO;

public interface ServicePackageBusiness {
	public List<ServicePackageDTO> getPackage(String node);
	public void insertPackage(String packageName, String packageNode, int required);
	public void deletePackage(Integer packagId);
	
}
