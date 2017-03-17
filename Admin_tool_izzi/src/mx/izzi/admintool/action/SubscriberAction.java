package mx.izzi.admintool.action;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import tv.mirada.www.iris.core.types.CustomerPremisesEquipment;
import tv.mirada.www.iris.core.types.Subscriber;
import tv.mirada.www.iris.core.types.Subscription;
import mx.izzi.admintool.business.SubscriberBusiness;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SubscriberAction extends ActionSupport {

	private Logger logger = Logger.getLogger(this.getClass());

	private SubscriberBusiness subscriberBusiness;
	private String account = null, irisId = null, node = null, region = null;

	private Subscriber subscriber = null;
	private List<Subscription> subscription = null;
	private List<CustomerPremisesEquipment> equipments = null;

	@Override
	public String execute () {
		logger.debug("SubscriberAction - execute : " + account + ", " + irisId + ", " + node);
		
		if(account == null && irisId == null){
			return SUCCESS;
		}
		
		if(account != null && account.length() > 0){
			subscriber = getSubscriberBusiness().findSubscriber(account, node);
		}else if (irisId != null && irisId.length() > 0){
			subscriber = getSubscriberBusiness().findSubscriber(Long.parseLong(irisId), node);
			account = subscriber.getOperatorSubscriberId().getId();
		}
		if(subscriber != null){
			subscription = getSubscriberBusiness().getSubscriptions(account, node);
			equipments = getSubscriberBusiness().getCPEs(account, node);
		}
		((Map<String, String>)ActionContext.getContext().get("session")).put("account", account);
		((Map<String, String>)ActionContext.getContext().get("session")).put("node", node);
		return SUCCESS;
	}
	
	public String newSubscriber(){
		if(getSubscriberBusiness().newSubscriber(account, region, node))
			return SUCCESS;
		return ERROR;
	}
	
	public String deleteSubscriber(){
		getSubscriberBusiness().deleteSubscriber((String)((Map<String, ?>)ActionContext.getContext().get("session")).get("account"), node);
		return SUCCESS;
	}

	public void validate(){
		logger.debug("Node=" + node);
		if(node == null || node == ""){
			node = "mex";
		}
		logger.debug("Account=" + account);
		if(account == null){
			account = (String)((Map<String, ?>)ActionContext.getContext().get("session")).get("account");
		}
	}
	
	public List<Subscription> getSubscription() {
		return subscription;
	}
	
	public void setSubscription(List<Subscription> suscription) {
		this.subscription = suscription;
	}
	
	public Subscriber getSubscriber() {
		return subscriber;
	}
	
	public void setSubscriber(Subscriber subscriber) {
		this.subscriber = subscriber;
	}
	
	public List<CustomerPremisesEquipment> getEquipments() {
		return equipments;
	}

	public void setEquipments(List<CustomerPremisesEquipment> equipments) {
		this.equipments = equipments;
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

	public void setNode(String node) {
		this.node = node;
	}

	public void setRegion(String region) {
		this.region = region;
	}

}
