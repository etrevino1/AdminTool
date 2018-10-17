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

import mx.izzi.admintool.admin.service.business.ServicePackageBusiness;
import mx.izzi.admintool.admin.service.dto.ServicePackageDTO;
import mx.izzi.admintool.admin.service.dto.ServicePackageDetailDTO;
import mx.izzi.admintool.business.NodeBusiness;
import mx.izzi.admintool.dto.MiradaNodeDTO;

@Namespace("/service")
public class ServicePackageAction extends ActionSupport implements SessionAware, ServletRequestAware {

	static final long serialVersionUID = 741852963;
	
	private Logger log = Logger.getLogger(this.getClass());
	private Map<String, Object> session = null;
	private HttpServletRequest request = null;
	
	private ServicePackageBusiness servicePackageBusiness;
	private NodeBusiness nodeBusiness;
	
	private String packageId = null;
	private String packageName = null;
	private String packageNode = "";
	private String required = null;
	
	private List<MiradaNodeDTO> nodes = null;
	private List<ServicePackageDTO> packages = null;
	private List<ServicePackageDetailDTO> packageDetails = null;
	
	
	@Action(
			value="getPackage",
			results={
					@Result(name="success", location="/jsp/service/service.jsp")
			}
			)
	public String getPackage(){
		log.debug("ServicePackageAction - getPackage: " + packageNode);
		packages = this.servicePackageBusiness.getPackage(packageNode);
		
		return SUCCESS;
	}
	
	@Action(
			value="insertPackage",
			results={
					@Result(name="success", location="getPackage", type="redirect"),
					@Result(name="ACCESS", location="/jsp/service/serviceNew.jsp")
			}
			)
	public String insertPackage(){
		log.debug("ServicePackageAction - insertPackage");
		
		if(packageName != null && packageNode != null && packageName.length() > 0 && packageNode.length() > 0){
			this.servicePackageBusiness.insertPackage(packageName, packageNode, (required.equals("true")?1:0));//revisar boolean
		}else{
			nodes = nodeBusiness.getNodes();
			log.debug(nodes.size());
			return "ACCESS";
		}
		return SUCCESS;
	}
	
	@Action(
			value="deletePackage",
			results={
					@Result(name="success", location="getPackage", type="redirect")
			}
			)
	public String deletePackage(){
		log.debug("ServicePackageAction - deletePackage: " + packageId);
		
		this.servicePackageBusiness.deletePackage(Integer.parseInt(packageId));
		
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
	public void setServicePackageBusiness(ServicePackageBusiness servicePackageBusiness) {
		this.servicePackageBusiness = servicePackageBusiness;
	}

	@Autowired
	public void setNodeBusiness(NodeBusiness nodeBusiness) {
		this.nodeBusiness = nodeBusiness;
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getPackageNode() {
		return packageNode;
	}

	public void setPackageNode(String packageNode) {
		this.packageNode = packageNode;
	}

	public String getPackageId() {
		return packageId;
	}

	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

	public String getRequired() {
		return required;
	}

	public void setRequired(String required) {
		this.required = required;
	}

	public List<ServicePackageDTO> getPackages() {
		return packages;
	}

	public void setPackages(List<ServicePackageDTO> packages) {
		this.packages = packages;
	}

	public List<MiradaNodeDTO> getNodes() {
		return nodes;
	}

	public void setNodes(List<MiradaNodeDTO> nodes) {
		this.nodes = nodes;
	}

	public List<ServicePackageDetailDTO> getPackageDetails() {
		return packageDetails;
	}
	
	
}
