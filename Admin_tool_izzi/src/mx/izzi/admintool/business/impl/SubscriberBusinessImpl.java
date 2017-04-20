package mx.izzi.admintool.business.impl;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

import org.apache.log4j.Logger;

import tv.mirada.www.iris.core.types.CustomerPremisesEquipment;
import tv.mirada.www.iris.core.types.Subscriber;
import tv.mirada.www.iris.core.types.Subscription;
import mx.izzi.admintool.business.SubscriberBusiness;
import mx.izzi.admintool.dao.SubscriberDAO;
import mx.izzi.admintool.dblog.business.impl.LogUserOperationBusinessImpl;
import mx.izzi.admintool.dblog.dto.LogUserOperationDTO;

public class SubscriberBusinessImpl extends LogUserOperationBusinessImpl implements SubscriberBusiness{

	private Logger logger = Logger.getLogger(this.getClass());
	private SubscriberDAO subscriberDAO;
	
	@Override
	public List<Subscription> getSubscriptions(String account, String node, String user){
		logger.debug("SubscriberBusiness - getSubscriptions(" + account + ")" + " - " + node);
		logUserOperation(new LogUserOperationDTO(user, "getSubscriptions", "getSubscriptions: " + account, new Timestamp(Calendar.getInstance().getTimeInMillis())));
		return this.getSubscriberDAO().findSubscriberSubscriptions(account, node);
	}
	
	@Override
	public List<CustomerPremisesEquipment> getCPEs(String account, String node, String user){
		logger.debug("SubscriberBusiness - getCPEs(" + account + ")" + " - " + node);
		logUserOperation(new LogUserOperationDTO(user, "getCPEs", "getCPEs: " + account, new Timestamp(Calendar.getInstance().getTimeInMillis())));
		return this.getSubscriberDAO().findSubscriberCPEs(account, node);
	}
	
	@Override
	public Subscriber findSubscriber(String account, String node, String user){
		logger.debug("SubscriberBusiness - FindSubscriber(" + account + ")" + " - " + node);
		logUserOperation(new LogUserOperationDTO(user, "FindSubscriber", "FindSubscriber: " + account, new Timestamp(Calendar.getInstance().getTimeInMillis())));
		return this.getSubscriberDAO().findSubscriberRequest(account, node);
	}
	
	@Override
	public Subscriber findSubscriber(Long irisId, String node, String user){
		logger.debug("SubscriberBusiness - FindSubscriber(irisId)" + " - " + node);
		logUserOperation(new LogUserOperationDTO(user, "FindSubscriber(irisId)", "FindSubscriber(irisId): " + irisId, new Timestamp(Calendar.getInstance().getTimeInMillis())));
		return this.getSubscriberDAO().findSubscriberRequest(irisId, node);
	}

	@Override
	public void activateSubscriber(String account, String node, String user){
		logger.debug("SubscriberBusiness - activateSubscriber(subscriber)" + " - " + node);
		logUserOperation(new LogUserOperationDTO(user, "activateSubscriber", "activateSubscriber: " + account, new Timestamp(Calendar.getInstance().getTimeInMillis())));
		this.getSubscriberDAO().activateSubscriber(account, node);
	}
	
	@Override
	public void deactivateSubscriber(String account, String node, String user){
		logger.debug("SubscriberBusiness - deactivateSubscriber(subscriber)" + " - " + node);
		logUserOperation(new LogUserOperationDTO(user, "deactivateSubscriber", "deactivateSubscriber: " + account, new Timestamp(Calendar.getInstance().getTimeInMillis())));
		this.getSubscriberDAO().deactivateSubscriber(account, node);
	}
	
	@Override
	public boolean newSubscriber(String account, String region, String node, String user){
		logger.debug("SubscriberBusiness - newSubscriber" + " - " + node);
		logUserOperation(new LogUserOperationDTO(user, "newSubscriber", "newSubscriber: " + account + ", region: " + region, new Timestamp(Calendar.getInstance().getTimeInMillis())));
		return getSubscriberDAO().newSubscriber(account, region,  node);
	}
	
	@Override
	public void deleteSubscriber(String account, String node, String user){
		logger.debug("SubscriberBusiness - deleteSubscriber" + " - " + node);
		logUserOperation(new LogUserOperationDTO(user, "deleteSubscriber", "deleteSubscriber: " + account, new Timestamp(Calendar.getInstance().getTimeInMillis())));
		getSubscriberDAO().deleteSubscriber(account, node);
	}
	
	public SubscriberDAO getSubscriberDAO() {
		return subscriberDAO;
	}

	public void setSubscriberDAO(SubscriberDAO subscriberDAO) {
		this.subscriberDAO = subscriberDAO;
	}
}
