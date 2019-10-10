/**
 * ServiceDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.demo.fedex.rate.stub;

public class ServiceDescription  implements java.io.Serializable {
    private String serviceType;

    private String code;

    /* Branded, translated, and/or localized names for this service. */
    private com.example.demo.fedex.rate.stub.ProductName[] names;

    private String description;

    private String astraDescription;

    public ServiceDescription() {
    }

    public ServiceDescription(
           String serviceType,
           String code,
           com.example.demo.fedex.rate.stub.ProductName[] names,
           String description,
           String astraDescription) {
           this.serviceType = serviceType;
           this.code = code;
           this.names = names;
           this.description = description;
           this.astraDescription = astraDescription;
    }


    /**
     * Gets the serviceType value for this ServiceDescription.
     *
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this ServiceDescription.
     *
     * @param serviceType
     */
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }


    /**
     * Gets the code value for this ServiceDescription.
     *
     * @return code
     */
    public String getCode() {
        return code;
    }


    /**
     * Sets the code value for this ServiceDescription.
     *
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }


    /**
     * Gets the names value for this ServiceDescription.
     *
     * @return names   * Branded, translated, and/or localized names for this service.
     */
    public com.example.demo.fedex.rate.stub.ProductName[] getNames() {
        return names;
    }


    /**
     * Sets the names value for this ServiceDescription.
     *
     * @param names   * Branded, translated, and/or localized names for this service.
     */
    public void setNames(com.example.demo.fedex.rate.stub.ProductName[] names) {
        this.names = names;
    }

    public com.example.demo.fedex.rate.stub.ProductName getNames(int i) {
        return this.names[i];
    }

    public void setNames(int i, com.example.demo.fedex.rate.stub.ProductName _value) {
        this.names[i] = _value;
    }


    /**
     * Gets the description value for this ServiceDescription.
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ServiceDescription.
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets the astraDescription value for this ServiceDescription.
     *
     * @return astraDescription
     */
    public String getAstraDescription() {
        return astraDescription;
    }


    /**
     * Sets the astraDescription value for this ServiceDescription.
     *
     * @param astraDescription
     */
    public void setAstraDescription(String astraDescription) {
        this.astraDescription = astraDescription;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ServiceDescription)) return false;
        ServiceDescription other = (ServiceDescription) obj;
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
            ((this.code==null && other.getCode()==null) ||
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.names==null && other.getNames()==null) ||
             (this.names!=null &&
              java.util.Arrays.equals(this.names, other.getNames()))) &&
            ((this.description==null && other.getDescription()==null) ||
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.astraDescription==null && other.getAstraDescription()==null) ||
             (this.astraDescription!=null &&
              this.astraDescription.equals(other.getAstraDescription())));
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
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNames());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getAstraDescription() != null) {
            _hashCode += getAstraDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceDescription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ServiceDescription"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ServiceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("names");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Names"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ProductName"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("astraDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "AstraDescription"));
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
