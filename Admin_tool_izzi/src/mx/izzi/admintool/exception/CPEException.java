package mx.izzi.admintool.exception;

public class CPEException extends Exception {
	
	static final long serialVersionUID = 1L;
	
	public CPEException(){
		super("CPE_NOT_FOUND");
	}
	
	public CPEException(String message){
		super(message);
	}
	
	public CPEException(String message, String cause){
		super(message, new Throwable(cause));
	}
}
