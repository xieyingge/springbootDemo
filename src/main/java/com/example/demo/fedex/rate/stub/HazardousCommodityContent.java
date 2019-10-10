/**
 * HazardousCommodityContent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.demo.fedex.rate.stub;


/**
 * Documents the kind and quantity of an individual hazardous commodity
 * in a package.
 */
public class HazardousCommodityContent  implements java.io.Serializable {
    /* Identifies and describes an individual hazardous commodity. */
    private com.example.demo.fedex.rate.stub.HazardousCommodityDescription description;

    /* Specifies the amount of the commodity in alternate units. */
    private com.example.demo.fedex.rate.stub.HazardousCommodityQuantityDetail quantity;

    /* This describes the inner receptacle details for a hazardous
     * commodity within the dangerous goods container. */
    private com.example.demo.fedex.rate.stub.HazardousCommodityInnerReceptacleDetail[] innerReceptacles;

    /* Customer-provided specifications for handling individual commodities. */
    private com.example.demo.fedex.rate.stub.HazardousCommodityOptionDetail options;

    /* Specifies the details of any radio active materials within
     * the commodity. */
    private com.example.demo.fedex.rate.stub.RadionuclideDetail radionuclideDetail;

    /* The total mass of the contained explosive substances, without
     * the mass of any casings, bullets, shells, etc. */
    private com.example.demo.fedex.rate.stub.NetExplosiveDetail netExplosiveDetail;

    public HazardousCommodityContent() {
    }

    public HazardousCommodityContent(
           com.example.demo.fedex.rate.stub.HazardousCommodityDescription description,
           com.example.demo.fedex.rate.stub.HazardousCommodityQuantityDetail quantity,
           com.example.demo.fedex.rate.stub.HazardousCommodityInnerReceptacleDetail[] innerReceptacles,
           com.example.demo.fedex.rate.stub.HazardousCommodityOptionDetail options,
           com.example.demo.fedex.rate.stub.RadionuclideDetail radionuclideDetail,
           com.example.demo.fedex.rate.stub.NetExplosiveDetail netExplosiveDetail) {
           this.description = description;
           this.quantity = quantity;
           this.innerReceptacles = innerReceptacles;
           this.options = options;
           this.radionuclideDetail = radionuclideDetail;
           this.netExplosiveDetail = netExplosiveDetail;
    }


    /**
     * Gets the description value for this HazardousCommodityContent.
     *
     * @return description   * Identifies and describes an individual hazardous commodity.
     */
    public com.example.demo.fedex.rate.stub.HazardousCommodityDescription getDescription() {
        return description;
    }


    /**
     * Sets the description value for this HazardousCommodityContent.
     *
     * @param description   * Identifies and describes an individual hazardous commodity.
     */
    public void setDescription(com.example.demo.fedex.rate.stub.HazardousCommodityDescription description) {
        this.description = description;
    }


