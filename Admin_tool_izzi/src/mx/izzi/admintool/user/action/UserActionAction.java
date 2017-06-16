package mx.izzi.admintool.user.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import mx.izzi.admintool.user.business.UserActionBusiness;
import mx.izzi.admintool.user.dto.PlatformUserDTO;
import mx.izzi.admintool.user.dto.PlatformUserRoleDTO;

@Namespace("/user")
public class UserActionAction extends ActionSupport implements SessionAware, ServletRequestAware {

	static final long serialVersionUID = 1L;
	
	private Logger log = Logger.getLogger(this.getClass());
	private Map<String, Object> session = null;
	
	private String user = null, password = null, role = null;


	private List<PlatformUserDTO> users = null;
	private List<PlatformUserRoleDTO> userRoles = null;
	
	public List<PlatformUserDTO> getUsers() {
		return users;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private UserActionBusiness userActionBusiness = null;
	
	@Action(
			value="getUsers" ,
			results={
					@Result(name="success", location="../../../jsp/users/user.jsp")
			}
			)
	public String execute(){
		log.debug("UserActionAction - execute");
		
		users = userActionBusiness.getUsers();
		return SUCCESS;
	}
	
	@Action(
			value="createUser" ,
			results={
					@Result(name="success", location="/getUsers", type="redirectAction")
			}
			)
	public String createUser(){
		if(user != null && password != null && user.length() > 5 && password.length() > 5){
			userActionBusiness.createUser(user, password);
		}
		
		return SUCCESS;
	}
	
	@Action(
			value="deleteUser" ,
			results={
					@Result(name="success", location="/getUsers", type="redirectAction")
			}
			)
	public String deleteUser(){
		log.debug("Delete user: " + user);
		if(user != null && user.length() > 5){
			userActionBusiness.deleteUser(user);
		}
		
		return SUCCESS;
	}
	
	@Action(
			value="getUserRoles" ,
			results={
					@Result(name="success", location="../../../jsp/users/userRoles.jsp")
			}
			)
	public String getUserRole(){
		log.debug("Edit user: " + user);
		if(user != null && user.length() > 5){
			session.put("user", user);
		}else{
			user = (String)session.get("user");
		}
		userRoles = userActionBusiness.getUserRoles(user);
		
		return SUCCESS;
	}
	
	@Action(
			value="deleteUserRole" ,
			results={
					@Result(name="success", location="/getUserRoles", type="redirectAction")
			}
			)
	public String deleteUserRole(){
		if(user != null && user.length() > 5){
			userActionBusiness.deleteUserRole(user, role);
		}
		
		return SUCCESS;
	}
	
	@Action(
			value="assignUserRole" ,
			results={
					@Result(name="success", location="/getUserRoles", type="redirectAction")
			}
			)
	public String assignUserRole(){
		log.debug("Edit user: " + user);
		user = (String)session.get("user");
		if(user != null && user.length() > 5 && role != null && role.length() > 2){
			userActionBusiness.assignUserRole(user, role);
		}
		
		return SUCCESS;
	}
	
	public List<PlatformUserRoleDTO> getUserRoles() {
		return userRoles;
	}

	
	public void setRole(String role) {
		this.role = role;
	}
	
	@Autowired
	public void setUserActionBusiness(UserActionBusiness userActionBusiness) {
		this.userActionBusiness = userActionBusiness;
	}

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
