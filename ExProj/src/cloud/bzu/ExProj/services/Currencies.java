/**
 * Currencies.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cloud.bzu.ExProj.services;

public class Currencies  implements java.io.Serializable {
    private cloud.bzu.ExProj.services.Currency fromCurrency;

    private cloud.bzu.ExProj.services.Currency toCurrency;

    public Currencies() {
    }

    public Currencies(
           cloud.bzu.ExProj.services.Currency fromCurrency,
           cloud.bzu.ExProj.services.Currency toCurrency) {
           this.fromCurrency = fromCurrency;
           this.toCurrency = toCurrency;
    }


    /**
     * Gets the fromCurrency value for this Currencies.
     * 
     * @return fromCurrency
     */
    public cloud.bzu.ExProj.services.Currency getFromCurrency() {
        return fromCurrency;
    }


    /**
     * Sets the fromCurrency value for this Currencies.
     * 
     * @param fromCurrency
     */
    public void setFromCurrency(cloud.bzu.ExProj.services.Currency fromCurrency) {
        this.fromCurrency = fromCurrency;
    }


    /**
     * Gets the toCurrency value for this Currencies.
     * 
     * @return toCurrency
     */
    public cloud.bzu.ExProj.services.Currency getToCurrency() {
        return toCurrency;
    }


    /**
     * Sets the toCurrency value for this Currencies.
     * 
     * @param toCurrency
     */
    public void setToCurrency(cloud.bzu.ExProj.services.Currency toCurrency) {
        this.toCurrency = toCurrency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Currencies)) return false;
        Currencies other = (Currencies) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fromCurrency==null && other.getFromCurrency()==null) || 
             (this.fromCurrency!=null &&
              this.fromCurrency.equals(other.getFromCurrency()))) &&
            ((this.toCurrency==null && other.getToCurrency()==null) || 
             (this.toCurrency!=null &&
              this.toCurrency.equals(other.getToCurrency())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getFromCurrency() != null) {
            _hashCode += getFromCurrency().hashCode();
        }
        if (getToCurrency() != null) {
            _hashCode += getToCurrency().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Currencies.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bzu.cloud:8080/ExProj/services/", "currencies"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FromCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bzu.cloud:8080/ExProj/services/", "Currency"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ToCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bzu.cloud:8080/ExProj/services/", "Currency"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
