/**
 * VariableReceiptInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.moneygram.www.AgentConnect1305;

public class VariableReceiptInfoResponse  extends com.moneygram.www.AgentConnect1305.Response  implements java.io.Serializable {
    private java.lang.String version;

    private com.moneygram.www.AgentConnect1305.VariableReceiptTextInfo[] receiptText;

    public VariableReceiptInfoResponse() {
    }

    public VariableReceiptInfoResponse(
           boolean doCheckIn,
           java.util.Calendar timeStamp,
           int flags,
           java.lang.String version,
           com.moneygram.www.AgentConnect1305.VariableReceiptTextInfo[] receiptText) {
        super(
            doCheckIn,
            timeStamp,
            flags);
        this.version = version;
        this.receiptText = receiptText;
    }


    /**
     * Gets the version value for this VariableReceiptInfoResponse.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this VariableReceiptInfoResponse.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the receiptText value for this VariableReceiptInfoResponse.
     * 
     * @return receiptText
     */
    public com.moneygram.www.AgentConnect1305.VariableReceiptTextInfo[] getReceiptText() {
        return receiptText;
    }


    /**
     * Sets the receiptText value for this VariableReceiptInfoResponse.
     * 
     * @param receiptText
     */
    public void setReceiptText(com.moneygram.www.AgentConnect1305.VariableReceiptTextInfo[] receiptText) {
        this.receiptText = receiptText;
    }

    public com.moneygram.www.AgentConnect1305.VariableReceiptTextInfo getReceiptText(int i) {
        return this.receiptText[i];
    }

    public void setReceiptText(int i, com.moneygram.www.AgentConnect1305.VariableReceiptTextInfo _value) {
        this.receiptText[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VariableReceiptInfoResponse)) return false;
        VariableReceiptInfoResponse other = (VariableReceiptInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.receiptText==null && other.getReceiptText()==null) || 
             (this.receiptText!=null &&
              java.util.Arrays.equals(this.receiptText, other.getReceiptText())));
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
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getReceiptText() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReceiptText());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReceiptText(), i);
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
        new org.apache.axis.description.TypeDesc(VariableReceiptInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "VariableReceiptInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "receiptText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "VariableReceiptTextInfo"));
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
