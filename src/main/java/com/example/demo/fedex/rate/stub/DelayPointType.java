/**
 * DelayPointType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.demo.fedex.rate.stub;

public class DelayPointType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DelayPointType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _BROKER = "BROKER";
    public static final String _DESTINATION = "DESTINATION";
    public static final String _ORIGIN = "ORIGIN";
    public static final String _ORIGIN_DESTINATION_PAIR = "ORIGIN_DESTINATION_PAIR";
    public static final String _PROOF_OF_DELIVERY_POINT = "PROOF_OF_DELIVERY_POINT";
    public static final DelayPointType BROKER = new DelayPointType(_BROKER);
    public static final DelayPointType DESTINATION = new DelayPointType(_DESTINATION);
    public static final DelayPointType ORIGIN = new DelayPointType(_ORIGIN);
    public static final DelayPointType ORIGIN_DESTINATION_PAIR = new DelayPointType(_ORIGIN_DESTINATION_PAIR);
    public static final DelayPointType PROOF_OF_DELIVERY_POINT = new DelayPointType(_PROOF_OF_DELIVERY_POINT);
    public String getValue() { return _value_;}
    public static DelayPointType fromValue(String value)
          throws IllegalArgumentException {
        DelayPointType enumeration = (DelayPointType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static DelayPointType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(DelayPointType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DelayPointType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
