/**
 * PAYPERVIEW.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.types;

public interface PAYPERVIEW extends java.rmi.Remote {
    public tv.mirada.www.iris.contents.iPPVProduct.messages.FindPPVProductResponse findPPVProduct(tv.mirada.www.iris.contents.iPPVProduct.messages.FindPPVProductRequest findPPVProductRequest) throws java.rmi.RemoteException;
    public void deletePPVProduct(tv.mirada.www.iris.contents.iPPVProduct.messages.DeletePPVProductRequest deletePPVProductRequest) throws java.rmi.RemoteException;
    public void updatePPVProduct(tv.mirada.www.iris.contents.iPPVProduct.messages.UpdatePPVProductRequest updatePPVProductRequest) throws java.rmi.RemoteException;
    public tv.mirada.www.iris.contents.iPPVProduct.messages.CreatePPVProductResponse createPPVProduct(tv.mirada.www.iris.contents.iPPVProduct.messages.CreatePPVProductRequest createPPVProductRequest) throws java.rmi.RemoteException;
}
