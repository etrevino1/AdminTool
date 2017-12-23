package mx.izzi.admintool.admin.service.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import mx.izzi.admintool.admin.service.business.ServicePackageDetailBusiness;
import mx.izzi.admintool.admin.service.dto.ServicePackageDetailDTO;

@Namespace("/service")
public class ServicePackageDetailAction extends ActionSupport implements SessionAware, ServletRequestAware {
	
	static final long serialVersionUID = 741852963;
	
	private Logger log = Logger.getLogger(this.getClass());
	
	private Map<String, Object> session = null;
	private HttpServletRequest request = null;
	
	private ServicePackageDetailBusiness servicePackageDetailBusiness;
	
	private String packageName = null;
	private String packageNode = null;
	private String packageDetail = null;
	private String required = null;
	
	private List<ServicePackageDetailDTO> packageDetailInfo = null;
	
	@Action(
			value="getPackageDetails",
			results={
					@Result(name="success", location="/jsp/service/serviceDetail.jsp")
			}
			)
	public String getPackageDetail(){
		log.debug("ServicePackageAction - getPackageDetail: " + packageName);
		packageDetailInfo = servicePackageDetailBusiness.getPackageDetail(packageName);
		log.debug("" + packageDetailInfo.size());
		return SUCCESS;
	}
	
	@Action(
			value="insertPackageDetails",
			results={
					@Result(name="success", location="/jsp/service/serviceDetail.jsp")
			}
			)
	public String insertPackageDetail(){
		log.debug("ServicePackageDetailAction - insertPackageDetail: " + packageName + ", " + packageNode + ", " + packageDetail + ", " + required);
		servicePackageDetailBusiness.insertPackageDetail(packageName, packageNode, packageDetail, required);
		return SUCCESS;
	}
	
	@Action(
			value="deletePackageDetails",
			results={
					@Result(name="success", location="/jsp/service/serviceDetail.jsp")
			}
			)
	public String deletePackageDetail(){
		servicePackageDetailBusiness.deletePackageDetail(packageName, packageNode, packageDetail);
		return SUCCESS;
	}
	
	@Action(
			value="updatePackageDetails",
			results={
					@Result(name="success", location="/jsp/service/serviceDetail.jsp")
			}
			)
	public String updatePackageDetail(){
		servicePackageDetailBusiness.updatePackageDetail(packageName, packageNode, packageDetail, required);
		return SUCCESS;
	}
	
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	@Autowired
	public void setServicePackageDetailBusiness(ServicePackageDetailBusiness servicePackageDetailBusiness) {
		this.servicePackageDetailBusiness = servicePackageDetailBusiness;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageNode(String packageNode) {
		this.packageNode = packageNode;
	}

	public void setPackageDetail(String packageDetail) {
		this.packageDetail = packageDetail;
	}

	public void setRequired(String required) {
		this.required = required;
	}

	public List<ServicePackageDetailDTO> getPackageDetailInfo() {
		return packageDetailInfo;
	}

}
