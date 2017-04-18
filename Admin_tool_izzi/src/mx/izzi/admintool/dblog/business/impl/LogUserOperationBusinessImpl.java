package mx.izzi.admintool.dblog.business.impl;

import mx.izzi.admintool.dblog.business.LogUserOperationBusiness;
import mx.izzi.admintool.dblog.dao.LogUserOperationDAO;
import mx.izzi.admintool.dblog.dto.LogUserOperationDTO;

public class LogUserOperationBusinessImpl implements LogUserOperationBusiness {

	private LogUserOperationDAO logUserOperationDAO;
	
	@Override
	public void logUserOperation(LogUserOperationDTO userOperation) {
		logUserOperationDAO.logUserOperation(userOperation);
	}

	public void setLogUserOperationDAO(LogUserOperationDAO logUserOperationDAO) {
		this.logUserOperationDAO = logUserOperationDAO;
	}
}
