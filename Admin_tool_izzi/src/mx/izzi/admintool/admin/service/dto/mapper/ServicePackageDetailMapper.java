package mx.izzi.admintool.admin.service.dto.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.izzi.admintool.admin.service.dto.ServicePackageDetailDTO;

public class ServicePackageDetailMapper implements RowMapper<ServicePackageDetailDTO> {

	@Override
	public ServicePackageDetailDTO mapRow(ResultSet rs, int rowNum) throws SQLException{
		return new ServicePackageDetailDTO(rs.getString("packageName"), rs.getString("nodo"), rs.getString("detail"), rs.getInt("required"));
	}
}
