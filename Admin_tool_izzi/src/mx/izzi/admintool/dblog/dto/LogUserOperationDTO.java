package mx.izzi.admintool.dblog.dto;

import java.sql.Timestamp;

public class LogUserOperationDTO {
	private String user = "";
	private String operation = "";
	private String detail = "";
	private Timestamp date = null;
	
	public LogUserOperationDTO(String user, String operation, String detail, Timestamp date){
		this.user = user;
		this.operation = operation;
		this.detail = detail;
		this.date = date;
	}

	public String getUser() {
		return user;
	}

	public String getOperation() {
		return operation;
	}

	public String getDetail() {
		return detail;
	}

	@Override
	public String toString() {
		return "{" + user + ", " + operation + ", " + detail + ", " + date + "}";
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}
}
