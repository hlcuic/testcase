package com.moneygram.www.AgentConnect1305;

public class AgentConnectProxy implements com.moneygram.www.AgentConnect1305.AgentConnect {
  private String _endpoint = null;
  private com.moneygram.www.AgentConnect1305.AgentConnect agentConnect = null;
  
  public AgentConnectProxy() {
    _initAgentConnectProxy();
  }
  
  public AgentConnectProxy(String endpoint) {
    _endpoint = endpoint;
    _initAgentConnectProxy();
  }
  
  private void _initAgentConnectProxy() {
    try {
      agentConnect = (new com.moneygram.www.AgentConnect1305.AgentConnectServiceLocator()).getAgentConnect();
      if (agentConnect != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)agentConnect)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)agentConnect)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (agentConnect != null)
      ((javax.xml.rpc.Stub)agentConnect)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.moneygram.www.AgentConnect1305.AgentConnect getAgentConnect() {
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect;
  }
  
  public com.moneygram.www.AgentConnect1305.CommitTransactionResponse commitTransaction(com.moneygram.www.AgentConnect1305.CommitTransactionRequest commitTransactionRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.commitTransaction(commitTransactionRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.AmendTransactionResponse amendTransaction(com.moneygram.www.AgentConnect1305.AmendTransactionRequest amendTransactionRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.amendTransaction(amendTransactionRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.MoneyGramConsumerLookupResponse moneyGramConsumerLookup(com.moneygram.www.AgentConnect1305.MoneyGramConsumerLookupRequest moneyGramConsumerLookupRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.moneyGramConsumerLookup(moneyGramConsumerLookupRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.BillPaymentConsumerLookupResponse billPaymentConsumerLookup(com.moneygram.www.AgentConnect1305.BillPaymentConsumerLookupRequest billPaymentConsumerLookupRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.billPaymentConsumerLookup(billPaymentConsumerLookupRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.CheckInResponse checkIn(com.moneygram.www.AgentConnect1305.CheckInRequest checkInRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.checkIn(checkInRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.CityListResponse cityList(com.moneygram.www.AgentConnect1305.CityListRequest cityListRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.cityList(cityListRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.CodeTableResponse codeTable(com.moneygram.www.AgentConnect1305.CodeTableRequest codeTableRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.codeTable(codeTableRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.StateProvinceInfoResponse stateProvinceInfo(com.moneygram.www.AgentConnect1305.StateProvinceInfoRequest stateProvinceInfoRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.stateProvinceInfo(stateProvinceInfoRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.CountryInfoResponse countryInfo(com.moneygram.www.AgentConnect1305.CountryInfoRequest countryInfoRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.countryInfo(countryInfoRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.CurrencyInfoResponse currencyInfo(com.moneygram.www.AgentConnect1305.CurrencyInfoRequest currencyInfoRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.currencyInfo(currencyInfoRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.ConfirmTokenResponse confirmToken(com.moneygram.www.AgentConnect1305.ConfirmTokenRequest confirmTokenRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.confirmToken(confirmTokenRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.DetailLookupResponse detailLookup(com.moneygram.www.AgentConnect1305.DetailLookupRequest detailLookupRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.detailLookup(detailLookupRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.DirectedSendRegistrationFieldsResponse directedSendRegistrationFields(com.moneygram.www.AgentConnect1305.DirectedSendRegistrationFieldsRequest directedSendRegistrationFieldsRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.directedSendRegistrationFields(directedSendRegistrationFieldsRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.DirectoryOfAgentsByAreaCodePrefixResponse directoryOfAgentsByAreaCodePrefix(com.moneygram.www.AgentConnect1305.DirectoryOfAgentsByAreaCodePrefixRequest directoryOfAgentsByAreaCodePrefixRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.directoryOfAgentsByAreaCodePrefix(directoryOfAgentsByAreaCodePrefixRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.DirectoryOfAgentsByCityResponse directoryOfAgentsByCity(com.moneygram.www.AgentConnect1305.DirectoryOfAgentsByCityRequest directoryOfAgentsByCityRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.directoryOfAgentsByCity(directoryOfAgentsByCityRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.DirectoryOfAgentsByZipResponse directoryOfAgentsByZip(com.moneygram.www.AgentConnect1305.DirectoryOfAgentsByZipRequest directoryOfAgentsByZipRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.directoryOfAgentsByZip(directoryOfAgentsByZipRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.BillerSearchResponse billerSearch(com.moneygram.www.AgentConnect1305.BillerSearchRequest billerSearchRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.billerSearch(billerSearchRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.BillPaymentDetailReportResponse billPaymentDetailReport(com.moneygram.www.AgentConnect1305.BillPaymentDetailReportRequest billPaymentDetailReportRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.billPaymentDetailReport(billPaymentDetailReportRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.BillPaymentSummaryReportResponse billPaymentSummaryReport(com.moneygram.www.AgentConnect1305.BillPaymentSummaryReportRequest billPaymentSummaryReportRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.billPaymentSummaryReport(billPaymentSummaryReportRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.BpValidationResponse bpValidation(com.moneygram.www.AgentConnect1305.BpValidationRequest bpValidationRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.bpValidation(bpValidationRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.FeeLookupResponse feeLookup(com.moneygram.www.AgentConnect1305.FeeLookupRequest feeLookupRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.feeLookup(feeLookupRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.DoddFrankStateRegulatorInfoResponse doddFrankStateRegulatorInfo(com.moneygram.www.AgentConnect1305.DoddFrankStateRegulatorInfoRequest doddFrankStateRegulatorInfoRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.doddFrankStateRegulatorInfo(doddFrankStateRegulatorInfoRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.FormFreeBPLookupResponse formFreeBPLookup(com.moneygram.www.AgentConnect1305.FormFreeBPLookupRequest formFreeBPLookupRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.formFreeBPLookup(formFreeBPLookupRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.FormFreeReceiveLookupResponse formFreeReceiveLookup(com.moneygram.www.AgentConnect1305.FormFreeReceiveLookupRequest formFreeReceiveLookupRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.formFreeReceiveLookup(formFreeReceiveLookupRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.FormFreeSendLookupResponse formFreeSendLookup(com.moneygram.www.AgentConnect1305.FormFreeSendLookupRequest formFreeSendLookupRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.formFreeSendLookup(formFreeSendLookupRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.FormFreeTranLookupResponse formFreeTranLookup(com.moneygram.www.AgentConnect1305.FormFreeTranLookupRequest formFreeTranLookupRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.formFreeTranLookup(formFreeTranLookupRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.FormFreeTypeLookupResponse formFreeTypeLookup(com.moneygram.www.AgentConnect1305.FormFreeTypeLookupRequest formFreeTypeLookupRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.formFreeTypeLookup(formFreeTypeLookupRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.GetFieldsForProductResponse getFieldsForProduct(com.moneygram.www.AgentConnect1305.GetFieldsForProductRequest getFieldsForProductRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.getFieldsForProduct(getFieldsForProductRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.GetFieldsForRewardsResponse getFieldsForRewards(com.moneygram.www.AgentConnect1305.GetFieldsForRewardsRequest getFieldsForRewardsRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.getFieldsForRewards(getFieldsForRewardsRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.SaveRewardsResponse saveRewards(com.moneygram.www.AgentConnect1305.SaveRewardsRequest saveRewardsRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.saveRewards(saveRewardsRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.FQDOsForCountryResponse getFQDOsForCountry(com.moneygram.www.AgentConnect1305.FQDOsForCountryRequest FQDOsForCountryRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.getFQDOsForCountry(FQDOsForCountryRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.GetFQDOByCustomerReceiveNumberResponse getFQDOByCustomerReceiveNumber(com.moneygram.www.AgentConnect1305.GetFQDOByCustomerReceiveNumberRequest getFQDOByCustomerReceiveNumberRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.getFQDOByCustomerReceiveNumber(getFQDOByCustomerReceiveNumberRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.IndustryResponse industries(com.moneygram.www.AgentConnect1305.IndustryRequest industryRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.industries(industryRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.InitialSetupResponse initialSetup(com.moneygram.www.AgentConnect1305.InitialSetupRequest initialSetupRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.initialSetup(initialSetupRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.MoneyGramReceiveDetailReportResponse moneyGramReceiveDetailReport(com.moneygram.www.AgentConnect1305.MoneyGramReceiveDetailReportRequest moneyGramReceiveDetailReportRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.moneyGramReceiveDetailReport(moneyGramReceiveDetailReportRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.ReceiveValidationResponse receiveValidation(com.moneygram.www.AgentConnect1305.ReceiveValidationRequest receiveValidationRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.receiveValidation(receiveValidationRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.MoneyGramReceiveSummaryReportResponse moneyGramReceiveSummaryReport(com.moneygram.www.AgentConnect1305.MoneyGramReceiveSummaryReportRequest moneyGramReceiveSummaryReportRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.moneyGramReceiveSummaryReport(moneyGramReceiveSummaryReportRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.SendValidationResponse sendValidation(com.moneygram.www.AgentConnect1305.SendValidationRequest sendValidationRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.sendValidation(sendValidationRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.MoneyGramSendDetailReportResponse moneyGramSendDetailReport(com.moneygram.www.AgentConnect1305.MoneyGramSendDetailReportRequest moneyGramSendDetailReportRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.moneyGramSendDetailReport(moneyGramSendDetailReportRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.MoneyGramSendSummaryReportResponse moneyGramSendSummaryReport(com.moneygram.www.AgentConnect1305.MoneyGramSendSummaryReportRequest moneyGramSendSummaryReportRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.moneyGramSendSummaryReport(moneyGramSendSummaryReportRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.ProfileResponse profile(com.moneygram.www.AgentConnect1305.ProfileRequest profileRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.profile(profileRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.QueryRegistrationByNamesResponse queryRegistrationByNames(com.moneygram.www.AgentConnect1305.QueryRegistrationByNamesRequest queryRegistrationByNamesRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.queryRegistrationByNames(queryRegistrationByNamesRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.ReceiveCountryRequirementsResponse receiveCountryRequirements(com.moneygram.www.AgentConnect1305.ReceiveCountryRequirementsRequest receiveCountryRequirementsRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.receiveCountryRequirements(receiveCountryRequirementsRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.GetRelatedProfilesResponse getRelatedProfiles(com.moneygram.www.AgentConnect1305.GetRelatedProfilesRequest getRelatedProfilesRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.getRelatedProfiles(getRelatedProfilesRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.ReceiveReversalResponse receiveReversal(com.moneygram.www.AgentConnect1305.ReceiveReversalRequest receiveReversalRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.receiveReversal(receiveReversalRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.ReferenceNumberNameResponse referenceNumberName(com.moneygram.www.AgentConnect1305.ReferenceNumberNameRequest referenceNumberNameRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.referenceNumberName(referenceNumberNameRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.ReferenceNumberPhoneResponse referenceNumberPhone(com.moneygram.www.AgentConnect1305.ReferenceNumberPhoneRequest referenceNumberPhoneRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.referenceNumberPhone(referenceNumberPhoneRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.ReferenceNumberResponse referenceNumber(com.moneygram.www.AgentConnect1305.ReferenceNumberRequest referenceNumberRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.referenceNumber(referenceNumberRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.SaveRegistrationResponse saveRegistration(com.moneygram.www.AgentConnect1305.SaveRegistrationRequest saveRegistrationRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.saveRegistration(saveRegistrationRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.SendReversalResponse sendReversal(com.moneygram.www.AgentConnect1305.SendReversalRequest sendReversalRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.sendReversal(sendReversalRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.BillPaymentCancelResponse billPaymentCancel(com.moneygram.www.AgentConnect1305.BillPaymentCancelRequest billPaymentCancelRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.billPaymentCancel(billPaymentCancelRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.TranslationsResponse translations(com.moneygram.www.AgentConnect1305.TranslationsRequest translationsRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.translations(translationsRequest);
  }
  
  public com.moneygram.www.AgentConnect1305.VariableReceiptInfoResponse variableReceiptInfo(com.moneygram.www.AgentConnect1305.VariableReceiptInfoRequest variableReceiptInfoRequest) throws java.rmi.RemoteException, com.moneygram.www.AgentConnect1305.Error{
    if (agentConnect == null)
      _initAgentConnectProxy();
    return agentConnect.variableReceiptInfo(variableReceiptInfoRequest);
  }
  
  
}