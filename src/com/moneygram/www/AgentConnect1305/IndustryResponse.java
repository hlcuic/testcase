/**
 * IndustryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.moneygram.www.AgentConnect1305;

public class IndustryResponse  extends com.moneygram.www.AgentConnect1305.Response  implements java.io.Serializable {
    private com.moneygram.www.AgentConnect1305.IndustryInfo[] industryInfoList;

    public IndustryResponse() {
    }

    public IndustryResponse(
           boolean doCheckIn,
           java.util.Calendar timeStamp,
           int flags,
           com.moneygram.www.AgentConnect1305.IndustryInfo[] industryInfoList) {
        super(
            doCheckIn,
            timeStamp,
            flags);
        this.industryInfoList = industryInfoList;
    }


    /**
     * Gets the industryInfoList value for this IndustryResponse.
     * 
     * @return industryInfoList
     */
    public com.moneygram.www.AgentConnect1305.IndustryInfo[] getIndustryInfoList() {
        return industryInfoList;
    }


    /**
     * Sets the industryInfoList value for this IndustryResponse.
     * 
     * @param industryInfoList
     */
    public void setIndustryInfoList(com.moneygram.www.AgentConnect1305.IndustryInfo[] industryInfoList) {
        this.industryInfoList = industryInfoList;
    }

    public com.moneygram.www.AgentConnect1305.IndustryInfo getIndustryInfoList(int i) {
        return this.industryInfoList[i];
    }

    public void setIndustryInfoList(int i, com.moneygram.www.AgentConnect1305.IndustryInfo _value) {
        this.industryInfoList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IndustryResponse)) return false;
        IndustryResponse other = (IndustryResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.industryInfoList==null && other.getIndustryInfoList()==null) || 
             (this.industryInfoList!=null &&
              java.util.Arrays.equals(this.industryInfoList, other.getIndustryInfoList())));
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
        if (getIndustryInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIndustryInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIndustryInfoList(), i);
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
        new org.apache.axis.description.TypeDesc(IndustryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "IndustryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industryInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "industryInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "IndustryInfo"));
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
