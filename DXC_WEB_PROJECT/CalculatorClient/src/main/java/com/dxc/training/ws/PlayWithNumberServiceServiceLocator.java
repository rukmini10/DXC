/**
 * PlayWithNumberServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dxc.training.ws;

public class PlayWithNumberServiceServiceLocator extends org.apache.axis.client.Service implements com.dxc.training.ws.PlayWithNumberServiceService {

    public PlayWithNumberServiceServiceLocator() {
    }


    public PlayWithNumberServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PlayWithNumberServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PlayWithNumberService
    private java.lang.String PlayWithNumberService_address = "http://localhost:8080/Calculator/services/PlayWithNumberService";

    public java.lang.String getPlayWithNumberServiceAddress() {
        return PlayWithNumberService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PlayWithNumberServiceWSDDServiceName = "PlayWithNumberService";

    public java.lang.String getPlayWithNumberServiceWSDDServiceName() {
        return PlayWithNumberServiceWSDDServiceName;
    }

    public void setPlayWithNumberServiceWSDDServiceName(java.lang.String name) {
        PlayWithNumberServiceWSDDServiceName = name;
    }

    public com.dxc.training.ws.PlayWithNumberService getPlayWithNumberService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PlayWithNumberService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPlayWithNumberService(endpoint);
    }

    public com.dxc.training.ws.PlayWithNumberService getPlayWithNumberService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.dxc.training.ws.PlayWithNumberServiceSoapBindingStub _stub = new com.dxc.training.ws.PlayWithNumberServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPlayWithNumberServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPlayWithNumberServiceEndpointAddress(java.lang.String address) {
        PlayWithNumberService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.dxc.training.ws.PlayWithNumberService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.dxc.training.ws.PlayWithNumberServiceSoapBindingStub _stub = new com.dxc.training.ws.PlayWithNumberServiceSoapBindingStub(new java.net.URL(PlayWithNumberService_address), this);
                _stub.setPortName(getPlayWithNumberServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("PlayWithNumberService".equals(inputPortName)) {
            return getPlayWithNumberService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.training.dxc.com", "PlayWithNumberServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.training.dxc.com", "PlayWithNumberService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PlayWithNumberService".equals(portName)) {
            setPlayWithNumberServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
