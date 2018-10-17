package mx.izzi.admintool.admin.service.dto.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.izzi.admintool.admin.service.dto.ServicePackageDTO;

public class ServicePackageMapper implements RowMapper<ServicePackageDTO> {

	@Override
	public ServicePackageDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new ServicePackageDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getBoolean(4));
	}
	
}
