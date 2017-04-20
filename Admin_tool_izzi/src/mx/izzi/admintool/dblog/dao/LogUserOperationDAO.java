package mx.izzi.admintool.dblog.dao;

import java.util.Map;

import mx.izzi.admintool.dblog.dto.LogUserOperationDTO;

public interface LogUserOperationDAO {
	public boolean logUserOperation(LogUserOperationDTO userOperation);
	public Map<?, ?> getLogUserOperation(String user);
}
