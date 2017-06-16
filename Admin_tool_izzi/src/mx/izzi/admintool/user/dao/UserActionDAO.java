package mx.izzi.admintool.user.dao;

import java.util.Map;

import mx.izzi.admintool.user.dto.PlatformUserDTO;
import mx.izzi.admintool.user.dto.PlatformUserRoleDTO;

public interface UserActionDAO {
	public Map<?, ?> getUsers();
	public void createUser(PlatformUserDTO user);
	public void deleteUser(PlatformUserDTO user);
	
	public Map<?, ?> getUserRoles(String user);
	public void deleteUserRole(PlatformUserRoleDTO userRole);
	public void assignUserRole(PlatformUserRoleDTO userRole);
}
