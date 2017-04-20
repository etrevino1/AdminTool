package mx.izzi.admintool.dblog.dao.impl;

import java.util.Map;

import javax.sql.DataSource;

import org.apache.log4j.Logger;

import mx.izzi.admintool.dblog.dao.LogUserOperationDAO;
import mx.izzi.admintool.dblog.dto.LogUserOperationDTO;
import mx.izzi.admintool.sp.LogUserOperationSP;
import mx.izzi.admintool.sp.LogUserOperationSPR;

public class LogUserOperationDAOImpl implements LogUserOperationDAO{
	
	private DataSource dataSource;
	private Logger log = Logger.getLogger(this.getClass());
	
	@Override
	public boolean logUserOperation(LogUserOperationDTO userOperation){
		log.debug("LogUserOperationDAOImpl - logUserOperation: " + userOperation);
		LogUserOperationSP sp = new LogUserOperationSP(dataSource);
		sp.execute(userOperation);
		
		return true;
	}
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public Map<?, ?> getLogUserOperation(String user){
		log.debug("LogUserOperationDAOImpl - getLogUserOperation");
		
		LogUserOperationSPR sp = new LogUserOperationSPR(dataSource);
		return sp.execute(user);
	}
	
}
