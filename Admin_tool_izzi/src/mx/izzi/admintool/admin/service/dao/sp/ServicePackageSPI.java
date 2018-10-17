package mx.izzi.admintool.admin.service.dao.sp;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.hsqldb.types.Types;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

import mx.izzi.admintool.admin.service.dto.ServicePackageNewDTO;

public class ServicePackageSPI extends StoredProcedure {

	private static final String SPROC_NAME = "spi_mirada_package";
	private static final String NAME = "packageName";
	private static final String NODE = "node_id";
	private static final String NEEDED = "equipment";
	
	@Autowired
	public ServicePackageSPI(DataSource dataSource){
		super(dataSource, SPROC_NAME);
		declareParameter(new SqlParameter(NAME, Types.VARCHAR));
		declareParameter(new SqlParameter(NODE, Types.VARCHAR));
		declareParameter(new SqlParameter(NEEDED, Types.TINYINT));
		
		compile();
	}
	
	public Map<?, ?> execute(ServicePackageNewDTO param){
		Map<String, Object> params = new HashMap<String, Object>();
		params.put(NAME, param.getPackageName());
		params.put(NODE, param.getPackageNode());
		params.put(NEEDED, param.getEquipment());
		return super.execute(params);
	}
}
