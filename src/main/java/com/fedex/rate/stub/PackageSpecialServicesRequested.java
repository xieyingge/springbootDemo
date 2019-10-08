/**
 * PackageSpecialServicesRequested.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.rate.stub;


/**
 * These special services are available at the package level for some
 * or all service types. If the shipper is requesting a special service
 * which requires additional data, the package special service type must
 * be present in the specialServiceTypes collection, and the supporting
 * detail must be provided in the appropriate sub-object below.
 */
public class PackageSpecialServicesRequested  implements java.io.Serializable {
    /* Indicates the package special service types that are requested
     * on this shipment. For a list of the valid package special service
     * types, please consult your integration documentation or get the list
     * of the available special services from the getAllSpecialServices method
     * of the Validation Availability and Commitment service. */
    private String[] specialServiceTypes;

    /* For use with FedEx Ground services only; COD must be present
     * in shipment's special services. */
    private com.fedex.rate.stub.CodDetail codDetail;

    private com.fedex.rate.stub.DangerousGoodsDetail dangerousGoodsDetail;

    /* Provides details about the batteries or cells that are contained
     * within this specific package. */
    private com.fedex.rate.stub.BatteryClassificationDetail[] batteryDetails;

    private com.fedex.rate.stub.Weight dryIceWeight;

    private com.fedex.rate.stub.SignatureOptionDetail signatureOptionDetail;

    private com.fedex.rate.stub.PriorityAlertDetail priorityAlertDetail;

    private com.fedex.rate.stub.AlcoholDetail alcoholDetail;

    public PackageSpecialServicesRequested() {
    }

    public PackageSpecialServicesRequested(
           String[] specialServiceTypes,
           com.fedex.rate.stub.CodDetail codDetail,
           com.fedex.rate.stub.DangerousGoodsDetail dangerousGoodsDetail,
           com.fedex.rate.stub.BatteryClassificationDetail[] batteryDetails,
           com.fedex.rate.stub.Weight dryIceWeight,
           com.fedex.rate.stub.SignatureOptionDetail signatureOptionDetail,
           com.fedex.rate.stub.PriorityAlertDetail priorityAlertDetail,
           com.fedex.rate.stub.AlcoholDetail alcoholDetail) {
           this.specialServiceTypes = specialServiceTypes;
           this.codDetail = codDetail;
           this.dangerousGoodsDetail = dangerousGoodsDetail;
           this.batteryDetails = batteryDetails;
           this.dryIceWeight = dryIceWeight;
           this.signatureOptionDetail = signatureOptionDetail;
           this.priorityAlertDetail = priorityAlertDetail;
           this.alcoholDetail = alcoholDetail;
    }


    /**
     * Gets the specialServiceTypes value for this PackageSpecialServicesRequested.
     *
     * @return specialServiceTypes   * Indicates the package special service types that are requested
     * on this shipment. For a list of the valid package special service
     * types, please consult your integration documentation or get the list
     * of the available special services from the getAllSpecialServices method
     * of the Validation Availability and Commitment service.
     */
    public String[] getSpecialServiceTypes() {
        return specialServiceTypes;
    }


    /**
     * Sets the specialServiceTypes value for this PackageSpecialServicesRequested.
     *
     * @param specialServiceTypes   * Indicates the package special service types that are requested
     * on this shipment. For a list of the valid package special service
     * types, please consult your integration documentation or get the list
     * of the available special services from the getAllSpecialServices method
     * of the Validation Availability and Commitment service.
     */
    public void setSpecialServiceTypes(String[] specialServiceTypes) {
        this.specialServiceTypes = specialServiceTypes;
    }

    public String getSpecialServiceTypes(int i) {
        return this.specialServiceTypes[i];
    }

    public void setSpecialServiceTypes(int i, String _value) {
        this.specialServiceTypes[i] = _value;
    }


    /**
     * Gets the codDetail value for this PackageSpecialServicesRequested.
     *
     * @return codDetail   * For use with FedEx Ground services only; COD must be present
     * in shipment's special services.
     */
    public com.fedex.rate.stub.CodDetail getCodDetail() {
        return codDetail;
    }


    /**
     * Sets the codDetail value for this PackageSpecialServicesRequested.
     *
     * @param codDetail   * For use with FedEx Ground services only; COD must be present
     * in shipment's special services.
     */
    public void setCodDetail(com.fedex.rate.stub.CodDetail codDetail) {
        this.codDetail = codDetail;
    }


    /**
     * Gets the dangerousGoodsDetail value for this PackageSpecialServicesRequested.
     *
     * @return dangerousGoodsDetail
     */
    public com.fedex.rate.stub.DangerousGoodsDetail getDangerousGoodsDetail() {
        return dangerousGoodsDetail;
    }


    /**
     * Sets the dangerousGoodsDetail value for this PackageSpecialServicesRequested.
     *
     * @param dangerousGoodsDetail
     */
    public void setDangerousGoodsDetail(com.fedex.rate.stub.DangerousGoodsDetail dangerousGoodsDetail) {
        this.dangerousGoodsDetail = dangerousGoodsDetail;
    }


    /**
     * Gets the batteryDetails value for this PackageSpecialServicesRequested.
     *
     * @return batteryDetails   * Provides details about the batteries or cells that are contained
     * within this specific package.
     */
    public com.fedex.rate.stub.BatteryClassificationDetail[] getBatteryDetails() {
        return batteryDetails;
    }


    /**
     * Sets the batteryDetails value for this PackageSpecialServicesRequested.
     *
     * @param batteryDetails   * Provides details about the batteries or cells that are contained
     * within this specific package.
     */
    public void setBatteryDetails(com.fedex.rate.stub.BatteryClassificationDetail[] batteryDetails) {
        this.batteryDetails = batteryDetails;
    }

