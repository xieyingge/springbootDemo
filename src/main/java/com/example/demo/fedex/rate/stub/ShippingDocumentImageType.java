/**
 * ShippingDocumentImageType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.demo.fedex.rate.stub;

public class ShippingDocumentImageType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ShippingDocumentImageType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _EPL2 = "EPL2";
    public static final String _PDF = "PDF";
    public static final String _PNG = "PNG";
    public static final String _ZPLII = "ZPLII";
    public static final ShippingDocumentImageType EPL2 = new ShippingDocumentImageType(_EPL2);
    public static final ShippingDocumentImageType PDF = new ShippingDocumentImageType(_PDF);
    public static final ShippingDocumentImageType PNG = new ShippingDocumentImageType(_PNG);
    public static final ShippingDocumentImageType ZPLII = new ShippingDocumentImageType(_ZPLII);
    public String getValue() { return _value_;}
    public static ShippingDocumentImageType fromValue(String value)
          throws IllegalArgumentException {
        ShippingDocumentImageType enumeration = (ShippingDocumentImageType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static ShippingDocumentImageType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(ShippingDocumentImageType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShippingDocumentImageType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
