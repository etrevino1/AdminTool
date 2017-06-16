package mx.izzi.admintool.user.dao.sp;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.hsqldb.types.Types;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

import mx.izzi.admintool.user.dto.PlatformUserRoleDTO;

public class PlatformUserRoleSPD extends StoredProcedure {

	private static final String SPROC_NAME ="spd_tomcat_user_role";
	private static final String USER = "user_name";
	private static final String ROLE = "role_name";
	
	@Autowired
	public PlatformUserRoleSPD (DataSource dataSource){
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
