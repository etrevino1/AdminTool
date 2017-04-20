package mx.izzi.admintool.dblog.business;

import java.util.List;

import mx.izzi.admintool.dblog.dto.LogUserOperationDTO;

public interface LogUserOperationBusiness {
	public void logUserOperation(LogUserOperationDTO userOperation);
	public List<LogUserOperationDTO> getLogUserOperation(String user);
}
