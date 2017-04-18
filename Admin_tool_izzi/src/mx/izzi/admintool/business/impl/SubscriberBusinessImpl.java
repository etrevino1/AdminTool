package mx.izzi.admintool.business.impl;

import java.util.List;

import org.apache.log4j.Logger;

import tv.mirada.www.iris.core.types.CustomerPremisesEquipment;
import tv.mirada.www.iris.core.types.Subscriber;
import tv.mirada.www.iris.core.types.Subscription;
import mx.izzi.admintool.business.SubscriberBusiness;
import mx.izzi.admintool.dao.SubscriberDAO;

public class SubscriberBusinessImpl implements SubscriberBusiness{

	private Logger logger = Logger.getLogger(this.getClass());
	private SubscriberDAO subscriberDAO;
	
	@Override
	public List<Subscription> getSubscriptions(String account, String node){
		logger.debug("SubscriberBusiness - getSubscriptions(" + account + ")" + " - " + node);
		return this.getSubscriberDAO().findSubscriberSubscriptions(account, node);
	}
	
	@Override
	public List<CustomerPremisesEquipment> getCPEs(String account, String node){
		logger.debug("SubscriberBusiness - getCPEs(" + account + ")" + " - " + node);
		return this.getSubscriberDAO().findSubscriberCPEs(account, node);
	}
	
	@Override
	public Subscriber findSubscriber(String account, String node){
		logger.debug("SubscriberBusiness - FindSubscriber(" + account + ")" + " - " + node);
		return this.getSubscriberDAO().findSubscriberRequest(account, node);
	}
	
	@Override
	public Subscriber findSubscriber(Long irisId, String node){
		logger.debug("SubscriberBusiness - FindSubscriber(irisId)" + " - " + node);
		return this.getSubscriberDAO().findSubscriberRequest(irisId, node);
	}

	@Override
	public void activateSubscriber(String account, String node){
		logger.debug("SubscriberBusiness - activateSubscriber(subscriber)" + " - " + node);
		this.getSubscriberDAO().activateSubscriber(account, node);
	}
	
	@Override
	public void deactivateSubscriber(String subscriber, String node){
		logger.debug("SubscriberBusiness - deactivateSubscriber(subscriber)" + " - " + node);
		this.getSubscriberDAO().deactivateSubscriber(subscriber, node);
	}
	
	@Override
	public boolean newSubscriber(String account, String region, String node){
		logger.debug("SubscriberBusiness - newSubscriber" + " - " + node);
		return getSubscriberDAO().newSubscriber(account, region,  node);
	}
	
	@Override
	public void deleteSubscriber(String account, String node){
		logger.debug("SubscriberBusiness - deleteSubscriber" + " - " + node);
		getSubscriberDAO().deleteSubscriber(account, node);
	}
	
	public SubscriberDAO getSubscriberDAO() {
		return subscriberDAO;
	}

	public void setSubscriberDAO(SubscriberDAO subscriberDAO) {
		this.subscriberDAO = subscriberDAO;
	}
}
