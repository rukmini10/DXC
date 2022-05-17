/**
 * NameConversionServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dxc.ws;

public class NameConversionServiceLocator extends org.apache.axis.client.Service implements com.dxc.ws.NameConversionService {

    public NameConversionServiceLocator() {
    }


    public NameConversionServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NameConversionServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for NameConversion
    private java.lang.String NameConversion_address = "http://localhost:8005/SoapWebServiceAssesment/services/NameConversion";

    public java.lang.String getNameConversionAddress() {
        return NameConversion_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NameConversionWSDDServiceName = "NameConversion";

    public java.lang.String getNameConversionWSDDServiceName() {
        return NameConversionWSDDServiceName;
    }

    public void setNameConversionWSDDServiceName(java.lang.String name) {
        NameConversionWSDDServiceName = name;
    }

    public com.dxc.ws.NameConversion getNameConversion() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(NameConversion_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNameConversion(endpoint);
    }

    public com.dxc.ws.NameConversion getNameConversion(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.dxc.ws.NameConversionSoapBindingStub _stub = new com.dxc.ws.NameConversionSoapBindingStub(portAddress, this);
            _stub.setPortName(getNameConversionWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNameConversionEndpointAddress(java.lang.String address) {
        NameConversion_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.dxc.ws.NameConversion.class.isAssignableFrom(serviceEndpointInterface)) {
                com.dxc.ws.NameConversionSoapBindingStub _stub = new com.dxc.ws.NameConversionSoapBindingStub(new java.net.URL(NameConversion_address), this);
                _stub.setPortName(getNameConversionWSDDServiceName());
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
        if ("NameConversion".equals(inputPortName)) {
            return getNameConversion();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.dxc.com", "NameConversionService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.dxc.com", "NameConversion"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("NameConversion".equals(portName)) {
            setNameConversionEndpointAddress(address);
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
