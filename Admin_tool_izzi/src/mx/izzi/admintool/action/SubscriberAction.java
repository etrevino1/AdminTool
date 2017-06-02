package mx.izzi.admintool.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import mx.izzi.admintool.business.MixedBusiness;
import mx.izzi.admintool.business.SubscriberBusiness;
import mx.izzi.admintool.dto.IzziTvClientDTO;

import com.opensymphony.xwork2.ActionSupport;

public class SubscriberAction extends ActionSupport implements SessionAware, ServletRequestAware {

	static final long serialVersionUID = 74185458763L;

	private Logger log = Logger.getLogger(this.getClass());

	private Map<String, Object> session = null;
	HttpServletRequest request = null;

	private SubscriberBusiness subscriberBusiness;
	private MixedBusiness mixedBusiness;

	private String account = null, irisId = null, node = null, region = null;

	private IzziTvClientDTO client = null;

	@Override
	public String execute () {
		log.debug("SubscriberAction - execute : " + account + ", " + irisId + ", " + node);
		
		if(request.isUserInRole("tomcat")){
			log.debug("Has it");
		}else{
			addActionError("ACCESS_DENIED");
			log.debug("does???");
			return LOGIN;
		}
		
		
		if(account == null && irisId == null){
			return SUCCESS;
		}
		if(node == null || node.equals("") ){
			node = "mex";
		}
		client = null;
		String user = request.getUserPrincipal().getName();
		if(account != null && account.length() > 0){
			client = mixedBusiness.getClient(account, node, user);
		}else if (irisId != null && irisId.length() > 0){
			client = mixedBusiness.getClient(Long.parseLong(irisId), node, user);
			account = client.getSubscriber().getOperatorSubscriberId().getId();
		}

		session.put("account", account);
		session.put("node", node);
		return SUCCESS;
	}

	public String newSubscriber(){
		if(getSubscriberBusiness().newSubscriber(account, region, node, request.getUserPrincipal().getName()))
			return SUCCESS;
		return ERROR;
	}

	public String deleteSubscriber(){
		getSubscriberBusiness().deleteSubscriber((String)session.get("account"), node, request.getUserPrincipal().getName());
		session.remove("account");
		account = null;

		return SUCCESS;
	}

	public void validate(){

		log.debug("SubscriberAction - execute - session" + session);

		if(session != null && !session.isEmpty()){
			log.debug("valid");
			log.debug("Node=" + node);
			
			if(node == null || node == ""){
				node = (String)session.get("node");
				if(node == null){
					node = "mex";
				}
			}

			log.debug("Account=" + account);
			if(account == null){
				account = (String)session.get("account");
			}
		}else{
			log.debug("Not valid");
		}
		

	}

	public String getIrisId() {
		return irisId;
	}

	public void setIrisId(String irisId) {
		this.irisId = irisId;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public SubscriberBusiness getSubscriberBusiness() {
		return subscriberBusiness;
	}

	public void setSubscriberBusiness(SubscriberBusiness subscriberBusiness) {
		this.subscriberBusiness = subscriberBusiness;
	}

	public void setMixedBusiness(MixedBusiness mixedBusiness) {
		this.mixedBusiness = mixedBusiness;
	}

	public void setNode(String node) {
		this.node = node;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public IzziTvClientDTO getClient() {
		return client;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
}
