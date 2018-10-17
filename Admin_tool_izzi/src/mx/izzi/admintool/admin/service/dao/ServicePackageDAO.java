package mx.izzi.admintool.admin.service.dao;

import java.util.List;

import mx.izzi.admintool.admin.service.dto.ServicePackageDTO;
import mx.izzi.admintool.admin.service.dto.ServicePackageNewDTO;

public interface ServicePackageDAO {
	public List<ServicePackageDTO> getPackage(String node);
	public void insertPackage(ServicePackageNewDTO packageDTO);
	public void deletePackage(Integer packageId);
	
}
