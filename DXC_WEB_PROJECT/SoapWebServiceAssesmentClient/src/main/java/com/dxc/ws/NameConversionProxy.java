package com.dxc.ws;

public class NameConversionProxy implements com.dxc.ws.NameConversion {
  private String _endpoint = null;
  private com.dxc.ws.NameConversion nameConversion = null;
  
  public NameConversionProxy() {
    _initNameConversionProxy();
  }
  
  public NameConversionProxy(String endpoint) {
    _endpoint = endpoint;
    _initNameConversionProxy();
  }
  
  private void _initNameConversionProxy() {
    try {
      nameConversion = (new com.dxc.ws.NameConversionServiceLocator()).getNameConversion();
      if (nameConversion != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)nameConversion)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)nameConversion)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (nameConversion != null)
      ((javax.xml.rpc.Stub)nameConversion)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.dxc.ws.NameConversion getNameConversion() {
    if (nameConversion == null)
      _initNameConversionProxy();
    return nameConversion;
  }
  
  public java.lang.String nConvertor() throws java.rmi.RemoteException{
    if (nameConversion == null)
      _initNameConversionProxy();
    return nameConversion.nConvertor();
  }
  
  
}