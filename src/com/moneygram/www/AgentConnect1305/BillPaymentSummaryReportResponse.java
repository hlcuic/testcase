/**
 * BillPaymentSummaryReportResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.moneygram.www.AgentConnect1305;

public class BillPaymentSummaryReportResponse  extends com.moneygram.www.AgentConnect1305.Response  implements java.io.Serializable {
    private com.moneygram.www.AgentConnect1305.BillPaymentSummaryInfo[] reportInfo;

    public BillPaymentSummaryReportResponse() {
    }

    public BillPaymentSummaryReportResponse(
           boolean doCheckIn,
           java.util.Calendar timeStamp,
           int flags,
           com.moneygram.www.AgentConnect1305.BillPaymentSummaryInfo[] reportInfo) {
        super(
            doCheckIn,
            timeStamp,
            flags);
        this.reportInfo = reportInfo;
    }


    /**
     * Gets the reportInfo value for this BillPaymentSummaryReportResponse.
     * 
     * @return reportInfo
     */
    public com.moneygram.www.AgentConnect1305.BillPaymentSummaryInfo[] getReportInfo() {
        return reportInfo;
    }


    /**
     * Sets the reportInfo value for this BillPaymentSummaryReportResponse.
     * 
     * @param reportInfo
     */
    public void setReportInfo(com.moneygram.www.AgentConnect1305.BillPaymentSummaryInfo[] reportInfo) {
        this.reportInfo = reportInfo;
    }

    public com.moneygram.www.AgentConnect1305.BillPaymentSummaryInfo getReportInfo(int i) {
        return this.reportInfo[i];
    }

    public void setReportInfo(int i, com.moneygram.www.AgentConnect1305.BillPaymentSummaryInfo _value) {
        this.reportInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillPaymentSummaryReportResponse)) return false;
        BillPaymentSummaryReportResponse other = (BillPaymentSummaryReportResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.reportInfo==null && other.getReportInfo()==null) || 
             (this.reportInfo!=null &&
              java.util.Arrays.equals(this.reportInfo, other.getReportInfo())));
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
        if (getReportInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReportInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReportInfo(), i);
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
        new org.apache.axis.description.TypeDesc(BillPaymentSummaryReportResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "BillPaymentSummaryReportResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "reportInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "BillPaymentSummaryInfo"));
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