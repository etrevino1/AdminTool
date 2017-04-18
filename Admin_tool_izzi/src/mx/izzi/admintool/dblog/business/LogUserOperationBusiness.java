package mx.izzi.admintool.dblog.business;

import mx.izzi.admintool.dblog.dto.LogUserOperationDTO;

public interface LogUserOperationBusiness {
	public void logUserOperation(LogUserOperationDTO userOperation);
}
