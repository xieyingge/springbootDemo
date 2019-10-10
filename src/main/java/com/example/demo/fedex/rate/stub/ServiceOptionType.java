/**
 * ServiceOptionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.demo.fedex.rate.stub;

public class ServiceOptionType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ServiceOptionType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _FEDEX_ONE_RATE = "FEDEX_ONE_RATE";
    public static final String _FREIGHT_GUARANTEE = "FREIGHT_GUARANTEE";
    public static final String _SATURDAY_DELIVERY = "SATURDAY_DELIVERY";
    public static final String _SMART_POST_ALLOWED_INDICIA = "SMART_POST_ALLOWED_INDICIA";
    public static final String _SMART_POST_HUB_ID = "SMART_POST_HUB_ID";
    public static final ServiceOptionType FEDEX_ONE_RATE = new ServiceOptionType(_FEDEX_ONE_RATE);
    public static final ServiceOptionType FREIGHT_GUARANTEE = new ServiceOptionType(_FREIGHT_GUARANTEE);
    public static final ServiceOptionType SATURDAY_DELIVERY = new ServiceOptionType(_SATURDAY_DELIVERY);
    public static final ServiceOptionType SMART_POST_ALLOWED_INDICIA = new ServiceOptionType(_SMART_POST_ALLOWED_INDICIA);
    public static final ServiceOptionType SMART_POST_HUB_ID = new ServiceOptionType(_SMART_POST_HUB_ID);
    public String getValue() { return _value_;}
    public static ServiceOptionType fromValue(String value)
          throws IllegalArgumentException {
        ServiceOptionType enumeration = (ServiceOptionType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static ServiceOptionType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(ServiceOptionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ServiceOptionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
