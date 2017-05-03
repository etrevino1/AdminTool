package mx.izzi.admintool.exception;

public class SubscriberException extends Exception {
	
	static final long serialVersionUID = 1L;
	
	public SubscriberException(){
		super("SUBSCRIBER_NOT_FOUND");
	}
	
	public SubscriberException(String message){
		super(message);
	}
}
