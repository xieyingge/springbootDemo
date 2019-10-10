/**
 * ShipmentSpecialServicesRequested.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.demo.fedex.rate.stub;


/**
 * These special services are available at the shipment level for
 * some or all service types. If the shipper is requesting a special
 * service which requires additional data (such as the COD amount), the
 * shipment special service type must be present in the specialServiceTypes
 * collection, and the supporting detail must be provided in the appropriate
 * sub-object below.
 */
public class ShipmentSpecialServicesRequested  implements java.io.Serializable {
    /* Indicates the shipment special service types that are requested
     * on this shipment. For a list of the valid shipment special service
     * types, please consult your integration documentation or get the list
     * of the available special services from the getAllSpecialServices method
     * of the Validation Availability and Commitment service. */
    private String[] specialServiceTypes;

    private com.example.demo.fedex.rate.stub.CodDetail codDetail;

    private com.example.demo.fedex.rate.stub.DeliveryOnInvoiceAcceptanceDetail deliveryOnInvoiceAcceptanceDetail;

    private com.example.demo.fedex.rate.stub.HoldAtLocationDetail holdAtLocationDetail;

    /* This replaces eMailNotificationDetail */
    private com.example.demo.fedex.rate.stub.ShipmentEventNotificationDetail eventNotificationDetail;

    private com.example.demo.fedex.rate.stub.ReturnShipmentDetail returnShipmentDetail;

    /* This field should be populated for pending shipments (e.g.
     * e-mail label) It is required by a PENDING_SHIPMENT special service
     * type. */
    private com.example.demo.fedex.rate.stub.PendingShipmentDetail pendingShipmentDetail;

    private com.example.demo.fedex.rate.stub.InternationalControlledExportDetail internationalControlledExportDetail;

    private com.example.demo.fedex.rate.stub.InternationalTrafficInArmsRegulationsDetail internationalTrafficInArmsRegulationsDetail;

    private com.example.demo.fedex.rate.stub.ShipmentDryIceDetail shipmentDryIceDetail;

    private com.example.demo.fedex.rate.stub.HomeDeliveryPremiumDetail homeDeliveryPremiumDetail;

    private com.example.demo.fedex.rate.stub.FlatbedTrailerDetail flatbedTrailerDetail;

    private com.example.demo.fedex.rate.stub.FreightGuaranteeDetail freightGuaranteeDetail;

    /* Electronic Trade document references. */
    private com.example.demo.fedex.rate.stub.EtdDetail etdDetail;

    /* Specification for date or range of dates on which delivery
     * is to be attempted. */
    private com.example.demo.fedex.rate.stub.CustomDeliveryWindowDetail customDeliveryWindowDetail;

    public ShipmentSpecialServicesRequested() {
    }

