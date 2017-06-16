package mx.izzi.admintool.user.dao.sp;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.hsqldb.types.Types;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

public class PlatformUserSPI extends StoredProcedure {
	private static final String SPROC_NAME ="spi_tomcat_user";
	private static final String USER = "user_name";
	private static final String PASSWORD = "password";

	@Autowired
	public PlatformUserSPI(DataSource dataSource){
		super(dataSource, SPROC_NAME);
		declareParameter(new SqlParameter(USER, Types.SQL_VARCHAR));
		declareParameter(new SqlParameter(PASSWORD, Types.SQL_VARCHAR));
		compile();
	}
	
	public Map<String, Object> execute(String user, String password){
		Map<String, Object> params = new HashMap<String, Object>();
		params.put(USER, user);
		params.put(PASSWORD, password);
		return super.execute(params);
	}
}
