/**
 * QueryRegistrationByNamesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.moneygram.www.AgentConnect1305;

public class QueryRegistrationByNamesResponse  extends com.moneygram.www.AgentConnect1305.Response  implements java.io.Serializable {
    private com.moneygram.www.AgentConnect1305.ReceiverInfo[] receiverInfo;

    public QueryRegistrationByNamesResponse() {
    }

    public QueryRegistrationByNamesResponse(
           boolean doCheckIn,
           java.util.Calendar timeStamp,
           int flags,
           com.moneygram.www.AgentConnect1305.ReceiverInfo[] receiverInfo) {
        super(
            doCheckIn,
            timeStamp,
            flags);
        this.receiverInfo = receiverInfo;
    }


    /**
     * Gets the receiverInfo value for this QueryRegistrationByNamesResponse.
     * 
     * @return receiverInfo
     */
    public com.moneygram.www.AgentConnect1305.ReceiverInfo[] getReceiverInfo() {
        return receiverInfo;
    }


    /**
     * Sets the receiverInfo value for this QueryRegistrationByNamesResponse.
     * 
     * @param receiverInfo
     */
    public void setReceiverInfo(com.moneygram.www.AgentConnect1305.ReceiverInfo[] receiverInfo) {
        this.receiverInfo = receiverInfo;
    }

    public com.moneygram.www.AgentConnect1305.ReceiverInfo getReceiverInfo(int i) {
        return this.receiverInfo[i];
    }

    public void setReceiverInfo(int i, com.moneygram.www.AgentConnect1305.ReceiverInfo _value) {
        this.receiverInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryRegistrationByNamesResponse)) return false;
        QueryRegistrationByNamesResponse other = (QueryRegistrationByNamesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.receiverInfo==null && other.getReceiverInfo()==null) || 
             (this.receiverInfo!=null &&
              java.util.Arrays.equals(this.receiverInfo, other.getReceiverInfo())));
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
        if (getReceiverInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReceiverInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReceiverInfo(), i);
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
        new org.apache.axis.description.TypeDesc(QueryRegistrationByNamesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "QueryRegistrationByNamesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "receiverInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ReceiverInfo"));
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
