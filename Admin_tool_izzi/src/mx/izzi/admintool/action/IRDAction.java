package mx.izzi.admintool.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import mx.izzi.admintool.business.IRDBusiness;
import mx.izzi.admintool.business.MixedBusiness;
import mx.izzi.admintool.exception.NDSTransformationTVIException;

@Namespace("/ird")
public class IRDAction extends ActionSupport implements SessionAware, ServletRequestAware {

	static final long serialVersionUID = 741852963;

	private Logger logger = Logger.getLogger(this.getClass());

	private Map<String, Object> session = null;
	private HttpServletRequest request = null;

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
		if(request.isUserInRole("subscriber-activate")){
			logger.debug("valid session");
			try{
				mixedBusiness.activateAccount((String)session.get("account"), (String)session.get("node"), request.getUserPrincipal().getName());
			}catch(NDSTransformationTVIException ndsttvie){
				logger.error(ndsttvie.getMessage());
			}
		}else{
			logger.debug(request.getUserPrincipal().getName() + ": has no activate account access");
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
		try{
			if(request.isUserInRole("subscriber-deactivate"))
				mixedBusiness.deactivateAccount((String)session.get("account"), (String)session.get("node"), request.getUserPrincipal().getName());
			else
				logger.debug(request.getUserPrincipal().getName() + ": has no deactivate account access");
		}catch(NDSTransformationTVIException ndsttvie){
			logger.error(ndsttvie.getMessage());
		}
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
		if(request.isUserInRole("cpe-message")){
			try{
				iRDBusiness.sendMessage("Prueba de comunicación", hardwareId, false, (String)session.get("node"), request.getUserPrincipal().getName());
			}catch(NDSTransformationTVIException ndsttvie){
				logger.error(ndsttvie.getMessage());
			}
		}else{
			logger.debug(request.getUserPrincipal().getName() + ": has no message access");
		}
		return SUCCESS;
	}

	@Action(
			value="resetPin",
			results={
					@Result(name="success", location="../findSubscriber", type="redirectAction")
			}
			)
	public String resetPin(){
		logger.debug("Reset Pin 1111");
		if(request.isUserInRole("cpe-resetpin")){
			try{
				iRDBusiness.resetPin(hardwareId, (String)session.get("node"));
			}catch(NDSTransformationTVIException ndsttvie){
				logger.error(ndsttvie.getMessage());
			}
		}else{
			logger.debug(request.getUserPrincipal().getName() + ": has no reset access");
		}
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
		if(request.isUserInRole("cpe-reboot")){
			try{
				iRDBusiness.rebootSTB(hardwareId, (String)session.get("node"), request.getUserPrincipal().getName());
			}catch(NDSTransformationTVIException ndsttvie){
				logger.error(ndsttvie.getMessage());
			}
		}else{
			logger.debug(request.getUserPrincipal().getName() + ": has no reboot cpe access");
		}
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
		if(request.isUserInRole("cpe-restore")){
			try{
				iRDBusiness.restoreSTB(hardwareId, "FULL", (String)session.get("node"), request.getUserPrincipal().getName());
			}catch(NDSTransformationTVIException ndsttvie){
				logger.error(ndsttvie.getMessage());
			}
		}else{
			logger.debug(request.getUserPrincipal().getName() + ": has no restore cpe access");
		}
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
		if(request.isUserInRole("cpe-enable")){
			try{
				iRDBusiness.enableSTB(hardwareId, (String)session.get("node"), request.getUserPrincipal().getName());
			}catch(NDSTransformationTVIException ndsttvie){
				logger.error(ndsttvie.getMessage());
			}
		}else{
			logger.debug(request.getUserPrincipal().getName() + ": has no enable cpe access");
		}
		return SUCCESS;
	}

	@Action(
			value="disable",
			results={
					@Result(name="success", location="../findSubscriber", type="redirectAction")
			}
			)
	public String disableSTB(){
		logger.debug("IRDAction - disableSTB: " + hardwareId);
		if(request.isUserInRole("cpe-disable")){
			try{
				iRDBusiness.disableSTB(hardwareId, (String)session.get("node"), request.getUserPrincipal().getName());
			}catch(NDSTransformationTVIException ndsttvie){
				logger.error(ndsttvie.getMessage());
			}
		}else{
			logger.debug(request.getUserPrincipal().getName() + ": has no disable cpe access");
		}
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

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

}
