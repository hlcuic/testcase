/**
 * ReferenceNumberPhoneResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.moneygram.www.AgentConnect1305;

public class ReferenceNumberPhoneResponse  extends com.moneygram.www.AgentConnect1305.Response  implements java.io.Serializable {
    private com.moneygram.www.AgentConnect1305.ReferenceNumberInfo[] referenceInfo;

    public ReferenceNumberPhoneResponse() {
    }

    public ReferenceNumberPhoneResponse(
           boolean doCheckIn,
           java.util.Calendar timeStamp,
           int flags,
           com.moneygram.www.AgentConnect1305.ReferenceNumberInfo[] referenceInfo) {
        super(
            doCheckIn,
            timeStamp,
            flags);
        this.referenceInfo = referenceInfo;
    }


    /**
     * Gets the referenceInfo value for this ReferenceNumberPhoneResponse.
     * 
     * @return referenceInfo
     */
    public com.moneygram.www.AgentConnect1305.ReferenceNumberInfo[] getReferenceInfo() {
        return referenceInfo;
    }


    /**
     * Sets the referenceInfo value for this ReferenceNumberPhoneResponse.
     * 
     * @param referenceInfo
     */
    public void setReferenceInfo(com.moneygram.www.AgentConnect1305.ReferenceNumberInfo[] referenceInfo) {
        this.referenceInfo = referenceInfo;
    }

    public com.moneygram.www.AgentConnect1305.ReferenceNumberInfo getReferenceInfo(int i) {
        return this.referenceInfo[i];
    }

    public void setReferenceInfo(int i, com.moneygram.www.AgentConnect1305.ReferenceNumberInfo _value) {
        this.referenceInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReferenceNumberPhoneResponse)) return false;
        ReferenceNumberPhoneResponse other = (ReferenceNumberPhoneResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.referenceInfo==null && other.getReferenceInfo()==null) || 
             (this.referenceInfo!=null &&
              java.util.Arrays.equals(this.referenceInfo, other.getReferenceInfo())));
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
        if (getReferenceInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReferenceInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReferenceInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ReferenceNumberPhoneResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ReferenceNumberPhoneResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "referenceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ReferenceNumberInfo"));
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
