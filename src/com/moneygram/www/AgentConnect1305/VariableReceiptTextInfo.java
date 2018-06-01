/**
 * VariableReceiptTextInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.moneygram.www.AgentConnect1305;

public class VariableReceiptTextInfo  implements java.io.Serializable {
    private java.lang.String receiptTextType;

    private com.moneygram.www.AgentConnect1305.TextTranslation[] textTranslation;

    public VariableReceiptTextInfo() {
    }

    public VariableReceiptTextInfo(
           java.lang.String receiptTextType,
           com.moneygram.www.AgentConnect1305.TextTranslation[] textTranslation) {
           this.receiptTextType = receiptTextType;
           this.textTranslation = textTranslation;
    }


    /**
     * Gets the receiptTextType value for this VariableReceiptTextInfo.
     * 
     * @return receiptTextType
     */
    public java.lang.String getReceiptTextType() {
        return receiptTextType;
    }


    /**
     * Sets the receiptTextType value for this VariableReceiptTextInfo.
     * 
     * @param receiptTextType
     */
    public void setReceiptTextType(java.lang.String receiptTextType) {
        this.receiptTextType = receiptTextType;
    }


    /**
     * Gets the textTranslation value for this VariableReceiptTextInfo.
     * 
     * @return textTranslation
     */
    public com.moneygram.www.AgentConnect1305.TextTranslation[] getTextTranslation() {
        return textTranslation;
    }


    /**
     * Sets the textTranslation value for this VariableReceiptTextInfo.
     * 
     * @param textTranslation
     */
    public void setTextTranslation(com.moneygram.www.AgentConnect1305.TextTranslation[] textTranslation) {
        this.textTranslation = textTranslation;
    }

    public com.moneygram.www.AgentConnect1305.TextTranslation getTextTranslation(int i) {
        return this.textTranslation[i];
    }

    public void setTextTranslation(int i, com.moneygram.www.AgentConnect1305.TextTranslation _value) {
        this.textTranslation[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VariableReceiptTextInfo)) return false;
        VariableReceiptTextInfo other = (VariableReceiptTextInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.receiptTextType==null && other.getReceiptTextType()==null) || 
             (this.receiptTextType!=null &&
              this.receiptTextType.equals(other.getReceiptTextType()))) &&
            ((this.textTranslation==null && other.getTextTranslation()==null) || 
             (this.textTranslation!=null &&
              java.util.Arrays.equals(this.textTranslation, other.getTextTranslation())));
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
        if (getReceiptTextType() != null) {
            _hashCode += getReceiptTextType().hashCode();
        }
        if (getTextTranslation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTextTranslation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTextTranslation(), i);
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
        new org.apache.axis.description.TypeDesc(VariableReceiptTextInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "VariableReceiptTextInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptTextType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "receiptTextType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textTranslation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "textTranslation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "TextTranslation"));
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
