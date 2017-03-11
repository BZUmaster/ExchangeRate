/**
 * Currency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cloud.bzu.ExProj.services;

public class Currency implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Currency(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AUD = "AUD";
    public static final java.lang.String _BGN = "BGN";
    public static final java.lang.String _BRL = "BRL";
    public static final java.lang.String _CAD = "CAD";
    public static final java.lang.String _CHF = "CHF";
    public static final java.lang.String _CNY = "CNY";
    public static final java.lang.String _CZK = "CZK";
    public static final java.lang.String _DKK = "DKK";
    public static final java.lang.String _EUR = "EUR";
    public static final java.lang.String _GBP = "GBP";
    public static final java.lang.String _HKD = "HKD";
    public static final java.lang.String _HRK = "HRK";
    public static final java.lang.String _HUF = "HUF";
    public static final java.lang.String _IDR = "IDR";
    public static final java.lang.String _ILS = "ILS";
    public static final java.lang.String _INR = "INR";
    public static final java.lang.String _JPY = "JPY";
    public static final java.lang.String _KRW = "KRW";
    public static final java.lang.String _MXN = "MXN";
    public static final java.lang.String _MYR = "MYR";
    public static final java.lang.String _NOK = "NOK";
    public static final java.lang.String _NZD = "NZD";
    public static final java.lang.String _PHP = "PHP";
    public static final java.lang.String _PLN = "PLN";
    public static final java.lang.String _RON = "RON";
    public static final java.lang.String _RUB = "RUB";
    public static final java.lang.String _SEK = "SEK";
    public static final java.lang.String _SGD = "SGD";
    public static final java.lang.String _THB = "THB";
    public static final java.lang.String _TRY = "TRY";
    public static final java.lang.String _USD = "USD";
    public static final java.lang.String _ZAR = "ZAR";
    public static final Currency AUD = new Currency(_AUD);
    public static final Currency BGN = new Currency(_BGN);
    public static final Currency BRL = new Currency(_BRL);
    public static final Currency CAD = new Currency(_CAD);
    public static final Currency CHF = new Currency(_CHF);
    public static final Currency CNY = new Currency(_CNY);
    public static final Currency CZK = new Currency(_CZK);
    public static final Currency DKK = new Currency(_DKK);
    public static final Currency EUR = new Currency(_EUR);
    public static final Currency GBP = new Currency(_GBP);
    public static final Currency HKD = new Currency(_HKD);
    public static final Currency HRK = new Currency(_HRK);
    public static final Currency HUF = new Currency(_HUF);
    public static final Currency IDR = new Currency(_IDR);
    public static final Currency ILS = new Currency(_ILS);
    public static final Currency INR = new Currency(_INR);
    public static final Currency JPY = new Currency(_JPY);
    public static final Currency KRW = new Currency(_KRW);
    public static final Currency MXN = new Currency(_MXN);
    public static final Currency MYR = new Currency(_MYR);
    public static final Currency NOK = new Currency(_NOK);
    public static final Currency NZD = new Currency(_NZD);
    public static final Currency PHP = new Currency(_PHP);
    public static final Currency PLN = new Currency(_PLN);
    public static final Currency RON = new Currency(_RON);
    public static final Currency RUB = new Currency(_RUB);
    public static final Currency SEK = new Currency(_SEK);
    public static final Currency SGD = new Currency(_SGD);
    public static final Currency THB = new Currency(_THB);
    public static final Currency TRY = new Currency(_TRY);
    public static final Currency USD = new Currency(_USD);
    public static final Currency ZAR = new Currency(_ZAR);
    public java.lang.String getValue() { return _value_;}
    public static Currency fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Currency enumeration = (Currency)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Currency fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Currency.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bzu.cloud:8080/ExProj/services/", "Currency"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
