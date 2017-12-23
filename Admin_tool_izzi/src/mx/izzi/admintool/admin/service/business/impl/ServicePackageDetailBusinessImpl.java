package mx.izzi.admintool.admin.service.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import mx.izzi.admintool.admin.service.business.ServicePackageDetailBusiness;
import mx.izzi.admintool.admin.service.dao.ServicePackageDetailDAO;
import mx.izzi.admintool.admin.service.dto.ServicePackageDetailDTO;
import mx.izzi.admintool.dblog.business.impl.LogUserOperationBusinessImpl;

public class ServicePackageDetailBusinessImpl extends LogUserOperationBusinessImpl implements ServicePackageDetailBusiness {

	private ServicePackageDetailDAO servicePackageDetailDAO;
	
	@Override
	public List<ServicePackageDetailDTO> getPackageDetail(String name){
		return servicePackageDetailDAO.getPackageDetail(name);
	}
	
	@Override
	public void insertPackageDetail(String packageName, String packageNode, String packageDetail, String required){
		ServicePackageDetailDTO details = new ServicePackageDetailDTO(packageName, packageNode, packageDetail, required.equals("false")?false:true);
		servicePackageDetailDAO.insertPackageDetail(details);
	}
	
	@Override
	public void deletePackageDetail(String packageName, String packageNode, String packageDetail){
		ServicePackageDetailDTO details = new ServicePackageDetailDTO(packageName, packageNode, packageDetail, null);
		servicePackageDetailDAO.deletePackageDetail(details);
	}
	
	@Override
	public void updatePackageDetail(String packageName, String packageNode, String packageDetail, String required){
		ServicePackageDetailDTO details = new ServicePackageDetailDTO(packageName, packageNode, packageDetail, required.equals("false")?false:true);
		servicePackageDetailDAO.updatePackageDetail(details);
	}

	@Autowired
	public void setServicePackageDetailDAO(ServicePackageDetailDAO servicePackageDetailDAO) {
		this.servicePackageDetailDAO = servicePackageDetailDAO;
	}

}
