/**
 * ExServiceSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cloud.bzu.ExProj.services;

import cloud.bzu.ExProj.services.CurrenyRates;

public class ExServiceSOAPImpl implements cloud.bzu.ExProj.services.ExService_PortType{
    public float calculateExRate(cloud.bzu.ExProj.services.Currencies parameters) throws java.rmi.RemoteException {
        return (float) CurrenyRates.getExchangeRate(parameters.getFromCurrency().toString(), parameters.getToCurrency().toString());
    }

}
