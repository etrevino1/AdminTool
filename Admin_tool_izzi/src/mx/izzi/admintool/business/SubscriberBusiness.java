package mx.izzi.admintool.business;

import java.util.List;

import tv.mirada.www.iris.core.types.CustomerPremisesEquipment;
import tv.mirada.www.iris.core.types.Subscriber;
import tv.mirada.www.iris.core.types.Subscription;

public interface SubscriberBusiness {
	public Subscriber findSubscriber(Long irisId, String node);
	public Subscriber findSubscriber(String account, String node);
	
	public List<Subscription> getSubscriptions(String account, String node);
	
	public List<CustomerPremisesEquipment> getCPEs(String account, String node);
	
	public void activateSubscriber(String subscriber, String node);
	public void deactivateSubscriber(String subscriber, String node);
	
	public boolean newSubscriber(String account, String region, String node);
	public void deleteSubscriber(String account, String node);
}
