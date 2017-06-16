package mx.izzi.admintool.user.dto.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.izzi.admintool.user.dto.PlatformUserRoleDTO;

public class PlatformUserRoleMapper implements RowMapper<PlatformUserRoleDTO> {

	@Override
	public PlatformUserRoleDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new PlatformUserRoleDTO(rs.getString(1), rs.getString(2));
	}

}
