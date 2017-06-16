package mx.izzi.admintool.user.dto;

import java.io.Serializable;

public class PlatformUserRoleDTO implements Serializable {

	private String user = null;
	private String role = null;
	
	public PlatformUserRoleDTO(String user, String role) {
		this.user = user;
		this.role = role;
	}
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "{User: " + user + ", role: " + role + "}";
	}

}
