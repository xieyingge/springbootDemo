/**
 * RequestedPackageLineItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.demo.fedex.rate.stub;


/**
 * This class rationalizes RequestedPackage and RequestedPackageSummary
 * from previous interfaces.
 */
public class RequestedPackageLineItem  implements java.io.Serializable {
    /* Used only with INDIVIDUAL_PACKAGE, as a unique identifier of
     * each requested package. */
    private org.apache.axis.types.PositiveInteger sequenceNumber;

    /* Used only with PACKAGE_GROUPS, as a unique identifier of each
     * group of identical packages. */
    private org.apache.axis.types.NonNegativeInteger groupNumber;

    /* Used only with PACKAGE_GROUPS, as a count of packages within
     * a group of identical packages. */
    private org.apache.axis.types.NonNegativeInteger groupPackageCount;

    private com.example.demo.fedex.rate.stub.VariableHandlingChargeDetail variableHandlingChargeDetail;

    /* Specifies the declared value for carriage of the package. The
     * declared value for carriage represents the maximum liability of FedEx
     * in connection with a shipment, including, but not limited to, any
     * loss, damage, delay, mis-delivery, nondelivery, misinformation, any
     * failure to provide information, or mis-delivery of information relating
     * to the package. This field is only used for INDIVIDUAL_PACKAGES and
     * PACKAGE_GROUPS. Ignored for PACKAGE_SUMMARY, in which case totalInsuredValue
     * and packageCount on the shipment will be used to determine this value. */
    private com.example.demo.fedex.rate.stub.Money insuredValue;

    /* Only used for INDIVIDUAL_PACKAGES and PACKAGE_GROUPS. Ignored
     * for PACKAGE_SUMMARY, in which case total weight and packageCount on
     * the shipment will be used to determine this value. */
    private com.example.demo.fedex.rate.stub.Weight weight;

    private com.example.demo.fedex.rate.stub.Dimensions dimensions;

    /* Provides additional detail on how the customer has physically
     * packaged this item. As of June 2009, required for packages moving
     * under international and SmartPost services. */
    private com.example.demo.fedex.rate.stub.PhysicalPackagingType physicalPackaging;

    private com.example.demo.fedex.rate.stub.AssociatedFreightLineItemDetail[] associatedFreightLineItems;

    /* Human-readable text describing the package. */
    private String itemDescription;

    /* Human-readable text describing the contents of the package
     * to be used for clearance purposes. */
    private String itemDescriptionForClearance;

    private com.example.demo.fedex.rate.stub.CustomerReference[] customerReferences;

    private com.example.demo.fedex.rate.stub.PackageSpecialServicesRequested specialServicesRequested;

    /* Only used for INDIVIDUAL_PACKAGES and PACKAGE_GROUPS. */
    private com.example.demo.fedex.rate.stub.ContentRecord[] contentRecords;

    private com.example.demo.fedex.rate.stub.ShipperConveyanceDetail conveyanceDetail;

    public RequestedPackageLineItem() {
    }

    public RequestedPackageLineItem(
           org.apache.axis.types.PositiveInteger sequenceNumber,
           org.apache.axis.types.NonNegativeInteger groupNumber,
           org.apache.axis.types.NonNegativeInteger groupPackageCount,
           com.example.demo.fedex.rate.stub.VariableHandlingChargeDetail variableHandlingChargeDetail,
           com.example.demo.fedex.rate.stub.Money insuredValue,
           com.example.demo.fedex.rate.stub.Weight weight,
           com.example.demo.fedex.rate.stub.Dimensions dimensions,
           com.example.demo.fedex.rate.stub.PhysicalPackagingType physicalPackaging,
           com.example.demo.fedex.rate.stub.AssociatedFreightLineItemDetail[] associatedFreightLineItems,
           String itemDescription,
           String itemDescriptionForClearance,
           com.example.demo.fedex.rate.stub.CustomerReference[] customerReferences,
           com.example.demo.fedex.rate.stub.PackageSpecialServicesRequested specialServicesRequested,
           com.example.demo.fedex.rate.stub.ContentRecord[] contentRecords,
           com.example.demo.fedex.rate.stub.ShipperConveyanceDetail conveyanceDetail) {
           this.sequenceNumber = sequenceNumber;
           this.groupNumber = groupNumber;
           this.groupPackageCount = groupPackageCount;
           this.variableHandlingChargeDetail = variableHandlingChargeDetail;
           this.insuredValue = insuredValue;
           this.weight = weight;
           this.dimensions = dimensions;
           this.physicalPackaging = physicalPackaging;
           this.associatedFreightLineItems = associatedFreightLineItems;
           this.itemDescription = itemDescription;
           this.itemDescriptionForClearance = itemDescriptionForClearance;
           this.customerReferences = customerReferences;
           this.specialServicesRequested = specialServicesRequested;
           this.contentRecords = contentRecords;
           this.conveyanceDetail = conveyanceDetail;
    }


