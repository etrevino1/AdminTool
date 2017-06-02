/**
 * SUBSCRIBERPPV.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.types;

public interface SUBSCRIBERPPV extends java.rmi.Remote {
    public tv.mirada.www.iris.contents.subscriberPPV.messages.FindSubscribersPPVPurchasesResponse findSubscribersPPVPurchases(tv.mirada.www.iris.contents.subscriberPPV.messages.FindSubscribersPPVPurchasesRequest findSubscribersPPVPurchasesRequest) throws java.rmi.RemoteException;
    public tv.mirada.www.iris.contents.subscriberPPV.messages.AddAdvancePPVPurchaseResponse addAdvancePPVPurchase(tv.mirada.www.iris.contents.subscriberPPV.messages.AddAdvancePPVPurchaseRequest addAdvancePPVPurchaseRequest) throws java.rmi.RemoteException;
    public void cancelAdvancePPVPurchase(tv.mirada.www.iris.contents.subscriberPPV.messages.CancelAdvancePPVPurchaseRequest cancelAdvancePPVPurchaseRequest) throws java.rmi.RemoteException;
    public tv.mirada.www.iris.contents.subscriberPPV.messages.GetIPPVPurchaseSettingsResponse getIPPVPurchaseSettings(tv.mirada.www.iris.contents.subscriberPPV.messages.GetIPPVPurchaseSettingsRequest getIPPVPurchaseSettingsRequest) throws java.rmi.RemoteException;
    public void updateIPPVPurchaseSettings(tv.mirada.www.iris.contents.subscriberPPV.messages.UpdateIPPVPurchaseSettingsRequest updateIPPVPurchaseSettingsRequest) throws java.rmi.RemoteException;
}
