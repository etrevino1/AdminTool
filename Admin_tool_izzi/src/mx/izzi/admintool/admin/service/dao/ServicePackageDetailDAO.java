package mx.izzi.admintool.admin.service.dao;

import java.util.List;

import mx.izzi.admintool.admin.service.dto.ServicePackageDetailDTO;

public interface ServicePackageDetailDAO {
	public List<ServicePackageDetailDTO> getPackageDetail(String name);
	public void insertPackageDetail(ServicePackageDetailDTO details);
	public void deletePackageDetail(ServicePackageDetailDTO details);
	public void updatePackageDetail(ServicePackageDetailDTO details);
}
