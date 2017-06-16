package mx.izzi.admintool.user.dao.sp;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlReturnResultSet;
import org.springframework.jdbc.object.StoredProcedure;

import mx.izzi.admintool.user.dto.PlatformUserDTO;
import mx.izzi.admintool.user.dto.mapper.PlatformUserMapper;

public class PlatformUserSPR extends StoredProcedure {
	private static final String SPROC_NAME ="spr_users";
	
	@Autowired
	public PlatformUserSPR(DataSource dataSource){
		super(dataSource, SPROC_NAME);
		RowMapper<PlatformUserDTO> mapper = new PlatformUserMapper();
		declareParameter(new SqlReturnResultSet("RESULT_LIST", mapper));
		compile();
	}
	
	public Map<?, ?> execute(){
		Map<String, Object> params = new HashMap<String, Object>();
		return super.execute(params);
	}
}
