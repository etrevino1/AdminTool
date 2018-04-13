package mx.izzi.admintool.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import mx.izzi.admintool.business.CpeBusiness;
import mx.izzi.admintool.business.MixedBusiness;
import mx.izzi.admintool.exception.CPEException;
import mx.izzi.admintool.exception.NDSTransformationTVIException;
import tv.mirada.www.iris.core.types.Subscriber;

public class CpeAction extends ActionSupport implements SessionAware, ServletRequestAware{
	static final long serialVersionUID = 1L;
	private Logger log = Logger.getLogger(this.getClass());

	private Map<String, Object> session = null;
	private HttpServletRequest request = null;

	private String irisId = null, account = null, hardwareId = null, type = null, node = null;

	private CpeBusiness cpeBusiness = null;
	private MixedBusiness mixedBusiness = null;

	public String execute(){
		log.debug("CPE iris Id: " + irisId);
		if(request.isUserInRole("cpe-delete")){
			try{
				this.cpeBusiness.deleteCPE(irisId, node, request.getUserPrincipal().getName());
			}catch(NDSTransformationTVIException ndsttvie){
				log.error(ndsttvie.getMessage());
			}
			irisId=null;
		}else{
			log.debug(request.getUserPrincipal().getName() + ": has no delete cpe access");
		}
		return SUCCESS;
	}

	public String addCPE(){
		log.debug("CPE HardwareId " + hardwareId);
		log.debug("CPE Type " + type);
		if(request.isUserInRole("cpe-add")){
			try{
				this.cpeBusiness.addCPE(account, hardwareId, type, node, request.getUserPrincipal().getName());
			}catch(NDSTransformationTVIException ndsttvie){
				log.error(ndsttvie.getMessage());
			}
		}else{
			log.debug(request.getUserPrincipal().getName() + ": has no add cpe access");
		}
		return SUCCESS;
	}

	@Action(value="findCPE",
			results={
					@Result(name="success", location="/cpe.jsp"),
					@Result(name="found", location="findSubscriber", type="redirectAction"),
					@Result(name="error", location="findCPE", type="redirectAction")})
	public String findCPE(){
		log.debug("CpeAction - findCPE: hardwareId: " + hardwareId + ", node: " + node );
		if(request.isUserInRole("cpe-find")){
			if(hardwareId != null){
				try{
					Subscriber subscriber = mixedBusiness.findCPESubscriber(hardwareId, node, request.getUserPrincipal().getName());
					session.put("account", subscriber.getOperatorSubscriberId().getId());
					session.put("node", node);
				}catch(CPEException cpee){
					return ERROR;
				}catch(NDSTransformationTVIException ndsttvie){
					log.error(ndsttvie.getMessage());
					ndsttvie.printStackTrace();
					return ERROR;
				}
				return "found";
			}
		}else{
			log.debug(request.getUserPrincipal().getName() + ": has no find account by cpe access");
		}


		return SUCCESS;
	}

	public void validate(){
		log.debug("CpeAction - validate");
		account = (String)session.get("account");
		if(node == null)
			node = (String)session.get("node");
		log.debug("account: " + account);
		log.debug("node: " + node);
	}



	public void setCpeBusiness(CpeBusiness cpeBusiness) {
		this.cpeBusiness = cpeBusiness;
	}

	public void setMixedBusiness(MixedBusiness mixedBusiness) {
		this.mixedBusiness = mixedBusiness;
	}

	public void setIrisId(String irisId) {
		this.irisId = irisId;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public void setHardwareId(String hardwareId) {
		this.hardwareId = hardwareId;
	}

	//	@RequiredFieldValidator(message = "Required")
	public String getHardwareId(){
		return hardwareId;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setNode(String node){
		this.node = node;
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
