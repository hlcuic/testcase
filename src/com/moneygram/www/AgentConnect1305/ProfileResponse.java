/**
 * ProfileResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.moneygram.www.AgentConnect1305;

public class ProfileResponse  extends com.moneygram.www.AgentConnect1305.Response  implements java.io.Serializable {
    private com.moneygram.www.AgentConnect1305.ProfileItem[] profileItem;

    private com.moneygram.www.AgentConnect1305.ProductProfileItem[] productProfileItem;

    public ProfileResponse() {
    }

    public ProfileResponse(
           boolean doCheckIn,
           java.util.Calendar timeStamp,
           int flags,
           com.moneygram.www.AgentConnect1305.ProfileItem[] profileItem,
           com.moneygram.www.AgentConnect1305.ProductProfileItem[] productProfileItem) {
        super(
            doCheckIn,
            timeStamp,
            flags);
        this.profileItem = profileItem;
        this.productProfileItem = productProfileItem;
    }


    /**
     * Gets the profileItem value for this ProfileResponse.
     * 
     * @return profileItem
     */
    public com.moneygram.www.AgentConnect1305.ProfileItem[] getProfileItem() {
        return profileItem;
    }


    /**
     * Sets the profileItem value for this ProfileResponse.
     * 
     * @param profileItem
     */
    public void setProfileItem(com.moneygram.www.AgentConnect1305.ProfileItem[] profileItem) {
        this.profileItem = profileItem;
    }

    public com.moneygram.www.AgentConnect1305.ProfileItem getProfileItem(int i) {
        return this.profileItem[i];
    }

    public void setProfileItem(int i, com.moneygram.www.AgentConnect1305.ProfileItem _value) {
        this.profileItem[i] = _value;
    }


    /**
     * Gets the productProfileItem value for this ProfileResponse.
     * 
     * @return productProfileItem
     */
    public com.moneygram.www.AgentConnect1305.ProductProfileItem[] getProductProfileItem() {
        return productProfileItem;
    }


    /**
     * Sets the productProfileItem value for this ProfileResponse.
     * 
     * @param productProfileItem
     */
    public void setProductProfileItem(com.moneygram.www.AgentConnect1305.ProductProfileItem[] productProfileItem) {
        this.productProfileItem = productProfileItem;
    }

    public com.moneygram.www.AgentConnect1305.ProductProfileItem getProductProfileItem(int i) {
        return this.productProfileItem[i];
    }

    public void setProductProfileItem(int i, com.moneygram.www.AgentConnect1305.ProductProfileItem _value) {
        this.productProfileItem[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProfileResponse)) return false;
        ProfileResponse other = (ProfileResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.profileItem==null && other.getProfileItem()==null) || 
             (this.profileItem!=null &&
              java.util.Arrays.equals(this.profileItem, other.getProfileItem()))) &&
            ((this.productProfileItem==null && other.getProductProfileItem()==null) || 
             (this.productProfileItem!=null &&
              java.util.Arrays.equals(this.productProfileItem, other.getProductProfileItem())));
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
        if (getProfileItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProfileItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProfileItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProductProfileItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductProfileItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductProfileItem(), i);
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
        new org.apache.axis.description.TypeDesc(ProfileResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ProfileResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "profileItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ProfileItem"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productProfileItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "productProfileItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1305", "ProductProfileItem"));
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
