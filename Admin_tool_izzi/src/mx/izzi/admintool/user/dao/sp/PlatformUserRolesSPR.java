package mx.izzi.admintool.user.dao.sp;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.hsqldb.types.Types;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.SqlReturnResultSet;
import org.springframework.jdbc.object.StoredProcedure;

import mx.izzi.admintool.user.dto.PlatformUserRoleDTO;
import mx.izzi.admintool.user.dto.mapper.PlatformUserRoleMapper;

public class PlatformUserRolesSPR extends StoredProcedure {
	private static final String SPROC_NAME ="spr_tomcat_user_roles";
	private static final String USER = "user_name";
	
	@Autowired
	public PlatformUserRolesSPR(DataSource dataSource){
		super(dataSource, SPROC_NAME);
		declareParameter(new SqlParameter(USER, Types.SQL_VARCHAR));
		
		RowMapper<PlatformUserRoleDTO> mapper = new PlatformUserRoleMapper();
		declareParameter(new SqlReturnResultSet("RESULT_LIST", mapper));
		compile();
	}
	
	public Map<?, ?> execute(String user){
		Map<String, Object> params = new HashMap<String, Object>();
		params.put(USER, user);
		return super.execute(params);
	}
}