    /**
     * Gets the sequenceNumber value for this RequestedPackageLineItem.
     *
     * @return sequenceNumber   * Used only with INDIVIDUAL_PACKAGE, as a unique identifier of
     * each requested package.
     */
    public org.apache.axis.types.PositiveInteger getSequenceNumber() {
        return sequenceNumber;
    }


    /**
     * Sets the sequenceNumber value for this RequestedPackageLineItem.
     *
     * @param sequenceNumber   * Used only with INDIVIDUAL_PACKAGE, as a unique identifier of
     * each requested package.
     */
    public void setSequenceNumber(org.apache.axis.types.PositiveInteger sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }


    /**
     * Gets the groupNumber value for this RequestedPackageLineItem.
     *
     * @return groupNumber   * Used only with PACKAGE_GROUPS, as a unique identifier of each
     * group of identical packages.
     */
    public org.apache.axis.types.NonNegativeInteger getGroupNumber() {
        return groupNumber;
    }


    /**
     * Sets the groupNumber value for this RequestedPackageLineItem.
     *
     * @param groupNumber   * Used only with PACKAGE_GROUPS, as a unique identifier of each
     * group of identical packages.
     */
    public void setGroupNumber(org.apache.axis.types.NonNegativeInteger groupNumber) {
        this.groupNumber = groupNumber;
    }


    /**
     * Gets the groupPackageCount value for this RequestedPackageLineItem.
     *
     * @return groupPackageCount   * Used only with PACKAGE_GROUPS, as a count of packages within
     * a group of identical packages.
     */
    public org.apache.axis.types.NonNegativeInteger getGroupPackageCount() {
        return groupPackageCount;
    }


    /**
     * Sets the groupPackageCount value for this RequestedPackageLineItem.
     *
     * @param groupPackageCount   * Used only with PACKAGE_GROUPS, as a count of packages within
     * a group of identical packages.
     */
    public void setGroupPackageCount(org.apache.axis.types.NonNegativeInteger groupPackageCount) {
        this.groupPackageCount = groupPackageCount;
    }


    /**
     * Gets the variableHandlingChargeDetail value for this RequestedPackageLineItem.
     *
     * @return variableHandlingChargeDetail
     */
    public com.example.demo.fedex.rate.stub.VariableHandlingChargeDetail getVariableHandlingChargeDetail() {
        return variableHandlingChargeDetail;
    }


    /**
     * Sets the variableHandlingChargeDetail value for this RequestedPackageLineItem.
     *
     * @param variableHandlingChargeDetail
     */
    public void setVariableHandlingChargeDetail(com.example.demo.fedex.rate.stub.VariableHandlingChargeDetail variableHandlingChargeDetail) {
        this.variableHandlingChargeDetail = variableHandlingChargeDetail;
    }


    /**
     * Gets the insuredValue value for this RequestedPackageLineItem.
     *
     * @return insuredValue   * Specifies the declared value for carriage of the package. The
     * declared value for carriage represents the maximum liability of FedEx
     * in connection with a shipment, including, but not limited to, any
     * loss, damage, delay, mis-delivery, nondelivery, misinformation, any
     * failure to provide information, or mis-delivery of information relating
     * to the package. This field is only used for INDIVIDUAL_PACKAGES and
     * PACKAGE_GROUPS. Ignored for PACKAGE_SUMMARY, in which case totalInsuredValue
     * and packageCount on the shipment will be used to determine this value.
     */
    public com.example.demo.fedex.rate.stub.Money getInsuredValue() {
        return insuredValue;
    }


