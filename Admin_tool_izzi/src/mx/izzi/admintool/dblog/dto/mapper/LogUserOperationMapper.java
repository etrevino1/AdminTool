package mx.izzi.admintool.dblog.dto.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.izzi.admintool.dblog.dto.LogUserOperationDTO;

public class LogUserOperationMapper implements RowMapper<LogUserOperationDTO> {
	@Override
	public LogUserOperationDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		return new LogUserOperationDTO(rs.getString("user"), rs.getString("action"), rs.getString("detail"), rs.getTimestamp("action_time"));
	}
}
