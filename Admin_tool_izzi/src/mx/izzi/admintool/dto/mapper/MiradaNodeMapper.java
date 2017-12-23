package mx.izzi.admintool.dto.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.izzi.admintool.dto.MiradaNodeDTO;

public class MiradaNodeMapper implements RowMapper<MiradaNodeDTO> {
	
	@Override
	public MiradaNodeDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new MiradaNodeDTO(rs.getInt("mirada_node_id"), rs.getString("mirada_node_descr"), rs.getString("mirada_node_code"));
	}
	
}
