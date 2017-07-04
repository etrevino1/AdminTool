package mx.izzi.admintool.dao.impl;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import org.apache.axis.AxisFault;
import org.apache.log4j.Logger;

import mx.izzi.admintool.dao.SubscriberPPVDAO;
import mx.izzi.admintool.util.DetermineNode;
import tv.mirada.www.iris.contents.subscriberPPV.messages.GetIPPVPurchaseSettingsRequest;
import tv.mirada.www.iris.contents.subscriberPPV.messages.GetIPPVPurchaseSettingsResponse;
import tv.mirada.www.iris.contents.subscriberPPV.messages.UpdateIPPVPurchaseSettingsRequest;
import tv.mirada.www.iris.core.types.OperatorSubscriberId;
import tv.mirada.www.iris.core.types.SUBSCRIBERPPVServiceLocator;
import tv.mirada.www.iris.core.types.SUBSCRIBERPPVSoap11Stub;

public class SubscriberPPDAOImpl implements SubscriberPPVDAO {

	private Logger log = Logger.getLogger(this.getClass());

	@Override
	public void updateIPPVOption(String account, boolean allow, int maxPurchase, int maxCredit, String node) {
		log.debug("SubscriberPPDAOImpl - updateIPPVOption");
		UpdateIPPVPurchaseSettingsRequest request = getUpdateIPPVOptionRequest(account, allow, maxPurchase, maxCredit);
		try{
			getStub(node).updateIPPVPurchaseSettings(request);
		}catch(RemoteException re){
			log.error(re.getMessage());
		}
	}
	
	@Override
	public boolean getIPPVOptionStatus(String account, String node){
		log.debug("SubscriberPPDAOImpl - getIPPVOptionStatus");
		GetIPPVPurchaseSettingsRequest request = getIPPVOption(account);
		try{
			return getStub(node).getIPPVPurchaseSettings(request).isIsImpulsePPVAllowed();
		}catch(RemoteException re){
			log.error(re.getMessage());
			return false;
		}
	}
	
	@Override
	public GetIPPVPurchaseSettingsResponse getIPPVOption(String account, String node){
		log.debug("SubscriberPPDAOImpl - getIPPVOption");
		GetIPPVPurchaseSettingsRequest request = getIPPVOption(account);
		try{
			return getStub(node).getIPPVPurchaseSettings(request);
		}catch(RemoteException re){
			log.error(re.getMessage());
			return null;
		}
	}

	private UpdateIPPVPurchaseSettingsRequest getUpdateIPPVOptionRequest(String account, boolean allow, int maxPurchase, int maxCredit){
		log.debug("SubscriberPPDAOImpl - getUpdateIPPVOptionRequest");
		UpdateIPPVPurchaseSettingsRequest request = new UpdateIPPVPurchaseSettingsRequest();
		request.setOperatorId(new OperatorSubscriberId("IZZI", account));
		request.setIsImpulsePPVAllowed(allow);
		request.setMaxOutstandingImpulsePPVPurchases(maxPurchase);
		request.setMaxImpulsePPVCredit(maxCredit);

		return request;
	}
	
	private GetIPPVPurchaseSettingsRequest getIPPVOption(String account){
		GetIPPVPurchaseSettingsRequest request = new GetIPPVPurchaseSettingsRequest();
		request.setOperatorId(new OperatorSubscriberId("IZZI", account));
		
		return request;
	}

	private SUBSCRIBERPPVSoap11Stub getStub(String node){
		log.debug("SubscriberPPDAOImpl - getStub");
		SUBSCRIBERPPVSoap11Stub ss = null;
		SUBSCRIBERPPVServiceLocator locator = new SUBSCRIBERPPVServiceLocator();
		try{
			log.debug("URL=" + DetermineNode.getService(node, "ippv"));
			ss = new SUBSCRIBERPPVSoap11Stub(new URL(DetermineNode.getService(node, "ippv")), locator);
		}catch(AxisFault af){
			log.error(af.getMessage());
		}catch(MalformedURLException mfurl){
			log.error(mfurl.getMessage());
		}catch(Exception e){
			log.error(e.getMessage());
			e.printStackTrace();
		}

		return ss;
	}
}
