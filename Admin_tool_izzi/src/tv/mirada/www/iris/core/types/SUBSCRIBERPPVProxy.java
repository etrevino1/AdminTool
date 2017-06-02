package tv.mirada.www.iris.core.types;

public class SUBSCRIBERPPVProxy implements tv.mirada.www.iris.core.types.SUBSCRIBERPPV {
  private String _endpoint = null;
  private tv.mirada.www.iris.core.types.SUBSCRIBERPPV sUBSCRIBERPPV = null;
  
  public SUBSCRIBERPPVProxy() {
    _initSUBSCRIBERPPVProxy();
  }
  
  public SUBSCRIBERPPVProxy(String endpoint) {
    _endpoint = endpoint;
    _initSUBSCRIBERPPVProxy();
  }
  
  private void _initSUBSCRIBERPPVProxy() {
    try {
      sUBSCRIBERPPV = (new tv.mirada.www.iris.core.types.SUBSCRIBERPPVServiceLocator()).getSUBSCRIBERPPVSoap11();
      if (sUBSCRIBERPPV != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sUBSCRIBERPPV)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sUBSCRIBERPPV)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sUBSCRIBERPPV != null)
      ((javax.xml.rpc.Stub)sUBSCRIBERPPV)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public tv.mirada.www.iris.core.types.SUBSCRIBERPPV getSUBSCRIBERPPV() {
    if (sUBSCRIBERPPV == null)
      _initSUBSCRIBERPPVProxy();
    return sUBSCRIBERPPV;
  }
  
  public tv.mirada.www.iris.contents.subscriberPPV.messages.FindSubscribersPPVPurchasesResponse findSubscribersPPVPurchases(tv.mirada.www.iris.contents.subscriberPPV.messages.FindSubscribersPPVPurchasesRequest findSubscribersPPVPurchasesRequest) throws java.rmi.RemoteException{
    if (sUBSCRIBERPPV == null)
      _initSUBSCRIBERPPVProxy();
    return sUBSCRIBERPPV.findSubscribersPPVPurchases(findSubscribersPPVPurchasesRequest);
  }
  
  public tv.mirada.www.iris.contents.subscriberPPV.messages.AddAdvancePPVPurchaseResponse addAdvancePPVPurchase(tv.mirada.www.iris.contents.subscriberPPV.messages.AddAdvancePPVPurchaseRequest addAdvancePPVPurchaseRequest) throws java.rmi.RemoteException{
    if (sUBSCRIBERPPV == null)
      _initSUBSCRIBERPPVProxy();
    return sUBSCRIBERPPV.addAdvancePPVPurchase(addAdvancePPVPurchaseRequest);
  }
  
  public void cancelAdvancePPVPurchase(tv.mirada.www.iris.contents.subscriberPPV.messages.CancelAdvancePPVPurchaseRequest cancelAdvancePPVPurchaseRequest) throws java.rmi.RemoteException{
    if (sUBSCRIBERPPV == null)
      _initSUBSCRIBERPPVProxy();
    sUBSCRIBERPPV.cancelAdvancePPVPurchase(cancelAdvancePPVPurchaseRequest);
  }
  
  public tv.mirada.www.iris.contents.subscriberPPV.messages.GetIPPVPurchaseSettingsResponse getIPPVPurchaseSettings(tv.mirada.www.iris.contents.subscriberPPV.messages.GetIPPVPurchaseSettingsRequest getIPPVPurchaseSettingsRequest) throws java.rmi.RemoteException{
    if (sUBSCRIBERPPV == null)
      _initSUBSCRIBERPPVProxy();
    return sUBSCRIBERPPV.getIPPVPurchaseSettings(getIPPVPurchaseSettingsRequest);
  }
  
  public void updateIPPVPurchaseSettings(tv.mirada.www.iris.contents.subscriberPPV.messages.UpdateIPPVPurchaseSettingsRequest updateIPPVPurchaseSettingsRequest) throws java.rmi.RemoteException{
    if (sUBSCRIBERPPV == null)
      _initSUBSCRIBERPPVProxy();
    sUBSCRIBERPPV.updateIPPVPurchaseSettings(updateIPPVPurchaseSettingsRequest);
  }
  
  
}