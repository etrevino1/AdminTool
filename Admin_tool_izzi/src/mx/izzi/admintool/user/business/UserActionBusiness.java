package mx.izzi.admintool.user.business;

import java.util.List;

import mx.izzi.admintool.user.dto.PlatformRoleDTO;
import mx.izzi.admintool.user.dto.PlatformUserDTO;
import mx.izzi.admintool.user.dto.PlatformUserRoleDTO;

public interface UserActionBusiness {
	public List<PlatformUserDTO> getUsers(String user);
	public List<PlatformUserRoleDTO> getUserRoles(String userName, String user);
	public void createUser(String userName, String password, String user);
	public void deleteUser(String userName, String user);
	public void deleteUserRole(String userName, String role, String user);
	public void assignUserRole(String userName, String role, String user);
	public List<PlatformRoleDTO> getUserNotRoles(String userName, String user);
}
