package mx.izzi.admintool.user.dto;

public class PlatformRoleDTO {
	private String roleName;

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public PlatformRoleDTO(String roleName) {
		super();
		this.roleName = roleName;
	}

	@Override
	public String toString() {
		return "{ Role: " + roleName + " }";
	}
	
	
}
