/**
 * StoreHourInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.moneygram.www.AgentConnect1305;

public class StoreHourInfo  implements java.io.Serializable {
    private com.moneygram.www.AgentConnect1305.DayOfWeek dayOfWeek;

    private org.apache.axis.types.Time openTime;

    private org.apache.axis.types.Time closeTime;

    private boolean closed;

    public StoreHourInfo() {
    }

    public StoreHourInfo(
           com.moneygram.www.AgentConnect1305.DayOfWeek dayOfWeek,
           org.apache.axis.types.Time openTime,
           org.apache.axis.types.Time closeTime,
           boolean closed) {
           this.dayOfWeek = dayOfWeek;
           this.openTime = openTime;
           this.closeTime = closeTime;
           this.closed = closed;
    }


    /**
     * Gets the dayOfWeek value for this StoreHourInfo.
     * 
     * @return dayOfWeek
     */
    public com.moneygram.www.AgentConnect1305.DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }


    /**
     * Sets the dayOfWeek value for this StoreHourInfo.
     * 
     * @param dayOfWeek
     */
    public void setDayOfWeek(com.moneygram.www.AgentConnect1305.DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }


    /**
     * Gets the openTime value for this StoreHourInfo.
     * 
     * @return openTime
     */
    public org.apache.axis.types.Time getOpenTime() {
        return openTime;
    }


    /**
     * Sets the openTime value for this StoreHourInfo.
     * 
     * @param openTime
     */
    public void setOpenTime(org.apache.axis.types.Time openTime) {
        this.openTime = openTime;
    }


    /**
     * Gets the closeTime value for this StoreHourInfo.
     * 
     * @return closeTime
     */
    public org.apache.axis.types.Time getCloseTime() {
        return closeTime;
    }


    /**
     * Sets the closeTime value for this StoreHourInfo.
     * 
     * @param closeTime
     */
    public void setCloseTime(org.apache.axis.types.Time closeTime) {
        this.closeTime = closeTime;
    }


    /**
     * Gets the closed value for this StoreHourInfo.
     * 
     * @return closed
     */
    public boolean isClosed() {
        return closed;
    }


    /**
     * Sets the closed value for this StoreHourInfo.
     * 
     * @param closed
     */
    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StoreHourInfo)) return false;
        StoreHourInfo other = (StoreHourInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dayOfWeek==null && other.getDayOfWeek()==null) || 
             (this.dayOfWeek!=null &&
              this.dayOfWeek.equals(other.getDayOfWeek()))) &&
            ((this.openTime==null && other.getOpenTime()==null) || 
             (this.openTime!=null &&
              this.openTime.equals(other.getOpenTime()))) &&
            ((this.closeTime==null && other.getCloseTime()==null) || 
             (this.closeTime!=null &&
              this.closeTime.equals(other.getCloseTime()))) &&
            this.closed == other.isClosed();
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
        if (getDayOfWeek() != null) {
            _hashCode += getDayOfWeek().hashCode();
        }
        if (getOpenTime() != null) {
            _hashCode += getOpenTime().hashCode();
        }
        if (getCloseTime() != null) {
            _hashCode += getCloseTime().hashCode();
        }
        _hashCode += (isClosed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StoreHourInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "StoreHourInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayOfWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "dayOfWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "dayOfWeek"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "openTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closeTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "closeTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "closed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
