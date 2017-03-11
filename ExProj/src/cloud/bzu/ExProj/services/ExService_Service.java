/**
 * ExService_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cloud.bzu.ExProj.services;

public interface ExService_Service extends javax.xml.rpc.Service {
    public java.lang.String getExServiceSOAPAddress();

    public cloud.bzu.ExProj.services.ExService_PortType getExServiceSOAP() throws javax.xml.rpc.ServiceException;

    public cloud.bzu.ExProj.services.ExService_PortType getExServiceSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
