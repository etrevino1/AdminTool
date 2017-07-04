package mx.izzi.admintool.action;

import mx.izzi.admintool.business.ServiceBusiness;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ServiceAction extends ActionSupport implements SessionAware, ServletRequestAware {
	static final long serialVersionUID = 1L;
	private Logger log = Logger.getLogger(this.getClass());

	private Map<String, Object> session = null;
	private HttpServletRequest request = null;

	private ServiceBusiness serviceBusiness;

	private String irisId = null, account = null, irisPackage = null, node = null;

	public String execute(){
		log.debug("Service iris Id" + irisId);
		if(request.isUserInRole("service-unsubscribe")){
			this.serviceBusiness.deletePackage(irisId, node,request.getUserPrincipal().getName());
			irisId=null;
		}else{
			log.debug(request.getUserPrincipal().getName() + ": has no unsubscribe from package access");
		}
		return SUCCESS;
	}

	public String addPackage(){
		log.debug("Service irisPackage:" + irisPackage);
		log.debug("Service account:" + account);
		if(request.isUserInRole("service-subscribe")){
			this.serviceBusiness.addPackage(account, irisPackage, node, request.getUserPrincipal().getName());
		}else{
			log.debug(request.getUserPrincipal().getName() + ": has no subscribe to package access");
		}
		return SUCCESS;
	}

	public void validate(){
		account = (String)session.get("account");
		node = (String)session.get("node");
	}

	public void setIrisPackage(String irisPackage) {
		this.irisPackage = irisPackage;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public void setIrisId(String irisId) {
		this.irisId = irisId;
	}

	public void setServiceBusiness(ServiceBusiness serviceBusiness) {
		this.serviceBusiness = serviceBusiness;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
}
