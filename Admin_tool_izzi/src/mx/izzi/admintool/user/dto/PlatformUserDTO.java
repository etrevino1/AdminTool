package mx.izzi.admintool.user.dto;

public class PlatformUserDTO {
	private String userName = null;
	private String password = null;
	
	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public PlatformUserDTO(String userName){
		this.userName = userName;
	}
	
	public PlatformUserDTO(String userName, String password){
		this.userName = userName;
		this.password = password;
	}
	
	public String toString(){
		return "{" + userName + ", " + password + "}";
	}
}
