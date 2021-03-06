/**
 * CustomLabelBarcodeEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.demo.fedex.rate.stub;


/**
 * Constructed string, based on format and zero or more data fields,
 * printed in specified barcode symbology.
 */
public class CustomLabelBarcodeEntry  implements java.io.Serializable {
    private com.example.demo.fedex.rate.stub.CustomLabelPosition position;

    private String format;

    private String[] dataFields;

    private Integer barHeight;

    /* Width of thinnest bar/space element in the barcode. */
    private Integer thinBarWidth;

    private com.example.demo.fedex.rate.stub.BarcodeSymbologyType barcodeSymbology;

    public CustomLabelBarcodeEntry() {
    }

    public CustomLabelBarcodeEntry(
           com.example.demo.fedex.rate.stub.CustomLabelPosition position,
           String format,
           String[] dataFields,
           Integer barHeight,
           Integer thinBarWidth,
           com.example.demo.fedex.rate.stub.BarcodeSymbologyType barcodeSymbology) {
           this.position = position;
           this.format = format;
           this.dataFields = dataFields;
           this.barHeight = barHeight;
           this.thinBarWidth = thinBarWidth;
           this.barcodeSymbology = barcodeSymbology;
    }


    /**
     * Gets the position value for this CustomLabelBarcodeEntry.
     *
     * @return position
     */
    public com.example.demo.fedex.rate.stub.CustomLabelPosition getPosition() {
        return position;
    }


    /**
     * Sets the position value for this CustomLabelBarcodeEntry.
     *
     * @param position
     */
    public void setPosition(com.example.demo.fedex.rate.stub.CustomLabelPosition position) {
        this.position = position;
    }


    /**
     * Gets the format value for this CustomLabelBarcodeEntry.
     *
     * @return format
     */
    public String getFormat() {
        return format;
    }


    /**
     * Sets the format value for this CustomLabelBarcodeEntry.
     *
     * @param format
     */
    public void setFormat(String format) {
        this.format = format;
    }


    /**
     * Gets the dataFields value for this CustomLabelBarcodeEntry.
     *
     * @return dataFields
     */
    public String[] getDataFields() {
        return dataFields;
    }


    /**
     * Sets the dataFields value for this CustomLabelBarcodeEntry.
     *
     * @param dataFields
     */
    public void setDataFields(String[] dataFields) {
        this.dataFields = dataFields;
    }

    public String getDataFields(int i) {
        return this.dataFields[i];
    }

    public void setDataFields(int i, String _value) {
        this.dataFields[i] = _value;
    }


    /**
     * Gets the barHeight value for this CustomLabelBarcodeEntry.
     *
     * @return barHeight
     */
    public Integer getBarHeight() {
        return barHeight;
    }


    /**
     * Sets the barHeight value for this CustomLabelBarcodeEntry.
     *
     * @param barHeight
     */
    public void setBarHeight(Integer barHeight) {
        this.barHeight = barHeight;
    }


    /**
     * Gets the thinBarWidth value for this CustomLabelBarcodeEntry.
     *
     * @return thinBarWidth   * Width of thinnest bar/space element in the barcode.
     */
    public Integer getThinBarWidth() {
        return thinBarWidth;
    }


    /**
     * Sets the thinBarWidth value for this CustomLabelBarcodeEntry.
     *
     * @param thinBarWidth   * Width of thinnest bar/space element in the barcode.
     */
    public void setThinBarWidth(Integer thinBarWidth) {
        this.thinBarWidth = thinBarWidth;
    }


    /**
     * Gets the barcodeSymbology value for this CustomLabelBarcodeEntry.
     *
     * @return barcodeSymbology
     */
    public com.example.demo.fedex.rate.stub.BarcodeSymbologyType getBarcodeSymbology() {
        return barcodeSymbology;
    }


    /**
     * Sets the barcodeSymbology value for this CustomLabelBarcodeEntry.
     *
     * @param barcodeSymbology
     */
    public void setBarcodeSymbology(com.example.demo.fedex.rate.stub.BarcodeSymbologyType barcodeSymbology) {
        this.barcodeSymbology = barcodeSymbology;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CustomLabelBarcodeEntry)) return false;
        CustomLabelBarcodeEntry other = (CustomLabelBarcodeEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.position==null && other.getPosition()==null) ||
             (this.position!=null &&
              this.position.equals(other.getPosition()))) &&
            ((this.format==null && other.getFormat()==null) ||
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            ((this.dataFields==null && other.getDataFields()==null) ||
             (this.dataFields!=null &&
              java.util.Arrays.equals(this.dataFields, other.getDataFields()))) &&
            ((this.barHeight==null && other.getBarHeight()==null) ||
             (this.barHeight!=null &&
              this.barHeight.equals(other.getBarHeight()))) &&
            ((this.thinBarWidth==null && other.getThinBarWidth()==null) ||
             (this.thinBarWidth!=null &&
              this.thinBarWidth.equals(other.getThinBarWidth()))) &&
            ((this.barcodeSymbology==null && other.getBarcodeSymbology()==null) ||
             (this.barcodeSymbology!=null &&
              this.barcodeSymbology.equals(other.getBarcodeSymbology())));
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
        if (getPosition() != null) {
            _hashCode += getPosition().hashCode();
        }
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        if (getDataFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDataFields());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDataFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBarHeight() != null) {
            _hashCode += getBarHeight().hashCode();
        }
        if (getThinBarWidth() != null) {
            _hashCode += getThinBarWidth().hashCode();
        }
        if (getBarcodeSymbology() != null) {
            _hashCode += getBarcodeSymbology().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomLabelBarcodeEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CustomLabelBarcodeEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("position");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Position"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CustomLabelPosition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DataFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barHeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "BarHeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thinBarWidth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ThinBarWidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barcodeSymbology");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "BarcodeSymbology"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "BarcodeSymbologyType"));
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
