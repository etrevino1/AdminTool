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

import mx.izzi.admintool.user.dto.PlatformRoleDTO;
import mx.izzi.admintool.user.dto.mapper.PlatformRoleMapper;

public class PlatformRoleSPR extends StoredProcedure {
	private static final String SPROC_NAME ="spr_tomcat_roles";
	private static final String USER = "userName";
	
	@Autowired
	public PlatformRoleSPR(DataSource dataSource) {
		super(dataSource, SPROC_NAME);
		declareParameter(new SqlParameter(USER, Types.VARCHAR));
		
		RowMapper<PlatformRoleDTO> mapper = new PlatformRoleMapper();
		declareParameter(new SqlReturnResultSet("RESULT_LIST", mapper));
		
		compile();
	}
	
	public Map<?, ?> execute(String user){
		Map<String, Object> params = new HashMap<String, Object>();
		params.put(USER, user);
		return super.execute(params);
	}
}