    /**
     * Sets the insuredValue value for this RequestedPackageLineItem.
     *
     * @param insuredValue   * Specifies the declared value for carriage of the package. The
     * declared value for carriage represents the maximum liability of FedEx
     * in connection with a shipment, including, but not limited to, any
     * loss, damage, delay, mis-delivery, nondelivery, misinformation, any
     * failure to provide information, or mis-delivery of information relating
     * to the package. This field is only used for INDIVIDUAL_PACKAGES and
     * PACKAGE_GROUPS. Ignored for PACKAGE_SUMMARY, in which case totalInsuredValue
     * and packageCount on the shipment will be used to determine this value.
     */
    public void setInsuredValue(com.example.demo.fedex.rate.stub.Money insuredValue) {
        this.insuredValue = insuredValue;
    }


    /**
     * Gets the weight value for this RequestedPackageLineItem.
     *
     * @return weight   * Only used for INDIVIDUAL_PACKAGES and PACKAGE_GROUPS. Ignored
     * for PACKAGE_SUMMARY, in which case total weight and packageCount on
     * the shipment will be used to determine this value.
     */
    public com.example.demo.fedex.rate.stub.Weight getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this RequestedPackageLineItem.
     *
     * @param weight   * Only used for INDIVIDUAL_PACKAGES and PACKAGE_GROUPS. Ignored
     * for PACKAGE_SUMMARY, in which case total weight and packageCount on
     * the shipment will be used to determine this value.
     */
    public void setWeight(com.example.demo.fedex.rate.stub.Weight weight) {
        this.weight = weight;
    }


    /**
     * Gets the dimensions value for this RequestedPackageLineItem.
     *
     * @return dimensions
     */
    public com.example.demo.fedex.rate.stub.Dimensions getDimensions() {
        return dimensions;
    }


    /**
     * Sets the dimensions value for this RequestedPackageLineItem.
     *
     * @param dimensions
     */
    public void setDimensions(com.example.demo.fedex.rate.stub.Dimensions dimensions) {
        this.dimensions = dimensions;
    }


    /**
     * Gets the physicalPackaging value for this RequestedPackageLineItem.
     *
     * @return physicalPackaging   * Provides additional detail on how the customer has physically
     * packaged this item. As of June 2009, required for packages moving
     * under international and SmartPost services.
     */
    public com.example.demo.fedex.rate.stub.PhysicalPackagingType getPhysicalPackaging() {
        return physicalPackaging;
    }


    /**
     * Sets the physicalPackaging value for this RequestedPackageLineItem.
     *
     * @param physicalPackaging   * Provides additional detail on how the customer has physically
     * packaged this item. As of June 2009, required for packages moving
     * under international and SmartPost services.
     */
    public void setPhysicalPackaging(com.example.demo.fedex.rate.stub.PhysicalPackagingType physicalPackaging) {
        this.physicalPackaging = physicalPackaging;
    }


    /**
     * Gets the associatedFreightLineItems value for this RequestedPackageLineItem.
     *
     * @return associatedFreightLineItems
     */
    public com.example.demo.fedex.rate.stub.AssociatedFreightLineItemDetail[] getAssociatedFreightLineItems() {
        return associatedFreightLineItems;
    }


    /**
     * Sets the associatedFreightLineItems value for this RequestedPackageLineItem.
     *
     * @param associatedFreightLineItems
     */
    public void setAssociatedFreightLineItems(com.example.demo.fedex.rate.stub.AssociatedFreightLineItemDetail[] associatedFreightLineItems) {
        this.associatedFreightLineItems = associatedFreightLineItems;
    }

    public com.example.demo.fedex.rate.stub.AssociatedFreightLineItemDetail getAssociatedFreightLineItems(int i) {
        return this.associatedFreightLineItems[i];
    }

    public void setAssociatedFreightLineItems(int i, com.example.demo.fedex.rate.stub.AssociatedFreightLineItemDetail _value) {
        this.associatedFreightLineItems[i] = _value;
    }


    /**
     * Gets the itemDescription value for this RequestedPackageLineItem.
     *
     * @return itemDescription   * Human-readable text describing the package.
     */
    public String getItemDescription() {
        return itemDescription;
    }


