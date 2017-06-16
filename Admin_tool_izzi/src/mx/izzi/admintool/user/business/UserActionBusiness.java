package mx.izzi.admintool.user.business;

import java.util.List;

import mx.izzi.admintool.user.dto.PlatformUserDTO;
import mx.izzi.admintool.user.dto.PlatformUserRoleDTO;

public interface UserActionBusiness {
	public List<PlatformUserDTO> getUsers();
	public List<PlatformUserRoleDTO> getUserRoles(String user);
	public void createUser(String userName, String password);
	public void deleteUser(String userName);
	public void deleteUserRole(String user, String role);
	public void assignUserRole(String user, String role);
}
