package mx.izzi.admintool.ppv.dao;

import tv.mirada.www.iris.contents.iPPVProduct.messages.FindPPVProductResponse;
import tv.mirada.www.iris.contents.types.PayPerViewProduct;

public interface IPPVDAO {
	public void createIPPVProduct(PayPerViewProduct ppvp, String node);
	public void deleteIPPVProduct(String ppvId, String node);
	public void updateIPPVProduct();
	
	public FindPPVProductResponse findIPPVProduct(String ppvId, String node);
}
