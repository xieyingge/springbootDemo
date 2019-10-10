/**
 * ShippingDocumentFormat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.demo.fedex.rate.stub;


/**
 * Specifies characteristics of a shipping document to be produced.
 */
public class ShippingDocumentFormat  implements java.io.Serializable {
    /* Specifies how to create, organize, and return the document. */
    private com.example.demo.fedex.rate.stub.ShippingDocumentDispositionDetail[] dispositions;

    /* Specifies how far down the page to move the beginning of the
     * image; allows for printing on letterhead and other pre-printed stock. */
    private com.example.demo.fedex.rate.stub.LinearMeasure topOfPageOffset;

    private com.example.demo.fedex.rate.stub.ShippingDocumentImageType imageType;

    private com.example.demo.fedex.rate.stub.ShippingDocumentStockType stockType;

    /* For those shipping document types which have both a "form"
     * and "instructions" component (e.g. NAFTA Certificate of Origin and
     * General Agency Agreement), this field indicates whether to provide
     * the instructions. */
    private Boolean provideInstructions;

    private com.example.demo.fedex.rate.stub.DocumentFormatOptionsRequested optionsRequested;

    /* Governs the language to be used for this individual document,
     * independently from other content returned for the same shipment. */
    private com.example.demo.fedex.rate.stub.Localization localization;

    public ShippingDocumentFormat() {
    }

    public ShippingDocumentFormat(
           com.example.demo.fedex.rate.stub.ShippingDocumentDispositionDetail[] dispositions,
           com.example.demo.fedex.rate.stub.LinearMeasure topOfPageOffset,
           com.example.demo.fedex.rate.stub.ShippingDocumentImageType imageType,
           com.example.demo.fedex.rate.stub.ShippingDocumentStockType stockType,
           Boolean provideInstructions,
           com.example.demo.fedex.rate.stub.DocumentFormatOptionsRequested optionsRequested,
           com.example.demo.fedex.rate.stub.Localization localization) {
           this.dispositions = dispositions;
           this.topOfPageOffset = topOfPageOffset;
           this.imageType = imageType;
           this.stockType = stockType;
           this.provideInstructions = provideInstructions;
           this.optionsRequested = optionsRequested;
           this.localization = localization;
    }


    /**
     * Gets the dispositions value for this ShippingDocumentFormat.
     *
     * @return dispositions   * Specifies how to create, organize, and return the document.
     */
    public com.example.demo.fedex.rate.stub.ShippingDocumentDispositionDetail[] getDispositions() {
        return dispositions;
    }


    /**
     * Sets the dispositions value for this ShippingDocumentFormat.
     *
     * @param dispositions   * Specifies how to create, organize, and return the document.
     */
    public void setDispositions(com.example.demo.fedex.rate.stub.ShippingDocumentDispositionDetail[] dispositions) {
        this.dispositions = dispositions;
    }

    public com.example.demo.fedex.rate.stub.ShippingDocumentDispositionDetail getDispositions(int i) {
        return this.dispositions[i];
    }

    public void setDispositions(int i, com.example.demo.fedex.rate.stub.ShippingDocumentDispositionDetail _value) {
        this.dispositions[i] = _value;
    }


    /**
     * Gets the topOfPageOffset value for this ShippingDocumentFormat.
     *
     * @return topOfPageOffset   * Specifies how far down the page to move the beginning of the
     * image; allows for printing on letterhead and other pre-printed stock.
     */
    public com.example.demo.fedex.rate.stub.LinearMeasure getTopOfPageOffset() {
        return topOfPageOffset;
    }


    /**
     * Sets the topOfPageOffset value for this ShippingDocumentFormat.
     *
     * @param topOfPageOffset   * Specifies how far down the page to move the beginning of the
     * image; allows for printing on letterhead and other pre-printed stock.
     */
    public void setTopOfPageOffset(com.example.demo.fedex.rate.stub.LinearMeasure topOfPageOffset) {
        this.topOfPageOffset = topOfPageOffset;
    }


    /**
     * Gets the imageType value for this ShippingDocumentFormat.
     *
     * @return imageType
     */
    public com.example.demo.fedex.rate.stub.ShippingDocumentImageType getImageType() {
        return imageType;
    }


    /**
     * Sets the imageType value for this ShippingDocumentFormat.
     *
     * @param imageType
     */
    public void setImageType(com.example.demo.fedex.rate.stub.ShippingDocumentImageType imageType) {
        this.imageType = imageType;
    }


    /**
     * Gets the stockType value for this ShippingDocumentFormat.
     *
     * @return stockType
     */
    public com.example.demo.fedex.rate.stub.ShippingDocumentStockType getStockType() {
        return stockType;
    }


