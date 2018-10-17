package mx.izzi.admintool.admin.service.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import mx.izzi.admintool.admin.service.dao.ServicePackageDetailDAO;
import mx.izzi.admintool.admin.service.dao.sp.ServicePackageDetailSPD;
import mx.izzi.admintool.admin.service.dao.sp.ServicePackageDetailSPI;
import mx.izzi.admintool.admin.service.dao.sp.ServicePackageDetailSPR;
import mx.izzi.admintool.admin.service.dao.sp.ServicePackageDetailSPU;
import mx.izzi.admintool.admin.service.dto.ServicePackageDetailDTO;

public class ServicePackageDetailDAOImpl implements ServicePackageDetailDAO {
	
	private Logger log = Logger.getLogger(this.getClass());
	
	private ServicePackageDetailSPR servicePackageDetailSPR = null;
	private ServicePackageDetailSPI servicePackageDetailSPI = null;
	private ServicePackageDetailSPD servicePackageDetailSPD = null;
	private ServicePackageDetailSPU servicePackageDetailSPU = null;
	
	@Override
	public List<ServicePackageDetailDTO> getPackageDetail(String name){
		log.debug("ServicePackageDAOImpl - getPackageDetail: " + name);
		Map<?, ?> data = this.servicePackageDetailSPR.execute(name);
		return (List<ServicePackageDetailDTO>) data.get("RESULT_LIST");
	}
	
	@Override
	public void insertPackageDetail(ServicePackageDetailDTO details){
		log.debug("ServicePackageDAOImpl - insertPackageDetail: " + details);
		servicePackageDetailSPI.execute(details);
	}
	
	@Override
	public void deletePackageDetail(ServicePackageDetailDTO details){
		log.debug("ServicePackageDAOImpl - insertPackageDetail: " + details);
		servicePackageDetailSPD.execute(details);
	}
	
	@Override
	public void updatePackageDetail(ServicePackageDetailDTO details){
		log.debug("ServicePackageDAOImpl - updatePackageDetail: " + details);
		servicePackageDetailSPU.execute(details);
	}

	@Autowired
	public void setServicePackageDetailSPR(ServicePackageDetailSPR servicePackageDetailSPR) {
		this.servicePackageDetailSPR = servicePackageDetailSPR;
	}

	@Autowired
	public void setServicePackageDetailSPI(ServicePackageDetailSPI servicePackageDetailSPI) {
		this.servicePackageDetailSPI = servicePackageDetailSPI;
	}

	@Autowired
	public void setServicePackageDetailSPD(ServicePackageDetailSPD servicePackageDetailSPD) {
		this.servicePackageDetailSPD = servicePackageDetailSPD;
	}

	@Autowired
	public void setServicePackageDetailSPU(ServicePackageDetailSPU servicePackageDetailSPU) {
		this.servicePackageDetailSPU = servicePackageDetailSPU;
	}
}
