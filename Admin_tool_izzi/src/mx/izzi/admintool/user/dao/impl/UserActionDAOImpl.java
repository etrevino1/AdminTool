package mx.izzi.admintool.user.dao.impl;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import mx.izzi.admintool.user.dao.UserActionDAO;
import mx.izzi.admintool.user.dao.sp.PlatformUserRoleSPD;
import mx.izzi.admintool.user.dao.sp.PlatformUserRoleSPI;
import mx.izzi.admintool.user.dao.sp.PlatformUserRolesSPR;
import mx.izzi.admintool.user.dao.sp.PlatformUserSPD;
import mx.izzi.admintool.user.dao.sp.PlatformUserSPI;
import mx.izzi.admintool.user.dao.sp.PlatformUserSPR;
import mx.izzi.admintool.user.dto.PlatformUserDTO;
import mx.izzi.admintool.user.dto.PlatformUserRoleDTO;

public class UserActionDAOImpl implements UserActionDAO {
	private Logger log = Logger.getLogger(this.getClass());
	
	private PlatformUserSPR platformUserSPR = null;
	private PlatformUserSPI platformUserSPI = null;
	private PlatformUserSPD platformUserSPD= null;
	
	private PlatformUserRolesSPR platformUserRolesSPR = null;
	private PlatformUserRoleSPD platformUserRoleSPD = null;
	private PlatformUserRoleSPI platformUserRoleSPI = null;




	@Override
	public Map<?, ?> getUsers(){
		log.debug("UserActionDAOImpl - getUsers");
		return platformUserSPR.execute();
	}
	
	@Override
	public void createUser(PlatformUserDTO user){
		log.debug("UserActionDAOImpl - createUser");
		platformUserSPI.execute(user.getUserName(), user.getPassword());
	}
	
	@Override
	public void deleteUser(PlatformUserDTO user){
		log.debug("UserActionDAOImpl - deleteUser");
		platformUserSPD.execute(user.getUserName());
	}
	
	@Override
	public Map<?, ?> getUserRoles(String user){
		log.debug("UserActionDAOImpl - getUserRoles");
		return platformUserRolesSPR.execute(user);
	}
	
	@Override
	public void deleteUserRole(PlatformUserRoleDTO userRole){
		log.debug("UserActionDAOImpl - deleteUserRole");
		platformUserRoleSPD.execute(userRole);
	}
	
	@Override
	public void assignUserRole(PlatformUserRoleDTO userRole){
		log.debug("UserActionDAOImpl - assignUserRole");
		platformUserRoleSPI.execute(userRole);
	}
	
	@Autowired
	public void setPlatformUserSPR(PlatformUserSPR platformUserSPR) {
		this.platformUserSPR = platformUserSPR;
	}
	
	@Autowired
	public void setPlatformUserSPI(PlatformUserSPI platformUserSPI){
		this.platformUserSPI = platformUserSPI;
	}

	@Autowired
	public void setPlatformUserSPD(PlatformUserSPD platformUserSPD) {
		this.platformUserSPD = platformUserSPD;
	}

	@Autowired
	public void setPlatformUserRolesSPR(PlatformUserRolesSPR platformUserRolesSPR) {
		this.platformUserRolesSPR = platformUserRolesSPR;
	}
	
	@Autowired
	public void setPlatformUserRoleSPD(PlatformUserRoleSPD platformUserRoleSPD) {
		this.platformUserRoleSPD = platformUserRoleSPD;
	}
	
	@Autowired
	public void setPlatformUserRoleSPI(PlatformUserRoleSPI platformUserRoleSPI) {
		this.platformUserRoleSPI = platformUserRoleSPI;
	}
}
