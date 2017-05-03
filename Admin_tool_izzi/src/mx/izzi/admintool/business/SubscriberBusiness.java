package mx.izzi.admintool.business;

import java.util.List;

import mx.izzi.admintool.exception.SubscriberException;
import tv.mirada.www.iris.core.types.CustomerPremisesEquipment;
import tv.mirada.www.iris.core.types.Subscriber;
import tv.mirada.www.iris.core.types.Subscription;

public interface SubscriberBusiness {
	public Subscriber findSubscriber(Long irisId, String node, String user) throws SubscriberException;
	public Subscriber findSubscriber(String account, String node, String user) throws SubscriberException;
	
	public List<Subscription> getSubscriptions(String account, String node, String user);
	
	public List<CustomerPremisesEquipment> getCPEs(String account, String node, String user);
	
	public void activateSubscriber(String subscriber, String node, String user);
	public void deactivateSubscriber(String subscriber, String node, String user);
	
	public boolean newSubscriber(String account, String region, String node, String user);
	public void deleteSubscriber(String account, String node, String user);
}