    public ShipmentSpecialServicesRequested(
           String[] specialServiceTypes,
           com.example.demo.fedex.rate.stub.CodDetail codDetail,
           com.example.demo.fedex.rate.stub.DeliveryOnInvoiceAcceptanceDetail deliveryOnInvoiceAcceptanceDetail,
           com.example.demo.fedex.rate.stub.HoldAtLocationDetail holdAtLocationDetail,
           com.example.demo.fedex.rate.stub.ShipmentEventNotificationDetail eventNotificationDetail,
           com.example.demo.fedex.rate.stub.ReturnShipmentDetail returnShipmentDetail,
           com.example.demo.fedex.rate.stub.PendingShipmentDetail pendingShipmentDetail,
           com.example.demo.fedex.rate.stub.InternationalControlledExportDetail internationalControlledExportDetail,
           com.example.demo.fedex.rate.stub.InternationalTrafficInArmsRegulationsDetail internationalTrafficInArmsRegulationsDetail,
           com.example.demo.fedex.rate.stub.ShipmentDryIceDetail shipmentDryIceDetail,
           com.example.demo.fedex.rate.stub.HomeDeliveryPremiumDetail homeDeliveryPremiumDetail,
           com.example.demo.fedex.rate.stub.FlatbedTrailerDetail flatbedTrailerDetail,
           com.example.demo.fedex.rate.stub.FreightGuaranteeDetail freightGuaranteeDetail,
           com.example.demo.fedex.rate.stub.EtdDetail etdDetail,
           com.example.demo.fedex.rate.stub.CustomDeliveryWindowDetail customDeliveryWindowDetail) {
           this.specialServiceTypes = specialServiceTypes;
           this.codDetail = codDetail;
           this.deliveryOnInvoiceAcceptanceDetail = deliveryOnInvoiceAcceptanceDetail;
           this.holdAtLocationDetail = holdAtLocationDetail;
           this.eventNotificationDetail = eventNotificationDetail;
           this.returnShipmentDetail = returnShipmentDetail;
           this.pendingShipmentDetail = pendingShipmentDetail;
           this.internationalControlledExportDetail = internationalControlledExportDetail;
           this.internationalTrafficInArmsRegulationsDetail = internationalTrafficInArmsRegulationsDetail;
           this.shipmentDryIceDetail = shipmentDryIceDetail;
           this.homeDeliveryPremiumDetail = homeDeliveryPremiumDetail;
           this.flatbedTrailerDetail = flatbedTrailerDetail;
           this.freightGuaranteeDetail = freightGuaranteeDetail;
           this.etdDetail = etdDetail;
           this.customDeliveryWindowDetail = customDeliveryWindowDetail;
    }


    /**
     * Gets the specialServiceTypes value for this ShipmentSpecialServicesRequested.
     *
     * @return specialServiceTypes   * Indicates the shipment special service types that are requested
     * on this shipment. For a list of the valid shipment special service
     * types, please consult your integration documentation or get the list
     * of the available special services from the getAllSpecialServices method
     * of the Validation Availability and Commitment service.
     */
    public String[] getSpecialServiceTypes() {
        return specialServiceTypes;
    }


    /**
     * Sets the specialServiceTypes value for this ShipmentSpecialServicesRequested.
     *
     * @param specialServiceTypes   * Indicates the shipment special service types that are requested
     * on this shipment. For a list of the valid shipment special service
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
     * Gets the codDetail value for this ShipmentSpecialServicesRequested.
     *
     * @return codDetail
     */
    public com.example.demo.fedex.rate.stub.CodDetail getCodDetail() {
        return codDetail;
    }


    /**
     * Sets the codDetail value for this ShipmentSpecialServicesRequested.
     *
     * @param codDetail
     */
    public void setCodDetail(com.example.demo.fedex.rate.stub.CodDetail codDetail) {
        this.codDetail = codDetail;
    }


    /**
     * Gets the deliveryOnInvoiceAcceptanceDetail value for this ShipmentSpecialServicesRequested.
     *
     * @return deliveryOnInvoiceAcceptanceDetail
     */
    public com.example.demo.fedex.rate.stub.DeliveryOnInvoiceAcceptanceDetail getDeliveryOnInvoiceAcceptanceDetail() {
        return deliveryOnInvoiceAcceptanceDetail;
    }


    /**
     * Sets the deliveryOnInvoiceAcceptanceDetail value for this ShipmentSpecialServicesRequested.
     *
     * @param deliveryOnInvoiceAcceptanceDetail
     */
    public void setDeliveryOnInvoiceAcceptanceDetail(com.example.demo.fedex.rate.stub.DeliveryOnInvoiceAcceptanceDetail deliveryOnInvoiceAcceptanceDetail) {
        this.deliveryOnInvoiceAcceptanceDetail = deliveryOnInvoiceAcceptanceDetail;
    }


