/**
 * ExServiceSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cloud.bzu.ExProj.services;

public class ExServiceSOAPSkeleton implements cloud.bzu.ExProj.services.ExService_PortType, org.apache.axis.wsdl.Skeleton {
    private cloud.bzu.ExProj.services.ExService_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://bzu.cloud:8080/ExProj/services/", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://bzu.cloud:8080/ExProj/services/", "currencies"), cloud.bzu.ExProj.services.Currencies.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("calculateExRate", _params, new javax.xml.namespace.QName("http://bzu.cloud:8080/ExProj/services/", "rate"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "CalculateExRate"));
        _oper.setSoapAction("http://bzu.cloud:8080/ExProj/services/NewOperation");
        _myOperationsList.add(_oper);
        if (_myOperations.get("calculateExRate") == null) {
            _myOperations.put("calculateExRate", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("calculateExRate")).add(_oper);
    }

    public ExServiceSOAPSkeleton() {
        this.impl = new cloud.bzu.ExProj.services.ExServiceSOAPImpl();
    }

    public ExServiceSOAPSkeleton(cloud.bzu.ExProj.services.ExService_PortType impl) {
        this.impl = impl;
    }
    public float calculateExRate(cloud.bzu.ExProj.services.Currencies parameters) throws java.rmi.RemoteException
    {
        float ret = impl.calculateExRate(parameters);
        return ret;
    }

}
