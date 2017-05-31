package mx.izzi.admintool.dblog.business.impl;

import java.util.List;
import java.util.Map;

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

	@Override
	@SuppressWarnings("unchecked")
	public List<LogUserOperationDTO> getLogUserOperation(String user) {
		Map<?, ?> data = logUserOperationDAO.getLogUserOperation(user);
		return (List<LogUserOperationDTO>)data.get("RESULT_LIST");
	}
}
