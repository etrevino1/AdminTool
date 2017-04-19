package mx.izzi.admintool.dblog.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import mx.izzi.admintool.dblog.dao.LogUserOperationDAO;
import mx.izzi.admintool.dblog.dto.LogUserOperationDTO;
import mx.izzi.admintool.sp.LogUserOperationSP;

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
	public List<LogUserOperationDTO> getLogUserOperation(){
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		String sql = "select * from tomcat_realm.log_user_operation";
		
		List<LogUserOperationDTO> list = jdbcTemplate.query(sql, new RowMapper<LogUserOperationDTO>(){
			
			public LogUserOperationDTO mapRow(ResultSet rs, int rowNumber) throws SQLException {
				return new LogUserOperationDTO(rs.getString("user"), rs.getString("action"), rs.getString("detail"), rs.getTimestamp("action_time"));
			}
		});
		
		return list;
	}
	
}
