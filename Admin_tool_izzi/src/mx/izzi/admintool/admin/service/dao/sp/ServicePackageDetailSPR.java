package mx.izzi.admintool.admin.service.dao.sp;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.hsqldb.types.Types;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.SqlReturnResultSet;
import org.springframework.jdbc.object.StoredProcedure;

import mx.izzi.admintool.admin.service.dto.ServicePackageDetailDTO;
import mx.izzi.admintool.admin.service.dto.mapper.ServicePackageDetailMapper;

public class ServicePackageDetailSPR extends StoredProcedure {
	private static final String SPROC_NAME = "spr_mirada_package_detail";
	private static final String NAME = "packageName";
	
	@Autowired
	public ServicePackageDetailSPR(DataSource dataSource){
		super(dataSource, SPROC_NAME);
		RowMapper<ServicePackageDetailDTO> mapper = new ServicePackageDetailMapper();
		declareParameter(new SqlReturnResultSet("RESULT_LIST", mapper));
		declareParameter(new SqlParameter(NAME, Types.VARCHAR));
		
		compile();
	}
	
	public Map<?, ?> execute(String packageName){
		Map<String, Object> params = new HashMap<String, Object>();
		params.put(NAME, packageName);
		return super.execute(params);
	}
}