    /**
     * Gets the holdAtLocationDetail value for this ShipmentSpecialServicesRequested.
     *
     * @return holdAtLocationDetail
     */
    public com.example.demo.fedex.rate.stub.HoldAtLocationDetail getHoldAtLocationDetail() {
        return holdAtLocationDetail;
    }


    /**
     * Sets the holdAtLocationDetail value for this ShipmentSpecialServicesRequested.
     *
     * @param holdAtLocationDetail
     */
    public void setHoldAtLocationDetail(com.example.demo.fedex.rate.stub.HoldAtLocationDetail holdAtLocationDetail) {
        this.holdAtLocationDetail = holdAtLocationDetail;
    }


    /**
     * Gets the eventNotificationDetail value for this ShipmentSpecialServicesRequested.
     *
     * @return eventNotificationDetail   * This replaces eMailNotificationDetail
     */
    public com.example.demo.fedex.rate.stub.ShipmentEventNotificationDetail getEventNotificationDetail() {
        return eventNotificationDetail;
    }


    /**
     * Sets the eventNotificationDetail value for this ShipmentSpecialServicesRequested.
     *
     * @param eventNotificationDetail   * This replaces eMailNotificationDetail
     */
    public void setEventNotificationDetail(com.example.demo.fedex.rate.stub.ShipmentEventNotificationDetail eventNotificationDetail) {
        this.eventNotificationDetail = eventNotificationDetail;
    }


    /**
     * Gets the returnShipmentDetail value for this ShipmentSpecialServicesRequested.
     *
     * @return returnShipmentDetail
     */
    public com.example.demo.fedex.rate.stub.ReturnShipmentDetail getReturnShipmentDetail() {
        return returnShipmentDetail;
    }


    /**
     * Sets the returnShipmentDetail value for this ShipmentSpecialServicesRequested.
     *
     * @param returnShipmentDetail
     */
    public void setReturnShipmentDetail(com.example.demo.fedex.rate.stub.ReturnShipmentDetail returnShipmentDetail) {
        this.returnShipmentDetail = returnShipmentDetail;
    }


    /**
     * Gets the pendingShipmentDetail value for this ShipmentSpecialServicesRequested.
     *
     * @return pendingShipmentDetail   * This field should be populated for pending shipments (e.g.
     * e-mail label) It is required by a PENDING_SHIPMENT special service
     * type.
     */
    public com.example.demo.fedex.rate.stub.PendingShipmentDetail getPendingShipmentDetail() {
        return pendingShipmentDetail;
    }


    /**
     * Sets the pendingShipmentDetail value for this ShipmentSpecialServicesRequested.
     *
     * @param pendingShipmentDetail   * This field should be populated for pending shipments (e.g.
     * e-mail label) It is required by a PENDING_SHIPMENT special service
     * type.
     */
    public void setPendingShipmentDetail(com.example.demo.fedex.rate.stub.PendingShipmentDetail pendingShipmentDetail) {
        this.pendingShipmentDetail = pendingShipmentDetail;
    }


    /**
     * Gets the internationalControlledExportDetail value for this ShipmentSpecialServicesRequested.
     *
     * @return internationalControlledExportDetail
     */
    public com.example.demo.fedex.rate.stub.InternationalControlledExportDetail getInternationalControlledExportDetail() {
        return internationalControlledExportDetail;
    }


    /**
     * Sets the internationalControlledExportDetail value for this ShipmentSpecialServicesRequested.
     *
     * @param internationalControlledExportDetail
     */
    public void setInternationalControlledExportDetail(com.example.demo.fedex.rate.stub.InternationalControlledExportDetail internationalControlledExportDetail) {
        this.internationalControlledExportDetail = internationalControlledExportDetail;
    }


    /**
     * Gets the internationalTrafficInArmsRegulationsDetail value for this ShipmentSpecialServicesRequested.
     *
     * @return internationalTrafficInArmsRegulationsDetail
     */
    public com.example.demo.fedex.rate.stub.InternationalTrafficInArmsRegulationsDetail getInternationalTrafficInArmsRegulationsDetail() {
        return internationalTrafficInArmsRegulationsDetail;
    }