    /**
     * Gets the quantity value for this HazardousCommodityContent.
     *
     * @return quantity   * Specifies the amount of the commodity in alternate units.
     */
    public com.example.demo.fedex.rate.stub.HazardousCommodityQuantityDetail getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this HazardousCommodityContent.
     *
     * @param quantity   * Specifies the amount of the commodity in alternate units.
     */
    public void setQuantity(com.example.demo.fedex.rate.stub.HazardousCommodityQuantityDetail quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the innerReceptacles value for this HazardousCommodityContent.
     *
     * @return innerReceptacles   * This describes the inner receptacle details for a hazardous
     * commodity within the dangerous goods container.
     */
    public com.example.demo.fedex.rate.stub.HazardousCommodityInnerReceptacleDetail[] getInnerReceptacles() {
        return innerReceptacles;
    }


    /**
     * Sets the innerReceptacles value for this HazardousCommodityContent.
     *
     * @param innerReceptacles   * This describes the inner receptacle details for a hazardous
     * commodity within the dangerous goods container.
     */
    public void setInnerReceptacles(com.example.demo.fedex.rate.stub.HazardousCommodityInnerReceptacleDetail[] innerReceptacles) {
        this.innerReceptacles = innerReceptacles;
    }

    public com.example.demo.fedex.rate.stub.HazardousCommodityInnerReceptacleDetail getInnerReceptacles(int i) {
        return this.innerReceptacles[i];
    }

    public void setInnerReceptacles(int i, com.example.demo.fedex.rate.stub.HazardousCommodityInnerReceptacleDetail _value) {
        this.innerReceptacles[i] = _value;
    }


    /**
     * Gets the options value for this HazardousCommodityContent.
     *
     * @return options   * Customer-provided specifications for handling individual commodities.
     */
    public com.example.demo.fedex.rate.stub.HazardousCommodityOptionDetail getOptions() {
        return options;
    }


    /**
     * Sets the options value for this HazardousCommodityContent.
     *
     * @param options   * Customer-provided specifications for handling individual commodities.
     */
    public void setOptions(com.example.demo.fedex.rate.stub.HazardousCommodityOptionDetail options) {
        this.options = options;
    }


    /**
     * Gets the radionuclideDetail value for this HazardousCommodityContent.
     *
     * @return radionuclideDetail   * Specifies the details of any radio active materials within
     * the commodity.
     */
    public com.example.demo.fedex.rate.stub.RadionuclideDetail getRadionuclideDetail() {
        return radionuclideDetail;
    }


    /**
     * Sets the radionuclideDetail value for this HazardousCommodityContent.
     *
     * @param radionuclideDetail   * Specifies the details of any radio active materials within
     * the commodity.
     */
    public void setRadionuclideDetail(com.example.demo.fedex.rate.stub.RadionuclideDetail radionuclideDetail) {
        this.radionuclideDetail = radionuclideDetail;
    }


    /**
     * Gets the netExplosiveDetail value for this HazardousCommodityContent.
     *
     * @return netExplosiveDetail   * The total mass of the contained explosive substances, without
     * the mass of any casings, bullets, shells, etc.
     */
    public com.example.demo.fedex.rate.stub.NetExplosiveDetail getNetExplosiveDetail() {
        return netExplosiveDetail;
    }


    /**
     * Sets the netExplosiveDetail value for this HazardousCommodityContent.
     *
     * @param netExplosiveDetail   * The total mass of the contained explosive substances, without
     * the mass of any casings, bullets, shells, etc.
     */
    public void setNetExplosiveDetail(com.example.demo.fedex.rate.stub.NetExplosiveDetail netExplosiveDetail) {
        this.netExplosiveDetail = netExplosiveDetail;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof HazardousCommodityContent)) return false;
        HazardousCommodityContent other = (HazardousCommodityContent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.description==null && other.getDescription()==null) ||
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.quantity==null && other.getQuantity()==null) ||
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.innerReceptacles==null && other.getInnerReceptacles()==null) ||
             (this.innerReceptacles!=null &&
              java.util.Arrays.equals(this.innerReceptacles, other.getInnerReceptacles()))) &&
            ((this.options==null && other.getOptions()==null) ||
             (this.options!=null &&
              this.options.equals(other.getOptions()))) &&
            ((this.radionuclideDetail==null && other.getRadionuclideDetail()==null) ||
             (this.radionuclideDetail!=null &&
              this.radionuclideDetail.equals(other.getRadionuclideDetail()))) &&
            ((this.netExplosiveDetail==null && other.getNetExplosiveDetail()==null) ||
             (this.netExplosiveDetail!=null &&
              this.netExplosiveDetail.equals(other.getNetExplosiveDetail())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getInnerReceptacles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInnerReceptacles());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getInnerReceptacles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOptions() != null) {
            _hashCode += getOptions().hashCode();
        }
        if (getRadionuclideDetail() != null) {
            _hashCode += getRadionuclideDetail().hashCode();
        }
        if (getNetExplosiveDetail() != null) {
            _hashCode += getNetExplosiveDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HazardousCommodityContent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "HazardousCommodityContent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "HazardousCommodityDescription"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "HazardousCommodityQuantityDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("innerReceptacles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "InnerReceptacles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "HazardousCommodityInnerReceptacleDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Options"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "HazardousCommodityOptionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radionuclideDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RadionuclideDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RadionuclideDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netExplosiveDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "NetExplosiveDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "NetExplosiveDetail"));
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
