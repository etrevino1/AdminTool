package mx.izzi.admintool.business.impl;

import java.sql.Timestamp;
import java.util.Calendar;

import org.apache.log4j.Logger;

import tv.mirada.www.iris.core.service.messages.SubscribeToPackageResponse;
import mx.izzi.admintool.business.ServiceBusiness;
import mx.izzi.admintool.dao.ServiceDAO;
import mx.izzi.admintool.dblog.business.impl.LogUserOperationBusinessImpl;
import mx.izzi.admintool.dblog.dto.LogUserOperationDTO;

public class ServiceBusinessImpl extends LogUserOperationBusinessImpl implements ServiceBusiness {

	private ServiceDAO serviceDAO;
	

	private Logger log = Logger.getLogger(this.getClass());
	
	@Override
	public boolean deletePackage(String irisId, String node, String user) {
		log.debug("ServiceBusinessImpl - deletePackage");
		logUserOperation(new LogUserOperationDTO(user, "delPackage", "deletePackage: " + irisId, new Timestamp(Calendar.getInstance().getTimeInMillis())));
		this.serviceDAO.deletePackage(irisId, node);
		return false;
	}
	
	@Override
	public SubscribeToPackageResponse addPackage(String account, String irisPackage, String node, String user){
		log.debug("ServiceBusinessImpl - addPackage");
		logUserOperation(new LogUserOperationDTO(user, "addPackage", "addPackage: " + irisPackage + ", Account" + account, new Timestamp(Calendar.getInstance().getTimeInMillis())));
		return this.serviceDAO.addPackage(account, irisPackage, node);
	}

	public void setServiceDAO(ServiceDAO serviceDAO) {
		this.serviceDAO = serviceDAO;
	}
}