    /**
     * Sets the stockType value for this ShippingDocumentFormat.
     *
     * @param stockType
     */
    public void setStockType(com.example.demo.fedex.rate.stub.ShippingDocumentStockType stockType) {
        this.stockType = stockType;
    }


    /**
     * Gets the provideInstructions value for this ShippingDocumentFormat.
     *
     * @return provideInstructions   * For those shipping document types which have both a "form"
     * and "instructions" component (e.g. NAFTA Certificate of Origin and
     * General Agency Agreement), this field indicates whether to provide
     * the instructions.
     */
    public Boolean getProvideInstructions() {
        return provideInstructions;
    }


    /**
     * Sets the provideInstructions value for this ShippingDocumentFormat.
     *
     * @param provideInstructions   * For those shipping document types which have both a "form"
     * and "instructions" component (e.g. NAFTA Certificate of Origin and
     * General Agency Agreement), this field indicates whether to provide
     * the instructions.
     */
    public void setProvideInstructions(Boolean provideInstructions) {
        this.provideInstructions = provideInstructions;
    }


    /**
     * Gets the optionsRequested value for this ShippingDocumentFormat.
     *
     * @return optionsRequested
     */
    public com.example.demo.fedex.rate.stub.DocumentFormatOptionsRequested getOptionsRequested() {
        return optionsRequested;
    }


    /**
     * Sets the optionsRequested value for this ShippingDocumentFormat.
     *
     * @param optionsRequested
     */
    public void setOptionsRequested(com.example.demo.fedex.rate.stub.DocumentFormatOptionsRequested optionsRequested) {
        this.optionsRequested = optionsRequested;
    }


    /**
     * Gets the localization value for this ShippingDocumentFormat.
     *
     * @return localization   * Governs the language to be used for this individual document,
     * independently from other content returned for the same shipment.
     */
    public com.example.demo.fedex.rate.stub.Localization getLocalization() {
        return localization;
    }


    /**
     * Sets the localization value for this ShippingDocumentFormat.
     *
     * @param localization   * Governs the language to be used for this individual document,
     * independently from other content returned for the same shipment.
     */
    public void setLocalization(com.example.demo.fedex.rate.stub.Localization localization) {
        this.localization = localization;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ShippingDocumentFormat)) return false;
        ShippingDocumentFormat other = (ShippingDocumentFormat) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.dispositions==null && other.getDispositions()==null) ||
             (this.dispositions!=null &&
              java.util.Arrays.equals(this.dispositions, other.getDispositions()))) &&
            ((this.topOfPageOffset==null && other.getTopOfPageOffset()==null) ||
             (this.topOfPageOffset!=null &&
              this.topOfPageOffset.equals(other.getTopOfPageOffset()))) &&
            ((this.imageType==null && other.getImageType()==null) ||
             (this.imageType!=null &&
              this.imageType.equals(other.getImageType()))) &&
            ((this.stockType==null && other.getStockType()==null) ||
             (this.stockType!=null &&
              this.stockType.equals(other.getStockType()))) &&
            ((this.provideInstructions==null && other.getProvideInstructions()==null) ||
             (this.provideInstructions!=null &&
              this.provideInstructions.equals(other.getProvideInstructions()))) &&
            ((this.optionsRequested==null && other.getOptionsRequested()==null) ||
             (this.optionsRequested!=null &&
              this.optionsRequested.equals(other.getOptionsRequested()))) &&
            ((this.localization==null && other.getLocalization()==null) ||
             (this.localization!=null &&
              this.localization.equals(other.getLocalization())));
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
        if (getDispositions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDispositions());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDispositions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTopOfPageOffset() != null) {
            _hashCode += getTopOfPageOffset().hashCode();
        }
        if (getImageType() != null) {
            _hashCode += getImageType().hashCode();
        }
        if (getStockType() != null) {
            _hashCode += getStockType().hashCode();
        }
        if (getProvideInstructions() != null) {
            _hashCode += getProvideInstructions().hashCode();
        }
        if (getOptionsRequested() != null) {
            _hashCode += getOptionsRequested().hashCode();
        }
        if (getLocalization() != null) {
            _hashCode += getLocalization().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShippingDocumentFormat.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShippingDocumentFormat"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dispositions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Dispositions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShippingDocumentDispositionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topOfPageOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "TopOfPageOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "LinearMeasure"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ImageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShippingDocumentImageType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stockType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "StockType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShippingDocumentStockType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provideInstructions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ProvideInstructions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionsRequested");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "OptionsRequested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DocumentFormatOptionsRequested"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localization");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Localization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Localization"));
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
