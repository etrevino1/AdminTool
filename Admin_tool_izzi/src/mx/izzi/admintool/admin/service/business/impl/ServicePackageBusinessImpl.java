package mx.izzi.admintool.admin.service.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import mx.izzi.admintool.admin.service.business.ServicePackageBusiness;
import mx.izzi.admintool.admin.service.dao.ServicePackageDAO;
import mx.izzi.admintool.admin.service.dto.ServicePackageDTO;
import mx.izzi.admintool.admin.service.dto.ServicePackageNewDTO;
import mx.izzi.admintool.dblog.business.impl.LogUserOperationBusinessImpl;

public class ServicePackageBusinessImpl extends LogUserOperationBusinessImpl implements ServicePackageBusiness {
	
	private ServicePackageDAO servicePackageDAO;
	
	@Override
	public List<ServicePackageDTO> getPackage(String node){
		return servicePackageDAO.getPackage(node);
	}
	
	@Override
	public void insertPackage(String packageName, String packageNode, int required){
		ServicePackageNewDTO packageDTO = new ServicePackageNewDTO(packageName, packageNode, required);
		servicePackageDAO.insertPackage(packageDTO);
	}
	
	@Override
	public void deletePackage(Integer packageId) {
		servicePackageDAO.deletePackage(packageId);
	}

	@Autowired
	public void setServicePackageDAO(ServicePackageDAO servicePackageDAO) {
		this.servicePackageDAO = servicePackageDAO;
	}
	
	
}
