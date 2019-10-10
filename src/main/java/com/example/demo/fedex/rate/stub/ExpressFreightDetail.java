/**
 * ExpressFreightDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.demo.fedex.rate.stub;

public class ExpressFreightDetail  implements java.io.Serializable {
    private Boolean packingListEnclosed;

    private org.apache.axis.types.PositiveInteger shippersLoadAndCount;

    private String bookingConfirmationNumber;

    private Boolean referenceLabelRequested;

    private com.example.demo.fedex.rate.stub.ExpressFreightDetailContact beforeDeliveryContact;

    private com.example.demo.fedex.rate.stub.ExpressFreightDetailContact undeliverableContact;

    public ExpressFreightDetail() {
    }

    public ExpressFreightDetail(
           Boolean packingListEnclosed,
           org.apache.axis.types.PositiveInteger shippersLoadAndCount,
           String bookingConfirmationNumber,
           Boolean referenceLabelRequested,
           com.example.demo.fedex.rate.stub.ExpressFreightDetailContact beforeDeliveryContact,
           com.example.demo.fedex.rate.stub.ExpressFreightDetailContact undeliverableContact) {
           this.packingListEnclosed = packingListEnclosed;
           this.shippersLoadAndCount = shippersLoadAndCount;
           this.bookingConfirmationNumber = bookingConfirmationNumber;
           this.referenceLabelRequested = referenceLabelRequested;
           this.beforeDeliveryContact = beforeDeliveryContact;
           this.undeliverableContact = undeliverableContact;
    }


    /**
     * Gets the packingListEnclosed value for this ExpressFreightDetail.
     *
     * @return packingListEnclosed
     */
    public Boolean getPackingListEnclosed() {
        return packingListEnclosed;
    }


    /**
     * Sets the packingListEnclosed value for this ExpressFreightDetail.
     *
     * @param packingListEnclosed
     */
    public void setPackingListEnclosed(Boolean packingListEnclosed) {
        this.packingListEnclosed = packingListEnclosed;
    }


    /**
     * Gets the shippersLoadAndCount value for this ExpressFreightDetail.
     *
     * @return shippersLoadAndCount
     */
    public org.apache.axis.types.PositiveInteger getShippersLoadAndCount() {
        return shippersLoadAndCount;
    }


    /**
     * Sets the shippersLoadAndCount value for this ExpressFreightDetail.
     *
     * @param shippersLoadAndCount
     */
    public void setShippersLoadAndCount(org.apache.axis.types.PositiveInteger shippersLoadAndCount) {
        this.shippersLoadAndCount = shippersLoadAndCount;
    }


    /**
     * Gets the bookingConfirmationNumber value for this ExpressFreightDetail.
     *
     * @return bookingConfirmationNumber
     */
    public String getBookingConfirmationNumber() {
        return bookingConfirmationNumber;
    }


    /**
     * Sets the bookingConfirmationNumber value for this ExpressFreightDetail.
     *
     * @param bookingConfirmationNumber
     */
    public void setBookingConfirmationNumber(String bookingConfirmationNumber) {
        this.bookingConfirmationNumber = bookingConfirmationNumber;
    }


    /**
     * Gets the referenceLabelRequested value for this ExpressFreightDetail.
     *
     * @return referenceLabelRequested
     */
    public Boolean getReferenceLabelRequested() {
        return referenceLabelRequested;
    }


    /**
     * Sets the referenceLabelRequested value for this ExpressFreightDetail.
     *
     * @param referenceLabelRequested
     */
    public void setReferenceLabelRequested(Boolean referenceLabelRequested) {
        this.referenceLabelRequested = referenceLabelRequested;
    }


    /**
     * Gets the beforeDeliveryContact value for this ExpressFreightDetail.
     *
     * @return beforeDeliveryContact
     */
    public com.example.demo.fedex.rate.stub.ExpressFreightDetailContact getBeforeDeliveryContact() {
        return beforeDeliveryContact;
    }


    /**
     * Sets the beforeDeliveryContact value for this ExpressFreightDetail.
     *
     * @param beforeDeliveryContact
     */
    public void setBeforeDeliveryContact(com.example.demo.fedex.rate.stub.ExpressFreightDetailContact beforeDeliveryContact) {
        this.beforeDeliveryContact = beforeDeliveryContact;
    }


    /**
     * Gets the undeliverableContact value for this ExpressFreightDetail.
     *
     * @return undeliverableContact
     */
    public com.example.demo.fedex.rate.stub.ExpressFreightDetailContact getUndeliverableContact() {
        return undeliverableContact;
    }


    /**
     * Sets the undeliverableContact value for this ExpressFreightDetail.
     *
     * @param undeliverableContact
     */
    public void setUndeliverableContact(com.example.demo.fedex.rate.stub.ExpressFreightDetailContact undeliverableContact) {
        this.undeliverableContact = undeliverableContact;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ExpressFreightDetail)) return false;
        ExpressFreightDetail other = (ExpressFreightDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.packingListEnclosed==null && other.getPackingListEnclosed()==null) ||
             (this.packingListEnclosed!=null &&
              this.packingListEnclosed.equals(other.getPackingListEnclosed()))) &&
            ((this.shippersLoadAndCount==null && other.getShippersLoadAndCount()==null) ||
             (this.shippersLoadAndCount!=null &&
              this.shippersLoadAndCount.equals(other.getShippersLoadAndCount()))) &&
            ((this.bookingConfirmationNumber==null && other.getBookingConfirmationNumber()==null) ||
             (this.bookingConfirmationNumber!=null &&
              this.bookingConfirmationNumber.equals(other.getBookingConfirmationNumber()))) &&
            ((this.referenceLabelRequested==null && other.getReferenceLabelRequested()==null) ||
             (this.referenceLabelRequested!=null &&
              this.referenceLabelRequested.equals(other.getReferenceLabelRequested()))) &&
            ((this.beforeDeliveryContact==null && other.getBeforeDeliveryContact()==null) ||
             (this.beforeDeliveryContact!=null &&
              this.beforeDeliveryContact.equals(other.getBeforeDeliveryContact()))) &&
            ((this.undeliverableContact==null && other.getUndeliverableContact()==null) ||
             (this.undeliverableContact!=null &&
              this.undeliverableContact.equals(other.getUndeliverableContact())));
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
        if (getPackingListEnclosed() != null) {
            _hashCode += getPackingListEnclosed().hashCode();
        }
        if (getShippersLoadAndCount() != null) {
            _hashCode += getShippersLoadAndCount().hashCode();
        }
        if (getBookingConfirmationNumber() != null) {
            _hashCode += getBookingConfirmationNumber().hashCode();
        }
        if (getReferenceLabelRequested() != null) {
            _hashCode += getReferenceLabelRequested().hashCode();
        }
        if (getBeforeDeliveryContact() != null) {
            _hashCode += getBeforeDeliveryContact().hashCode();
        }
        if (getUndeliverableContact() != null) {
            _hashCode += getUndeliverableContact().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExpressFreightDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ExpressFreightDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packingListEnclosed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "PackingListEnclosed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippersLoadAndCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShippersLoadAndCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookingConfirmationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "BookingConfirmationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceLabelRequested");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ReferenceLabelRequested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beforeDeliveryContact");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "BeforeDeliveryContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ExpressFreightDetailContact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("undeliverableContact");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "UndeliverableContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ExpressFreightDetailContact"));
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
