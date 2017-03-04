package mx.izzi.admintool.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import mx.izzi.admintool.business.MixedBusiness;

public class IRDAction extends ActionSupport {

	static final long serialVersionUID = 741852963;

	private MixedBusiness mixedBusiness = null;

	public String execute(){
		mixedBusiness.activateAccount((String)((Map<String, ?>)ActionContext.getContext().get("session")).get("account"), (String)((Map<String, ?>)ActionContext.getContext().get("session")).get("node"));
		return SUCCESS;
	}

	public void setMixedBusiness(MixedBusiness mixedBusiness) {
		this.mixedBusiness = mixedBusiness;
	}

}
