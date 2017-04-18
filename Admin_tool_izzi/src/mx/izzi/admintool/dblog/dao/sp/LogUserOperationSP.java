package mx.izzi.admintool.dblog.dao.sp;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.hsqldb.types.Types;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

import mx.izzi.admintool.dblog.dto.LogUserOperationDTO;

public class LogUserOperationSP extends StoredProcedure {
	private static final String SPROC_NAME ="spi_log_user_operation";
	private static final String USER = "user_operation";
	private static final String OPERATION = "operation_done";
	private static final String DETAIL = "detail_operation";
	private static final String DATE = "action_date";
	
	public LogUserOperationSP(DataSource dataSource){
		super(dataSource,SPROC_NAME);
		declareParameter(new SqlParameter(USER, Types.SQL_VARCHAR));
		declareParameter(new SqlParameter(OPERATION, Types.SQL_VARCHAR));
		declareParameter(new SqlParameter(DETAIL, Types.SQL_VARCHAR));
		declareParameter(new SqlParameter(DATE, Types.SQL_TIMESTAMP));
		compile();
	}
	
	public Map<String, Object> execute(LogUserOperationDTO oper){
		Map<String, Object> params = new HashMap<String, Object>();
		params.put(USER, oper.getUser());
		params.put(OPERATION, oper.getOperation());
		params.put(DETAIL, oper.getDetail());
		params.put(DATE, oper.getDate());
		return super.execute(params);
	}
}
