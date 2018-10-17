package mx.izzi.admintool.admin.service.business;

import java.util.List;

import mx.izzi.admintool.admin.service.dto.ServicePackageDetailDTO;

public interface ServicePackageDetailBusiness {
	
	public List<ServicePackageDetailDTO> getPackageDetail(String name);
	public void insertPackageDetail(String packageName, String packageNode, String packageDetail, String required);
	public void deletePackageDetail(String packageName, String packageNode, String packageDetail);
	public void updatePackageDetail(String packageName, String packageNode, String packageDetail, String required);
	
	
}
