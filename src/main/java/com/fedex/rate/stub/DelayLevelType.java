/**
 * DelayLevelType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.rate.stub;

public class DelayLevelType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DelayLevelType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _CITY = "CITY";
    public static final String _COUNTRY = "COUNTRY";
    public static final String _LOCATION = "LOCATION";
    public static final String _POSTAL_CODE = "POSTAL_CODE";
    public static final String _SERVICE_AREA = "SERVICE_AREA";
    public static final String _SERVICE_AREA_SPECIAL_SERVICE = "SERVICE_AREA_SPECIAL_SERVICE";
    public static final String _SPECIAL_SERVICE = "SPECIAL_SERVICE";
    public static final DelayLevelType CITY = new DelayLevelType(_CITY);
    public static final DelayLevelType COUNTRY = new DelayLevelType(_COUNTRY);
    public static final DelayLevelType LOCATION = new DelayLevelType(_LOCATION);
    public static final DelayLevelType POSTAL_CODE = new DelayLevelType(_POSTAL_CODE);
    public static final DelayLevelType SERVICE_AREA = new DelayLevelType(_SERVICE_AREA);
    public static final DelayLevelType SERVICE_AREA_SPECIAL_SERVICE = new DelayLevelType(_SERVICE_AREA_SPECIAL_SERVICE);
    public static final DelayLevelType SPECIAL_SERVICE = new DelayLevelType(_SPECIAL_SERVICE);
    public String getValue() { return _value_;}
    public static DelayLevelType fromValue(String value)
          throws IllegalArgumentException {
        DelayLevelType enumeration = (DelayLevelType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static DelayLevelType fromString(String value)
          throws IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public String toString() { return _value_;}
    public Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DelayLevelType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DelayLevelType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
