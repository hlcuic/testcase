/**
 * AgentConnectBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.moneygram.www.AgentConnect1305;

public class AgentConnectBindingStub extends org.apache.axis.client.Stub implements com.moneygram.www.AgentConnect1305.AgentConnect {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[53];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doddFrankStateRegulatorInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "doddFrankStateRegulatorInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "DoddFrankStateRegulatorInfoRequest"), com.moneygram.www.AgentConnect1305.DoddFrankStateRegulatorInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "DoddFrankStateRegulatorInfoResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.DoddFrankStateRegulatorInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "doddFrankStateRegulatorInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("amendTransaction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "amendTransactionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "AmendTransactionRequest"), com.moneygram.www.AgentConnect1305.AmendTransactionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "AmendTransactionResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.AmendTransactionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "amendTransactionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("moneyGramConsumerLookup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "moneyGramConsumerLookupRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "MoneyGramConsumerLookupRequest"), com.moneygram.www.AgentConnect1305.MoneyGramConsumerLookupRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "MoneyGramConsumerLookupResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.MoneyGramConsumerLookupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "moneyGramConsumerLookupResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("billPaymentConsumerLookup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "billPaymentConsumerLookupRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "BillPaymentConsumerLookupRequest"), com.moneygram.www.AgentConnect1305.BillPaymentConsumerLookupRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "BillPaymentConsumerLookupResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.BillPaymentConsumerLookupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "billPaymentConsumerLookupResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("commitTransaction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "commitTransactionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "CommitTransactionRequest"), com.moneygram.www.AgentConnect1305.CommitTransactionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "CommitTransactionResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.CommitTransactionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "commitTransactionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("checkIn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "checkInRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "CheckInRequest"), com.moneygram.www.AgentConnect1305.CheckInRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "CheckInResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.CheckInResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "checkInResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cityList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "cityListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "CityListRequest"), com.moneygram.www.AgentConnect1305.CityListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "CityListResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.CityListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "cityListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("codeTable");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "codeTableRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "CodeTableRequest"), com.moneygram.www.AgentConnect1305.CodeTableRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "CodeTableResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.CodeTableResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "codeTableResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("stateProvinceInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "stateProvinceInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "StateProvinceInfoRequest"), com.moneygram.www.AgentConnect1305.StateProvinceInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "StateProvinceInfoResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.StateProvinceInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "stateProvinceInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("countryInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "countryInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "CountryInfoRequest"), com.moneygram.www.AgentConnect1305.CountryInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "CountryInfoResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.CountryInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "countryInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("currencyInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "currencyInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "CurrencyInfoRequest"), com.moneygram.www.AgentConnect1305.CurrencyInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "CurrencyInfoResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.CurrencyInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "currencyInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("confirmToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "confirmTokenRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ConfirmTokenRequest"), com.moneygram.www.AgentConnect1305.ConfirmTokenRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ConfirmTokenResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.ConfirmTokenResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "confirmTokenResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("detailLookup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "detailLookupRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "DetailLookupRequest"), com.moneygram.www.AgentConnect1305.DetailLookupRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "DetailLookupResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.DetailLookupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "detailLookupResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("directedSendRegistrationFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "directedSendRegistrationFieldsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "DirectedSendRegistrationFieldsRequest"), com.moneygram.www.AgentConnect1305.DirectedSendRegistrationFieldsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "DirectedSendRegistrationFieldsResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.DirectedSendRegistrationFieldsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "directedSendRegistrationFieldsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("directoryOfAgentsByAreaCodePrefix");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "directoryOfAgentsByAreaCodePrefixRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "DirectoryOfAgentsByAreaCodePrefixRequest"), com.moneygram.www.AgentConnect1305.DirectoryOfAgentsByAreaCodePrefixRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "DirectoryOfAgentsByAreaCodePrefixResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.DirectoryOfAgentsByAreaCodePrefixResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "directoryOfAgentsByAreaCodePrefixResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("directoryOfAgentsByCity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "directoryOfAgentsByCityRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "DirectoryOfAgentsByCityRequest"), com.moneygram.www.AgentConnect1305.DirectoryOfAgentsByCityRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "DirectoryOfAgentsByCityResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.DirectoryOfAgentsByCityResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "directoryOfAgentsByCityResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("directoryOfAgentsByZip");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "directoryOfAgentsByZipRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "DirectoryOfAgentsByZipRequest"), com.moneygram.www.AgentConnect1305.DirectoryOfAgentsByZipRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "DirectoryOfAgentsByZipResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.DirectoryOfAgentsByZipResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "directoryOfAgentsByZipResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("billerSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "billerSearchRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "BillerSearchRequest"), com.moneygram.www.AgentConnect1305.BillerSearchRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "BillerSearchResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.BillerSearchResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "billerSearchResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("billPaymentDetailReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "billPaymentDetailReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "BillPaymentDetailReportRequest"), com.moneygram.www.AgentConnect1305.BillPaymentDetailReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "BillPaymentDetailReportResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.BillPaymentDetailReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "billPaymentDetailReportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("billPaymentSummaryReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "billPaymentSummaryReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "BillPaymentSummaryReportRequest"), com.moneygram.www.AgentConnect1305.BillPaymentSummaryReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "BillPaymentSummaryReportResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.BillPaymentSummaryReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "billPaymentSummaryReportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("bpValidation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "bpValidationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "BpValidationRequest"), com.moneygram.www.AgentConnect1305.BpValidationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "BpValidationResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.BpValidationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "bpValidationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("feeLookup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "feeLookupRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "FeeLookupRequest"), com.moneygram.www.AgentConnect1305.FeeLookupRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "FeeLookupResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.FeeLookupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "feeLookupResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("formFreeBPLookup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "formFreeBPLookupRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "FormFreeBPLookupRequest"), com.moneygram.www.AgentConnect1305.FormFreeBPLookupRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "FormFreeBPLookupResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.FormFreeBPLookupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "formFreeBPLookupResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("formFreeReceiveLookup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "formFreeReceiveLookupRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "FormFreeReceiveLookupRequest"), com.moneygram.www.AgentConnect1305.FormFreeReceiveLookupRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "FormFreeReceiveLookupResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.FormFreeReceiveLookupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "formFreeReceiveLookupResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("formFreeSendLookup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "formFreeSendLookupRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "FormFreeSendLookupRequest"), com.moneygram.www.AgentConnect1305.FormFreeSendLookupRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "FormFreeSendLookupResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.FormFreeSendLookupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "formFreeSendLookupResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("formFreeTranLookup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "formFreeTranLookupRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "FormFreeTranLookupRequest"), com.moneygram.www.AgentConnect1305.FormFreeTranLookupRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "FormFreeTranLookupResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.FormFreeTranLookupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "formFreeTranLookupResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("formFreeTypeLookup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "formFreeTypeLookupRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "FormFreeTypeLookupRequest"), com.moneygram.www.AgentConnect1305.FormFreeTypeLookupRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "FormFreeTypeLookupResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.FormFreeTypeLookupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "formFreeTypeLookupResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFieldsForProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "getFieldsForProductRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "GetFieldsForProductRequest"), com.moneygram.www.AgentConnect1305.GetFieldsForProductRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "GetFieldsForProductResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.GetFieldsForProductResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "getFieldsForProductResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFieldsForRewards");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "getFieldsForRewardsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "GetFieldsForRewardsRequest"), com.moneygram.www.AgentConnect1305.GetFieldsForRewardsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "GetFieldsForRewardsResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.GetFieldsForRewardsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "getFieldsForRewardsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("saveRewards");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "saveRewardsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "SaveRewardsRequest"), com.moneygram.www.AgentConnect1305.SaveRewardsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "SaveRewardsResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.SaveRewardsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "saveRewardsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFQDOsForCountry");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "fQDOsForCountryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "FQDOsForCountryRequest"), com.moneygram.www.AgentConnect1305.FQDOsForCountryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "FQDOsForCountryResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.FQDOsForCountryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "fQDOsForCountryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFQDOByCustomerReceiveNumber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "getFQDOByCustomerReceiveNumberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "GetFQDOByCustomerReceiveNumberRequest"), com.moneygram.www.AgentConnect1305.GetFQDOByCustomerReceiveNumberRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "GetFQDOByCustomerReceiveNumberResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.GetFQDOByCustomerReceiveNumberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "getFQDOByCustomerReceiveNumberResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("initialSetup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "initialSetupRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "InitialSetupRequest"), com.moneygram.www.AgentConnect1305.InitialSetupRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "InitialSetupResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.InitialSetupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "initialSetupResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("receiveValidation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "receiveValidationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ReceiveValidationRequest"), com.moneygram.www.AgentConnect1305.ReceiveValidationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ReceiveValidationResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.ReceiveValidationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "receiveValidationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("moneyGramReceiveDetailReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "moneyGramReceiveDetailReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "MoneyGramReceiveDetailReportRequest"), com.moneygram.www.AgentConnect1305.MoneyGramReceiveDetailReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "MoneyGramReceiveDetailReportResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.MoneyGramReceiveDetailReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "moneyGramReceiveDetailReportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("moneyGramReceiveSummaryReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "moneyGramReceiveSummaryReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "MoneyGramReceiveSummaryReportRequest"), com.moneygram.www.AgentConnect1305.MoneyGramReceiveSummaryReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "MoneyGramReceiveSummaryReportResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.MoneyGramReceiveSummaryReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "moneyGramReceiveSummaryReportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendValidation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "sendValidationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "SendValidationRequest"), com.moneygram.www.AgentConnect1305.SendValidationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "SendValidationResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.SendValidationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "sendValidationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("moneyGramSendDetailReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "moneyGramSendDetailReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "MoneyGramSendDetailReportRequest"), com.moneygram.www.AgentConnect1305.MoneyGramSendDetailReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "MoneyGramSendDetailReportResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.MoneyGramSendDetailReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "moneyGramSendDetailReportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("moneyGramSendSummaryReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "moneyGramSendSummaryReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "MoneyGramSendSummaryReportRequest"), com.moneygram.www.AgentConnect1305.MoneyGramSendSummaryReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "MoneyGramSendSummaryReportResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.MoneyGramSendSummaryReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "moneyGramSendSummaryReportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("profile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "profileRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ProfileRequest"), com.moneygram.www.AgentConnect1305.ProfileRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ProfileResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.ProfileResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "profileResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryRegistrationByNames");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "queryRegistrationByNamesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "QueryRegistrationByNamesRequest"), com.moneygram.www.AgentConnect1305.QueryRegistrationByNamesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "QueryRegistrationByNamesResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.QueryRegistrationByNamesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "queryRegistrationByNamesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("receiveReversal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "receiveReversalRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ReceiveReversalRequest"), com.moneygram.www.AgentConnect1305.ReceiveReversalRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ReceiveReversalResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.ReceiveReversalResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "receiveReversalResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("referenceNumber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "referenceNumberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ReferenceNumberRequest"), com.moneygram.www.AgentConnect1305.ReferenceNumberRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ReferenceNumberResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.ReferenceNumberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "referenceNumberResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("referenceNumberName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "referenceNumberNameRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ReferenceNumberNameRequest"), com.moneygram.www.AgentConnect1305.ReferenceNumberNameRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ReferenceNumberNameResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.ReferenceNumberNameResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "referenceNumberNameResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("referenceNumberPhone");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "referenceNumberPhoneRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ReferenceNumberPhoneRequest"), com.moneygram.www.AgentConnect1305.ReferenceNumberPhoneRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ReferenceNumberPhoneResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.ReferenceNumberPhoneResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "referenceNumberPhoneResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRelatedProfiles");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "getRelatedProfilesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "GetRelatedProfilesRequest"), com.moneygram.www.AgentConnect1305.GetRelatedProfilesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "GetRelatedProfilesResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.GetRelatedProfilesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "getRelatedProfilesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("receiveCountryRequirements");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "receiveCountryRequirementsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ReceiveCountryRequirementsRequest"), com.moneygram.www.AgentConnect1305.ReceiveCountryRequirementsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ReceiveCountryRequirementsResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.ReceiveCountryRequirementsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "receiveCountryRequirementsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("saveRegistration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "saveRegistrationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "SaveRegistrationRequest"), com.moneygram.www.AgentConnect1305.SaveRegistrationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "SaveRegistrationResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.SaveRegistrationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "saveRegistrationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendReversal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "sendReversalRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "SendReversalRequest"), com.moneygram.www.AgentConnect1305.SendReversalRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "SendReversalResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.SendReversalResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "sendReversalResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("billPaymentCancel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "billPaymentCancelRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "BillPaymentCancelRequest"), com.moneygram.www.AgentConnect1305.BillPaymentCancelRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "BillPaymentCancelResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.BillPaymentCancelResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "billPaymentCancelResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("translations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "translationsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "TranslationsRequest"), com.moneygram.www.AgentConnect1305.TranslationsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "TranslationsResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.TranslationsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "translationsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("industries");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "industryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "IndustryRequest"), com.moneygram.www.AgentConnect1305.IndustryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "IndustryResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.IndustryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "industryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("variableReceiptInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "variableReceiptInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "VariableReceiptInfoRequest"), com.moneygram.www.AgentConnect1305.VariableReceiptInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "VariableReceiptInfoResponse"));
        oper.setReturnClass(com.moneygram.www.AgentConnect1305.VariableReceiptInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "variableReceiptInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "error"),
                      "com.moneygram.www.AgentConnect1305.Error",
                      new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error"), 
                      true
                     ));
        _operations[52] = oper;

    }

    public AgentConnectBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public AgentConnectBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public AgentConnectBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", ">BpValidationRequest>fieldValues");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.KeyValuePair[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "KeyValuePair");
            qName2 = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "keyValuePair");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", ">BpValidationRequest>promoCodeValues");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "stringMax20");
            qName2 = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "promoCode");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", ">CommitTransactionRequest>fieldValues");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.KeyValuePair[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "KeyValuePair");
            qName2 = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "keyValuePair");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", ">DoddFrankStateRegulatorInfoRequest>languages");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "LongLanguageCode");
            qName2 = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "longLanguageCode");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", ">DynamicFieldInfo>enumeratedValues");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.EnumeratedValueInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "EnumeratedValueInfo");
            qName2 = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "enumeratedValueInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", ">FeeLookupRequest>promoCodeValues");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "stringMax20");
            qName2 = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "promoCode");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", ">FormFreeReceiveLookupResponse>fieldValues");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.KeyValuePair[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "KeyValuePair");
            qName2 = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "keyValuePair");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", ">FormFreeSendLookupResponse>fieldValues");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.KeyValuePair[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "KeyValuePair");
            qName2 = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "keyValuePair");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", ">ProductFieldInfo>enumeratedValues");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.EnumeratedValueInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "EnumeratedValueInfo");
            qName2 = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "enumeratedValueInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", ">ReceiveValidationRequest>fieldValues");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.KeyValuePair[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "KeyValuePair");
            qName2 = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "keyValuePair");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", ">RegistrationFieldInfo>enumeratedValues");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.EnumeratedValueInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "EnumeratedValueInfo");
            qName2 = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "enumeratedValueInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", ">RewardsFieldInfo>enumeratedValues");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.EnumeratedRewardsValueInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "EnumeratedRewardsValueInfo");
            qName2 = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "enumeratedRewardsValueInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", ">SaveRegistrationRequest>fieldValues");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.KeyValuePair[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "KeyValuePair");
            qName2 = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "keyValuePair");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", ">SendValidationRequest>fieldValues");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.KeyValuePair[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "KeyValuePair");
            qName2 = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "keyValuePair");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", ">SendValidationRequest>promoCodeValues");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "stringMax20");
            qName2 = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "promoCode");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", ">VariableReceiptInfoRequest>languages");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "LongLanguageCode");
            qName2 = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "longLanguageCode");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "accountNickname");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "addressType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "addressTypeXLong");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "AgentAddress");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "addressTypeXLong");
            qName2 = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "agentAddressLine");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "agentCityType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "agentConsumerId");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "agentFrequentCustomerNumber");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "agentID");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "AgentInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.AgentInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "agentName");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "agentNumber");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "AmendTransactionRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.AmendTransactionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "AmendTransactionResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.AmendTransactionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "AmountInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.AmountInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "areaCodePrefixType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "bancomerConfirmationNumber");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "billerAccountNumber");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "billerAddress");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "BillerInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.BillerInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "BillerLookupInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.BillerLookupInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "BillerSearchRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.BillerSearchRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "BillerSearchResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.BillerSearchResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "billPayCancelReasonType");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.BillPayCancelReasonType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "BillPaymentCancelRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.BillPaymentCancelRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "BillPaymentCancelResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.BillPaymentCancelResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "BillPaymentConsumerLookupRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.BillPaymentConsumerLookupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "BillPaymentConsumerLookupResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.BillPaymentConsumerLookupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "BillPaymentDetailInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.BillPaymentDetailInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "BillPaymentDetailReportRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.BillPaymentDetailReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "BillPaymentDetailReportResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.BillPaymentDetailReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "BillPaymentSummaryInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.BillPaymentSummaryInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "BillPaymentSummaryReportRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.BillPaymentSummaryReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "BillPaymentSummaryReportResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.BillPaymentSummaryReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "binNumber");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "BpValidationRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.BpValidationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "BpValidationResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.BpValidationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "cardTypeCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "CheckInRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.CheckInRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "CheckInResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.CheckInResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "checkType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "CityListRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.CityListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "CityListResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.CityListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "cityType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "cityType60");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "cityTypeLong");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "CodeTableRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.CodeTableRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "CodeTableResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.CodeTableResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "CommitTransactionRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.CommitTransactionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "CommitTransactionResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.CommitTransactionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "confirmationNumber");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ConfirmTokenRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.ConfirmTokenRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ConfirmTokenResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.ConfirmTokenResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "consumerId");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "CountryCurrencyInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.CountryCurrencyInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "countryFilterType");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.CountryFilterType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "CountryInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.CountryInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "CountryInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.CountryInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "CountryInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.CountryInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "CountryTranslation");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.CountryTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "countryType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "currencyCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "CurrencyInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.CurrencyInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "CurrencyInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.CurrencyInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "CurrencyInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.CurrencyInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "CurrencyTranslation");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.CurrencyTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "customerReceiveNumber");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "dataTypeCode");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.DataTypeCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "dayOfWeek");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.DayOfWeek.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "dayType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "decimal14");
            cachedSerQNames.add(qName);
            cls = java.math.BigDecimal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "decimal14nonZero");
            cachedSerQNames.add(qName);
            cls = java.math.BigDecimal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "decimal9nonZero");
            cachedSerQNames.add(qName);
            cls = java.math.BigDecimal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "deliveryOption");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "deliveryOptionDisplayName");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "DeliveryOptionInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.DeliveryOptionInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "DeliveryOptionTranslation");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.DeliveryOptionTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "DetailLookupRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.DetailLookupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "DetailLookupResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.DetailLookupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "DirectedSendRegistrationFieldsRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.DirectedSendRegistrationFieldsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "DirectedSendRegistrationFieldsResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.DirectedSendRegistrationFieldsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "directionType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "DirectoryOfAgentsByAreaCodePrefixRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.DirectoryOfAgentsByAreaCodePrefixRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "DirectoryOfAgentsByAreaCodePrefixResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.DirectoryOfAgentsByAreaCodePrefixResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "DirectoryOfAgentsByCityRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.DirectoryOfAgentsByCityRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "DirectoryOfAgentsByCityResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.DirectoryOfAgentsByCityResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "DirectoryOfAgentsByZipRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.DirectoryOfAgentsByZipRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "DirectoryOfAgentsByZipResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.DirectoryOfAgentsByZipResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "DoddFrankStateRegulatorInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.DoddFrankStateRegulatorInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "DoddFrankStateRegulatorInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.DoddFrankStateRegulatorInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "DynamicFieldInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.DynamicFieldInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "emailType");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.Token.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "emailType128");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.Token.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "EnumeratedRewardsValueInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.EnumeratedRewardsValueInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "EnumeratedValueInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.EnumeratedValueInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Error");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.Error.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "EstimatedReceiveAmountInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.EstimatedReceiveAmountInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "FeeInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.FeeInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "FeeLookupRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.FeeLookupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "FeeLookupResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.FeeLookupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "feeType");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.FeeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "fNameType40");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "FormFreeBPLookupRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.FormFreeBPLookupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "FormFreeBPLookupResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.FormFreeBPLookupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "FormFreeReceiveLookupRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.FormFreeReceiveLookupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "FormFreeReceiveLookupResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.FormFreeReceiveLookupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "FormFreeSendLookupRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.FormFreeSendLookupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "FormFreeSendLookupResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.FormFreeSendLookupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "FormFreeTranLookupRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.FormFreeTranLookupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "FormFreeTranLookupResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.FormFreeTranLookupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "FormFreeTransactionInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.FormFreeTransactionInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "FormFreeTypeLookupRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.FormFreeTypeLookupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "FormFreeTypeLookupResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.FormFreeTypeLookupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "FQDOInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.FQDOInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "FQDOsForCountryRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.FQDOsForCountryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "FQDOsForCountryResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.FQDOsForCountryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "FQDOTextTranslation");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.FQDOTextTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "genderType");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.GenderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "GetFieldsForProductRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.GetFieldsForProductRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "GetFieldsForProductResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.GetFieldsForProductResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "GetFieldsForRewardsRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.GetFieldsForRewardsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "GetFieldsForRewardsResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.GetFieldsForRewardsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "GetFQDOByCustomerReceiveNumberRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.GetFQDOByCustomerReceiveNumberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "GetFQDOByCustomerReceiveNumberResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.GetFQDOByCustomerReceiveNumberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "GetRelatedProfilesRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.GetRelatedProfilesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "GetRelatedProfilesResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.GetRelatedProfilesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "industryID");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "IndustryInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.IndustryInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "IndustryRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.IndustryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "IndustryResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.IndustryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "IndustryTranslation");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.IndustryTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "InitialSetupRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.InitialSetupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "InitialSetupResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.InitialSetupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "int1");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "int1NonZero");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "int3");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "int4");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "int5");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "intMaxToReturn");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "KeyValuePair");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.KeyValuePair.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "languageType5");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "legalIdType");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.LegalIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "lNameType40");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "LongLanguageCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "mgiTransactionSessionID");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "mNameType40");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "MoneyGramConsumerLookupRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.MoneyGramConsumerLookupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "MoneyGramConsumerLookupResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.MoneyGramConsumerLookupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "MoneyGramReceiveDetailInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.MoneyGramReceiveDetailInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "MoneyGramReceiveDetailReportRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.MoneyGramReceiveDetailReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "MoneyGramReceiveDetailReportResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.MoneyGramReceiveDetailReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "MoneyGramReceiveSummaryInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.MoneyGramReceiveSummaryInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "MoneyGramReceiveSummaryReportRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.MoneyGramReceiveSummaryReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "MoneyGramReceiveSummaryReportResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.MoneyGramReceiveSummaryReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "MoneyGramSendDetailInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.MoneyGramSendDetailInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "MoneyGramSendDetailReportRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.MoneyGramSendDetailReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "MoneyGramSendDetailReportResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.MoneyGramSendDetailReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "MoneyGramSendSummaryInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.MoneyGramSendSummaryInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "MoneyGramSendSummaryReportRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.MoneyGramSendSummaryReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "MoneyGramSendSummaryReportResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.MoneyGramSendSummaryReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "month");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "monthType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "operatorIdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "otherPayoutType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "partnerName");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "paymentType");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.PaymentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "payoutType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "personalIdNumber");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "personalIdOffice");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "personalIdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "phoneType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "phoneType14");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "phoneType20");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "phoneTypeLong");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "phoneTypeShort");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "photoIdType");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.PhotoIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ProductFieldInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.ProductFieldInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ProductFieldInfoVisibility");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.ProductFieldInfoVisibility.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ProductProfileItem");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.ProductProfileItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "productType");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.ProductType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "productVariant");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.ProductVariant.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ProfileInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.ProfileInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ProfileItem");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.ProfileItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ProfileRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.ProfileRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ProfileResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.ProfileResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "PromotionInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.PromotionInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "QueryRegistrationByNamesRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.QueryRegistrationByNamesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "QueryRegistrationByNamesResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.QueryRegistrationByNamesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ReceiveAmountInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.ReceiveAmountInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "receiveCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ReceiveCountryRequirementsInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.ReceiveCountryRequirementsInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ReceiveCountryRequirementsRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.ReceiveCountryRequirementsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ReceiveCountryRequirementsResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.ReceiveCountryRequirementsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "receiveReversalReasonCode");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.ReceiveReversalReasonCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ReceiveReversalRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.ReceiveReversalRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ReceiveReversalResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.ReceiveReversalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ReceiverInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.ReceiverInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ReceiverLookupInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.ReceiverLookupInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ReceiveValidationRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.ReceiveValidationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ReceiveValidationResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.ReceiveValidationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "RedirectInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.RedirectInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "RedirectInfoRedirectType");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.RedirectInfoRedirectType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "referenceNumber");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ReferenceNumberInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.ReferenceNumberInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ReferenceNumberNameRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.ReferenceNumberNameRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ReferenceNumberNameResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.ReferenceNumberNameResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ReferenceNumberPhoneRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.ReferenceNumberPhoneRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ReferenceNumberPhoneResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.ReferenceNumberPhoneResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ReferenceNumberRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.ReferenceNumberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ReferenceNumberResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.ReferenceNumberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "RegistrationFieldInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.RegistrationFieldInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Request");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "Response");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "RewardsCardTypeInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.RewardsCardTypeInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "RewardsFieldInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.RewardsFieldInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "RewardsFieldInfoDisplay");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.RewardsFieldInfoDisplay.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "RewardsInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.RewardsInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "RewardsRegistrationInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.RewardsRegistrationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "rewardsRequestType");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.RewardsRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "SaveRegistrationRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.SaveRegistrationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "SaveRegistrationResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.SaveRegistrationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "SaveRewardsRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.SaveRewardsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "SaveRewardsResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.SaveRewardsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "searchType");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.SearchType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "SendAmountInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.SendAmountInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "SenderLookupInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.SenderLookupInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "sendReversalReasonCode");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.SendReversalReasonCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "SendReversalRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.SendReversalRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "SendReversalResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.SendReversalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "sendReversalType");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.SendReversalType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "SendValidationRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.SendValidationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "SendValidationResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.SendValidationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "stateProvinceFilterType");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.StateProvinceFilterType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "StateProvinceInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.StateProvinceInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "StateProvinceInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.StateProvinceInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "StateProvinceInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.StateProvinceInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "stateRegulatorInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.StateRegulatorInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "stateRegulatorVersion");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "stateType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "stateType40");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "stateTypeLong");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "StoreHourInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.StoreHourInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "string4");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "stringMax10");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "stringMax100");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "stringMax12");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "stringMax14");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "stringMax150");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "stringMax2");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "stringMax20");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "stringMax200");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "stringMax2000");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "stringMax21");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "stringMax24");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "stringMax255");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "stringMax3");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "stringMax30");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "stringMax33");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "stringMax4");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "stringMax40");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "stringMax400");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "stringMax5");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "stringMax50");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "stringMax6");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "stringMax60");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "stringMax64");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "stringMax7");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "stringMax8");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "stringMax80");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "TextTranslation");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.TextTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "thirdPartyType");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.ThirdPartyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "timeZoneCorrection");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.TimeZoneCorrection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "titleType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "token");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "transactionStatus");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.TransactionStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "TranslationsRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.TranslationsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "TranslationsResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.TranslationsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "translationText");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "VariableReceiptInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.VariableReceiptInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "VariableReceiptInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.VariableReceiptInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "VariableReceiptTextInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.VariableReceiptTextInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "VersionInfo");
            cachedSerQNames.add(qName);
            cls = com.moneygram.www.AgentConnect1305.VersionInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "year");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "yearType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "zipType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

    }
    private void addBindings3() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "zipType14");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

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
                java.lang.String key = (java.lang.String) keys.nextElement();
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
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
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
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.moneygram.www.AgentConnect1305.DoddFrankStateRegulatorInfoResponse doddFrankStateRegulatorInfo(com.moneygram.www.AgentConnect1305.DoddFrankStateRegulatorInfoRequest doddFrankStateRegulatorInfoRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#doddFrankStateRegulatorInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doddFrankStateRegulatorInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {doddFrankStateRegulatorInfoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.DoddFrankStateRegulatorInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.DoddFrankStateRegulatorInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.DoddFrankStateRegulatorInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.AmendTransactionResponse amendTransaction(com.moneygram.www.AgentConnect1305.AmendTransactionRequest amendTransactionRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#amendTransaction");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "amendTransaction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {amendTransactionRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.AmendTransactionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.AmendTransactionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.AmendTransactionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.MoneyGramConsumerLookupResponse moneyGramConsumerLookup(com.moneygram.www.AgentConnect1305.MoneyGramConsumerLookupRequest moneyGramConsumerLookupRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#moneyGramConsumerLookup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "moneyGramConsumerLookup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {moneyGramConsumerLookupRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.MoneyGramConsumerLookupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.MoneyGramConsumerLookupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.MoneyGramConsumerLookupResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.BillPaymentConsumerLookupResponse billPaymentConsumerLookup(com.moneygram.www.AgentConnect1305.BillPaymentConsumerLookupRequest billPaymentConsumerLookupRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#billPaymentConsumerLookup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "billPaymentConsumerLookup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {billPaymentConsumerLookupRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.BillPaymentConsumerLookupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.BillPaymentConsumerLookupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.BillPaymentConsumerLookupResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.CommitTransactionResponse commitTransaction(com.moneygram.www.AgentConnect1305.CommitTransactionRequest commitTransactionRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#commitTransaction");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "commitTransaction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {commitTransactionRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.CommitTransactionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.CommitTransactionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.CommitTransactionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.CheckInResponse checkIn(com.moneygram.www.AgentConnect1305.CheckInRequest checkInRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#checkIn");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "checkIn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {checkInRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.CheckInResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.CheckInResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.CheckInResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.CityListResponse cityList(com.moneygram.www.AgentConnect1305.CityListRequest cityListRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#cityList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cityList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cityListRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.CityListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.CityListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.CityListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.CodeTableResponse codeTable(com.moneygram.www.AgentConnect1305.CodeTableRequest codeTableRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#codeTable");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "codeTable"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {codeTableRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.CodeTableResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.CodeTableResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.CodeTableResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.StateProvinceInfoResponse stateProvinceInfo(com.moneygram.www.AgentConnect1305.StateProvinceInfoRequest stateProvinceInfoRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#stateProvinceInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "stateProvinceInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {stateProvinceInfoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.StateProvinceInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.StateProvinceInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.StateProvinceInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.CountryInfoResponse countryInfo(com.moneygram.www.AgentConnect1305.CountryInfoRequest countryInfoRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#countryInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "countryInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {countryInfoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.CountryInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.CountryInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.CountryInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.CurrencyInfoResponse currencyInfo(com.moneygram.www.AgentConnect1305.CurrencyInfoRequest currencyInfoRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#currencyInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "currencyInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {currencyInfoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.CurrencyInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.CurrencyInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.CurrencyInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.ConfirmTokenResponse confirmToken(com.moneygram.www.AgentConnect1305.ConfirmTokenRequest confirmTokenRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#confirmToken");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "confirmToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {confirmTokenRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.ConfirmTokenResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.ConfirmTokenResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.ConfirmTokenResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.DetailLookupResponse detailLookup(com.moneygram.www.AgentConnect1305.DetailLookupRequest detailLookupRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#detailLookup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "detailLookup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {detailLookupRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.DetailLookupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.DetailLookupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.DetailLookupResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.DirectedSendRegistrationFieldsResponse directedSendRegistrationFields(com.moneygram.www.AgentConnect1305.DirectedSendRegistrationFieldsRequest directedSendRegistrationFieldsRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#directedSendRegistrationFields");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "directedSendRegistrationFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {directedSendRegistrationFieldsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.DirectedSendRegistrationFieldsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.DirectedSendRegistrationFieldsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.DirectedSendRegistrationFieldsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.DirectoryOfAgentsByAreaCodePrefixResponse directoryOfAgentsByAreaCodePrefix(com.moneygram.www.AgentConnect1305.DirectoryOfAgentsByAreaCodePrefixRequest directoryOfAgentsByAreaCodePrefixRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#directoryOfAgentsByAreaCodePrefix");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "directoryOfAgentsByAreaCodePrefix"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {directoryOfAgentsByAreaCodePrefixRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.DirectoryOfAgentsByAreaCodePrefixResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.DirectoryOfAgentsByAreaCodePrefixResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.DirectoryOfAgentsByAreaCodePrefixResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.DirectoryOfAgentsByCityResponse directoryOfAgentsByCity(com.moneygram.www.AgentConnect1305.DirectoryOfAgentsByCityRequest directoryOfAgentsByCityRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#directoryOfAgentsByCity");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "directoryOfAgentsByCity"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {directoryOfAgentsByCityRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.DirectoryOfAgentsByCityResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.DirectoryOfAgentsByCityResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.DirectoryOfAgentsByCityResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.DirectoryOfAgentsByZipResponse directoryOfAgentsByZip(com.moneygram.www.AgentConnect1305.DirectoryOfAgentsByZipRequest directoryOfAgentsByZipRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#directoryOfAgentsByZip");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "directoryOfAgentsByZip"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {directoryOfAgentsByZipRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.DirectoryOfAgentsByZipResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.DirectoryOfAgentsByZipResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.DirectoryOfAgentsByZipResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.BillerSearchResponse billerSearch(com.moneygram.www.AgentConnect1305.BillerSearchRequest billerSearchRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#billerSearch");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "billerSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {billerSearchRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.BillerSearchResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.BillerSearchResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.BillerSearchResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.BillPaymentDetailReportResponse billPaymentDetailReport(com.moneygram.www.AgentConnect1305.BillPaymentDetailReportRequest billPaymentDetailReportRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#billPaymentDetailReport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "billPaymentDetailReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {billPaymentDetailReportRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.BillPaymentDetailReportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.BillPaymentDetailReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.BillPaymentDetailReportResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.BillPaymentSummaryReportResponse billPaymentSummaryReport(com.moneygram.www.AgentConnect1305.BillPaymentSummaryReportRequest billPaymentSummaryReportRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#billPaymentSummaryReport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "billPaymentSummaryReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {billPaymentSummaryReportRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.BillPaymentSummaryReportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.BillPaymentSummaryReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.BillPaymentSummaryReportResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.BpValidationResponse bpValidation(com.moneygram.www.AgentConnect1305.BpValidationRequest bpValidationRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#bpValidation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "bpValidation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bpValidationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.BpValidationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.BpValidationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.BpValidationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.FeeLookupResponse feeLookup(com.moneygram.www.AgentConnect1305.FeeLookupRequest feeLookupRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#feeLookup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "feeLookup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {feeLookupRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.FeeLookupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.FeeLookupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.FeeLookupResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.FormFreeBPLookupResponse formFreeBPLookup(com.moneygram.www.AgentConnect1305.FormFreeBPLookupRequest formFreeBPLookupRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#formFreeBPLookup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "formFreeBPLookup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {formFreeBPLookupRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.FormFreeBPLookupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.FormFreeBPLookupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.FormFreeBPLookupResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.FormFreeReceiveLookupResponse formFreeReceiveLookup(com.moneygram.www.AgentConnect1305.FormFreeReceiveLookupRequest formFreeReceiveLookupRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#formFreeReceiveLookup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "formFreeReceiveLookup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {formFreeReceiveLookupRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.FormFreeReceiveLookupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.FormFreeReceiveLookupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.FormFreeReceiveLookupResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.FormFreeSendLookupResponse formFreeSendLookup(com.moneygram.www.AgentConnect1305.FormFreeSendLookupRequest formFreeSendLookupRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#formFreeSendLookup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "formFreeSendLookup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {formFreeSendLookupRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.FormFreeSendLookupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.FormFreeSendLookupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.FormFreeSendLookupResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.FormFreeTranLookupResponse formFreeTranLookup(com.moneygram.www.AgentConnect1305.FormFreeTranLookupRequest formFreeTranLookupRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#formFreeTranLookup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "formFreeTranLookup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {formFreeTranLookupRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.FormFreeTranLookupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.FormFreeTranLookupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.FormFreeTranLookupResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.FormFreeTypeLookupResponse formFreeTypeLookup(com.moneygram.www.AgentConnect1305.FormFreeTypeLookupRequest formFreeTypeLookupRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#formFreeTypeLookup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "formFreeTypeLookup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {formFreeTypeLookupRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.FormFreeTypeLookupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.FormFreeTypeLookupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.FormFreeTypeLookupResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.GetFieldsForProductResponse getFieldsForProduct(com.moneygram.www.AgentConnect1305.GetFieldsForProductRequest getFieldsForProductRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#getFieldsForProduct");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getFieldsForProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getFieldsForProductRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.GetFieldsForProductResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.GetFieldsForProductResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.GetFieldsForProductResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.GetFieldsForRewardsResponse getFieldsForRewards(com.moneygram.www.AgentConnect1305.GetFieldsForRewardsRequest getFieldsForRewardsRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#getFieldsForRewards");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getFieldsForRewards"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getFieldsForRewardsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.GetFieldsForRewardsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.GetFieldsForRewardsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.GetFieldsForRewardsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.SaveRewardsResponse saveRewards(com.moneygram.www.AgentConnect1305.SaveRewardsRequest saveRewardsRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#saveRewards");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "saveRewards"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {saveRewardsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.SaveRewardsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.SaveRewardsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.SaveRewardsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.FQDOsForCountryResponse getFQDOsForCountry(com.moneygram.www.AgentConnect1305.FQDOsForCountryRequest FQDOsForCountryRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#getFQDOsForCountry");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getFQDOsForCountry"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {FQDOsForCountryRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.FQDOsForCountryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.FQDOsForCountryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.FQDOsForCountryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.GetFQDOByCustomerReceiveNumberResponse getFQDOByCustomerReceiveNumber(com.moneygram.www.AgentConnect1305.GetFQDOByCustomerReceiveNumberRequest getFQDOByCustomerReceiveNumberRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#getFQDOByCustomerReceiveNumber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getFQDOByCustomerReceiveNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getFQDOByCustomerReceiveNumberRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.GetFQDOByCustomerReceiveNumberResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.GetFQDOByCustomerReceiveNumberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.GetFQDOByCustomerReceiveNumberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.InitialSetupResponse initialSetup(com.moneygram.www.AgentConnect1305.InitialSetupRequest initialSetupRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#initialSetup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "initialSetup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {initialSetupRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.InitialSetupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.InitialSetupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.InitialSetupResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.ReceiveValidationResponse receiveValidation(com.moneygram.www.AgentConnect1305.ReceiveValidationRequest receiveValidationRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#receiveValidation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "receiveValidation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiveValidationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.ReceiveValidationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.ReceiveValidationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.ReceiveValidationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.MoneyGramReceiveDetailReportResponse moneyGramReceiveDetailReport(com.moneygram.www.AgentConnect1305.MoneyGramReceiveDetailReportRequest moneyGramReceiveDetailReportRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#moneyGramReceiveDetailReport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "moneyGramReceiveDetailReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {moneyGramReceiveDetailReportRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.MoneyGramReceiveDetailReportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.MoneyGramReceiveDetailReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.MoneyGramReceiveDetailReportResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.MoneyGramReceiveSummaryReportResponse moneyGramReceiveSummaryReport(com.moneygram.www.AgentConnect1305.MoneyGramReceiveSummaryReportRequest moneyGramReceiveSummaryReportRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#moneyGramReceiveSummaryReport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "moneyGramReceiveSummaryReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {moneyGramReceiveSummaryReportRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.MoneyGramReceiveSummaryReportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.MoneyGramReceiveSummaryReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.MoneyGramReceiveSummaryReportResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.SendValidationResponse sendValidation(com.moneygram.www.AgentConnect1305.SendValidationRequest sendValidationRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#sendValidation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "sendValidation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sendValidationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.SendValidationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.SendValidationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.SendValidationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.MoneyGramSendDetailReportResponse moneyGramSendDetailReport(com.moneygram.www.AgentConnect1305.MoneyGramSendDetailReportRequest moneyGramSendDetailReportRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#moneyGramSendDetailReport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "moneyGramSendDetailReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {moneyGramSendDetailReportRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.MoneyGramSendDetailReportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.MoneyGramSendDetailReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.MoneyGramSendDetailReportResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.MoneyGramSendSummaryReportResponse moneyGramSendSummaryReport(com.moneygram.www.AgentConnect1305.MoneyGramSendSummaryReportRequest moneyGramSendSummaryReportRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#moneyGramSendSummaryReport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "moneyGramSendSummaryReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {moneyGramSendSummaryReportRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.MoneyGramSendSummaryReportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.MoneyGramSendSummaryReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.MoneyGramSendSummaryReportResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.ProfileResponse profile(com.moneygram.www.AgentConnect1305.ProfileRequest profileRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#profile");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "profile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profileRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.ProfileResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.ProfileResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.ProfileResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.QueryRegistrationByNamesResponse queryRegistrationByNames(com.moneygram.www.AgentConnect1305.QueryRegistrationByNamesRequest queryRegistrationByNamesRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#queryRegistrationByNames");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "queryRegistrationByNames"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryRegistrationByNamesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.QueryRegistrationByNamesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.QueryRegistrationByNamesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.QueryRegistrationByNamesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.ReceiveReversalResponse receiveReversal(com.moneygram.www.AgentConnect1305.ReceiveReversalRequest receiveReversalRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#receiveReversal");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "receiveReversal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiveReversalRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.ReceiveReversalResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.ReceiveReversalResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.ReceiveReversalResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.ReferenceNumberResponse referenceNumber(com.moneygram.www.AgentConnect1305.ReferenceNumberRequest referenceNumberRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#referenceNumber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "referenceNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {referenceNumberRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.ReferenceNumberResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.ReferenceNumberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.ReferenceNumberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.ReferenceNumberNameResponse referenceNumberName(com.moneygram.www.AgentConnect1305.ReferenceNumberNameRequest referenceNumberNameRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#referenceNumberName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "referenceNumberName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {referenceNumberNameRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.ReferenceNumberNameResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.ReferenceNumberNameResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.ReferenceNumberNameResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.ReferenceNumberPhoneResponse referenceNumberPhone(com.moneygram.www.AgentConnect1305.ReferenceNumberPhoneRequest referenceNumberPhoneRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#referenceNumberPhone");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "referenceNumberPhone"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {referenceNumberPhoneRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.ReferenceNumberPhoneResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.ReferenceNumberPhoneResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.ReferenceNumberPhoneResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.GetRelatedProfilesResponse getRelatedProfiles(com.moneygram.www.AgentConnect1305.GetRelatedProfilesRequest getRelatedProfilesRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#getRelatedProfiles");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getRelatedProfiles"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getRelatedProfilesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.GetRelatedProfilesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.GetRelatedProfilesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.GetRelatedProfilesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.ReceiveCountryRequirementsResponse receiveCountryRequirements(com.moneygram.www.AgentConnect1305.ReceiveCountryRequirementsRequest receiveCountryRequirementsRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#receiveCountryRequirements");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "receiveCountryRequirements"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiveCountryRequirementsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.ReceiveCountryRequirementsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.ReceiveCountryRequirementsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.ReceiveCountryRequirementsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.SaveRegistrationResponse saveRegistration(com.moneygram.www.AgentConnect1305.SaveRegistrationRequest saveRegistrationRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#saveRegistration");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "saveRegistration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {saveRegistrationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.SaveRegistrationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.SaveRegistrationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.SaveRegistrationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.SendReversalResponse sendReversal(com.moneygram.www.AgentConnect1305.SendReversalRequest sendReversalRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#sendReversal");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "sendReversal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sendReversalRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.SendReversalResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.SendReversalResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.SendReversalResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.BillPaymentCancelResponse billPaymentCancel(com.moneygram.www.AgentConnect1305.BillPaymentCancelRequest billPaymentCancelRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#billPaymentCancel");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "billPaymentCancel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {billPaymentCancelRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.BillPaymentCancelResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.BillPaymentCancelResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.BillPaymentCancelResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.TranslationsResponse translations(com.moneygram.www.AgentConnect1305.TranslationsRequest translationsRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#translations");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "translations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {translationsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.TranslationsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.TranslationsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.TranslationsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.IndustryResponse industries(com.moneygram.www.AgentConnect1305.IndustryRequest industryRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#industries");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "industries"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {industryRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.IndustryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.IndustryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.IndustryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.moneygram.www.AgentConnect1305.VariableReceiptInfoResponse variableReceiptInfo(com.moneygram.www.AgentConnect1305.VariableReceiptInfoRequest variableReceiptInfoRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AgentConnect1305#variableReceiptInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "variableReceiptInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {variableReceiptInfoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.moneygram.www.AgentConnect1305.VariableReceiptInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.moneygram.www.AgentConnect1305.VariableReceiptInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.moneygram.www.AgentConnect1305.VariableReceiptInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.moneygram.www.AgentConnect1305.Error) {
              throw (com.moneygram.www.AgentConnect1305.Error) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
