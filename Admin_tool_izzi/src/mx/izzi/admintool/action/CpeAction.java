package mx.izzi.admintool.action;

import java.util.Map;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import mx.izzi.admintool.business.CpeBusiness;
import mx.izzi.admintool.business.MixedBusiness;
import tv.mirada.www.iris.core.types.Subscriber;

public class CpeAction extends ActionSupport {
	static final long serialVersionUID = 1L;
	private Logger log = Logger.getLogger(this.getClass());
	
	private String irisId = null, account = null, hardwareId = null, type = null, node = null;
	
	private CpeBusiness cpeBusiness = null;
	private MixedBusiness mixedBusiness = null;
	
	public String execute(){
		log.debug("CPE iris Id: " + irisId);
		this.cpeBusiness.deleteCPE(irisId, node);
		irisId=null;
		return SUCCESS;
	}
	
	public String addCPE(){
		log.debug("CPE HardwareId " + hardwareId);
		log.debug("CPE Type " + type);
		
		this.cpeBusiness.addCPE(account, hardwareId, type, node);
		
		return SUCCESS;
	}
	
	public String findCPE(){
		log.debug("CpeAction - findCPE: hardwareId: " + hardwareId + ", node: " + node );
		
		if(hardwareId != null){
			Subscriber subscriber = mixedBusiness.findCPESubscriber(hardwareId, node);
			((Map<String, String>)ActionContext.getContext().get("session")).put("account", subscriber.getOperatorSubscriberId().getId());
			return "found";
		}
		
		return SUCCESS;
	}
	
	public void validate(){
		log.debug("CpeAction - validate");
		account = (String)((Map<String, ?>)ActionContext.getContext().get("session")).get("account");
		node = (String)((Map<String, ?>)ActionContext.getContext().get("session")).get("node");
		log.debug("account: " + account);
		log.debug("node: " + node);
	}
	
	
	
	public void setCpeBusiness(CpeBusiness cpeBusiness) {
		this.cpeBusiness = cpeBusiness;
	}

	public void setMixedBusiness(MixedBusiness mixedBusiness) {
		this.mixedBusiness = mixedBusiness;
	}

	public void setIrisId(String irisId) {
		this.irisId = irisId;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public void setHardwareId(String hardwareId) {
		this.hardwareId = hardwareId;
	}

	public void setType(String type) {
		this.type = type;
	}

}
