package mx.izzi.admintool.user.dto.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.izzi.admintool.user.dto.PlatformRoleDTO;

public class PlatformRoleMapper implements RowMapper<PlatformRoleDTO> {
	@Override
	public PlatformRoleDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new PlatformRoleDTO(rs.getString(1));
	}
}
