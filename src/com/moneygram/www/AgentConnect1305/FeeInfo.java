/**
 * FeeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.moneygram.www.AgentConnect1305;

public class FeeInfo  implements java.io.Serializable {
    private java.math.BigDecimal validReceiveAmount;

    private java.lang.String validReceiveCurrency;

    private java.math.BigDecimal validExchangeRate;

    private java.math.BigDecimal estimatedReceiveAmount;

    private java.lang.String estimatedReceiveCurrency;

    private java.math.BigDecimal estimatedExchangeRate;

    private java.math.BigDecimal totalAmount;

    private java.lang.String receiveCountry;

    private java.lang.String deliveryOption;

    private java.lang.Boolean receiveAmountAltered;

    private java.lang.String speedOfDeliveryText;

    private java.math.BigDecimal saLimitAvailable;

    private java.lang.Boolean revisedInformationalFee;

    private java.lang.String deliveryOptId;

    private java.lang.String deliveryOptDisplayName;

    private java.lang.String regAuthText;

    private java.lang.String receiveAgentID;

    private java.lang.String receiveAgentName;

    private java.lang.String receiveAgentAbbreviation;

    private java.lang.String mgManaged;

    private java.lang.String disclosureText;

    private java.lang.String mgiTransactionSessionID;

    private boolean sendAmountAltered;

    private java.lang.String additionalInfoText;

    private com.moneygram.www.AgentConnect1305.PromotionInfo[] promotionInfo;

    private com.moneygram.www.AgentConnect1305.SendAmountInfo sendAmounts;

    private com.moneygram.www.AgentConnect1305.EstimatedReceiveAmountInfo receiveAmounts;

    public FeeInfo() {
    }

    public FeeInfo(
           java.math.BigDecimal validReceiveAmount,
           java.lang.String validReceiveCurrency,
           java.math.BigDecimal validExchangeRate,
           java.math.BigDecimal estimatedReceiveAmount,
           java.lang.String estimatedReceiveCurrency,
           java.math.BigDecimal estimatedExchangeRate,
           java.math.BigDecimal totalAmount,
           java.lang.String receiveCountry,
           java.lang.String deliveryOption,
           java.lang.Boolean receiveAmountAltered,
           java.lang.String speedOfDeliveryText,
           java.math.BigDecimal saLimitAvailable,
           java.lang.Boolean revisedInformationalFee,
           java.lang.String deliveryOptId,
           java.lang.String deliveryOptDisplayName,
           java.lang.String regAuthText,
           java.lang.String receiveAgentID,
           java.lang.String receiveAgentName,
           java.lang.String receiveAgentAbbreviation,
           java.lang.String mgManaged,
           java.lang.String disclosureText,
           java.lang.String mgiTransactionSessionID,
           boolean sendAmountAltered,
           java.lang.String additionalInfoText,
           com.moneygram.www.AgentConnect1305.PromotionInfo[] promotionInfo,
           com.moneygram.www.AgentConnect1305.SendAmountInfo sendAmounts,
           com.moneygram.www.AgentConnect1305.EstimatedReceiveAmountInfo receiveAmounts) {
           this.validReceiveAmount = validReceiveAmount;
           this.validReceiveCurrency = validReceiveCurrency;
           this.validExchangeRate = validExchangeRate;
           this.estimatedReceiveAmount = estimatedReceiveAmount;
           this.estimatedReceiveCurrency = estimatedReceiveCurrency;
           this.estimatedExchangeRate = estimatedExchangeRate;
           this.totalAmount = totalAmount;
           this.receiveCountry = receiveCountry;
           this.deliveryOption = deliveryOption;
           this.receiveAmountAltered = receiveAmountAltered;
           this.speedOfDeliveryText = speedOfDeliveryText;
           this.saLimitAvailable = saLimitAvailable;
           this.revisedInformationalFee = revisedInformationalFee;
           this.deliveryOptId = deliveryOptId;
           this.deliveryOptDisplayName = deliveryOptDisplayName;
           this.regAuthText = regAuthText;
           this.receiveAgentID = receiveAgentID;
           this.receiveAgentName = receiveAgentName;
           this.receiveAgentAbbreviation = receiveAgentAbbreviation;
           this.mgManaged = mgManaged;
           this.disclosureText = disclosureText;
           this.mgiTransactionSessionID = mgiTransactionSessionID;
           this.sendAmountAltered = sendAmountAltered;
           this.additionalInfoText = additionalInfoText;
           this.promotionInfo = promotionInfo;
           this.sendAmounts = sendAmounts;
           this.receiveAmounts = receiveAmounts;
    }


    /**
     * Gets the validReceiveAmount value for this FeeInfo.
     * 
     * @return validReceiveAmount
     */
    public java.math.BigDecimal getValidReceiveAmount() {
        return validReceiveAmount;
    }


    /**
     * Sets the validReceiveAmount value for this FeeInfo.
     * 
     * @param validReceiveAmount
     */
    public void setValidReceiveAmount(java.math.BigDecimal validReceiveAmount) {
        this.validReceiveAmount = validReceiveAmount;
    }


    /**
     * Gets the validReceiveCurrency value for this FeeInfo.
     * 
     * @return validReceiveCurrency
     */
    public java.lang.String getValidReceiveCurrency() {
        return validReceiveCurrency;
    }


    /**
     * Sets the validReceiveCurrency value for this FeeInfo.
     * 
     * @param validReceiveCurrency
     */
    public void setValidReceiveCurrency(java.lang.String validReceiveCurrency) {
        this.validReceiveCurrency = validReceiveCurrency;
    }


    /**
     * Gets the validExchangeRate value for this FeeInfo.
     * 
     * @return validExchangeRate
     */
    public java.math.BigDecimal getValidExchangeRate() {
        return validExchangeRate;
    }


    /**
     * Sets the validExchangeRate value for this FeeInfo.
     * 
     * @param validExchangeRate
     */
    public void setValidExchangeRate(java.math.BigDecimal validExchangeRate) {
        this.validExchangeRate = validExchangeRate;
    }


    /**
     * Gets the estimatedReceiveAmount value for this FeeInfo.
     * 
     * @return estimatedReceiveAmount
     */
    public java.math.BigDecimal getEstimatedReceiveAmount() {
        return estimatedReceiveAmount;
    }


    /**
     * Sets the estimatedReceiveAmount value for this FeeInfo.
     * 
     * @param estimatedReceiveAmount
     */
    public void setEstimatedReceiveAmount(java.math.BigDecimal estimatedReceiveAmount) {
        this.estimatedReceiveAmount = estimatedReceiveAmount;
    }


    /**
     * Gets the estimatedReceiveCurrency value for this FeeInfo.
     * 
     * @return estimatedReceiveCurrency
     */
    public java.lang.String getEstimatedReceiveCurrency() {
        return estimatedReceiveCurrency;
    }


    /**
     * Sets the estimatedReceiveCurrency value for this FeeInfo.
     * 
     * @param estimatedReceiveCurrency
     */
    public void setEstimatedReceiveCurrency(java.lang.String estimatedReceiveCurrency) {
        this.estimatedReceiveCurrency = estimatedReceiveCurrency;
    }


    /**
     * Gets the estimatedExchangeRate value for this FeeInfo.
     * 
     * @return estimatedExchangeRate
     */
    public java.math.BigDecimal getEstimatedExchangeRate() {
        return estimatedExchangeRate;
    }


    /**
     * Sets the estimatedExchangeRate value for this FeeInfo.
     * 
     * @param estimatedExchangeRate
     */
    public void setEstimatedExchangeRate(java.math.BigDecimal estimatedExchangeRate) {
        this.estimatedExchangeRate = estimatedExchangeRate;
    }


    /**
     * Gets the totalAmount value for this FeeInfo.
     * 
     * @return totalAmount
     */
    public java.math.BigDecimal getTotalAmount() {
        return totalAmount;
    }


    /**
     * Sets the totalAmount value for this FeeInfo.
     * 
     * @param totalAmount
     */
    public void setTotalAmount(java.math.BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }


    /**
     * Gets the receiveCountry value for this FeeInfo.
     * 
     * @return receiveCountry
     */
    public java.lang.String getReceiveCountry() {
        return receiveCountry;
    }


    /**
     * Sets the receiveCountry value for this FeeInfo.
     * 
     * @param receiveCountry
     */
    public void setReceiveCountry(java.lang.String receiveCountry) {
        this.receiveCountry = receiveCountry;
    }


    /**
     * Gets the deliveryOption value for this FeeInfo.
     * 
     * @return deliveryOption
     */
    public java.lang.String getDeliveryOption() {
        return deliveryOption;
    }


    /**
     * Sets the deliveryOption value for this FeeInfo.
     * 
     * @param deliveryOption
     */
    public void setDeliveryOption(java.lang.String deliveryOption) {
        this.deliveryOption = deliveryOption;
    }


    /**
     * Gets the receiveAmountAltered value for this FeeInfo.
     * 
     * @return receiveAmountAltered
     */
    public java.lang.Boolean getReceiveAmountAltered() {
        return receiveAmountAltered;
    }


    /**
     * Sets the receiveAmountAltered value for this FeeInfo.
     * 
     * @param receiveAmountAltered
     */
    public void setReceiveAmountAltered(java.lang.Boolean receiveAmountAltered) {
        this.receiveAmountAltered = receiveAmountAltered;
    }


    /**
     * Gets the speedOfDeliveryText value for this FeeInfo.
     * 
     * @return speedOfDeliveryText
     */
    public java.lang.String getSpeedOfDeliveryText() {
        return speedOfDeliveryText;
    }


    /**
     * Sets the speedOfDeliveryText value for this FeeInfo.
     * 
     * @param speedOfDeliveryText
     */
    public void setSpeedOfDeliveryText(java.lang.String speedOfDeliveryText) {
        this.speedOfDeliveryText = speedOfDeliveryText;
    }


    /**
     * Gets the saLimitAvailable value for this FeeInfo.
     * 
     * @return saLimitAvailable
     */
    public java.math.BigDecimal getSaLimitAvailable() {
        return saLimitAvailable;
    }


    /**
     * Sets the saLimitAvailable value for this FeeInfo.
     * 
     * @param saLimitAvailable
     */
    public void setSaLimitAvailable(java.math.BigDecimal saLimitAvailable) {
        this.saLimitAvailable = saLimitAvailable;
    }


    /**
     * Gets the revisedInformationalFee value for this FeeInfo.
     * 
     * @return revisedInformationalFee
     */
    public java.lang.Boolean getRevisedInformationalFee() {
        return revisedInformationalFee;
    }


    /**
     * Sets the revisedInformationalFee value for this FeeInfo.
     * 
     * @param revisedInformationalFee
     */
    public void setRevisedInformationalFee(java.lang.Boolean revisedInformationalFee) {
        this.revisedInformationalFee = revisedInformationalFee;
    }


    /**
     * Gets the deliveryOptId value for this FeeInfo.
     * 
     * @return deliveryOptId
     */
    public java.lang.String getDeliveryOptId() {
        return deliveryOptId;
    }


    /**
     * Sets the deliveryOptId value for this FeeInfo.
     * 
     * @param deliveryOptId
     */
    public void setDeliveryOptId(java.lang.String deliveryOptId) {
        this.deliveryOptId = deliveryOptId;
    }


    /**
     * Gets the deliveryOptDisplayName value for this FeeInfo.
     * 
     * @return deliveryOptDisplayName
     */
    public java.lang.String getDeliveryOptDisplayName() {
        return deliveryOptDisplayName;
    }


    /**
     * Sets the deliveryOptDisplayName value for this FeeInfo.
     * 
     * @param deliveryOptDisplayName
     */
    public void setDeliveryOptDisplayName(java.lang.String deliveryOptDisplayName) {
        this.deliveryOptDisplayName = deliveryOptDisplayName;
    }


    /**
     * Gets the regAuthText value for this FeeInfo.
     * 
     * @return regAuthText
     */
    public java.lang.String getRegAuthText() {
        return regAuthText;
    }


    /**
     * Sets the regAuthText value for this FeeInfo.
     * 
     * @param regAuthText
     */
    public void setRegAuthText(java.lang.String regAuthText) {
        this.regAuthText = regAuthText;
    }


    /**
     * Gets the receiveAgentID value for this FeeInfo.
     * 
     * @return receiveAgentID
     */
    public java.lang.String getReceiveAgentID() {
        return receiveAgentID;
    }


    /**
     * Sets the receiveAgentID value for this FeeInfo.
     * 
     * @param receiveAgentID
     */
    public void setReceiveAgentID(java.lang.String receiveAgentID) {
        this.receiveAgentID = receiveAgentID;
    }


    /**
     * Gets the receiveAgentName value for this FeeInfo.
     * 
     * @return receiveAgentName
     */
    public java.lang.String getReceiveAgentName() {
        return receiveAgentName;
    }


    /**
     * Sets the receiveAgentName value for this FeeInfo.
     * 
     * @param receiveAgentName
     */
    public void setReceiveAgentName(java.lang.String receiveAgentName) {
        this.receiveAgentName = receiveAgentName;
    }


    /**
     * Gets the receiveAgentAbbreviation value for this FeeInfo.
     * 
     * @return receiveAgentAbbreviation
     */
    public java.lang.String getReceiveAgentAbbreviation() {
        return receiveAgentAbbreviation;
    }


    /**
     * Sets the receiveAgentAbbreviation value for this FeeInfo.
     * 
     * @param receiveAgentAbbreviation
     */
    public void setReceiveAgentAbbreviation(java.lang.String receiveAgentAbbreviation) {
        this.receiveAgentAbbreviation = receiveAgentAbbreviation;
    }


    /**
     * Gets the mgManaged value for this FeeInfo.
     * 
     * @return mgManaged
     */
    public java.lang.String getMgManaged() {
        return mgManaged;
    }


    /**
     * Sets the mgManaged value for this FeeInfo.
     * 
     * @param mgManaged
     */
    public void setMgManaged(java.lang.String mgManaged) {
        this.mgManaged = mgManaged;
    }


    /**
     * Gets the disclosureText value for this FeeInfo.
     * 
     * @return disclosureText
     */
    public java.lang.String getDisclosureText() {
        return disclosureText;
    }


    /**
     * Sets the disclosureText value for this FeeInfo.
     * 
     * @param disclosureText
     */
    public void setDisclosureText(java.lang.String disclosureText) {
        this.disclosureText = disclosureText;
    }


    /**
     * Gets the mgiTransactionSessionID value for this FeeInfo.
     * 
     * @return mgiTransactionSessionID
     */
    public java.lang.String getMgiTransactionSessionID() {
        return mgiTransactionSessionID;
    }


    /**
     * Sets the mgiTransactionSessionID value for this FeeInfo.
     * 
     * @param mgiTransactionSessionID
     */
    public void setMgiTransactionSessionID(java.lang.String mgiTransactionSessionID) {
        this.mgiTransactionSessionID = mgiTransactionSessionID;
    }


    /**
     * Gets the sendAmountAltered value for this FeeInfo.
     * 
     * @return sendAmountAltered
     */
    public boolean isSendAmountAltered() {
        return sendAmountAltered;
    }


    /**
     * Sets the sendAmountAltered value for this FeeInfo.
     * 
     * @param sendAmountAltered
     */
    public void setSendAmountAltered(boolean sendAmountAltered) {
        this.sendAmountAltered = sendAmountAltered;
    }


    /**
     * Gets the additionalInfoText value for this FeeInfo.
     * 
     * @return additionalInfoText
     */
    public java.lang.String getAdditionalInfoText() {
        return additionalInfoText;
    }


    /**
     * Sets the additionalInfoText value for this FeeInfo.
     * 
     * @param additionalInfoText
     */
    public void setAdditionalInfoText(java.lang.String additionalInfoText) {
        this.additionalInfoText = additionalInfoText;
    }


    /**
     * Gets the promotionInfo value for this FeeInfo.
     * 
     * @return promotionInfo
     */
    public com.moneygram.www.AgentConnect1305.PromotionInfo[] getPromotionInfo() {
        return promotionInfo;
    }


    /**
     * Sets the promotionInfo value for this FeeInfo.
     * 
     * @param promotionInfo
     */
    public void setPromotionInfo(com.moneygram.www.AgentConnect1305.PromotionInfo[] promotionInfo) {
        this.promotionInfo = promotionInfo;
    }

    public com.moneygram.www.AgentConnect1305.PromotionInfo getPromotionInfo(int i) {
        return this.promotionInfo[i];
    }

    public void setPromotionInfo(int i, com.moneygram.www.AgentConnect1305.PromotionInfo _value) {
        this.promotionInfo[i] = _value;
    }


    /**
     * Gets the sendAmounts value for this FeeInfo.
     * 
     * @return sendAmounts
     */
    public com.moneygram.www.AgentConnect1305.SendAmountInfo getSendAmounts() {
        return sendAmounts;
    }


    /**
     * Sets the sendAmounts value for this FeeInfo.
     * 
     * @param sendAmounts
     */
    public void setSendAmounts(com.moneygram.www.AgentConnect1305.SendAmountInfo sendAmounts) {
        this.sendAmounts = sendAmounts;
    }


    /**
     * Gets the receiveAmounts value for this FeeInfo.
     * 
     * @return receiveAmounts
     */
    public com.moneygram.www.AgentConnect1305.EstimatedReceiveAmountInfo getReceiveAmounts() {
        return receiveAmounts;
    }


    /**
     * Sets the receiveAmounts value for this FeeInfo.
     * 
     * @param receiveAmounts
     */
    public void setReceiveAmounts(com.moneygram.www.AgentConnect1305.EstimatedReceiveAmountInfo receiveAmounts) {
        this.receiveAmounts = receiveAmounts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeeInfo)) return false;
        FeeInfo other = (FeeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.validReceiveAmount==null && other.getValidReceiveAmount()==null) || 
             (this.validReceiveAmount!=null &&
              this.validReceiveAmount.equals(other.getValidReceiveAmount()))) &&
            ((this.validReceiveCurrency==null && other.getValidReceiveCurrency()==null) || 
             (this.validReceiveCurrency!=null &&
              this.validReceiveCurrency.equals(other.getValidReceiveCurrency()))) &&
            ((this.validExchangeRate==null && other.getValidExchangeRate()==null) || 
             (this.validExchangeRate!=null &&
              this.validExchangeRate.equals(other.getValidExchangeRate()))) &&
            ((this.estimatedReceiveAmount==null && other.getEstimatedReceiveAmount()==null) || 
             (this.estimatedReceiveAmount!=null &&
              this.estimatedReceiveAmount.equals(other.getEstimatedReceiveAmount()))) &&
            ((this.estimatedReceiveCurrency==null && other.getEstimatedReceiveCurrency()==null) || 
             (this.estimatedReceiveCurrency!=null &&
              this.estimatedReceiveCurrency.equals(other.getEstimatedReceiveCurrency()))) &&
            ((this.estimatedExchangeRate==null && other.getEstimatedExchangeRate()==null) || 
             (this.estimatedExchangeRate!=null &&
              this.estimatedExchangeRate.equals(other.getEstimatedExchangeRate()))) &&
            ((this.totalAmount==null && other.getTotalAmount()==null) || 
             (this.totalAmount!=null &&
              this.totalAmount.equals(other.getTotalAmount()))) &&
            ((this.receiveCountry==null && other.getReceiveCountry()==null) || 
             (this.receiveCountry!=null &&
              this.receiveCountry.equals(other.getReceiveCountry()))) &&
            ((this.deliveryOption==null && other.getDeliveryOption()==null) || 
             (this.deliveryOption!=null &&
              this.deliveryOption.equals(other.getDeliveryOption()))) &&
            ((this.receiveAmountAltered==null && other.getReceiveAmountAltered()==null) || 
             (this.receiveAmountAltered!=null &&
              this.receiveAmountAltered.equals(other.getReceiveAmountAltered()))) &&
            ((this.speedOfDeliveryText==null && other.getSpeedOfDeliveryText()==null) || 
             (this.speedOfDeliveryText!=null &&
              this.speedOfDeliveryText.equals(other.getSpeedOfDeliveryText()))) &&
            ((this.saLimitAvailable==null && other.getSaLimitAvailable()==null) || 
             (this.saLimitAvailable!=null &&
              this.saLimitAvailable.equals(other.getSaLimitAvailable()))) &&
            ((this.revisedInformationalFee==null && other.getRevisedInformationalFee()==null) || 
             (this.revisedInformationalFee!=null &&
              this.revisedInformationalFee.equals(other.getRevisedInformationalFee()))) &&
            ((this.deliveryOptId==null && other.getDeliveryOptId()==null) || 
             (this.deliveryOptId!=null &&
              this.deliveryOptId.equals(other.getDeliveryOptId()))) &&
            ((this.deliveryOptDisplayName==null && other.getDeliveryOptDisplayName()==null) || 
             (this.deliveryOptDisplayName!=null &&
              this.deliveryOptDisplayName.equals(other.getDeliveryOptDisplayName()))) &&
            ((this.regAuthText==null && other.getRegAuthText()==null) || 
             (this.regAuthText!=null &&
              this.regAuthText.equals(other.getRegAuthText()))) &&
            ((this.receiveAgentID==null && other.getReceiveAgentID()==null) || 
             (this.receiveAgentID!=null &&
              this.receiveAgentID.equals(other.getReceiveAgentID()))) &&
            ((this.receiveAgentName==null && other.getReceiveAgentName()==null) || 
             (this.receiveAgentName!=null &&
              this.receiveAgentName.equals(other.getReceiveAgentName()))) &&
            ((this.receiveAgentAbbreviation==null && other.getReceiveAgentAbbreviation()==null) || 
             (this.receiveAgentAbbreviation!=null &&
              this.receiveAgentAbbreviation.equals(other.getReceiveAgentAbbreviation()))) &&
            ((this.mgManaged==null && other.getMgManaged()==null) || 
             (this.mgManaged!=null &&
              this.mgManaged.equals(other.getMgManaged()))) &&
            ((this.disclosureText==null && other.getDisclosureText()==null) || 
             (this.disclosureText!=null &&
              this.disclosureText.equals(other.getDisclosureText()))) &&
            ((this.mgiTransactionSessionID==null && other.getMgiTransactionSessionID()==null) || 
             (this.mgiTransactionSessionID!=null &&
              this.mgiTransactionSessionID.equals(other.getMgiTransactionSessionID()))) &&
            this.sendAmountAltered == other.isSendAmountAltered() &&
            ((this.additionalInfoText==null && other.getAdditionalInfoText()==null) || 
             (this.additionalInfoText!=null &&
              this.additionalInfoText.equals(other.getAdditionalInfoText()))) &&
            ((this.promotionInfo==null && other.getPromotionInfo()==null) || 
             (this.promotionInfo!=null &&
              java.util.Arrays.equals(this.promotionInfo, other.getPromotionInfo()))) &&
            ((this.sendAmounts==null && other.getSendAmounts()==null) || 
             (this.sendAmounts!=null &&
              this.sendAmounts.equals(other.getSendAmounts()))) &&
            ((this.receiveAmounts==null && other.getReceiveAmounts()==null) || 
             (this.receiveAmounts!=null &&
              this.receiveAmounts.equals(other.getReceiveAmounts())));
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
        if (getValidReceiveAmount() != null) {
            _hashCode += getValidReceiveAmount().hashCode();
        }
        if (getValidReceiveCurrency() != null) {
            _hashCode += getValidReceiveCurrency().hashCode();
        }
        if (getValidExchangeRate() != null) {
            _hashCode += getValidExchangeRate().hashCode();
        }
        if (getEstimatedReceiveAmount() != null) {
            _hashCode += getEstimatedReceiveAmount().hashCode();
        }
        if (getEstimatedReceiveCurrency() != null) {
            _hashCode += getEstimatedReceiveCurrency().hashCode();
        }
        if (getEstimatedExchangeRate() != null) {
            _hashCode += getEstimatedExchangeRate().hashCode();
        }
        if (getTotalAmount() != null) {
            _hashCode += getTotalAmount().hashCode();
        }
        if (getReceiveCountry() != null) {
            _hashCode += getReceiveCountry().hashCode();
        }
        if (getDeliveryOption() != null) {
            _hashCode += getDeliveryOption().hashCode();
        }
        if (getReceiveAmountAltered() != null) {
            _hashCode += getReceiveAmountAltered().hashCode();
        }
        if (getSpeedOfDeliveryText() != null) {
            _hashCode += getSpeedOfDeliveryText().hashCode();
        }
        if (getSaLimitAvailable() != null) {
            _hashCode += getSaLimitAvailable().hashCode();
        }
        if (getRevisedInformationalFee() != null) {
            _hashCode += getRevisedInformationalFee().hashCode();
        }
        if (getDeliveryOptId() != null) {
            _hashCode += getDeliveryOptId().hashCode();
        }
        if (getDeliveryOptDisplayName() != null) {
            _hashCode += getDeliveryOptDisplayName().hashCode();
        }
        if (getRegAuthText() != null) {
            _hashCode += getRegAuthText().hashCode();
        }
        if (getReceiveAgentID() != null) {
            _hashCode += getReceiveAgentID().hashCode();
        }
        if (getReceiveAgentName() != null) {
            _hashCode += getReceiveAgentName().hashCode();
        }
        if (getReceiveAgentAbbreviation() != null) {
            _hashCode += getReceiveAgentAbbreviation().hashCode();
        }
        if (getMgManaged() != null) {
            _hashCode += getMgManaged().hashCode();
        }
        if (getDisclosureText() != null) {
            _hashCode += getDisclosureText().hashCode();
        }
        if (getMgiTransactionSessionID() != null) {
            _hashCode += getMgiTransactionSessionID().hashCode();
        }
        _hashCode += (isSendAmountAltered() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAdditionalInfoText() != null) {
            _hashCode += getAdditionalInfoText().hashCode();
        }
        if (getPromotionInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPromotionInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPromotionInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSendAmounts() != null) {
            _hashCode += getSendAmounts().hashCode();
        }
        if (getReceiveAmounts() != null) {
            _hashCode += getReceiveAmounts().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "FeeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validReceiveAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "validReceiveAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validReceiveCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "validReceiveCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validExchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "validExchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedReceiveAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "estimatedReceiveAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedReceiveCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "estimatedReceiveCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedExchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "estimatedExchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "totalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "receiveCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryOption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "deliveryOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveAmountAltered");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "receiveAmountAltered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("speedOfDeliveryText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "speedOfDeliveryText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saLimitAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "saLimitAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revisedInformationalFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "revisedInformationalFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryOptId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "deliveryOptId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryOptDisplayName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "deliveryOptDisplayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regAuthText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "regAuthText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveAgentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "receiveAgentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveAgentName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "receiveAgentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveAgentAbbreviation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "receiveAgentAbbreviation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mgManaged");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "mgManaged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disclosureText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "disclosureText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mgiTransactionSessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "mgiTransactionSessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendAmountAltered");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "sendAmountAltered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInfoText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "additionalInfoText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "promotionInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "PromotionInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendAmounts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "sendAmounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "SendAmountInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveAmounts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "receiveAmounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "EstimatedReceiveAmountInfo"));
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
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