    /**
     * Sets the internationalTrafficInArmsRegulationsDetail value for this ShipmentSpecialServicesRequested.
     *
     * @param internationalTrafficInArmsRegulationsDetail
     */
    public void setInternationalTrafficInArmsRegulationsDetail(com.example.demo.fedex.rate.stub.InternationalTrafficInArmsRegulationsDetail internationalTrafficInArmsRegulationsDetail) {
        this.internationalTrafficInArmsRegulationsDetail = internationalTrafficInArmsRegulationsDetail;
    }


    /**
     * Gets the shipmentDryIceDetail value for this ShipmentSpecialServicesRequested.
     *
     * @return shipmentDryIceDetail
     */
    public com.example.demo.fedex.rate.stub.ShipmentDryIceDetail getShipmentDryIceDetail() {
        return shipmentDryIceDetail;
    }


    /**
     * Sets the shipmentDryIceDetail value for this ShipmentSpecialServicesRequested.
     *
     * @param shipmentDryIceDetail
     */
    public void setShipmentDryIceDetail(com.example.demo.fedex.rate.stub.ShipmentDryIceDetail shipmentDryIceDetail) {
        this.shipmentDryIceDetail = shipmentDryIceDetail;
    }


    /**
     * Gets the homeDeliveryPremiumDetail value for this ShipmentSpecialServicesRequested.
     *
     * @return homeDeliveryPremiumDetail
     */
    public com.example.demo.fedex.rate.stub.HomeDeliveryPremiumDetail getHomeDeliveryPremiumDetail() {
        return homeDeliveryPremiumDetail;
    }


    /**
     * Sets the homeDeliveryPremiumDetail value for this ShipmentSpecialServicesRequested.
     *
     * @param homeDeliveryPremiumDetail
     */
    public void setHomeDeliveryPremiumDetail(com.example.demo.fedex.rate.stub.HomeDeliveryPremiumDetail homeDeliveryPremiumDetail) {
        this.homeDeliveryPremiumDetail = homeDeliveryPremiumDetail;
    }


    /**
     * Gets the flatbedTrailerDetail value for this ShipmentSpecialServicesRequested.
     *
     * @return flatbedTrailerDetail
     */
    public com.example.demo.fedex.rate.stub.FlatbedTrailerDetail getFlatbedTrailerDetail() {
        return flatbedTrailerDetail;
    }


    /**
     * Sets the flatbedTrailerDetail value for this ShipmentSpecialServicesRequested.
     *
     * @param flatbedTrailerDetail
     */
    public void setFlatbedTrailerDetail(com.example.demo.fedex.rate.stub.FlatbedTrailerDetail flatbedTrailerDetail) {
        this.flatbedTrailerDetail = flatbedTrailerDetail;
    }


    /**
     * Gets the freightGuaranteeDetail value for this ShipmentSpecialServicesRequested.
     *
     * @return freightGuaranteeDetail
     */
    public com.example.demo.fedex.rate.stub.FreightGuaranteeDetail getFreightGuaranteeDetail() {
        return freightGuaranteeDetail;
    }


    /**
     * Sets the freightGuaranteeDetail value for this ShipmentSpecialServicesRequested.
     *
     * @param freightGuaranteeDetail
     */
    public void setFreightGuaranteeDetail(com.example.demo.fedex.rate.stub.FreightGuaranteeDetail freightGuaranteeDetail) {
        this.freightGuaranteeDetail = freightGuaranteeDetail;
    }


    /**
     * Gets the etdDetail value for this ShipmentSpecialServicesRequested.
     *
     * @return etdDetail   * Electronic Trade document references.
     */
    public com.example.demo.fedex.rate.stub.EtdDetail getEtdDetail() {
        return etdDetail;
    }


