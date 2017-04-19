package mx.izzi.admintool.business.impl;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

import org.apache.log4j.Logger;

import mx.izzi.admintool.business.IRDBusiness;
import mx.izzi.admintool.business.CpeBusiness;
import mx.izzi.admintool.business.MixedBusiness;
import mx.izzi.admintool.business.SubscriberBusiness;
import mx.izzi.admintool.dblog.business.impl.LogUserOperationBusinessImpl;
import mx.izzi.admintool.dblog.dto.LogUserOperationDTO;
import mx.izzi.admintool.dto.IzziTvClientDTO;
import mx.izzi.admintool.exception.CPEException;
import tv.mirada.www.iris.core.types.CustomerPremisesEquipment;
import tv.mirada.www.iris.core.types.Subscriber;

public class MixedBusinessImpl extends LogUserOperationBusinessImpl implements MixedBusiness {

	private Logger log = Logger.getLogger(this.getClass());

	private SubscriberBusiness subscriberBusiness = null;
	private IRDBusiness iRDBusiness = null;
	private CpeBusiness cpeBusiness = null;

	public IzziTvClientDTO getClient(String account, String node, String user){
		log.debug("MixedBusinessImpl - getClient");
		logUserOperation(new LogUserOperationDTO(user, "retrieve", "findSubscriber : " + account, new Timestamp(Calendar.getInstance().getTimeInMillis())));
		
		IzziTvClientDTO client = new IzziTvClientDTO();
		
		client.setSubscriber(subscriberBusiness.findSubscriber(account, node));
		client.setSubscription(subscriberBusiness.getSubscriptions(account, node));
		client.setEquipment(subscriberBusiness.getCPEs(account, node));
		
		return client;
	}
	
	public IzziTvClientDTO getClient(Long irisId, String node, String user){
		log.debug("MixedBusinessImpl - getClient");
		logUserOperation(new LogUserOperationDTO(user, "retrieve", "findSubscriber : " + irisId, new Timestamp(Calendar.getInstance().getTimeInMillis())));
		
		IzziTvClientDTO client = new IzziTvClientDTO();
		
		client.setSubscriber(subscriberBusiness.findSubscriber(irisId, node));
		String account = client.getSubscriber().getOperatorSubscriberId().getId();
		client.setSubscription(subscriberBusiness.getSubscriptions(account, node));
		client.setEquipment(subscriberBusiness.getCPEs(account, node));
		
		return client;
	}
	
	public void activateAccount(String account, String node, String user){
		logUserOperation(new LogUserOperationDTO(user, "activate", "activateAccount : " + account, new Timestamp(Calendar.getInstance().getTimeInMillis())));
		//getEquipments
		List<CustomerPremisesEquipment> equipos = subscriberBusiness.getCPEs(account, node);
		//activateSubscriber
		subscriberBusiness.activateSubscriber(account, node);

		for(CustomerPremisesEquipment equipo : equipos){
			logUserOperation(new LogUserOperationDTO(user, "activate", "enableCPE : " + equipo, new Timestamp(Calendar.getInstance().getTimeInMillis())));
			iRDBusiness.enableCPE(equipo, node);
		}

	}

	public void deactivateAccount(String account, String node, String user){
		//getEquipments
		List<CustomerPremisesEquipment> equipos = subscriberBusiness.getCPEs(account, node);
		
		for(CustomerPremisesEquipment equipo : equipos){
			logUserOperation(new LogUserOperationDTO(user, "deactivate", "disableCPE : " + equipo, new Timestamp(Calendar.getInstance().getTimeInMillis())));
			iRDBusiness.disableCPE(equipo, node);
		}
		
		//deactivateSubscriber
		logUserOperation(new LogUserOperationDTO(user, "deactivate", "deactivateAccount : " + account, new Timestamp(Calendar.getInstance().getTimeInMillis())));
		subscriberBusiness.deactivateSubscriber(account, node);
	}

	@Override
	public Subscriber findCPESubscriber(String hardwareId, String node, String user) throws CPEException{

		CustomerPremisesEquipment cpe = cpeBusiness.findCPE(hardwareId, node);

		if(cpe != null){
			logUserOperation(new LogUserOperationDTO(user, "retrieve", "findCPESubscriber : " + hardwareId, new Timestamp(Calendar.getInstance().getTimeInMillis())));
			return subscriberBusiness.findSubscriber(cpe.getIrisSubscriberId(), node);
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


}