    public com.fedex.rate.stub.BatteryClassificationDetail getBatteryDetails(int i) {
        return this.batteryDetails[i];
    }

    public void setBatteryDetails(int i, com.fedex.rate.stub.BatteryClassificationDetail _value) {
        this.batteryDetails[i] = _value;
    }


    /**
     * Gets the dryIceWeight value for this PackageSpecialServicesRequested.
     *
     * @return dryIceWeight
     */
    public com.fedex.rate.stub.Weight getDryIceWeight() {
        return dryIceWeight;
    }


    /**
     * Sets the dryIceWeight value for this PackageSpecialServicesRequested.
     *
     * @param dryIceWeight
     */
    public void setDryIceWeight(com.fedex.rate.stub.Weight dryIceWeight) {
        this.dryIceWeight = dryIceWeight;
    }


    /**
     * Gets the signatureOptionDetail value for this PackageSpecialServicesRequested.
     *
     * @return signatureOptionDetail
     */
    public com.fedex.rate.stub.SignatureOptionDetail getSignatureOptionDetail() {
        return signatureOptionDetail;
    }


    /**
     * Sets the signatureOptionDetail value for this PackageSpecialServicesRequested.
     *
     * @param signatureOptionDetail
     */
    public void setSignatureOptionDetail(com.fedex.rate.stub.SignatureOptionDetail signatureOptionDetail) {
        this.signatureOptionDetail = signatureOptionDetail;
    }


    /**
     * Gets the priorityAlertDetail value for this PackageSpecialServicesRequested.
     *
     * @return priorityAlertDetail
     */
    public com.fedex.rate.stub.PriorityAlertDetail getPriorityAlertDetail() {
        return priorityAlertDetail;
    }


    /**
     * Sets the priorityAlertDetail value for this PackageSpecialServicesRequested.
     *
     * @param priorityAlertDetail
     */
    public void setPriorityAlertDetail(com.fedex.rate.stub.PriorityAlertDetail priorityAlertDetail) {
        this.priorityAlertDetail = priorityAlertDetail;
    }


    /**
     * Gets the alcoholDetail value for this PackageSpecialServicesRequested.
     *
     * @return alcoholDetail
     */
    public com.fedex.rate.stub.AlcoholDetail getAlcoholDetail() {
        return alcoholDetail;
    }


    /**
     * Sets the alcoholDetail value for this PackageSpecialServicesRequested.
     *
     * @param alcoholDetail
     */
    public void setAlcoholDetail(com.fedex.rate.stub.AlcoholDetail alcoholDetail) {
        this.alcoholDetail = alcoholDetail;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PackageSpecialServicesRequested)) return false;
        PackageSpecialServicesRequested other = (PackageSpecialServicesRequested) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.specialServiceTypes==null && other.getSpecialServiceTypes()==null) ||
             (this.specialServiceTypes!=null &&
              java.util.Arrays.equals(this.specialServiceTypes, other.getSpecialServiceTypes()))) &&
            ((this.codDetail==null && other.getCodDetail()==null) ||
             (this.codDetail!=null &&
              this.codDetail.equals(other.getCodDetail()))) &&
            ((this.dangerousGoodsDetail==null && other.getDangerousGoodsDetail()==null) ||
             (this.dangerousGoodsDetail!=null &&
              this.dangerousGoodsDetail.equals(other.getDangerousGoodsDetail()))) &&
            ((this.batteryDetails==null && other.getBatteryDetails()==null) ||
             (this.batteryDetails!=null &&
              java.util.Arrays.equals(this.batteryDetails, other.getBatteryDetails()))) &&
            ((this.dryIceWeight==null && other.getDryIceWeight()==null) ||
             (this.dryIceWeight!=null &&
              this.dryIceWeight.equals(other.getDryIceWeight()))) &&
            ((this.signatureOptionDetail==null && other.getSignatureOptionDetail()==null) ||
             (this.signatureOptionDetail!=null &&
              this.signatureOptionDetail.equals(other.getSignatureOptionDetail()))) &&
            ((this.priorityAlertDetail==null && other.getPriorityAlertDetail()==null) ||
             (this.priorityAlertDetail!=null &&
              this.priorityAlertDetail.equals(other.getPriorityAlertDetail()))) &&
            ((this.alcoholDetail==null && other.getAlcoholDetail()==null) ||
             (this.alcoholDetail!=null &&
              this.alcoholDetail.equals(other.getAlcoholDetail())));
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
        if (getSpecialServiceTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpecialServiceTypes());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSpecialServiceTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCodDetail() != null) {
            _hashCode += getCodDetail().hashCode();
        }
        if (getDangerousGoodsDetail() != null) {
            _hashCode += getDangerousGoodsDetail().hashCode();
        }
        if (getBatteryDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBatteryDetails());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getBatteryDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDryIceWeight() != null) {
            _hashCode += getDryIceWeight().hashCode();
        }
        if (getSignatureOptionDetail() != null) {
            _hashCode += getSignatureOptionDetail().hashCode();
        }
        if (getPriorityAlertDetail() != null) {
            _hashCode += getPriorityAlertDetail().hashCode();
        }
        if (getAlcoholDetail() != null) {
            _hashCode += getAlcoholDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PackageSpecialServicesRequested.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "PackageSpecialServicesRequested"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialServiceTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "SpecialServiceTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CodDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CodDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dangerousGoodsDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DangerousGoodsDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DangerousGoodsDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batteryDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "BatteryDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "BatteryClassificationDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dryIceWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DryIceWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Weight"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureOptionDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "SignatureOptionDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "SignatureOptionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorityAlertDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "PriorityAlertDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "PriorityAlertDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alcoholDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "AlcoholDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "AlcoholDetail"));
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
