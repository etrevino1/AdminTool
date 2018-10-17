package tv.mirada.www.iris.core.types;

public class PAYPERVIEWProxy implements tv.mirada.www.iris.core.types.PAYPERVIEW {
  private String _endpoint = null;
  private tv.mirada.www.iris.core.types.PAYPERVIEW pAYPERVIEW = null;
  
  public PAYPERVIEWProxy() {
    _initPAYPERVIEWProxy();
  }
  
  public PAYPERVIEWProxy(String endpoint) {
    _endpoint = endpoint;
    _initPAYPERVIEWProxy();
  }
  
  private void _initPAYPERVIEWProxy() {
    try {
      pAYPERVIEW = (new tv.mirada.www.iris.core.types.PAYPERVIEWServiceLocator()).getPAYPERVIEWSoap11();
      if (pAYPERVIEW != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)pAYPERVIEW)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)pAYPERVIEW)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (pAYPERVIEW != null)
      ((javax.xml.rpc.Stub)pAYPERVIEW)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public tv.mirada.www.iris.core.types.PAYPERVIEW getPAYPERVIEW() {
    if (pAYPERVIEW == null)
      _initPAYPERVIEWProxy();
    return pAYPERVIEW;
  }
  
  public tv.mirada.www.iris.contents.iPPVProduct.messages.FindPPVProductResponse findPPVProduct(tv.mirada.www.iris.contents.iPPVProduct.messages.FindPPVProductRequest findPPVProductRequest) throws java.rmi.RemoteException{
    if (pAYPERVIEW == null)
      _initPAYPERVIEWProxy();
    return pAYPERVIEW.findPPVProduct(findPPVProductRequest);
  }
  
  public void deletePPVProduct(tv.mirada.www.iris.contents.iPPVProduct.messages.DeletePPVProductRequest deletePPVProductRequest) throws java.rmi.RemoteException{
    if (pAYPERVIEW == null)
      _initPAYPERVIEWProxy();
    pAYPERVIEW.deletePPVProduct(deletePPVProductRequest);
  }
  
  public void updatePPVProduct(tv.mirada.www.iris.contents.iPPVProduct.messages.UpdatePPVProductRequest updatePPVProductRequest) throws java.rmi.RemoteException{
    if (pAYPERVIEW == null)
      _initPAYPERVIEWProxy();
    pAYPERVIEW.updatePPVProduct(updatePPVProductRequest);
  }
  
  public tv.mirada.www.iris.contents.iPPVProduct.messages.CreatePPVProductResponse createPPVProduct(tv.mirada.www.iris.contents.iPPVProduct.messages.CreatePPVProductRequest createPPVProductRequest) throws java.rmi.RemoteException{
    if (pAYPERVIEW == null)
      _initPAYPERVIEWProxy();
    return pAYPERVIEW.createPPVProduct(createPPVProductRequest);
  }
  
  
}