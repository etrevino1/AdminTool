package mx.izzi.admintool.user.business.impl;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import mx.izzi.admintool.dblog.business.impl.LogUserOperationBusinessImpl;
import mx.izzi.admintool.dblog.dto.LogUserOperationDTO;
import mx.izzi.admintool.user.business.UserActionBusiness;
import mx.izzi.admintool.user.dao.UserActionDAO;
import mx.izzi.admintool.user.dto.PlatformRoleDTO;
import mx.izzi.admintool.user.dto.PlatformUserDTO;
import mx.izzi.admintool.user.dto.PlatformUserRoleDTO;

public class UserActionBusinessImpl extends LogUserOperationBusinessImpl implements UserActionBusiness {
	private Logger log = Logger.getLogger(this.getClass());
	
	private UserActionDAO userActionDAO = null;
	
	@Override
	public List<PlatformUserDTO> getUsers(String user){
		logUserOperation(new LogUserOperationDTO(user, "getUsers()", "UserActionBusinessImpl - getUsers()", new Timestamp(Calendar.getInstance().getTimeInMillis())));
		return (List<PlatformUserDTO>)userActionDAO.getUsers().get("RESULT_LIST");
	}
	
	@Override
	public void createUser(String userName, String password, String user){
		logUserOperation(new LogUserOperationDTO(user, "createUser()", "UserActionBusinessImpl - createUser(" + userName + ")", new Timestamp(Calendar.getInstance().getTimeInMillis())));
		userActionDAO.createUser(new PlatformUserDTO(userName, password));
	}
	
	@Override
	public void deleteUser(String userName, String user){
		logUserOperation(new LogUserOperationDTO(user, "deleteUser()", "UserActionBusinessImpl - deleteUser(" + userName + ")", new Timestamp(Calendar.getInstance().getTimeInMillis())));
		userActionDAO.deleteUser(new PlatformUserDTO(userName));
	}
	
	@Override
	public List<PlatformUserRoleDTO> getUserRoles(String userName, String user){
		logUserOperation(new LogUserOperationDTO(user, "getUserRoles()", "UserActionBusinessImpl - getUserRoles(" + userName + ")", new Timestamp(Calendar.getInstance().getTimeInMillis())));
		return (List<PlatformUserRoleDTO>)userActionDAO.getUserRoles(userName).get("RESULT_LIST");
	}
	
	@Override
	public void deleteUserRole(String userName, String role, String user){
		logUserOperation(new LogUserOperationDTO(user, "deleteUserRole()", "UserActionBusinessImpl - deleteUserRole(" + userName + ")", new Timestamp(Calendar.getInstance().getTimeInMillis())));
		PlatformUserRoleDTO userRole = new PlatformUserRoleDTO(userName, role);
		userActionDAO.deleteUserRole(userRole);
	}
	
	@Override
	public void assignUserRole(String userName, String role, String user){
		logUserOperation(new LogUserOperationDTO(user, "assignUserRole()", "UserActionBusinessImpl - assignUserRole(" + userName + ")", new Timestamp(Calendar.getInstance().getTimeInMillis())));
		PlatformUserRoleDTO userRole = new PlatformUserRoleDTO(userName, role);
		userActionDAO.assignUserRole(userRole);
	}
	
	@Override
	public List<PlatformRoleDTO> getUserNotRoles(String userName, String user){
		logUserOperation(new LogUserOperationDTO(user, "getUserNotRoles()", "UserActionBusinessImpl - getUserNotRoles(" + userName + ")", new Timestamp(Calendar.getInstance().getTimeInMillis())));
		return this.userActionDAO.getUserNotRoles(userName);
	}
	
	@Autowired
	public void setUserActionDAO(UserActionDAO userActionDAO) {
		this.userActionDAO = userActionDAO;
	}
	
}
