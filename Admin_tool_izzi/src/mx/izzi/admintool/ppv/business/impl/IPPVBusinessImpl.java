package mx.izzi.admintool.ppv.business.impl;

import java.text.ParseException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import mx.izzi.admintool.dblog.business.impl.LogUserOperationBusinessImpl;
import mx.izzi.admintool.ppv.business.IPPVBusiness;
import mx.izzi.admintool.ppv.dao.IPPVDAO;
import mx.izzi.admintool.util.DateConverter;
import tv.mirada.www.iris.contents.types.EventId;
import tv.mirada.www.iris.contents.types.LocalizedProductData;
import tv.mirada.www.iris.contents.types.OperatorProductId;
import tv.mirada.www.iris.contents.types.PayPerViewProduct;
import tv.mirada.www.iris.contents.types.TimeSpan;

public class IPPVBusinessImpl extends LogUserOperationBusinessImpl implements IPPVBusiness {

	private Logger log = Logger.getLogger(this.getClass());

	private IPPVDAO iPPVDAO = null;

	@Override
	public void createIPPVProduct(String ppvId, String eventExternalRef, int price, 
			String freeviewStartTime, String freeviewEndTime,
			String PurchaseStartTime, String PurchaseEndTime,
			String CancelStartTime, String cancelEndTime,
			String name, String description, String node) {

		log.debug("IPPVBusinessImpl - createIPPVProduct");
		PayPerViewProduct ppvp = getProduct(ppvId, eventExternalRef, price, freeviewStartTime, freeviewEndTime, PurchaseStartTime, PurchaseEndTime, CancelStartTime, cancelEndTime, name, description);

		iPPVDAO.createIPPVProduct(ppvp, node);
	}

	@Override
	public void deleteIPPVProduct(String ppvId, String node) {
		iPPVDAO.deleteIPPVProduct(ppvId, node);

	}

	@Override
	public void updateIPPVProduct() {
		// TODO Auto-generated method stub

	}

	@Override
	public void findIPPVProduct(String ppvId, String node) {
		iPPVDAO.findIPPVProduct(ppvId, node);

	}

	private PayPerViewProduct getProduct(String ppvId, String eventExternalRef, int price, 
			String freeviewStartTime, String freeviewEndTime,
			String purchaseStartTime, String purchaseEndTime,
			String cancelStartTime, String cancelEndTime, 
			String name, String description){
		PayPerViewProduct ppvp = new PayPerViewProduct();

		ppvp.setOperatorProductId(new OperatorProductId("CAS", ppvId));

		EventId eventId = new EventId();
		eventId.setEventExternalRef(eventExternalRef);
		ppvp.setEventId(eventId);

		ppvp.setPrice(price*100);

		ppvp.setIsImpulsePPVAllowed(true);
		ppvp.setIsRecordingAllowed(false);

		//spans data
		try{
			ppvp.setFreeviewTimeSpan(new TimeSpan(DateConverter.getCalendar(freeviewStartTime), DateConverter.getCalendar(freeviewEndTime)));
			ppvp.setPurchaseTimeSpan(new TimeSpan(DateConverter.getCalendar(purchaseStartTime), DateConverter.getCalendar(purchaseEndTime)));
			ppvp.setCancelTimeSpan(new TimeSpan(DateConverter.getCalendar(cancelStartTime), DateConverter.getCalendar(cancelEndTime)));
		}catch(ParseException pe){
			log.error(pe.getMessage());
		}

		LocalizedProductData productData[] = {new LocalizedProductData("SPA", name, description)};
		ppvp.setLocalizedProductData(productData);


		return ppvp;
	}

	@Autowired
	public void setiPPVDAO(IPPVDAO iPPVDAO) {
		this.iPPVDAO = iPPVDAO;
	}



}
