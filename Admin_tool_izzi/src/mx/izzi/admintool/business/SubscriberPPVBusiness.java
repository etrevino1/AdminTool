package mx.izzi.admintool.business;

import tv.mirada.www.iris.contents.subscriberPPV.messages.GetIPPVPurchaseSettingsResponse;

public interface SubscriberPPVBusiness {
	public void updateIPPVOption(String account, boolean allow, int maxPurchase, int maxCredit, String node, String user);
	public GetIPPVPurchaseSettingsResponse getIPPVDetail(String account, String node, String user);
}
