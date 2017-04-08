package mx.izzi.admintool.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

public class LocaleAction extends ActionSupport {
	
	static final long serialVersionUID = 7418529645L;
	
	private Logger log = Logger.getLogger(this.getClass());
	
	public String execute() {
		log.debug("LocaleAction");
		return SUCCESS;
	}

}
