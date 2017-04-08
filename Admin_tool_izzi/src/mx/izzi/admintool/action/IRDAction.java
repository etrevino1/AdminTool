package mx.izzi.admintool.action;

import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import mx.izzi.admintool.business.IRDBusiness;
import mx.izzi.admintool.business.MixedBusiness;

@Namespace("/ird")
public class IRDAction extends ActionSupport implements SessionAware {

	static final long serialVersionUID = 741852963;

	private Logger logger = Logger.getLogger(this.getClass());
	
	private Map<String, Object> session = null;

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
		logger.debug("IRDAction - execute");
		if(session != null){
			mixedBusiness.activateAccount((String)session.get("account"), (String)session.get("node"));
			logger.debug("valid session");
		}else{
			logger.debug("not-valid session");
		}
		
		
		return SUCCESS;
	}

	@Action(
			value="deactivateAccount" ,
			results={
					@Result(name="success", location="../findSubscriber", type="redirectAction")
			}
			)
	public String deactivateAccount(){
		mixedBusiness.deactivateAccount((String)session.get("account"), (String)session.get("node"));
		return SUCCESS;
	}

	@Action(
			value="showMessage",
			results={
					@Result(name="success", location="../findSubscriber", type="redirectAction")
			}
			)
	public String sendMessage(){
		logger.debug("Prueba de comunicación, " + hardwareId + ", " + (String)session.get("node"));
		iRDBusiness.sendMessage("Prueba de comunicación", hardwareId, false, (String)session.get("node"));
		return SUCCESS;
	}

	@Action(
			value="reboot",
			results={
					@Result(name="success", location="../findSubscriber", type="redirectAction")
			}
			)
	public String rebootSTB(){
		logger.debug("IRDAction - rebootSTB");
		iRDBusiness.rebootSTB(hardwareId, (String)session.get("node"));
		return SUCCESS;
	}
	
	@Action(
			value="restore",
			results={
					@Result(name="success", location="../findSubscriber", type="redirectAction")
			}
			)
	public String restoreSTB(){
		logger.debug("IRDAction - restoreSTB");
		iRDBusiness.restoreSTB(hardwareId, "FULL", (String)session.get("node"));
		return SUCCESS;
	}
	
	@Action(
			value="enable",
			results={
					@Result(name="success", location="../findSubscriber", type="redirectAction")
			}
			)
	public String enableSTB(){
		logger.debug("IRDAction - enableSTB: " + hardwareId);
		iRDBusiness.enableSTB(hardwareId, (String)session.get("node"));
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

	public void validate(){
		if(session != null ){
			logger.debug("Valid");
		}else{
			logger.debug("Not valid");
		}
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		logger.debug("IRDAction - Set session");
		this.session = session;
	}

}
