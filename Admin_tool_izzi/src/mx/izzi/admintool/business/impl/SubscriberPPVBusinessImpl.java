package mx.izzi.admintool.business.impl;

import java.sql.Timestamp;
import java.util.Calendar;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import mx.izzi.admintool.business.SubscriberPPVBusiness;
import mx.izzi.admintool.dao.SubscriberPPVDAO;
import mx.izzi.admintool.dblog.business.impl.LogUserOperationBusinessImpl;
import mx.izzi.admintool.dblog.dto.LogUserOperationDTO;
import tv.mirada.www.iris.contents.subscriberPPV.messages.GetIPPVPurchaseSettingsResponse;

public class SubscriberPPVBusinessImpl extends LogUserOperationBusinessImpl implements SubscriberPPVBusiness {

	private Logger log = Logger.getLogger(this.getClass());
	
	private SubscriberPPVDAO subscriberPPVDAO = null;
	
	@Override
	public void updateIPPVOption(String account, boolean allow, int maxPurchase, int maxCredit, String node, String user) {
		log.debug("SubscriberPPVBusinessImpl - updateIPPVOption");
		allow = !subscriberPPVDAO.getIPPVOptionStatus(account, node);
		subscriberPPVDAO.updateIPPVOption(account, allow, maxPurchase, maxCredit, node);
		logUserOperation(new LogUserOperationDTO(user, "updateIPPVOption", "updateIPPVOption: " + account + ", " + allow, new Timestamp(Calendar.getInstance().getTimeInMillis())));
	}
	
	@Override
	public GetIPPVPurchaseSettingsResponse getIPPVDetail(String account, String node, String user){
		log.debug("SubscriberPPVBusinessImpl - getIPPVDetail");
		GetIPPVPurchaseSettingsResponse response = subscriberPPVDAO.getIPPVOption(account, node);
		logUserOperation(new LogUserOperationDTO(user, "getIPPVDetail", "getIPPVDetail: " + account, new Timestamp(Calendar.getInstance().getTimeInMillis())));
		return response;
	}
	
	@Autowired
	public void setSubscriberPPVDAO(SubscriberPPVDAO subscriberPPVDAO) {
		this.subscriberPPVDAO = subscriberPPVDAO;
	}
}
