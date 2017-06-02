package mx.izzi.admintool.dto;

import java.util.List;

import tv.mirada.www.iris.core.types.CustomerPremisesEquipment;
import tv.mirada.www.iris.core.types.Subscriber;
import tv.mirada.www.iris.core.types.Subscription;

public class IzziTvClientDTO {
	private Subscriber subscriber;
	private List<Subscription> subscription;
	private List<CustomerPremisesEquipment> equipment;
	private boolean impulsePPVAllowed;
	private int maxOutstandingImpulsePPVPurchases;
	private int MaxImpulsePPVCredit;
	
	
	public boolean isImpulsePPVAllowed() {
		return impulsePPVAllowed;
	}
	public String getImpulsePPVAllowed() {
		return impulsePPVAllowed+"".toUpperCase();
	}
	public void setImpulsePPVAllowed(boolean impulsePPVAllowed) {
		this.impulsePPVAllowed = impulsePPVAllowed;
	}
	public int getMaxOutstandingImpulsePPVPurchases() {
		return maxOutstandingImpulsePPVPurchases;
	}
	public void setMaxOutstandingImpulsePPVPurchases(int maxOutstandingImpulsePPVPurchases) {
		this.maxOutstandingImpulsePPVPurchases = maxOutstandingImpulsePPVPurchases;
	}
	public int getMaxImpulsePPVCredit() {
		return MaxImpulsePPVCredit;
	}
	public void setMaxImpulsePPVCredit(int maxImpulsePPVCredit) {
		MaxImpulsePPVCredit = maxImpulsePPVCredit;
	}
	public Subscriber getSubscriber() {
		return subscriber;
	}
	public void setSubscriber(Subscriber susbcriber) {
		this.subscriber = susbcriber;
	}
	public List<Subscription> getSubscription() {
		return subscription;
	}
	public void setSubscription(List<Subscription> subscription) {
		this.subscription = subscription;
	}
	public List<CustomerPremisesEquipment> getEquipment() {
		return equipment;
	}
	public void setEquipment(List<CustomerPremisesEquipment> equipment) {
		this.equipment = equipment;
	}
	@Override
	public String toString() {
		return "client: [" + subscriber + ": " + subscription + ": " + equipment + "]";
	}
}
