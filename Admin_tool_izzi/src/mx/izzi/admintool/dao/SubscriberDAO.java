package mx.izzi.admintool.dao;

import java.util.List;

import tv.mirada.www.iris.core.types.CustomerPremisesEquipment;
import tv.mirada.www.iris.core.types.Subscriber;
import tv.mirada.www.iris.core.types.Subscription;

public interface SubscriberDAO {

	public boolean newSubscriber(String account, String region);
	public void deleteSubscriber(String account);
	public Subscriber findSubscriberRequest(String account);
	public Subscriber findSubscriberRequest(Long irisId);	
	public void activateSubscriber(String subscriber);
	public List<Subscription> findSubscriberSubscriptions(String account);
	public void findSubscriberSubscriptions(Long irisId);
	public  List<CustomerPremisesEquipment> findSubscriberCPEs(String account);
	
	
	public boolean newSubscriber(String account, String region, String node);
	public void deleteSubscriber(String account, String node);
	public Subscriber findSubscriberRequest(Long irisId, String node);
	public Subscriber findSubscriberRequest(String account, String node);
	public void activateSubscriber(String subscriber, String node);
	public void deactivateSubscriber(String subscriber, String node);
	public List<Subscription> findSubscriberSubscriptions(String account, String node);
	public  List<CustomerPremisesEquipment> findSubscriberCPEs(String account, String node);
}
