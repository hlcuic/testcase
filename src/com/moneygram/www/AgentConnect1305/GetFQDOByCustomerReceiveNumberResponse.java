/**
 * GetFQDOByCustomerReceiveNumberResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.moneygram.www.AgentConnect1305;

public class GetFQDOByCustomerReceiveNumberResponse  extends com.moneygram.www.AgentConnect1305.Response  implements java.io.Serializable {
    private com.moneygram.www.AgentConnect1305.FQDOInfo fqdoInfo;

    private java.lang.String registrationStatusCode;

    public GetFQDOByCustomerReceiveNumberResponse() {
    }

    public GetFQDOByCustomerReceiveNumberResponse(
           boolean doCheckIn,
           java.util.Calendar timeStamp,
           int flags,
           com.moneygram.www.AgentConnect1305.FQDOInfo fqdoInfo,
           java.lang.String registrationStatusCode) {
        super(
            doCheckIn,
            timeStamp,
            flags);
        this.fqdoInfo = fqdoInfo;
        this.registrationStatusCode = registrationStatusCode;
    }


    /**
     * Gets the fqdoInfo value for this GetFQDOByCustomerReceiveNumberResponse.
     * 
     * @return fqdoInfo
     */
    public com.moneygram.www.AgentConnect1305.FQDOInfo getFqdoInfo() {
        return fqdoInfo;
    }


    /**
     * Sets the fqdoInfo value for this GetFQDOByCustomerReceiveNumberResponse.
     * 
     * @param fqdoInfo
     */
    public void setFqdoInfo(com.moneygram.www.AgentConnect1305.FQDOInfo fqdoInfo) {
        this.fqdoInfo = fqdoInfo;
    }


    /**
     * Gets the registrationStatusCode value for this GetFQDOByCustomerReceiveNumberResponse.
     * 
     * @return registrationStatusCode
     */
    public java.lang.String getRegistrationStatusCode() {
        return registrationStatusCode;
    }


    /**
     * Sets the registrationStatusCode value for this GetFQDOByCustomerReceiveNumberResponse.
     * 
     * @param registrationStatusCode
     */
    public void setRegistrationStatusCode(java.lang.String registrationStatusCode) {
        this.registrationStatusCode = registrationStatusCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFQDOByCustomerReceiveNumberResponse)) return false;
        GetFQDOByCustomerReceiveNumberResponse other = (GetFQDOByCustomerReceiveNumberResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.fqdoInfo==null && other.getFqdoInfo()==null) || 
             (this.fqdoInfo!=null &&
              this.fqdoInfo.equals(other.getFqdoInfo()))) &&
            ((this.registrationStatusCode==null && other.getRegistrationStatusCode()==null) || 
             (this.registrationStatusCode!=null &&
              this.registrationStatusCode.equals(other.getRegistrationStatusCode())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getFqdoInfo() != null) {
            _hashCode += getFqdoInfo().hashCode();
        }
        if (getRegistrationStatusCode() != null) {
            _hashCode += getRegistrationStatusCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFQDOByCustomerReceiveNumberResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "GetFQDOByCustomerReceiveNumberResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fqdoInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "fqdoInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "FQDOInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationStatusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "registrationStatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
