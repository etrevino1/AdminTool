package mx.izzi.admintool.sp;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.object.StoredProcedure;

public class ServicePackageSP extends StoredProcedure {
	
	private static final String SPROC_NAME ="spr_mirada_package";
	
	public ServicePackageSP(DataSource dataSource){
		super(dataSource,SPROC_NAME);
		compile();
	}
	
	public Map<String, Object> execute(){
		Map<String, Object> params = new HashMap<String, Object>();
		return super.execute(params);
	}
}
