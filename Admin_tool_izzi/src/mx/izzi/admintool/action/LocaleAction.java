package mx.izzi.admintool.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

public class LocaleAction extends ActionSupport {
	
	private Logger log = Logger.getLogger(this.getClass());
	
	public String execute() {
		log.debug("LocaleAction");
		return SUCCESS;
	}

}
