/**
 * RateReplyDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.rate.stub;

public class RateReplyDetail  implements java.io.Serializable {
    private String serviceType;

    /* Descriptions and alternate identifiers for a service. */
    private com.fedex.rate.stub.ServiceDescription serviceDescription;

    private String packagingType;

    /* Shows the specific combination of service options combined
     * with the service type that produced this committment in the set returned
     * to the caller. */
    private com.fedex.rate.stub.ServiceOptionType[] appliedOptions;

    /* Supporting detail for applied options identified in preceding
     * field. */
    private com.fedex.rate.stub.ServiceSubOptionDetail appliedSubOptions;

    private String deliveryStation;

    private com.fedex.rate.stub.DayOfWeekType deliveryDayOfWeek;

    private java.util.Calendar deliveryTimestamp;

    private com.fedex.rate.stub.CommitDetail[] commitDetails;

    private String destinationAirportId;

    private Boolean ineligibleForMoneyBackGuarantee;

    /* Not populated by FAST service in Jan07. */
    private String originServiceArea;

    /* Not populated by FAST service in Jan07. */
    private String destinationServiceArea;

    /* Not populated by FAST service in Jan07. */
    private com.fedex.rate.stub.TransitTimeType transitTime;

    /* Maximum expected transit time */
    private com.fedex.rate.stub.TransitTimeType maximumTransitTime;

    /* Not populated by FAST service in Jan07. Actual signature option
     * applied, to allow for cases in wihch the original value conflicted
     * with other service features in the shipment. */
    private com.fedex.rate.stub.SignatureOptionType signatureOption;

    private com.fedex.rate.stub.ReturnedRateType actualRateType;

    /* Each element contains all rate data for a single rate type. */
    private com.fedex.rate.stub.RatedShipmentDetail[] ratedShipmentDetails;

    public RateReplyDetail() {
    }

    public RateReplyDetail(
           String serviceType,
           com.fedex.rate.stub.ServiceDescription serviceDescription,
           String packagingType,
           com.fedex.rate.stub.ServiceOptionType[] appliedOptions,
           com.fedex.rate.stub.ServiceSubOptionDetail appliedSubOptions,
           String deliveryStation,
           com.fedex.rate.stub.DayOfWeekType deliveryDayOfWeek,
           java.util.Calendar deliveryTimestamp,
           com.fedex.rate.stub.CommitDetail[] commitDetails,
           String destinationAirportId,
           Boolean ineligibleForMoneyBackGuarantee,
           String originServiceArea,
           String destinationServiceArea,
           com.fedex.rate.stub.TransitTimeType transitTime,
           com.fedex.rate.stub.TransitTimeType maximumTransitTime,
           com.fedex.rate.stub.SignatureOptionType signatureOption,
           com.fedex.rate.stub.ReturnedRateType actualRateType,
           com.fedex.rate.stub.RatedShipmentDetail[] ratedShipmentDetails) {
           this.serviceType = serviceType;
           this.serviceDescription = serviceDescription;
           this.packagingType = packagingType;
           this.appliedOptions = appliedOptions;
           this.appliedSubOptions = appliedSubOptions;
           this.deliveryStation = deliveryStation;
           this.deliveryDayOfWeek = deliveryDayOfWeek;
           this.deliveryTimestamp = deliveryTimestamp;
           this.commitDetails = commitDetails;
           this.destinationAirportId = destinationAirportId;
           this.ineligibleForMoneyBackGuarantee = ineligibleForMoneyBackGuarantee;
           this.originServiceArea = originServiceArea;
           this.destinationServiceArea = destinationServiceArea;
           this.transitTime = transitTime;
           this.maximumTransitTime = maximumTransitTime;
           this.signatureOption = signatureOption;
           this.actualRateType = actualRateType;
           this.ratedShipmentDetails = ratedShipmentDetails;
    }


    /**
     * Gets the serviceType value for this RateReplyDetail.
     *
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this RateReplyDetail.
     *
     * @param serviceType
     */
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }


    /**
     * Gets the serviceDescription value for this RateReplyDetail.
     *
     * @return serviceDescription   * Descriptions and alternate identifiers for a service.
     */
    public com.fedex.rate.stub.ServiceDescription getServiceDescription() {
        return serviceDescription;
    }


    /**
     * Sets the serviceDescription value for this RateReplyDetail.
     *
     * @param serviceDescription   * Descriptions and alternate identifiers for a service.
     */
    public void setServiceDescription(com.fedex.rate.stub.ServiceDescription serviceDescription) {
        this.serviceDescription = serviceDescription;
    }


    /**
     * Gets the packagingType value for this RateReplyDetail.
     *
     * @return packagingType
     */
    public String getPackagingType() {
        return packagingType;
    }


    /**
     * Sets the packagingType value for this RateReplyDetail.
     *
     * @param packagingType
     */
    public void setPackagingType(String packagingType) {
        this.packagingType = packagingType;
    }


    /**
     * Gets the appliedOptions value for this RateReplyDetail.
     *
     * @return appliedOptions   * Shows the specific combination of service options combined
     * with the service type that produced this committment in the set returned
     * to the caller.
     */
    public com.fedex.rate.stub.ServiceOptionType[] getAppliedOptions() {
        return appliedOptions;
    }


    /**
     * Sets the appliedOptions value for this RateReplyDetail.
     *
     * @param appliedOptions   * Shows the specific combination of service options combined
     * with the service type that produced this committment in the set returned
     * to the caller.
     */
    public void setAppliedOptions(com.fedex.rate.stub.ServiceOptionType[] appliedOptions) {
        this.appliedOptions = appliedOptions;
    }

    public com.fedex.rate.stub.ServiceOptionType getAppliedOptions(int i) {
        return this.appliedOptions[i];
    }

    public void setAppliedOptions(int i, com.fedex.rate.stub.ServiceOptionType _value) {
        this.appliedOptions[i] = _value;
    }


    /**
     * Gets the appliedSubOptions value for this RateReplyDetail.
     *
     * @return appliedSubOptions   * Supporting detail for applied options identified in preceding
     * field.
     */
    public com.fedex.rate.stub.ServiceSubOptionDetail getAppliedSubOptions() {
        return appliedSubOptions;
    }


    /**
     * Sets the appliedSubOptions value for this RateReplyDetail.
     *
     * @param appliedSubOptions   * Supporting detail for applied options identified in preceding
     * field.
     */
    public void setAppliedSubOptions(com.fedex.rate.stub.ServiceSubOptionDetail appliedSubOptions) {
        this.appliedSubOptions = appliedSubOptions;
    }


    /**
     * Gets the deliveryStation value for this RateReplyDetail.
     *
     * @return deliveryStation
     */
    public String getDeliveryStation() {
        return deliveryStation;
    }


    /**
     * Sets the deliveryStation value for this RateReplyDetail.
     *
     * @param deliveryStation
     */
    public void setDeliveryStation(String deliveryStation) {
        this.deliveryStation = deliveryStation;
    }


    /**
     * Gets the deliveryDayOfWeek value for this RateReplyDetail.
     *
     * @return deliveryDayOfWeek
     */
    public com.fedex.rate.stub.DayOfWeekType getDeliveryDayOfWeek() {
        return deliveryDayOfWeek;
    }


    /**
     * Sets the deliveryDayOfWeek value for this RateReplyDetail.
     *
     * @param deliveryDayOfWeek
     */
    public void setDeliveryDayOfWeek(com.fedex.rate.stub.DayOfWeekType deliveryDayOfWeek) {
        this.deliveryDayOfWeek = deliveryDayOfWeek;
    }


    /**
     * Gets the deliveryTimestamp value for this RateReplyDetail.
     *
     * @return deliveryTimestamp
     */
    public java.util.Calendar getDeliveryTimestamp() {
        return deliveryTimestamp;
    }


    /**
     * Sets the deliveryTimestamp value for this RateReplyDetail.
     *
     * @param deliveryTimestamp
     */
    public void setDeliveryTimestamp(java.util.Calendar deliveryTimestamp) {
        this.deliveryTimestamp = deliveryTimestamp;
    }


    /**
     * Gets the commitDetails value for this RateReplyDetail.
     *
     * @return commitDetails
     */
    public com.fedex.rate.stub.CommitDetail[] getCommitDetails() {
        return commitDetails;
    }


    /**
     * Sets the commitDetails value for this RateReplyDetail.
     *
     * @param commitDetails
     */
    public void setCommitDetails(com.fedex.rate.stub.CommitDetail[] commitDetails) {
        this.commitDetails = commitDetails;
    }

    public com.fedex.rate.stub.CommitDetail getCommitDetails(int i) {
        return this.commitDetails[i];
    }

    public void setCommitDetails(int i, com.fedex.rate.stub.CommitDetail _value) {
        this.commitDetails[i] = _value;
    }


    /**
     * Gets the destinationAirportId value for this RateReplyDetail.
     *
     * @return destinationAirportId
     */
    public String getDestinationAirportId() {
        return destinationAirportId;
    }


    /**
     * Sets the destinationAirportId value for this RateReplyDetail.
     *
     * @param destinationAirportId
     */
    public void setDestinationAirportId(String destinationAirportId) {
        this.destinationAirportId = destinationAirportId;
    }


    /**
     * Gets the ineligibleForMoneyBackGuarantee value for this RateReplyDetail.
     *
     * @return ineligibleForMoneyBackGuarantee
     */
    public Boolean getIneligibleForMoneyBackGuarantee() {
        return ineligibleForMoneyBackGuarantee;
    }


    /**
     * Sets the ineligibleForMoneyBackGuarantee value for this RateReplyDetail.
     *
     * @param ineligibleForMoneyBackGuarantee
     */
    public void setIneligibleForMoneyBackGuarantee(Boolean ineligibleForMoneyBackGuarantee) {
        this.ineligibleForMoneyBackGuarantee = ineligibleForMoneyBackGuarantee;
    }


    /**
     * Gets the originServiceArea value for this RateReplyDetail.
     *
     * @return originServiceArea   * Not populated by FAST service in Jan07.
     */
    public String getOriginServiceArea() {
        return originServiceArea;
    }


    /**
     * Sets the originServiceArea value for this RateReplyDetail.
     *
     * @param originServiceArea   * Not populated by FAST service in Jan07.
     */
    public void setOriginServiceArea(String originServiceArea) {
        this.originServiceArea = originServiceArea;
    }


    /**
     * Gets the destinationServiceArea value for this RateReplyDetail.
     *
     * @return destinationServiceArea   * Not populated by FAST service in Jan07.
     */
    public String getDestinationServiceArea() {
        return destinationServiceArea;
    }


    /**
     * Sets the destinationServiceArea value for this RateReplyDetail.
     *
     * @param destinationServiceArea   * Not populated by FAST service in Jan07.
     */
    public void setDestinationServiceArea(String destinationServiceArea) {
        this.destinationServiceArea = destinationServiceArea;
    }


    /**
     * Gets the transitTime value for this RateReplyDetail.
     *
     * @return transitTime   * Not populated by FAST service in Jan07.
     */
    public com.fedex.rate.stub.TransitTimeType getTransitTime() {
        return transitTime;
    }


    /**
     * Sets the transitTime value for this RateReplyDetail.
     *
     * @param transitTime   * Not populated by FAST service in Jan07.
     */
    public void setTransitTime(com.fedex.rate.stub.TransitTimeType transitTime) {
        this.transitTime = transitTime;
    }


    /**
     * Gets the maximumTransitTime value for this RateReplyDetail.
     *
     * @return maximumTransitTime   * Maximum expected transit time
     */
    public com.fedex.rate.stub.TransitTimeType getMaximumTransitTime() {
        return maximumTransitTime;
    }


    /**
     * Sets the maximumTransitTime value for this RateReplyDetail.
     *
     * @param maximumTransitTime   * Maximum expected transit time
     */
    public void setMaximumTransitTime(com.fedex.rate.stub.TransitTimeType maximumTransitTime) {
        this.maximumTransitTime = maximumTransitTime;
    }


    /**
     * Gets the signatureOption value for this RateReplyDetail.
     *
     * @return signatureOption   * Not populated by FAST service in Jan07. Actual signature option
     * applied, to allow for cases in wihch the original value conflicted
     * with other service features in the shipment.
     */
    public com.fedex.rate.stub.SignatureOptionType getSignatureOption() {
        return signatureOption;
    }


    /**
     * Sets the signatureOption value for this RateReplyDetail.
     *
     * @param signatureOption   * Not populated by FAST service in Jan07. Actual signature option
     * applied, to allow for cases in wihch the original value conflicted
     * with other service features in the shipment.
     */
    public void setSignatureOption(com.fedex.rate.stub.SignatureOptionType signatureOption) {
        this.signatureOption = signatureOption;
    }


    /**
     * Gets the actualRateType value for this RateReplyDetail.
     *
     * @return actualRateType
     */
    public com.fedex.rate.stub.ReturnedRateType getActualRateType() {
        return actualRateType;
    }


    /**
     * Sets the actualRateType value for this RateReplyDetail.
     *
     * @param actualRateType
     */
    public void setActualRateType(com.fedex.rate.stub.ReturnedRateType actualRateType) {
        this.actualRateType = actualRateType;
    }


    /**
     * Gets the ratedShipmentDetails value for this RateReplyDetail.
     *
     * @return ratedShipmentDetails   * Each element contains all rate data for a single rate type.
     */
    public com.fedex.rate.stub.RatedShipmentDetail[] getRatedShipmentDetails() {
        return ratedShipmentDetails;
    }


    /**
     * Sets the ratedShipmentDetails value for this RateReplyDetail.
     *
     * @param ratedShipmentDetails   * Each element contains all rate data for a single rate type.
     */
    public void setRatedShipmentDetails(com.fedex.rate.stub.RatedShipmentDetail[] ratedShipmentDetails) {
        this.ratedShipmentDetails = ratedShipmentDetails;
    }

    public com.fedex.rate.stub.RatedShipmentDetail getRatedShipmentDetails(int i) {
        return this.ratedShipmentDetails[i];
    }

    public void setRatedShipmentDetails(int i, com.fedex.rate.stub.RatedShipmentDetail _value) {
        this.ratedShipmentDetails[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RateReplyDetail)) return false;
        RateReplyDetail other = (RateReplyDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.serviceType==null && other.getServiceType()==null) ||
             (this.serviceType!=null &&
              this.serviceType.equals(other.getServiceType()))) &&
            ((this.serviceDescription==null && other.getServiceDescription()==null) ||
             (this.serviceDescription!=null &&
              this.serviceDescription.equals(other.getServiceDescription()))) &&
            ((this.packagingType==null && other.getPackagingType()==null) ||
             (this.packagingType!=null &&
              this.packagingType.equals(other.getPackagingType()))) &&
            ((this.appliedOptions==null && other.getAppliedOptions()==null) ||
             (this.appliedOptions!=null &&
              java.util.Arrays.equals(this.appliedOptions, other.getAppliedOptions()))) &&
            ((this.appliedSubOptions==null && other.getAppliedSubOptions()==null) ||
             (this.appliedSubOptions!=null &&
              this.appliedSubOptions.equals(other.getAppliedSubOptions()))) &&
            ((this.deliveryStation==null && other.getDeliveryStation()==null) ||
             (this.deliveryStation!=null &&
              this.deliveryStation.equals(other.getDeliveryStation()))) &&
            ((this.deliveryDayOfWeek==null && other.getDeliveryDayOfWeek()==null) ||
             (this.deliveryDayOfWeek!=null &&
              this.deliveryDayOfWeek.equals(other.getDeliveryDayOfWeek()))) &&
            ((this.deliveryTimestamp==null && other.getDeliveryTimestamp()==null) ||
             (this.deliveryTimestamp!=null &&
              this.deliveryTimestamp.equals(other.getDeliveryTimestamp()))) &&
            ((this.commitDetails==null && other.getCommitDetails()==null) ||
             (this.commitDetails!=null &&
              java.util.Arrays.equals(this.commitDetails, other.getCommitDetails()))) &&
            ((this.destinationAirportId==null && other.getDestinationAirportId()==null) ||
             (this.destinationAirportId!=null &&
              this.destinationAirportId.equals(other.getDestinationAirportId()))) &&
            ((this.ineligibleForMoneyBackGuarantee==null && other.getIneligibleForMoneyBackGuarantee()==null) ||
             (this.ineligibleForMoneyBackGuarantee!=null &&
              this.ineligibleForMoneyBackGuarantee.equals(other.getIneligibleForMoneyBackGuarantee()))) &&
            ((this.originServiceArea==null && other.getOriginServiceArea()==null) ||
             (this.originServiceArea!=null &&
              this.originServiceArea.equals(other.getOriginServiceArea()))) &&
            ((this.destinationServiceArea==null && other.getDestinationServiceArea()==null) ||
             (this.destinationServiceArea!=null &&
              this.destinationServiceArea.equals(other.getDestinationServiceArea()))) &&
            ((this.transitTime==null && other.getTransitTime()==null) ||
             (this.transitTime!=null &&
              this.transitTime.equals(other.getTransitTime()))) &&
            ((this.maximumTransitTime==null && other.getMaximumTransitTime()==null) ||
             (this.maximumTransitTime!=null &&
              this.maximumTransitTime.equals(other.getMaximumTransitTime()))) &&
            ((this.signatureOption==null && other.getSignatureOption()==null) ||
             (this.signatureOption!=null &&
              this.signatureOption.equals(other.getSignatureOption()))) &&
            ((this.actualRateType==null && other.getActualRateType()==null) ||
             (this.actualRateType!=null &&
              this.actualRateType.equals(other.getActualRateType()))) &&
            ((this.ratedShipmentDetails==null && other.getRatedShipmentDetails()==null) ||
             (this.ratedShipmentDetails!=null &&
              java.util.Arrays.equals(this.ratedShipmentDetails, other.getRatedShipmentDetails())));
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
        if (getServiceType() != null) {
            _hashCode += getServiceType().hashCode();
        }
        if (getServiceDescription() != null) {
            _hashCode += getServiceDescription().hashCode();
        }
        if (getPackagingType() != null) {
            _hashCode += getPackagingType().hashCode();
        }
        if (getAppliedOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppliedOptions());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAppliedOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppliedSubOptions() != null) {
            _hashCode += getAppliedSubOptions().hashCode();
        }
        if (getDeliveryStation() != null) {
            _hashCode += getDeliveryStation().hashCode();
        }
        if (getDeliveryDayOfWeek() != null) {
            _hashCode += getDeliveryDayOfWeek().hashCode();
        }
        if (getDeliveryTimestamp() != null) {
            _hashCode += getDeliveryTimestamp().hashCode();
        }
        if (getCommitDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommitDetails());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCommitDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDestinationAirportId() != null) {
            _hashCode += getDestinationAirportId().hashCode();
        }
        if (getIneligibleForMoneyBackGuarantee() != null) {
            _hashCode += getIneligibleForMoneyBackGuarantee().hashCode();
        }
        if (getOriginServiceArea() != null) {
            _hashCode += getOriginServiceArea().hashCode();
        }
        if (getDestinationServiceArea() != null) {
            _hashCode += getDestinationServiceArea().hashCode();
        }
        if (getTransitTime() != null) {
            _hashCode += getTransitTime().hashCode();
        }
        if (getMaximumTransitTime() != null) {
            _hashCode += getMaximumTransitTime().hashCode();
        }
        if (getSignatureOption() != null) {
            _hashCode += getSignatureOption().hashCode();
        }
        if (getActualRateType() != null) {
            _hashCode += getActualRateType().hashCode();
        }
        if (getRatedShipmentDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRatedShipmentDetails());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getRatedShipmentDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RateReplyDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RateReplyDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ServiceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ServiceDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ServiceDescription"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packagingType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "PackagingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "AppliedOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ServiceOptionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedSubOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "AppliedSubOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ServiceSubOptionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryStation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DeliveryStation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryDayOfWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DeliveryDayOfWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DayOfWeekType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DeliveryTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commitDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CommitDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CommitDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationAirportId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DestinationAirportId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ineligibleForMoneyBackGuarantee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "IneligibleForMoneyBackGuarantee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originServiceArea");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "OriginServiceArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationServiceArea");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DestinationServiceArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transitTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "TransitTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "TransitTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumTransitTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "MaximumTransitTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "TransitTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureOption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "SignatureOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "SignatureOptionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualRateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ActualRateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ReturnedRateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratedShipmentDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RatedShipmentDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RatedShipmentDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