    /**
     * Sets the itemDescription value for this RequestedPackageLineItem.
     *
     * @param itemDescription   * Human-readable text describing the package.
     */
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }


    /**
     * Gets the itemDescriptionForClearance value for this RequestedPackageLineItem.
     *
     * @return itemDescriptionForClearance   * Human-readable text describing the contents of the package
     * to be used for clearance purposes.
     */
    public String getItemDescriptionForClearance() {
        return itemDescriptionForClearance;
    }


    /**
     * Sets the itemDescriptionForClearance value for this RequestedPackageLineItem.
     *
     * @param itemDescriptionForClearance   * Human-readable text describing the contents of the package
     * to be used for clearance purposes.
     */
    public void setItemDescriptionForClearance(String itemDescriptionForClearance) {
        this.itemDescriptionForClearance = itemDescriptionForClearance;
    }


    /**
     * Gets the customerReferences value for this RequestedPackageLineItem.
     *
     * @return customerReferences
     */
    public com.example.demo.fedex.rate.stub.CustomerReference[] getCustomerReferences() {
        return customerReferences;
    }


    /**
     * Sets the customerReferences value for this RequestedPackageLineItem.
     *
     * @param customerReferences
     */
    public void setCustomerReferences(com.example.demo.fedex.rate.stub.CustomerReference[] customerReferences) {
        this.customerReferences = customerReferences;
    }

    public com.example.demo.fedex.rate.stub.CustomerReference getCustomerReferences(int i) {
        return this.customerReferences[i];
    }

    public void setCustomerReferences(int i, com.example.demo.fedex.rate.stub.CustomerReference _value) {
        this.customerReferences[i] = _value;
    }


    /**
     * Gets the specialServicesRequested value for this RequestedPackageLineItem.
     *
     * @return specialServicesRequested
     */
    public com.example.demo.fedex.rate.stub.PackageSpecialServicesRequested getSpecialServicesRequested() {
        return specialServicesRequested;
    }


    /**
     * Sets the specialServicesRequested value for this RequestedPackageLineItem.
     *
     * @param specialServicesRequested
     */
    public void setSpecialServicesRequested(com.example.demo.fedex.rate.stub.PackageSpecialServicesRequested specialServicesRequested) {
        this.specialServicesRequested = specialServicesRequested;
    }


    /**
     * Gets the contentRecords value for this RequestedPackageLineItem.
     *
     * @return contentRecords   * Only used for INDIVIDUAL_PACKAGES and PACKAGE_GROUPS.
     */
    public com.example.demo.fedex.rate.stub.ContentRecord[] getContentRecords() {
        return contentRecords;
    }


    /**
     * Sets the contentRecords value for this RequestedPackageLineItem.
     *
     * @param contentRecords   * Only used for INDIVIDUAL_PACKAGES and PACKAGE_GROUPS.
     */
    public void setContentRecords(com.example.demo.fedex.rate.stub.ContentRecord[] contentRecords) {
        this.contentRecords = contentRecords;
    }

    public com.example.demo.fedex.rate.stub.ContentRecord getContentRecords(int i) {
        return this.contentRecords[i];
    }

    public void setContentRecords(int i, com.example.demo.fedex.rate.stub.ContentRecord _value) {
        this.contentRecords[i] = _value;
    }


    /**
     * Gets the conveyanceDetail value for this RequestedPackageLineItem.
     *
     * @return conveyanceDetail
     */
    public com.example.demo.fedex.rate.stub.ShipperConveyanceDetail getConveyanceDetail() {
        return conveyanceDetail;
    }


    /**
     * Sets the conveyanceDetail value for this RequestedPackageLineItem.
     *
     * @param conveyanceDetail
     */
    public void setConveyanceDetail(com.example.demo.fedex.rate.stub.ShipperConveyanceDetail conveyanceDetail) {
        this.conveyanceDetail = conveyanceDetail;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RequestedPackageLineItem)) return false;
        RequestedPackageLineItem other = (RequestedPackageLineItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.sequenceNumber==null && other.getSequenceNumber()==null) ||
             (this.sequenceNumber!=null &&
              this.sequenceNumber.equals(other.getSequenceNumber()))) &&
            ((this.groupNumber==null && other.getGroupNumber()==null) ||
             (this.groupNumber!=null &&
              this.groupNumber.equals(other.getGroupNumber()))) &&
            ((this.groupPackageCount==null && other.getGroupPackageCount()==null) ||
             (this.groupPackageCount!=null &&
              this.groupPackageCount.equals(other.getGroupPackageCount()))) &&
            ((this.variableHandlingChargeDetail==null && other.getVariableHandlingChargeDetail()==null) ||
             (this.variableHandlingChargeDetail!=null &&
              this.variableHandlingChargeDetail.equals(other.getVariableHandlingChargeDetail()))) &&
            ((this.insuredValue==null && other.getInsuredValue()==null) ||
             (this.insuredValue!=null &&
              this.insuredValue.equals(other.getInsuredValue()))) &&
            ((this.weight==null && other.getWeight()==null) ||
             (this.weight!=null &&
              this.weight.equals(other.getWeight()))) &&
            ((this.dimensions==null && other.getDimensions()==null) ||
             (this.dimensions!=null &&
              this.dimensions.equals(other.getDimensions()))) &&
            ((this.physicalPackaging==null && other.getPhysicalPackaging()==null) ||
             (this.physicalPackaging!=null &&
              this.physicalPackaging.equals(other.getPhysicalPackaging()))) &&
            ((this.associatedFreightLineItems==null && other.getAssociatedFreightLineItems()==null) ||
             (this.associatedFreightLineItems!=null &&
              java.util.Arrays.equals(this.associatedFreightLineItems, other.getAssociatedFreightLineItems()))) &&
            ((this.itemDescription==null && other.getItemDescription()==null) ||
             (this.itemDescription!=null &&
              this.itemDescription.equals(other.getItemDescription()))) &&
            ((this.itemDescriptionForClearance==null && other.getItemDescriptionForClearance()==null) ||
             (this.itemDescriptionForClearance!=null &&
              this.itemDescriptionForClearance.equals(other.getItemDescriptionForClearance()))) &&
            ((this.customerReferences==null && other.getCustomerReferences()==null) ||
             (this.customerReferences!=null &&
              java.util.Arrays.equals(this.customerReferences, other.getCustomerReferences()))) &&
            ((this.specialServicesRequested==null && other.getSpecialServicesRequested()==null) ||
             (this.specialServicesRequested!=null &&
              this.specialServicesRequested.equals(other.getSpecialServicesRequested()))) &&
            ((this.contentRecords==null && other.getContentRecords()==null) ||
             (this.contentRecords!=null &&
              java.util.Arrays.equals(this.contentRecords, other.getContentRecords()))) &&
            ((this.conveyanceDetail==null && other.getConveyanceDetail()==null) ||
             (this.conveyanceDetail!=null &&
              this.conveyanceDetail.equals(other.getConveyanceDetail())));
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
        if (getSequenceNumber() != null) {
            _hashCode += getSequenceNumber().hashCode();
        }
        if (getGroupNumber() != null) {
            _hashCode += getGroupNumber().hashCode();
        }
        if (getGroupPackageCount() != null) {
            _hashCode += getGroupPackageCount().hashCode();
        }
        if (getVariableHandlingChargeDetail() != null) {
            _hashCode += getVariableHandlingChargeDetail().hashCode();
        }
        if (getInsuredValue() != null) {
            _hashCode += getInsuredValue().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        if (getDimensions() != null) {
            _hashCode += getDimensions().hashCode();
        }
        if (getPhysicalPackaging() != null) {
            _hashCode += getPhysicalPackaging().hashCode();
        }
        if (getAssociatedFreightLineItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssociatedFreightLineItems());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAssociatedFreightLineItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemDescription() != null) {
            _hashCode += getItemDescription().hashCode();
        }
        if (getItemDescriptionForClearance() != null) {
            _hashCode += getItemDescriptionForClearance().hashCode();
        }
        if (getCustomerReferences() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomerReferences());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCustomerReferences(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSpecialServicesRequested() != null) {
            _hashCode += getSpecialServicesRequested().hashCode();
        }
        if (getContentRecords() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContentRecords());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getContentRecords(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConveyanceDetail() != null) {
            _hashCode += getConveyanceDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestedPackageLineItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RequestedPackageLineItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "SequenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "GroupNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupPackageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "GroupPackageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variableHandlingChargeDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "VariableHandlingChargeDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "VariableHandlingChargeDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuredValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "InsuredValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Weight"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Dimensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Dimensions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("physicalPackaging");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "PhysicalPackaging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "PhysicalPackagingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associatedFreightLineItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "AssociatedFreightLineItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "AssociatedFreightLineItemDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ItemDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemDescriptionForClearance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ItemDescriptionForClearance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerReferences");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CustomerReferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CustomerReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialServicesRequested");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "SpecialServicesRequested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "PackageSpecialServicesRequested"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ContentRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ContentRecord"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conveyanceDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ConveyanceDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShipperConveyanceDetail"));
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
