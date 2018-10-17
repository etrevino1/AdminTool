package mx.izzi.admintool.admin.service.dao.sp;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.hsqldb.types.Types;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

public class ServicePackageSPD extends StoredProcedure{
	private static String SPROC_NAME = "spd_mirada_package";
	private static String ID = "packageId";
	
	@Autowired
	public ServicePackageSPD(DataSource dataSource){
		super(dataSource, SPROC_NAME);
		declareParameter(new SqlParameter(ID, Types.INTEGER));
		
		compile();
	}

	public Map<?, ?> execute(Integer packageId) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put(ID, packageId);
		return super.execute(params);
	}
	
	
}
