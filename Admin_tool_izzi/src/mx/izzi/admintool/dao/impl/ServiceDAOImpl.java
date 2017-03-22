package mx.izzi.admintool.dao.impl;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.axis.AxisFault;
import org.apache.log4j.Logger;
import org.springframework.remoting.soap.SoapFaultException;

import tv.mirada.www.iris.core.service.messages.SubscribeToPackageRequest;
import tv.mirada.www.iris.core.service.messages.SubscribeToPackageResponse;
import tv.mirada.www.iris.core.service.messages.UnsubscribeFromPackageRequest;
import tv.mirada.www.iris.core.types.OperatorSubscriberId;
import tv.mirada.www.iris.core.types.PackageId;
import tv.mirada.www.iris.core.types.PackageSubscriberId;
import tv.mirada.www.iris.core.types.ServicesServiceLocator;
import tv.mirada.www.iris.core.types.ServicesSoap11Stub;
import mx.izzi.admintool.dao.ServiceDAO;
import mx.izzi.admintool.util.DetermineNode;

public class ServiceDAOImpl implements ServiceDAO{

	private Logger log = Logger.getLogger(this.getClass());

	public boolean deletePackage(String irisId){
		return deletePackage(irisId, "mex");
	}
	
	public boolean deletePackage(String irisId, String region){
		UnsubscribeFromPackageRequest request = this.createRequestIrisId(irisId);
		try{
			getStub(region).unsubscribeFromPackage(request);
		}catch(Exception e){
			log.error(e.getMessage());
			return false;
		}
		return true;
	}
	
	public SubscribeToPackageResponse addPackage(String account, String irisPackage){
		return addPackage(account, irisPackage, "mex");
	}
	
	public SubscribeToPackageResponse addPackage(String account, String irisPackage, String region){
		SubscribeToPackageRequest request = addPackageRequest(account, irisPackage);
		try{
			log.debug(request.toString());
			getStub(region).subscribeToPackage(request);
		}catch(AxisFault af){
			System.err.println("af: " + af.getFaultString());
		}catch(SoapFaultException spe){
			System.err.println("spe: " + spe.getFaultString());
		}catch(Exception e){
			System.err.println("e: " + e.getCause());
		}
		return null;
	}
	
	private SubscribeToPackageRequest addPackageRequest(String account, String irisPackage){
		SubscribeToPackageRequest request = new SubscribeToPackageRequest();
		
		OperatorSubscriberId operatorSubscriberId = new OperatorSubscriberId("IZZI", account);

		PackageSubscriberId packageSubscriberId = new PackageSubscriberId();
		packageSubscriberId.setOperatorId(operatorSubscriberId);
		
		PackageId packageId = new PackageId();
		packageId.setName(irisPackage);
		
		request.setPackageSubscriberId(packageSubscriberId);
		request.setPackageId(packageId);
		
		return request;
	}
	
	private UnsubscribeFromPackageRequest createRequestIrisId(String irisId){
		UnsubscribeFromPackageRequest request = new UnsubscribeFromPackageRequest();
		request.setIrisId(Long.parseLong(irisId));
		return request;
	}
	
	private ServicesSoap11Stub getStub(String node){
		ServicesSoap11Stub ss = null;
		ServicesServiceLocator locator = new ServicesServiceLocator();
		try{
			ss = new ServicesSoap11Stub(new URL(DetermineNode.getService(node, "service")), locator);
		}catch(AxisFault _e){
			log.error(_e.getMessage());
		}catch(MalformedURLException _URLe){
			log.error(_URLe.getMessage());
		}catch(Exception e){
			log.error(e.getMessage());
		}
		return ss;
	}
}
