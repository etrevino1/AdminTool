package mx.izzi.admintool.dao.impl;

import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.axis.AxisFault;
import org.apache.log4j.Logger;

import mx.izzi.admintool.dao.SubscriberDAO;
import mx.izzi.admintool.exception.SubscriberException;
import mx.izzi.admintool.util.DetermineNode;
import tv.mirada.www.iris.core.subscriber.messages.ActivateSubscriberRequest;
import tv.mirada.www.iris.core.subscriber.messages.CreateSubscriberRequest;
import tv.mirada.www.iris.core.subscriber.messages.DeactivateSubscriberRequest;
import tv.mirada.www.iris.core.subscriber.messages.DeleteSubscriberRequest;
import tv.mirada.www.iris.core.subscriber.messages.FindSubscriberRequest;
import tv.mirada.www.iris.core.subscriber.messages.FindSubscriberResponse;
import tv.mirada.www.iris.core.subscriber.messages.FindSubscribersCustomerPremisesEquipmentRequest;
import tv.mirada.www.iris.core.subscriber.messages.FindSubscribersCustomerPremisesEquipmentResponse;
import tv.mirada.www.iris.core.subscriber.messages.FindSubscribersSubscriptionsRequest;
import tv.mirada.www.iris.core.subscriber.messages.FindSubscribersSubscriptionsResponse;
import tv.mirada.www.iris.core.types.CustomerPremisesEquipment;
import tv.mirada.www.iris.core.types.Gender;
import tv.mirada.www.iris.core.types.OperatorSubscriberId;
import tv.mirada.www.iris.core.types.Subscriber;
import tv.mirada.www.iris.core.types.SubscribersServiceLocator;
import tv.mirada.www.iris.core.types.SubscribersSoap11Stub;
import tv.mirada.www.iris.core.types.Subscription;

public class SubscriberDAOImpl implements SubscriberDAO {

	private Logger logger = Logger.getLogger(this.getClass());

	private SubscribersServiceLocator serviceLocator = null;

	private FindSubscriberResponse findSubscriberResponse = null;

	private FindSubscriberRequest findSubscriber (Long irisId) {
		FindSubscriberRequest request = new FindSubscriberRequest();
		request.setIrisId(irisId);
		return request;
	}

	private FindSubscriberRequest findSubscriber (String account){
		FindSubscriberRequest request = new FindSubscriberRequest();
		request.setOperatorId(new OperatorSubscriberId("IZZI", account));
		return request;
	}

	private FindSubscribersSubscriptionsRequest findSubscribersSubscriptions(String account){
		FindSubscribersSubscriptionsRequest request = new FindSubscribersSubscriptionsRequest();
		request.setOperatorId(new OperatorSubscriberId("IZZI", account));
		return request;
	}

	private FindSubscribersCustomerPremisesEquipmentRequest findSubscribersCustomerPremisesEquipmentRequest(String account){
		FindSubscribersCustomerPremisesEquipmentRequest request = new FindSubscribersCustomerPremisesEquipmentRequest();
		request.setOperatorId(new OperatorSubscriberId("IZZI", account));
		return request;
	}

	private ActivateSubscriberRequest activateSubscriberRequest(String subscriber){
		ActivateSubscriberRequest request = new ActivateSubscriberRequest();
		request.setOperatorId(new OperatorSubscriberId("IZZI", subscriber));
		return request;
	}

	private DeactivateSubscriberRequest getDeactivateSubscriberRequest(String subscriber){
		DeactivateSubscriberRequest request = new DeactivateSubscriberRequest();
		request.setOperatorId(new OperatorSubscriberId("IZZI", subscriber));
		return request;
	}

	private CreateSubscriberRequest createSubscriberRequest(String account, String region){
		CreateSubscriberRequest request = new CreateSubscriberRequest();
		Subscriber subscriber = new Subscriber();
		subscriber.setOperatorSubscriberId(new OperatorSubscriberId("IZZI", account));
		subscriber.setPassword("0000");
		subscriber.setCreationDatetime(new GregorianCalendar());
		subscriber.setGender(Gender.MALE);
		subscriber.setOTTMaxDevices(new BigInteger("2"));
		subscriber.setOTTCooldown(new BigInteger("0"));
		subscriber.setUsage("Test");
		subscriber.setRegionName(region);
		request.setSubscriber(subscriber);
		return request;
	}

	private DeleteSubscriberRequest deleteSubscriberRequest(String account){
		DeleteSubscriberRequest request = new DeleteSubscriberRequest();
		request.setOperatorId(new OperatorSubscriberId("IZZI", account));
		return request;
	}

	public Subscriber findSubscriberRequest(String account) throws SubscriberException{
		return findSubscriberRequest(account, "mex");
	}

