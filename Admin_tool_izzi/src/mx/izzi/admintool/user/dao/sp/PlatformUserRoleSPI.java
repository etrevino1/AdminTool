package mx.izzi.admintool.user.dao.sp;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.hsqldb.types.Types;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

import mx.izzi.admintool.user.dto.PlatformUserRoleDTO;

public class PlatformUserRoleSPI extends StoredProcedure {
	private static final String SPROC_NAME ="spi_tomcat_users_roles";
	private static final String USER = "userName";
	private static final String ROLE = "roleName";
	
	@Autowired
	public PlatformUserRoleSPI (DataSource dataSource){
		super(dataSource, SPROC_NAME);
		declareParameter(new SqlParameter(USER, Types.SQL_VARCHAR));
		declareParameter(new SqlParameter(ROLE, Types.SQL_VARCHAR));

		compile();
	}
	
	public  Map<?, ?> execute(PlatformUserRoleDTO userRole){
		Map<String, Object> params = new HashMap<String, Object>();
		params.put(USER, userRole.getUser());
		params.put(ROLE, userRole.getRole());
		return super.execute(params);
	}
}
