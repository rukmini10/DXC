/**
 * NameConversionService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dxc.ws;

public interface NameConversionService extends javax.xml.rpc.Service {
    public java.lang.String getNameConversionAddress();

    public com.dxc.ws.NameConversion getNameConversion() throws javax.xml.rpc.ServiceException;

    public com.dxc.ws.NameConversion getNameConversion(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
