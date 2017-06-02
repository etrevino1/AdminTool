package mx.izzi.admintool.dao;

import tv.mirada.www.iris.contents.subscriberPPV.messages.GetIPPVPurchaseSettingsResponse;

public interface SubscriberPPVDAO {
	public void updateIPPVOption(String account, boolean allow, int maxPurchase, int maxCredit, String node);
	public boolean getIPPVOptionStatus(String account, String node);
	public GetIPPVPurchaseSettingsResponse getIPPVOption(String account, String node);
}
