package mx.izzi.admintool.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import mx.izzi.admintool.business.SubscriberPPVBusiness;

@Namespace("/ippv")
public class IPPVAction extends ActionSupport implements SessionAware, ServletRequestAware {

	private Logger log = Logger.getLogger(this.getClass());

	private Map<String, Object> session = null;
	private HttpServletRequest request = null;

	private String account, node;
	private int maxPurchase = 0, maxCredit = 0;
	private boolean allow = false;

	private SubscriberPPVBusiness subscriberPPVBusiness = null;


	@Action(
			value="updateIPPV" ,
			results={
					@Result(name="success", location="../findSubscriber", type="redirectAction")
			}
			)
	public String updateIPPVOption(){
		log.debug("IPPVAction - updateIPPVOption");
		if(request.isUserInRole("subscriber-updateIPPV"))
			subscriberPPVBusiness.updateIPPVOption(account, allow, maxPurchase, maxCredit, (String)session.get("node"), request.getUserPrincipal().getName());
		else
			log.debug(request.getUserPrincipal().getName() + ": has no changeIPPV access");
		return SUCCESS;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		log.debug("IRDAction - Set session");
		this.session = session;
	}

	@Override
	public void validate() {



		if(maxPurchase == 0){
			maxPurchase = 5;
		}
		if(maxCredit == 0){
			maxCredit = 100;
		}
	}

	@Autowired
	public void setSubscriberPPVBusiness(SubscriberPPVBusiness subscriberPPVBusiness) {
		this.subscriberPPVBusiness = subscriberPPVBusiness;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public void setNode(String node) {
		this.node = node;
	}

	public void setMaxPurchase(int maxPurchase) {
		this.maxPurchase = maxPurchase;
	}

	public void setMaxCredit(int maxCredit) {
		this.maxCredit = maxCredit;
	}

	public void setAllow(boolean allow) {
		this.allow = allow;
	}

}
