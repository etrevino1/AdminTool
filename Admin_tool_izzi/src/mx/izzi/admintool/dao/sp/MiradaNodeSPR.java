package mx.izzi.admintool.dao.sp;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlReturnResultSet;
import org.springframework.jdbc.object.StoredProcedure;

import mx.izzi.admintool.dto.MiradaNodeDTO;
import mx.izzi.admintool.dto.mapper.MiradaNodeMapper;

public class MiradaNodeSPR extends StoredProcedure {
	private static final String SPROC_NAME = "spr_mirada_node";
	
	@Autowired
	public MiradaNodeSPR(DataSource dataSource){
		super(dataSource, SPROC_NAME);
		RowMapper<MiradaNodeDTO> mapper = new MiradaNodeMapper();
		declareParameter(new SqlReturnResultSet("RESULT_LIST", mapper));
		
		compile();
	}
	
	public Map<?, ?> execute(){
		Map<String, Object> params = new HashMap<String, Object>();
		return super.execute(params);
	}
}
