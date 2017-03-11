/**
 * ExService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cloud.bzu.ExProj.services;

public class ExService_ServiceLocator extends org.apache.axis.client.Service implements cloud.bzu.ExProj.services.ExService_Service {

    public ExService_ServiceLocator() {
    }


    public ExService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ExService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ExServiceSOAP
    private java.lang.String ExServiceSOAP_address = "http://bzu.cloud:8080/ExProj";

    public java.lang.String getExServiceSOAPAddress() {
        return ExServiceSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ExServiceSOAPWSDDServiceName = "ExServiceSOAP";

    public java.lang.String getExServiceSOAPWSDDServiceName() {
        return ExServiceSOAPWSDDServiceName;
    }

    public void setExServiceSOAPWSDDServiceName(java.lang.String name) {
        ExServiceSOAPWSDDServiceName = name;
    }

    public cloud.bzu.ExProj.services.ExService_PortType getExServiceSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ExServiceSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getExServiceSOAP(endpoint);
    }

    public cloud.bzu.ExProj.services.ExService_PortType getExServiceSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cloud.bzu.ExProj.services.ExServiceSOAPStub _stub = new cloud.bzu.ExProj.services.ExServiceSOAPStub(portAddress, this);
            _stub.setPortName(getExServiceSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setExServiceSOAPEndpointAddress(java.lang.String address) {
        ExServiceSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cloud.bzu.ExProj.services.ExService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                cloud.bzu.ExProj.services.ExServiceSOAPStub _stub = new cloud.bzu.ExProj.services.ExServiceSOAPStub(new java.net.URL(ExServiceSOAP_address), this);
                _stub.setPortName(getExServiceSOAPWSDDServiceName());
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
        if ("ExServiceSOAP".equals(inputPortName)) {
            return getExServiceSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://bzu.cloud:8080/ExProj/services/", "ExService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://bzu.cloud:8080/ExProj/services/", "ExServiceSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ExServiceSOAP".equals(portName)) {
            setExServiceSOAPEndpointAddress(address);
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
