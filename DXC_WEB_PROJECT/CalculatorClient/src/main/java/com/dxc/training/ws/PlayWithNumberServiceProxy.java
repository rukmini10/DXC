package com.dxc.training.ws;

public class PlayWithNumberServiceProxy implements com.dxc.training.ws.PlayWithNumberService {
  private String _endpoint = null;
  private com.dxc.training.ws.PlayWithNumberService playWithNumberService = null;
  
  public PlayWithNumberServiceProxy() {
    _initPlayWithNumberServiceProxy();
  }
  
  public PlayWithNumberServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initPlayWithNumberServiceProxy();
  }
  
  private void _initPlayWithNumberServiceProxy() {
    try {
      playWithNumberService = (new com.dxc.training.ws.PlayWithNumberServiceServiceLocator()).getPlayWithNumberService();
      if (playWithNumberService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)playWithNumberService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)playWithNumberService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (playWithNumberService != null)
      ((javax.xml.rpc.Stub)playWithNumberService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.dxc.training.ws.PlayWithNumberService getPlayWithNumberService() {
    if (playWithNumberService == null)
      _initPlayWithNumberServiceProxy();
    return playWithNumberService;
  }
  
  public java.lang.String numberType(int in0) throws java.rmi.RemoteException{
    if (playWithNumberService == null)
      _initPlayWithNumberServiceProxy();
    return playWithNumberService.numberType(in0);
  }
  
  public int numberSquare(int in0) throws java.rmi.RemoteException{
    if (playWithNumberService == null)
      _initPlayWithNumberServiceProxy();
    return playWithNumberService.numberSquare(in0);
  }
  
  public int numberSum(int in0) throws java.rmi.RemoteException{
    if (playWithNumberService == null)
      _initPlayWithNumberServiceProxy();
    return playWithNumberService.numberSum(in0);
  }
  
  
}