package mx.izzi.admintool.user.business.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import mx.izzi.admintool.user.business.UserActionBusiness;
import mx.izzi.admintool.user.dao.UserActionDAO;
import mx.izzi.admintool.user.dto.PlatformUserDTO;
import mx.izzi.admintool.user.dto.PlatformUserRoleDTO;

public class UserActionBusinessImpl implements UserActionBusiness {
	private Logger log = Logger.getLogger(this.getClass());
	
	private UserActionDAO userActionDAO = null;
	
	@Override
	public List<PlatformUserDTO> getUsers(){
		return (List<PlatformUserDTO>)userActionDAO.getUsers().get("RESULT_LIST");
	}
	
	@Override
	public void createUser(String userName, String password){
		userActionDAO.createUser(new PlatformUserDTO(userName, password));
	}
	
	@Override
	public void deleteUser(String userName){
		userActionDAO.deleteUser(new PlatformUserDTO(userName));
	}
	
	@Override
	public List<PlatformUserRoleDTO> getUserRoles(String user){
		return (List<PlatformUserRoleDTO>)userActionDAO.getUserRoles(user).get("RESULT_LIST");
	}
	
	@Override
	public void deleteUserRole(String user, String role){
		PlatformUserRoleDTO userRole = new PlatformUserRoleDTO(user, role);
		userActionDAO.deleteUserRole(userRole);
	}
	
	@Override
	public void assignUserRole(String user, String role){
		PlatformUserRoleDTO userRole = new PlatformUserRoleDTO(user, role);
		userActionDAO.assignUserRole(userRole);
	}
	
	@Autowired
	public void setUserActionDAO(UserActionDAO userActionDAO) {
		this.userActionDAO = userActionDAO;
	}
	
}
