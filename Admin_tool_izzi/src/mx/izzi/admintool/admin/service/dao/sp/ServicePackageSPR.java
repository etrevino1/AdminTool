package mx.izzi.admintool.admin.service.dao.sp;

import org.hsqldb.types.Types;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.SqlReturnResultSet;
import org.springframework.jdbc.object.StoredProcedure;

import mx.izzi.admintool.admin.service.dto.ServicePackageDTO;
import mx.izzi.admintool.admin.service.dto.mapper.ServicePackageMapper;

public class ServicePackageSPR extends StoredProcedure {
	private static final String SPROC_NAME = "spr_mirada_package";
	private static final String NODE = "packageNODE";

	@Autowired
	public ServicePackageSPR(DataSource dataSource){
		super(dataSource, SPROC_NAME);
		RowMapper<ServicePackageDTO> mapper = new ServicePackageMapper();
		declareParameter(new SqlReturnResultSet("RESULT_LIST", mapper));
		declareParameter(new SqlParameter(NODE, Types.VARCHAR));
		
		compile();
	}
	
	public Map<?, ?> execute(String node){
		Map<String, Object> params = new HashMap<String, Object>();
		params.put(NODE, node);
		return super.execute(params);
	}
}
