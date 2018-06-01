/**
 * FeeLookupResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.moneygram.www.AgentConnect1305;

public class FeeLookupResponse  extends com.moneygram.www.AgentConnect1305.Response  implements java.io.Serializable {
    private com.moneygram.www.AgentConnect1305.FeeInfo[] feeInfo;

    public FeeLookupResponse() {
    }

    public FeeLookupResponse(
           boolean doCheckIn,
           java.util.Calendar timeStamp,
           int flags,
           com.moneygram.www.AgentConnect1305.FeeInfo[] feeInfo) {
        super(
            doCheckIn,
            timeStamp,
            flags);
        this.feeInfo = feeInfo;
    }


    /**
     * Gets the feeInfo value for this FeeLookupResponse.
     * 
     * @return feeInfo
     */
    public com.moneygram.www.AgentConnect1305.FeeInfo[] getFeeInfo() {
        return feeInfo;
    }


    /**
     * Sets the feeInfo value for this FeeLookupResponse.
     * 
     * @param feeInfo
     */
    public void setFeeInfo(com.moneygram.www.AgentConnect1305.FeeInfo[] feeInfo) {
        this.feeInfo = feeInfo;
    }

    public com.moneygram.www.AgentConnect1305.FeeInfo getFeeInfo(int i) {
        return this.feeInfo[i];
    }

    public void setFeeInfo(int i, com.moneygram.www.AgentConnect1305.FeeInfo _value) {
        this.feeInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeeLookupResponse)) return false;
        FeeLookupResponse other = (FeeLookupResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.feeInfo==null && other.getFeeInfo()==null) || 
             (this.feeInfo!=null &&
              java.util.Arrays.equals(this.feeInfo, other.getFeeInfo())));
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
        if (getFeeInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeeInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeeInfo(), i);
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
        new org.apache.axis.description.TypeDesc(FeeLookupResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "FeeLookupResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "feeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "FeeInfo"));
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
