/**
 * RateServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.demo.fedex.rate.stub;

public class RateServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.example.demo.fedex.rate.stub.RatePortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[1];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RateRequest"), com.example.demo.fedex.rate.stub.RateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RateReply"));
        oper.setReturnClass(com.example.demo.fedex.rate.stub.RateReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RateReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

    }

    public RateServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public RateServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public RateServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
    }

    private void addBindings0() {
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "AdditionalLabelsDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.AdditionalLabelsDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "AdditionalLabelsType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.AdditionalLabelsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Address");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.Address.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "AlcoholDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.AlcoholDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "AlcoholRecipientType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.AlcoholRecipientType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "AncillaryFeeAndTax");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.AncillaryFeeAndTax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "AncillaryFeeAndTaxType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.AncillaryFeeAndTaxType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "AssociatedFreightLineItemDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.AssociatedFreightLineItemDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "B13AFilingOptionType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.B13AFilingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "BarcodeSymbologyType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.BarcodeSymbologyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "BatteryClassificationDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.BatteryClassificationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "BatteryMaterialType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.BatteryMaterialType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "BatteryPackingType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.BatteryPackingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "BatteryRegulatorySubType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.BatteryRegulatorySubType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "BrokerDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.BrokerDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "BrokerType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.BrokerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CarrierCodeType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.CarrierCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CertificateOfOriginDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.CertificateOfOriginDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ChargeBasisLevelType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ChargeBasisLevelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CleansedAddressAndLocationDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.CleansedAddressAndLocationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ClearanceBrokerageType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ClearanceBrokerageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ClientDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ClientDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CodAddTransportationChargeBasisType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.CodAddTransportationChargeBasisType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CodAddTransportationChargesDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.CodAddTransportationChargesDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CodCollectionType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.CodCollectionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CodDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.CodDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CodReturnReferenceIndicatorType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.CodReturnReferenceIndicatorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CommercialInvoice");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.CommercialInvoice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CommercialInvoiceDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.CommercialInvoiceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CommitDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.CommitDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CommitmentDelayType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.CommitmentDelayType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Commodity");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.Commodity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CommodityPurposeType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.CommodityPurposeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ConfigurableLabelReferenceEntry");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ConfigurableLabelReferenceEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ConsolidationKey");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ConsolidationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ConsolidationType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ConsolidationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Contact");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.Contact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ContactAndAddress");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ContactAndAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ContentRecord");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ContentRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CurrencyExchangeRate");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.CurrencyExchangeRate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CustomDeliveryWindowDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.CustomDeliveryWindowDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CustomDeliveryWindowType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.CustomDeliveryWindowType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CustomDocumentDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.CustomDocumentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CustomerImageUsage");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.CustomerImageUsage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CustomerImageUsageType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.CustomerImageUsageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CustomerReference");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.CustomerReference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CustomerReferenceType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.CustomerReferenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CustomerSpecifiedLabelDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.CustomerSpecifiedLabelDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CustomerSpecifiedLabelGenerationOptionType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.CustomerSpecifiedLabelGenerationOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CustomLabelBarcodeEntry");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.CustomLabelBarcodeEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CustomLabelBoxEntry");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.CustomLabelBoxEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CustomLabelCoordinateUnits");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.CustomLabelCoordinateUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CustomLabelDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.CustomLabelDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CustomLabelGraphicEntry");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.CustomLabelGraphicEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CustomLabelPosition");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.CustomLabelPosition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CustomLabelTextBoxEntry");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.CustomLabelTextBoxEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CustomLabelTextEntry");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.CustomLabelTextEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CustomsClearanceDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.CustomsClearanceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CustomsOptionDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.CustomsOptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "CustomsOptionType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.CustomsOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DangerousGoodsAccessibilityType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.DangerousGoodsAccessibilityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DangerousGoodsContainer");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.DangerousGoodsContainer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DangerousGoodsDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.DangerousGoodsDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DangerousGoodsPackingOptionType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.DangerousGoodsPackingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DangerousGoodsShippersDeclarationDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.DangerousGoodsShippersDeclarationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DangerousGoodsSignatory");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.DangerousGoodsSignatory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DateRange");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.DateRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DayOfWeekType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.DayOfWeekType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DelayDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.DelayDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DelayLevelType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.DelayLevelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DelayPointType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.DelayPointType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DeliveryOnInvoiceAcceptanceDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.DeliveryOnInvoiceAcceptanceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DestinationControlDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.DestinationControlDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DestinationControlStatementType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.DestinationControlStatementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Dimensions");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.Dimensions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Distance");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.Distance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DistanceUnits");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.DistanceUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DocTabContent");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.DocTabContent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DocTabContentBarcoded");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.DocTabContentBarcoded.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DocTabContentType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.DocTabContentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DocTabContentZone001");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.DocTabContentZone001.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DocTabZoneJustificationType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.DocTabZoneJustificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DocTabZoneSpecification");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.DocTabZoneSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DocumentFormatOptionsRequested");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.DocumentFormatOptionsRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DocumentFormatOptionType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.DocumentFormatOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "DropoffType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.DropoffType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "EdtCommodityTax");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.EdtCommodityTax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "EdtExciseCondition");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.EdtExciseCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "EdtRequestType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.EdtRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "EdtTaxDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.EdtTaxDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "EdtTaxType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.EdtTaxType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "EMailDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.EMailDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "EMailNotificationRecipientType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.EMailNotificationRecipientType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "EtdAttributeType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.EtdAttributeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "EtdDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.EtdDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ExportDeclarationDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ExportDeclarationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ExportDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ExportDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ExpressFreightDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ExpressFreightDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ExpressFreightDetailContact");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ExpressFreightDetailContact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ExpressRegionCode");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ExpressRegionCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }
    private void addBindings1() {
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "FedExLocationType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.FedExLocationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "FlatbedTrailerDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.FlatbedTrailerDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "FlatbedTrailerOption");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.FlatbedTrailerOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "FreightAddressLabelDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.FreightAddressLabelDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "FreightBaseCharge");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.FreightBaseCharge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "FreightBaseChargeCalculationType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.FreightBaseChargeCalculationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "FreightChargeBasisType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.FreightChargeBasisType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "FreightClassType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.FreightClassType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "FreightCollectTermsType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.FreightCollectTermsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "FreightCommitDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.FreightCommitDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "FreightGuaranteeDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.FreightGuaranteeDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "FreightGuaranteeType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.FreightGuaranteeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "FreightOnValueType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.FreightOnValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "FreightRateDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.FreightRateDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "FreightRateNotation");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.FreightRateNotation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "FreightRateQuoteType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.FreightRateQuoteType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "FreightServiceCenterDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.FreightServiceCenterDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "FreightServiceSchedulingType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.FreightServiceSchedulingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "FreightShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.FreightShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "FreightShipmentLineItem");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.FreightShipmentLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "FreightShipmentRoleType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.FreightShipmentRoleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "FreightSpecialServicePayment");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.FreightSpecialServicePayment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "GeneralAgencyAgreementDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.GeneralAgencyAgreementDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "HazardousCommodityContent");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.HazardousCommodityContent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "HazardousCommodityDescription");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.HazardousCommodityDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "HazardousCommodityDescriptionProcessingOptionType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.HazardousCommodityDescriptionProcessingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "HazardousCommodityInnerReceptacleDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.HazardousCommodityInnerReceptacleDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "HazardousCommodityLabelTextOptionType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.HazardousCommodityLabelTextOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "HazardousCommodityOptionDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.HazardousCommodityOptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "HazardousCommodityOptionType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.HazardousCommodityOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "HazardousCommodityPackagingDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.HazardousCommodityPackagingDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "HazardousCommodityPackingDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.HazardousCommodityPackingDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "HazardousCommodityPackingGroupType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.HazardousCommodityPackingGroupType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "HazardousCommodityQuantityDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.HazardousCommodityQuantityDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "HazardousCommodityQuantityType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.HazardousCommodityQuantityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "HazardousCommodityRegulationType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.HazardousCommodityRegulationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "HazardousContainerPackingType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.HazardousContainerPackingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "HoldAtLocationDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.HoldAtLocationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "HomeDeliveryPremiumDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.HomeDeliveryPremiumDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "HomeDeliveryPremiumType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.HomeDeliveryPremiumType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ImageId");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ImageId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "InternationalControlledExportDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.InternationalControlledExportDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "InternationalControlledExportType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.InternationalControlledExportType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "InternationalDocumentContentType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.InternationalDocumentContentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "InternationalTrafficInArmsRegulationsDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.InternationalTrafficInArmsRegulationsDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "LabelFormatType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.LabelFormatType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "LabelMaskableDataType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.LabelMaskableDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "LabelOrderType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.LabelOrderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "LabelPrintingOrientationType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.LabelPrintingOrientationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "LabelRotationType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.LabelRotationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "LabelSpecification");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.LabelSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "LabelStockType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.LabelStockType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "LiabilityCoverageDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.LiabilityCoverageDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "LiabilityCoverageType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.LiabilityCoverageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "LinearMeasure");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.LinearMeasure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "LinearUnits");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.LinearUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Localization");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.Localization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Measure");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.Measure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "MinimumChargeType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.MinimumChargeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Money");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.Money.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "NaftaCertificateOfOriginDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.NaftaCertificateOfOriginDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "NaftaCommodityDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.NaftaCommodityDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "NaftaImporterSpecificationType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.NaftaImporterSpecificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "NaftaNetCostMethodCode");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.NaftaNetCostMethodCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "NaftaPreferenceCriterionCode");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.NaftaPreferenceCriterionCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "NaftaProducer");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.NaftaProducer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "NaftaProducerDeterminationCode");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.NaftaProducerDeterminationCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "NaftaProducerSpecificationType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.NaftaProducerSpecificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "NetExplosiveClassificationType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.NetExplosiveClassificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "NetExplosiveDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.NetExplosiveDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Notification");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.Notification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "NotificationDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.NotificationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "NotificationEventType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.NotificationEventType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "NotificationFormatType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.NotificationFormatType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "NotificationParameter");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.NotificationParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "NotificationSeverityType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.NotificationSeverityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "NotificationType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.NotificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Op900Detail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.Op900Detail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "OversizeClassType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.OversizeClassType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "PackageRateDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.PackageRateDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "PackageSpecialServicesRequested");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.PackageSpecialServicesRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "PageQuadrantType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.PageQuadrantType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Party");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.Party.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Payment");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.Payment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "PaymentType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.PaymentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Payor");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.Payor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "PendingShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.PendingShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "PendingShipmentProcessingOptionsRequested");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.PendingShipmentProcessingOptionsRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "PendingShipmentProcessingOptionType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.PendingShipmentProcessingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "PendingShipmentType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.PendingShipmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "PhysicalFormType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.PhysicalFormType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "PhysicalPackagingType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.PhysicalPackagingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "PickupDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.PickupDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "PickupRequestSourceType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.PickupRequestSourceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "PickupRequestType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.PickupRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "PricingCodeType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.PricingCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "PriorityAlertDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.PriorityAlertDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "PriorityAlertEnhancementType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.PriorityAlertEnhancementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ProductName");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ProductName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "PurposeOfShipmentType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.PurposeOfShipmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }
    private void addBindings2() {
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RadioactiveContainerClassType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.RadioactiveContainerClassType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RadioactivityDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.RadioactivityDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RadioactivityUnitOfMeasure");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.RadioactivityUnitOfMeasure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RadionuclideActivity");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.RadionuclideActivity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RadionuclideDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.RadionuclideDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RateDimensionalDivisorType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.RateDimensionalDivisorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RateDiscount");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.RateDiscount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RateDiscountType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.RateDiscountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RatedPackageDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.RatedPackageDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RatedShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.RatedShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RatedWeightMethod");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.RatedWeightMethod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RateElementBasisType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.RateElementBasisType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RateReply");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.RateReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RateReplyDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.RateReplyDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RateRequest");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.RateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RateRequestType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.RateRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RateTypeBasisType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.RateTypeBasisType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Rebate");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.Rebate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RebateType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.RebateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RecipientCustomsId");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.RecipientCustomsId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RecipientCustomsIdType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.RecipientCustomsIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RecommendedDocumentSpecification");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.RecommendedDocumentSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RecommendedDocumentType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.RecommendedDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RegulatoryControlType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.RegulatoryControlType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RegulatoryLabelContentDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.RegulatoryLabelContentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RegulatoryLabelType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.RegulatoryLabelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RelativeVerticalPositionType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.RelativeVerticalPositionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RequestedPackageLineItem");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.RequestedPackageLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RequestedShipment");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.RequestedShipment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RequestedShippingDocumentType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.RequestedShippingDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RequiredShippingDocumentType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.RequiredShippingDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ReturnAssociationDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ReturnAssociationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ReturnedRateType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ReturnedRateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ReturnEMailAllowedSpecialServiceType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ReturnEMailAllowedSpecialServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ReturnEMailDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ReturnEMailDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ReturnInstructionsDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ReturnInstructionsDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ReturnShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ReturnShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ReturnType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ReturnType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Rma");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.Rma.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "RotationType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.RotationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "SecondaryBarcodeType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.SecondaryBarcodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ServiceDescription");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ServiceDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ServiceOptionType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ServiceOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ServiceSubOptionDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ServiceSubOptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShipmentAuthorizationDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ShipmentAuthorizationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShipmentConfigurationData");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ShipmentConfigurationData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShipmentDryIceDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ShipmentDryIceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShipmentDryIceProcessingOptionsRequested");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ShipmentDryIceProcessingOptionsRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShipmentDryIceProcessingOptionType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ShipmentDryIceProcessingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShipmentEventNotificationDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ShipmentEventNotificationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShipmentEventNotificationSpecification");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ShipmentEventNotificationSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShipmentLegRateDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ShipmentLegRateDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShipmentNotificationAggregationType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ShipmentNotificationAggregationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShipmentNotificationFormatSpecification");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ShipmentNotificationFormatSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShipmentNotificationRoleType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ShipmentNotificationRoleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShipmentOnlyFieldsType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ShipmentOnlyFieldsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShipmentRateDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ShipmentRateDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShipmentSpecialServicesRequested");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ShipmentSpecialServicesRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShipmentVariationOptionDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ShipmentVariationOptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShipperConveyanceDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ShipperConveyanceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShippingDocumentDispositionDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ShippingDocumentDispositionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShippingDocumentDispositionType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ShippingDocumentDispositionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShippingDocumentEMailDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ShippingDocumentEMailDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShippingDocumentEMailGroupingType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ShippingDocumentEMailGroupingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShippingDocumentEMailRecipient");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ShippingDocumentEMailRecipient.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShippingDocumentFormat");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ShippingDocumentFormat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShippingDocumentGroupingType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ShippingDocumentGroupingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShippingDocumentImageType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ShippingDocumentImageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShippingDocumentPrintDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ShippingDocumentPrintDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShippingDocumentSpecification");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ShippingDocumentSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "ShippingDocumentStockType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.ShippingDocumentStockType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "SignatureOptionDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.SignatureOptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "SignatureOptionType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.SignatureOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "SmartPostAncillaryEndorsementType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.SmartPostAncillaryEndorsementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "SmartPostIndiciaType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.SmartPostIndiciaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "SmartPostShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.SmartPostShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "SmartPostShipmentProcessingOptionsRequested");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.SmartPostShipmentProcessingOptionsRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "SmartPostShipmentProcessingOptionType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.SmartPostShipmentProcessingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "SpecialRatingAppliedType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.SpecialRatingAppliedType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Surcharge");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.Surcharge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "SurchargeLevelType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.SurchargeLevelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "SurchargeType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.SurchargeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Tax");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.Tax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "TaxesOrMiscellaneousChargeType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.TaxesOrMiscellaneousChargeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "TaxpayerIdentification");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.TaxpayerIdentification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "TaxType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.TaxType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "TinType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.TinType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "TrackingId");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.TrackingId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "TrackingIdType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.TrackingIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "TransactionDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.TransactionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "TransitTimeType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.TransitTimeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "UploadDocumentIdProducer");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.UploadDocumentIdProducer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "UploadDocumentProducerType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.UploadDocumentProducerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "UploadDocumentReferenceDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.UploadDocumentReferenceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "UploadDocumentType");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.UploadDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "VariableHandlingChargeDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.VariableHandlingChargeDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "VariableHandlingCharges");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.VariableHandlingCharges.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "VersionId");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.VersionId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Volume");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.Volume.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "VolumeUnits");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.VolumeUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }
    private void addBindings3() {
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "WebAuthenticationCredential");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.WebAuthenticationCredential.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "WebAuthenticationDetail");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.WebAuthenticationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "Weight");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.Weight.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v26", "WeightUnits");
            cachedSerQNames.add(qName);
            cls = com.example.demo.fedex.rate.stub.WeightUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                String key = (String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        Class cls = (Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            Class sf = (Class)
                                 cachedSerFactories.get(i);
                            Class df = (Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.example.demo.fedex.rate.stub.RateReply getRates(com.example.demo.fedex.rate.stub.RateRequest rateRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/rate/v26/getRates");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getRates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {rateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.example.demo.fedex.rate.stub.RateReply) _resp;
            } catch (Exception _exception) {
                return (com.example.demo.fedex.rate.stub.RateReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.example.demo.fedex.rate.stub.RateReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
