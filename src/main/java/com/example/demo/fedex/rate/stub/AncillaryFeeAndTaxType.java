/**
 * AncillaryFeeAndTaxType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.demo.fedex.rate.stub;

public class AncillaryFeeAndTaxType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AncillaryFeeAndTaxType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _CLEARANCE_ENTRY_FEE = "CLEARANCE_ENTRY_FEE";
    public static final String _GOODS_AND_SERVICES_TAX = "GOODS_AND_SERVICES_TAX";
    public static final String _HARMONIZED_SALES_TAX = "HARMONIZED_SALES_TAX";
    public static final String _OTHER = "OTHER";
    public static final AncillaryFeeAndTaxType CLEARANCE_ENTRY_FEE = new AncillaryFeeAndTaxType(_CLEARANCE_ENTRY_FEE);
    public static final AncillaryFeeAndTaxType GOODS_AND_SERVICES_TAX = new AncillaryFeeAndTaxType(_GOODS_AND_SERVICES_TAX);
    public static final AncillaryFeeAndTaxType HARMONIZED_SALES_TAX = new AncillaryFeeAndTaxType(_HARMONIZED_SALES_TAX);
    public static final AncillaryFeeAndTaxType OTHER = new AncillaryFeeAndTaxType(_OTHER);
    public String getValue() { return _value_;}
    public static AncillaryFeeAndTaxType fromValue(String value)
          throws IllegalArgumentException {
        AncillaryFeeAndTaxType enumeration = (AncillaryFeeAndTaxType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static AncillaryFeeAndTaxType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(AncillaryFeeAndTaxType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "AncillaryFeeAndTaxType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
