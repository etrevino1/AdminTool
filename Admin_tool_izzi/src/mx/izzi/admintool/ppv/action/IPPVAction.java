package mx.izzi.admintool.ppv.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import mx.izzi.admintool.ppv.business.IPPVBusiness;

@Namespace("/ippv")
public class IPPVAction extends ActionSupport implements ServletRequestAware {

	private Logger log = Logger.getLogger(this.getClass());
	
	private IPPVBusiness iPPVBusiness = null;
	
	private HttpServletRequest request = null;
	
	private String externalRef, eventId, eventPrice, eventPurchaseStartTime, eventPurchaseEndTime, eventFreeviewStartTime, eventFreeviewEndTime, eventCancelStartTime, eventCancelEndTime, language, name, node = null; 
	
	@Action(value="ippv",
			results={
					@Result(name="success", location="../../../jsp/ippv/ippv.jsp")})
	public String execute(){
		return SUCCESS;
	}
	
	@Action(value="createIPPV",
			results={
					@Result(name="success", location="../../../jsp/ippv/ippv.jsp")})
	public String createPPVProduct(){
		log.debug("IPPVAction - createPPVProduct: " + node);
		iPPVBusiness.createIPPVProduct(eventId, externalRef, 
				Integer.parseInt(eventPrice), 
				eventFreeviewStartTime, eventFreeviewEndTime,
				eventPurchaseStartTime, eventPurchaseEndTime,
				eventCancelStartTime, eventCancelEndTime,
				name, "", node);
		
		return SUCCESS;
	}
	
	
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public void setExternalRef(String externalRef) {
		this.externalRef = externalRef;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public void setEventPrice(String eventPrice) {
		this.eventPrice = eventPrice;
	}

	public void setEventPurchaseStartTime(String eventPurchaseStartTime) {
		this.eventPurchaseStartTime = eventPurchaseStartTime;
	}

	public void setEventPurchaseEndTime(String eventPurchaseEndTime) {
		this.eventPurchaseEndTime = eventPurchaseEndTime;
	}

	public void setEventFreeviewStartTime(String eventFreeviewStartTime) {
		this.eventFreeviewStartTime = eventFreeviewStartTime;
	}

	public void setEventFreeviewEndTime(String eventFreeviewEndTime) {
		this.eventFreeviewEndTime = eventFreeviewEndTime;
	}

	public void setEventCancelStartTime(String eventCancelStartTime) {
		this.eventCancelStartTime = eventCancelStartTime;
	}

	public void setEventCancelEndTime(String eventCancelEndTime) {
		this.eventCancelEndTime = eventCancelEndTime;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNode(String node) {
		this.node = node;
	}

	public IPPVBusiness getiPPVBusiness() {
		return iPPVBusiness;
	}

	public String getExternalRef() {
		return externalRef;
	}

	public String getEventId() {
		return eventId;
	}

	public String getEventPrice() {
		return eventPrice;
	}

	public String getEventPurchaseStartTime() {
		return eventPurchaseStartTime;
	}

	public String getEventPurchaseEndTime() {
		return eventPurchaseEndTime;
	}

	public String getEventFreeviewStartTime() {
		return eventFreeviewStartTime;
	}

	public String getEventFreeviewEndTime() {
		return eventFreeviewEndTime;
	}

	public String getEventCancelStartTime() {
		return eventCancelStartTime;
	}

	public String getEventCancelEndTime() {
		return eventCancelEndTime;
	}

	public String getLanguage() {
		return language;
	}

	public String getName() {
		return name;
	}

	public String getNode() {
		return node;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;

	}

	@Autowired
	public void setiPPVBusiness(IPPVBusiness iPPVBusiness) {
		this.iPPVBusiness = iPPVBusiness;
	}

}
