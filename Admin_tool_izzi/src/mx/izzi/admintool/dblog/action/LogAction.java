package mx.izzi.admintool.dblog.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import mx.izzi.admintool.dblog.business.LogUserOperationBusiness;
import mx.izzi.admintool.dblog.dto.LogUserOperationDTO;

@Namespace("/log")
public class LogAction extends ActionSupport implements SessionAware, ServletRequestAware {

	static final long serialVersionUID = 7414552963L;

	private Logger log = Logger.getLogger(this.getClass());
	
	private Map<String, Object> session = null;
	private HttpServletRequest request = null;
	
	private List<LogUserOperationDTO> logs = null;
	private String user = "";
	
	private LogUserOperationBusiness logUserOperationBusiness = null;

	@Action(
			value="viewLog" ,
			results={
					@Result(name="success", location="../../../jsp/logs/viewLogs.jsp"),
					@Result(name="error", location="../findSubscriber", type="redirectAction")
			}
			)
	public String getUserLog(){
		log.debug("LogAction - getUserLog");
		
		if(request.isUserInRole("log-query")){
			logs = logUserOperationBusiness.getLogUserOperation(user);
			return SUCCESS;
		}else{
			return ERROR;
		}
		
	}
	
	public List<LogUserOperationDTO> getLogs() {
		return logs;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
	public void setLogUserOperationBusiness(LogUserOperationBusiness logUserOperationBusiness) {
		this.logUserOperationBusiness = logUserOperationBusiness;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
}