    /**
     * Sets the etdDetail value for this ShipmentSpecialServicesRequested.
     *
     * @param etdDetail   * Electronic Trade document references.
     */
    public void setEtdDetail(com.example.demo.fedex.rate.stub.EtdDetail etdDetail) {
        this.etdDetail = etdDetail;
    }


    /**
     * Gets the customDeliveryWindowDetail value for this ShipmentSpecialServicesRequested.
     *
     * @return customDeliveryWindowDetail   * Specification for date or range of dates on which delivery
     * is to be attempted.
     */
    public com.example.demo.fedex.rate.stub.CustomDeliveryWindowDetail getCustomDeliveryWindowDetail() {
        return customDeliveryWindowDetail;
    }


    /**
     * Sets the customDeliveryWindowDetail value for this ShipmentSpecialServicesRequested.
     *
     * @param customDeliveryWindowDetail   * Specification for date or range of dates on which delivery
     * is to be attempted.
     */
    public void setCustomDeliveryWindowDetail(com.example.demo.fedex.rate.stub.CustomDeliveryWindowDetail customDeliveryWindowDetail) {
        this.customDeliveryWindowDetail = customDeliveryWindowDetail;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ShipmentSpecialServicesRequested)) return false;
        ShipmentSpecialServicesRequested other = (ShipmentSpecialServicesRequested) obj;
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
            ((this.deliveryOnInvoiceAcceptanceDetail==null && other.getDeliveryOnInvoiceAcceptanceDetail()==null) ||
             (this.deliveryOnInvoiceAcceptanceDetail!=null &&
              this.deliveryOnInvoiceAcceptanceDetail.equals(other.getDeliveryOnInvoiceAcceptanceDetail()))) &&
            ((this.holdAtLocationDetail==null && other.getHoldAtLocationDetail()==null) ||
             (this.holdAtLocationDetail!=null &&
              this.holdAtLocationDetail.equals(other.getHoldAtLocationDetail()))) &&
            ((this.eventNotificationDetail==null && other.getEventNotificationDetail()==null) ||
             (this.eventNotificationDetail!=null &&
              this.eventNotificationDetail.equals(other.getEventNotificationDetail()))) &&
            ((this.returnShipmentDetail==null && other.getReturnShipmentDetail()==null) ||
             (this.returnShipmentDetail!=null &&
              this.returnShipmentDetail.equals(other.getReturnShipmentDetail()))) &&
            ((this.pendingShipmentDetail==null && other.getPendingShipmentDetail()==null) ||
             (this.pendingShipmentDetail!=null &&
              this.pendingShipmentDetail.equals(other.getPendingShipmentDetail()))) &&
            ((this.internationalControlledExportDetail==null && other.getInternationalControlledExportDetail()==null) ||
             (this.internationalControlledExportDetail!=null &&
              this.internationalControlledExportDetail.equals(other.getInternationalControlledExportDetail()))) &&
            ((this.internationalTrafficInArmsRegulationsDetail==null && other.getInternationalTrafficInArmsRegulationsDetail()==null) ||
             (this.internationalTrafficInArmsRegulationsDetail!=null &&
              this.internationalTrafficInArmsRegulationsDetail.equals(other.getInternationalTrafficInArmsRegulationsDetail()))) &&
            ((this.shipmentDryIceDetail==null && other.getShipmentDryIceDetail()==null) ||
             (this.shipmentDryIceDetail!=null &&
              this.shipmentDryIceDetail.equals(other.getShipmentDryIceDetail()))) &&
            ((this.homeDeliveryPremiumDetail==null && other.getHomeDeliveryPremiumDetail()==null) ||
             (this.homeDeliveryPremiumDetail!=null &&
              this.homeDeliveryPremiumDetail.equals(other.getHomeDeliveryPremiumDetail()))) &&
            ((this.flatbedTrailerDetail==null && other.getFlatbedTrailerDetail()==null) ||
             (this.flatbedTrailerDetail!=null &&
              this.flatbedTrailerDetail.equals(other.getFlatbedTrailerDetail()))) &&
            ((this.freightGuaranteeDetail==null && other.getFreightGuaranteeDetail()==null) ||
             (this.freightGuaranteeDetail!=null &&
              this.freightGuaranteeDetail.equals(other.getFreightGuaranteeDetail()))) &&
            ((this.etdDetail==null && other.getEtdDetail()==null) ||
             (this.etdDetail!=null &&
              this.etdDetail.equals(other.getEtdDetail()))) &&
            ((this.customDeliveryWindowDetail==null && other.getCustomDeliveryWindowDetail()==null) ||
             (this.customDeliveryWindowDetail!=null &&
              this.customDeliveryWindowDetail.equals(other.getCustomDeliveryWindowDetail())));
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
        if (getDeliveryOnInvoiceAcceptanceDetail() != null) {
            _hashCode += getDeliveryOnInvoiceAcceptanceDetail().hashCode();
        }
        if (getHoldAtLocationDetail() != null) {
            _hashCode += getHoldAtLocationDetail().hashCode();
        }
        if (getEventNotificationDetail() != null) {
            _hashCode += getEventNotificationDetail().hashCode();
        }
        if (getReturnShipmentDetail() != null) {
            _hashCode += getReturnShipmentDetail().hashCode();
        }
        if (getPendingShipmentDetail() != null) {
            _hashCode += getPendingShipmentDetail().hashCode();
        }
        if (getInternationalControlledExportDetail() != null) {
            _hashCode += getInternationalControlledExportDetail().hashCode();
        }
        if (getInternationalTrafficInArmsRegulationsDetail() != null) {
            _hashCode += getInternationalTrafficInArmsRegulationsDetail().hashCode();
        }
        if (getShipmentDryIceDetail() != null) {
            _hashCode += getShipmentDryIceDetail().hashCode();
        }
        if (getHomeDeliveryPremiumDetail() != null) {
            _hashCode += getHomeDeliveryPremiumDetail().hashCode();
        }
        if (getFlatbedTrailerDetail() != null) {
            _hashCode += getFlatbedTrailerDetail().hashCode();
        }
        if (getFreightGuaranteeDetail() != null) {
            _hashCode += getFreightGuaranteeDetail().hashCode();
        }
        if (getEtdDetail() != null) {
            _hashCode += getEtdDetail().hashCode();
        }
        if (getCustomDeliveryWindowDetail() != null) {
            _hashCode += getCustomDeliveryWindowDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShipmentSpecialServicesRequested.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShipmentSpecialServicesRequested"));
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
        elemField.setFieldName("deliveryOnInvoiceAcceptanceDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DeliveryOnInvoiceAcceptanceDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DeliveryOnInvoiceAcceptanceDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holdAtLocationDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "HoldAtLocationDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "HoldAtLocationDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventNotificationDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "EventNotificationDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShipmentEventNotificationDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnShipmentDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ReturnShipmentDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ReturnShipmentDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pendingShipmentDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "PendingShipmentDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "PendingShipmentDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internationalControlledExportDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "InternationalControlledExportDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "InternationalControlledExportDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internationalTrafficInArmsRegulationsDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "InternationalTrafficInArmsRegulationsDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "InternationalTrafficInArmsRegulationsDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentDryIceDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShipmentDryIceDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShipmentDryIceDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeDeliveryPremiumDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "HomeDeliveryPremiumDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "HomeDeliveryPremiumDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flatbedTrailerDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "FlatbedTrailerDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "FlatbedTrailerDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freightGuaranteeDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "FreightGuaranteeDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "FreightGuaranteeDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("etdDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "EtdDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "EtdDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customDeliveryWindowDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CustomDeliveryWindowDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CustomDeliveryWindowDetail"));
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
