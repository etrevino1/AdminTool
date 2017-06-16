package mx.izzi.admintool.user.dto.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.izzi.admintool.user.dto.PlatformUserDTO;

public class PlatformUserMapper implements RowMapper<PlatformUserDTO> {
	@Override
	public PlatformUserDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		return new PlatformUserDTO(rs.getString("user_name"));
	}
}
