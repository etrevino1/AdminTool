package mx.izzi.admintool.business.impl;

import java.util.List;

import mx.izzi.admintool.business.IRDBusiness;
import mx.izzi.admintool.business.CpeBusiness;
import mx.izzi.admintool.business.MixedBusiness;
import mx.izzi.admintool.business.SubscriberBusiness;
import mx.izzi.admintool.exception.CPEException;
import tv.mirada.www.iris.core.types.CustomerPremisesEquipment;
import tv.mirada.www.iris.core.types.Subscriber;

public class MixedBusinessImpl implements MixedBusiness {

	private SubscriberBusiness subscriberBusiness = null;
	private IRDBusiness iRDBusiness = null;
	private CpeBusiness cpeBusiness = null;

	public void activateAccount(String subscriber, String node){
		//getEquipments
		List<CustomerPremisesEquipment> equipos = subscriberBusiness.getCPEs(subscriber, node);
		//activateSubscriber
		subscriberBusiness.activateSubscriber(subscriber, node);

		for(CustomerPremisesEquipment equipo : equipos){
			iRDBusiness.enableCPE(equipo, node);
		}

	}

	public void deactivateAccount(String subscriber, String node){
		//getEquipments
		List<CustomerPremisesEquipment> equipos = subscriberBusiness.getCPEs(subscriber, node);
		
		for(CustomerPremisesEquipment equipo : equipos){
			iRDBusiness.disableCPE(equipo, node);
		}
		
		//deactivateSubscriber
		subscriberBusiness.deactivateSubscriber(subscriber, node);
	}

	@Override
	public Subscriber findCPESubscriber(String hardwareId, String node) throws CPEException{

		CustomerPremisesEquipment cpe = cpeBusiness.findCPE(hardwareId, node);

		if(cpe != null){
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
