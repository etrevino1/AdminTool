package mx.izzi.admintool.sp;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.hsqldb.types.Types;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.SqlReturnResultSet;
import org.springframework.jdbc.object.StoredProcedure;

import mx.izzi.admintool.dblog.dto.LogUserOperationDTO;
import mx.izzi.admintool.dblog.dto.mapper.LogUserOperationMapper;

public class LogUserOperationSPR extends StoredProcedure {
	private static final String SPROC_NAME ="spr_log_user_operation";
	private static final String USER = "user_operation";
	
	public LogUserOperationSPR(DataSource dataSource){
		super(dataSource,SPROC_NAME);
		RowMapper<LogUserOperationDTO> mapper = new LogUserOperationMapper();
		declareParameter(new SqlReturnResultSet("RESULT_LIST", mapper));
		declareParameter(new SqlParameter(USER, Types.SQL_VARCHAR));
		compile();
	}
	
	public Map<String, Object> execute(String user){
		Map<String, Object> params = new HashMap<String, Object>();
		params.put(USER, user);
		return super.execute(params);
	}
}
