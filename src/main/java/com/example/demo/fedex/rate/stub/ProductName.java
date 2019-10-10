/**
 * ProductName.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.demo.fedex.rate.stub;

public class ProductName  implements java.io.Serializable {
    /* The type of name (long, medium, short, etc.) to which this
     * value refers. */
    private String type;

    /* The character encoding used to represent this product name.
     * For example, UTF-8. */
    private String encoding;

    private String value;

    public ProductName() {
    }

    public ProductName(
           String type,
           String encoding,
           String value) {
           this.type = type;
           this.encoding = encoding;
           this.value = value;
    }


    /**
     * Gets the type value for this ProductName.
     *
     * @return type   * The type of name (long, medium, short, etc.) to which this
     * value refers.
     */
    public String getType() {
        return type;
    }


    /**
     * Sets the type value for this ProductName.
     *
     * @param type   * The type of name (long, medium, short, etc.) to which this
     * value refers.
     */
    public void setType(String type) {
        this.type = type;
    }


    /**
     * Gets the encoding value for this ProductName.
     *
     * @return encoding   * The character encoding used to represent this product name.
     * For example, UTF-8.
     */
    public String getEncoding() {
        return encoding;
    }


    /**
     * Sets the encoding value for this ProductName.
     *
     * @param encoding   * The character encoding used to represent this product name.
     * For example, UTF-8.
     */
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }


    /**
     * Gets the value value for this ProductName.
     *
     * @return value
     */
    public String getValue() {
        return value;
    }


    /**
     * Sets the value value for this ProductName.
     *
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ProductName)) return false;
        ProductName other = (ProductName) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.type==null && other.getType()==null) ||
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.encoding==null && other.getEncoding()==null) ||
             (this.encoding!=null &&
              this.encoding.equals(other.getEncoding()))) &&
            ((this.value==null && other.getValue()==null) ||
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getEncoding() != null) {
            _hashCode += getEncoding().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductName.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ProductName"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encoding");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Encoding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
