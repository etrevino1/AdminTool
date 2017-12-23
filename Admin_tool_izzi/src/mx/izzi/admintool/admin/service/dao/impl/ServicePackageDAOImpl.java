package mx.izzi.admintool.admin.service.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import mx.izzi.admintool.admin.service.dao.ServicePackageDAO;
import mx.izzi.admintool.admin.service.dao.sp.ServicePackageDetailSPD;
import mx.izzi.admintool.admin.service.dao.sp.ServicePackageDetailSPI;
import mx.izzi.admintool.admin.service.dao.sp.ServicePackageDetailSPR;
import mx.izzi.admintool.admin.service.dao.sp.ServicePackageDetailSPU;
import mx.izzi.admintool.admin.service.dao.sp.ServicePackageSPD;
import mx.izzi.admintool.admin.service.dao.sp.ServicePackageSPI;
import mx.izzi.admintool.admin.service.dao.sp.ServicePackageSPR;
import mx.izzi.admintool.admin.service.dto.ServicePackageDTO;
import mx.izzi.admintool.admin.service.dto.ServicePackageDetailDTO;
import mx.izzi.admintool.admin.service.dto.ServicePackageNewDTO;

public class ServicePackageDAOImpl implements ServicePackageDAO {

	private Logger log = Logger.getLogger(this.getClass());
	
	private ServicePackageSPR servicePackageSPR = null;
	private ServicePackageSPD servicePackageSPD = null;
	private ServicePackageSPI servicePackageSPI = null; 
	
	@Override
	public List<ServicePackageDTO> getPackage(String node) {
		log.debug("ServicePackageDAOImpl - getPackage: " + node);
		Map<?, ?> data = this.servicePackageSPR.execute(node);
		return (List<ServicePackageDTO>)data.get("RESULT_LIST");
	}
	
	@Override
	public void insertPackage(ServicePackageNewDTO packageDTO) {
		log.debug("ServicePackageDAOImpl - insertPackage");
		this.servicePackageSPI.execute(packageDTO);
	}

	@Override
	public void deletePackage(Integer packageId) {
		log.debug("ServicePackageDAOImpl - deletePackage");
		this.servicePackageSPD.execute(packageId);
	}

	@Autowired
	public void setServicePackageSPR(ServicePackageSPR servicePackageSPR) {
		this.servicePackageSPR = servicePackageSPR;
	}

	@Autowired
	public void setServicePackageSPD(ServicePackageSPD servicePackageSPD) {
		this.servicePackageSPD = servicePackageSPD;
	}

	@Autowired
	public void setServicePackageSPI(ServicePackageSPI servicePackageSPI) {
		this.servicePackageSPI = servicePackageSPI;
	}

}
