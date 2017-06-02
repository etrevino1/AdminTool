package mx.izzi.admintool.business.impl;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import mx.izzi.admintool.business.IRDBusiness;
import mx.izzi.admintool.business.CpeBusiness;
import mx.izzi.admintool.business.MixedBusiness;
import mx.izzi.admintool.business.SubscriberBusiness;
import mx.izzi.admintool.business.SubscriberPPVBusiness;
import mx.izzi.admintool.dblog.business.impl.LogUserOperationBusinessImpl;
import mx.izzi.admintool.dblog.dto.LogUserOperationDTO;
import mx.izzi.admintool.dto.IzziTvClientDTO;
import mx.izzi.admintool.exception.CPEException;
import mx.izzi.admintool.exception.NDSTransformationTVIException;
import mx.izzi.admintool.exception.SubscriberException;
import tv.mirada.www.iris.contents.subscriberPPV.messages.GetIPPVPurchaseSettingsResponse;
import tv.mirada.www.iris.core.types.CustomerPremisesEquipment;
import tv.mirada.www.iris.core.types.Subscriber;

public class MixedBusinessImpl extends LogUserOperationBusinessImpl implements MixedBusiness {

	private Logger log = Logger.getLogger(this.getClass());

	private SubscriberBusiness subscriberBusiness = null;
	private IRDBusiness iRDBusiness = null;
	private CpeBusiness cpeBusiness = null;
	private SubscriberPPVBusiness subscriberPPVBusiness = null;


	public IzziTvClientDTO getClient(String account, String node, String user){
		log.debug("MixedBusinessImpl - getClient");

		IzziTvClientDTO client = new IzziTvClientDTO();

		try{
			client.setSubscriber(subscriberBusiness.findSubscriber(account, node, user));
			client.setSubscription(subscriberBusiness.getSubscriptions(account, node, user));
			client.setEquipment(subscriberBusiness.getCPEs(account, node, user));
			
			GetIPPVPurchaseSettingsResponse response = subscriberPPVBusiness.getIPPVDetail(account, node, user);
			
			client.setImpulsePPVAllowed(response.isIsImpulsePPVAllowed());
			client.setMaxImpulsePPVCredit(response.getMaxImpulsePPVCredit());
			client.setMaxOutstandingImpulsePPVPurchases(response.getMaxOutstandingImpulsePPVPurchases());
			
		}catch(SubscriberException se){
			return null;
		}


		return client;
	}

	public IzziTvClientDTO getClient(Long irisId, String node, String user){
		log.debug("MixedBusinessImpl - getClient");
		logUserOperation(new LogUserOperationDTO(user, "retrieve", "findSubscriber : " + irisId, new Timestamp(Calendar.getInstance().getTimeInMillis())));

		IzziTvClientDTO client = new IzziTvClientDTO();

		try{
			client.setSubscriber(subscriberBusiness.findSubscriber(irisId, node, user));
			String account = client.getSubscriber().getOperatorSubscriberId().getId();
			client.setSubscription(subscriberBusiness.getSubscriptions(account, node, user));
			client.setEquipment(subscriberBusiness.getCPEs(account, node, user));
		}catch(SubscriberException se){
			return null;
		}

		return client;
	}

	public void activateAccount(String account, String node, String user) throws NDSTransformationTVIException{
		//getEquipments
		List<CustomerPremisesEquipment> equipos = subscriberBusiness.getCPEs(account, node, user);
		//activateSubscriber
		subscriberBusiness.activateSubscriber(account, node, user);

		for(CustomerPremisesEquipment equipo : equipos){
			iRDBusiness.enableCPE(equipo, node, user);
		}

	}

	public void deactivateAccount(String account, String node, String user) throws NDSTransformationTVIException{
		//getEquipments
		List<CustomerPremisesEquipment> equipos = subscriberBusiness.getCPEs(account, node, user);

		for(CustomerPremisesEquipment equipo : equipos){
			logUserOperation(new LogUserOperationDTO(user, "deactivate", "disableCPE : " + equipo, new Timestamp(Calendar.getInstance().getTimeInMillis())));
			iRDBusiness.disableCPE(equipo, node, user);
		}

		//deactivateSubscriber
		logUserOperation(new LogUserOperationDTO(user, "deactivate", "deactivateAccount : " + account, new Timestamp(Calendar.getInstance().getTimeInMillis())));
		subscriberBusiness.deactivateSubscriber(account, node, user);
	}

	@Override
	public Subscriber findCPESubscriber(String hardwareId, String node, String user) throws CPEException, NDSTransformationTVIException{
		
		CustomerPremisesEquipment cpe = cpeBusiness.findCPE(hardwareId, node);

		if(cpe != null){
			logUserOperation(new LogUserOperationDTO(user, "retrieve", "findCPESubscriber : " + hardwareId, new Timestamp(Calendar.getInstance().getTimeInMillis())));
			try{
				return subscriberBusiness.findSubscriber(cpe.getIrisSubscriberId(), node, user);
			}catch(SubscriberException se){
				log.debug(se.getMessage());
			}
		}

		return null;
	}

	public void setSubscriberBusiness(SubscriberBusiness subscriberBusiness) {
		this.subscriberBusiness = subscriberBusiness;
	}

	public void setiRDBusiness(IRDBusiness iRDBusiness) {
		this.iRDBusiness = iRDBusiness;
	}

	public void setCpeBusiness(CpeBusiness cpeBusiness) {
		this.cpeBusiness = cpeBusiness;
	}

	@Autowired
	public void setSubscriberPPVBusiness(SubscriberPPVBusiness subscriberPPVBusiness) {
		this.subscriberPPVBusiness = subscriberPPVBusiness;
	}

}
