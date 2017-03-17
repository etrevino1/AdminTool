package mx.izzi.admintool.action;

import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import mx.izzi.admintool.business.IRDBusiness;
import mx.izzi.admintool.business.MixedBusiness;

@Namespace("/ird")
public class IRDAction extends ActionSupport {

	static final long serialVersionUID = 741852963;

	private Logger logger = Logger.getLogger(this.getClass());
	
	private String hardwareId = null;

	private MixedBusiness mixedBusiness = null;
	private IRDBusiness iRDBusiness = null;

	@Action(
			value="activateAccount" ,
			results={
					@Result(name="success", location="../findSubscriber", type="redirectAction")
			}
			)
	public String execute(){
		mixedBusiness.activateAccount((String)((Map<String, ?>)ActionContext.getContext().get("session")).get("account"), (String)((Map<String, ?>)ActionContext.getContext().get("session")).get("node"));
		return SUCCESS;
	}

	@Action(
			value="deactivateAccount" ,
			results={
					@Result(name="success", location="../findSubscriber", type="redirectAction")
			}
			)
	public String deactivateAccount(){
		mixedBusiness.deactivateAccount((String)((Map<String, ?>)ActionContext.getContext().get("session")).get("account"), (String)((Map<String, ?>)ActionContext.getContext().get("session")).get("node"));
		return SUCCESS;
	}
	
	@Action(
			value="showMessage",
			results={
					@Result(name="success", location="../findSubscriber", type="redirectAction")
			}
			)
	public String sendMessage(){
		logger.debug("Prueba de comunicación, " + hardwareId + ", " + (String)((Map<String, ?>)ActionContext.getContext().get("session")).get("node"));
		iRDBusiness.sendMessage("Prueba de comunicación", hardwareId, false, (String)((Map<String, ?>)ActionContext.getContext().get("session")).get("node"));
		return SUCCESS;
	}

	public void setMixedBusiness(MixedBusiness mixedBusiness) {
		this.mixedBusiness = mixedBusiness;
	}

	public void setiRDBusiness(IRDBusiness iRDBusiness) {
		this.iRDBusiness = iRDBusiness;
	}

	public void setHardwareId(String hardwareId) {
		this.hardwareId = hardwareId;
	}

}
