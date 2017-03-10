package mx.izzi.admintool.exception;

public class CPEException extends Exception {
	public CPEException(String message, String cause){
		
		super(message, new Throwable(cause));
	}
}
