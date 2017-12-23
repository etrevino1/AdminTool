package mx.izzi.admintool.admin.service.dao.sp;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.hsqldb.types.Types;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

import mx.izzi.admintool.admin.service.dto.ServicePackageDetailDTO;

public class ServicePackageDetailSPU extends StoredProcedure  {
	private static final String SPROC_NAME = "spu_mirada_package_detail";
	
	private static final String NAME = "packageName";
	private static final String NODE = "packageNode";
	private static final String DETAIL = "packageDetail";
	private static final String REQUIRED = "required";
	
	@Autowired
	public ServicePackageDetailSPU(DataSource dataSource){
		super(dataSource, SPROC_NAME);
		declareParameter(new SqlParameter(NAME, Types.VARCHAR));
		declareParameter(new SqlParameter(NODE, Types.VARCHAR));
		declareParameter(new SqlParameter(DETAIL, Types.VARCHAR));
		declareParameter(new SqlParameter(REQUIRED, Types.TINYINT));
		
		compile();
	}
	
	public Map<?, ?> execute(ServicePackageDetailDTO data){
		Map<String, Object> params = new HashMap<String, Object>();
		params.put(NAME, data.getPackageName());
		params.put(NODE, data.getPackageNode());
		params.put(DETAIL, data.getPackageDetail());
		params.put(REQUIRED, data.getRequired());
		return super.execute(params);
	}
}
