package mx.izzi.admintool.dblog.dao;

import java.util.List;

import mx.izzi.admintool.dblog.dto.LogUserOperationDTO;

public interface LogUserOperationDAO {
	public boolean logUserOperation(LogUserOperationDTO userOperation);
	public List<LogUserOperationDTO> getLogUserOperation();
}
