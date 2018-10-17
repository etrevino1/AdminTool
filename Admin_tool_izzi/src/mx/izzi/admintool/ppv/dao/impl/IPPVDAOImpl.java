package mx.izzi.admintool.ppv.dao.impl;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import org.apache.axis.AxisFault;
import org.apache.log4j.Logger;

import mx.izzi.admintool.ppv.dao.IPPVDAO;
import mx.izzi.admintool.util.DetermineNode;
import tv.mirada.www.iris.contents.iPPVProduct.messages.CreatePPVProductRequest;
import tv.mirada.www.iris.contents.iPPVProduct.messages.DeletePPVProductRequest;
import tv.mirada.www.iris.contents.iPPVProduct.messages.FindPPVProductRequest;
import tv.mirada.www.iris.contents.iPPVProduct.messages.FindPPVProductResponse;
import tv.mirada.www.iris.contents.types.OperatorProductId;
import tv.mirada.www.iris.contents.types.PayPerViewProduct;
import tv.mirada.www.iris.contents.types.ProductId;
import tv.mirada.www.iris.core.types.IrdServiceLocator;
import tv.mirada.www.iris.core.types.PAYPERVIEWSoap11Stub;

public class IPPVDAOImpl implements IPPVDAO {

	private Logger log = Logger.getLogger(this.getClass());
	
	@Override
	public void createIPPVProduct(PayPerViewProduct ppvp, String node) {
		log.debug("IPPVDAOImpl - createIPPVProduct");
		CreatePPVProductRequest request = getCreatePPVProductRequest(ppvp);
		try{
			getStub(node).createPPVProduct(request);
		}catch(RemoteException re){
			re.printStackTrace();
			log.error(re.getMessage());
		}
	}

	@Override
	public void deleteIPPVProduct(String ppvId, String node) {
		log.debug("IPPVDAOImpl - deleteIPPVProduct");
		DeletePPVProductRequest request = getDeletePPVProductRequest(ppvId);
		try{
			getStub(node).deletePPVProduct(request);
		}catch(RemoteException re){
			log.error(re.getMessage());
		}
	}

	@Override
	public void updateIPPVProduct() {
		log.debug("IPPVDAOImpl - updateIPPVProduct");
		
	}

	@Override
	public FindPPVProductResponse findIPPVProduct(String ppvId, String node) {
		log.debug("IPPVDAOImpl - findIPPVProduct");
		FindPPVProductResponse response = null;
		FindPPVProductRequest request = getFindPPVProductRequest(ppvId);
		try{
			response = getStub(node).findPPVProduct(request);
		}catch(RemoteException re){
			log.error(re.getMessage());
		}
		return response;
	}

	private CreatePPVProductRequest getCreatePPVProductRequest(PayPerViewProduct ppvp){
		return new CreatePPVProductRequest(ppvp);
	}
	
	private DeletePPVProductRequest getDeletePPVProductRequest(String ppvId){
		return new DeletePPVProductRequest(new ProductId(null, new OperatorProductId("CAS", ppvId)));
	}
	
	private FindPPVProductRequest getFindPPVProductRequest(String ppvId){
		return new FindPPVProductRequest(new ProductId(null, new OperatorProductId("CAS", ppvId)));
	}
	
	private PAYPERVIEWSoap11Stub getStub(String node){
		try{
			return new PAYPERVIEWSoap11Stub(new URL(DetermineNode.getService(node, "ippv")), new IrdServiceLocator());
		}catch(AxisFault af){
			log.error(af.getMessage());
		}catch(MalformedURLException mURLe){
			log.error(mURLe.getMessage());
		}catch(Exception e){
			e.printStackTrace();
			log.error(e.getMessage());
		}
		return null;
	}
	
}