	public Subscriber findSubscriberRequest(String account, String region) throws SubscriberException{
		FindSubscriberRequest request = findSubscriber(account);
		Subscriber subscriber = null;
		try {
			findSubscriberResponse = getStub(region).findSubscriber(request);
			subscriber = findSubscriberResponse.getSubscriber();
		}catch(AxisFault af){
			if(af.getMessage().equals("SUBSCRIBER_NOT_FOUND")){
				logger.error("AxisFault: " + af.getMessage());
				throw new SubscriberException();
			}
		}catch(RemoteException re){
			logger.error(re.getMessage());
			re.printStackTrace();
		}
		logger.debug("Subscriber: " + subscriber);
		return subscriber;
	}

	public Subscriber findSubscriberRequest(Long irisId){
		return findSubscriberRequest(irisId, "mex");
	}

	public Subscriber findSubscriberRequest(Long irisId, String region){
		FindSubscriberRequest findSubscriber = findSubscriber(irisId);

		Subscriber subscriber = null;
		try {
			findSubscriberResponse = getStub(region).findSubscriber(findSubscriber);
			subscriber = findSubscriberResponse.getSubscriber();
		}catch(RemoteException re){
			logger.error(re.getMessage());
			re.printStackTrace();
		}
		logger.debug("Subscriber: " + subscriber);
		return subscriber;
	}

	public List<Subscription> findSubscriberSubscriptions(String account){
		return findSubscriberSubscriptions(account, "mex");
	}

	public List<Subscription> findSubscriberSubscriptions(String account, String node){
		List<Subscription> suscripcion = null;

		FindSubscribersSubscriptionsRequest request=  findSubscribersSubscriptions(account);
		try {
			FindSubscribersSubscriptionsResponse response = getStub(node).findSubscribersSubscriptions(request);
			suscripcion = response.getSubscription();
		}catch(RemoteException re){
			logger.debug(re.getMessage());
			re.printStackTrace();
		}
		logger.debug("Subscriptions: " + suscripcion);
		return suscripcion;
	}

	public void findSubscriberSubscriptions(Long irisId){

	}

	public List<CustomerPremisesEquipment> findSubscriberCPEs(String account){
		return findSubscriberCPEs(account, "mex");
	}

	public List<CustomerPremisesEquipment> findSubscriberCPEs(String account, String node){
		List<CustomerPremisesEquipment> equipos = null;
		FindSubscribersCustomerPremisesEquipmentRequest request=  findSubscribersCustomerPremisesEquipmentRequest(account);
		try {
			FindSubscribersCustomerPremisesEquipmentResponse response = getStub(node).findSubscribersCustomerPremisesEquipment(request);

			equipos = response.getCustomerPremisesEquipments();
		}catch(RemoteException re){
			logger.error(re.getMessage());
			re.printStackTrace();
		}
		logger.debug("Equipos: " + equipos);

		return equipos;
	}

	public void activateSubscriber(String subscriber){
		activateSubscriber(subscriber, "mex");
	}

	public void activateSubscriber(String subscriber, String node){
		ActivateSubscriberRequest request = activateSubscriberRequest(subscriber);
		try{
			getStub(node).activateSubscriber(request);
		}catch(RemoteException re){
			logger.error(re.getStackTrace());
			re.printStackTrace();
		}
	}

	@Override
	public void deactivateSubscriber(String subscriber, String node){
		DeactivateSubscriberRequest request = getDeactivateSubscriberRequest(subscriber);
		try{
			getStub(node).deactivateSubscriber(request);
		}catch(RemoteException re){
			logger.error(re.getMessage());
			logger.error(re.getCause());
			logger.error(re.getStackTrace());
		}

	}

	public boolean newSubscriber(String account, String region){
		return newSubscriber(account, region, "mex");
	}

	public boolean newSubscriber(String account, String region, String node){
		CreateSubscriberRequest request = createSubscriberRequest(account, region);
		logger.debug("SubscriberDAOImpl - newSubscriber" + request);
		try{
			if(getStub(node).createSubscriber(request).getIrisSubscriberId() > 0)
				return true;
		}catch(RemoteException re){
			logger.error(re.getMessage());
			logger.error(re.getCause());
			logger.error(re.getStackTrace());
		}
		return false;
	}

	public void deleteSubscriber(String account){
		deleteSubscriber(account, "mex");
	}

	public void deleteSubscriber(String account, String region){
		DeleteSubscriberRequest request = deleteSubscriberRequest(account);
		try{
			getStub(region).deleteSubscriber(request);
		}catch(RemoteException re){
			logger.error(re.getMessage());
			logger.error(re.getCause());
			logger.error(re.getStackTrace());
		}
	}

	private SubscribersSoap11Stub getStub(String node){
		SubscribersSoap11Stub ss = null;
		serviceLocator = new SubscribersServiceLocator();
		try{
			logger.debug("URL=" + DetermineNode.getService(node, "subscriber"));
			ss = new SubscribersSoap11Stub(new URL(DetermineNode.getService(node, "subscriber")), serviceLocator);
		}catch(AxisFault _e){
			logger.error(_e.getMessage());
		}catch(MalformedURLException _URLe){
			logger.error(_URLe.getMessage());
		}catch(Exception e){
			logger.error(e.getMessage());
			logger.error(e.getCause());
			logger.error(e.getStackTrace());
			e.printStackTrace();
		}
		return ss;
	}
}
