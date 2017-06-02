/**
 * UpdateIPPVPurchaseSettingsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.contents.subscriberPPV.messages;

public class UpdateIPPVPurchaseSettingsRequest  implements java.io.Serializable {
    private java.lang.Long irisSubscriberId;

    private tv.mirada.www.iris.core.types.OperatorSubscriberId operatorId;

    private java.lang.String hardwareId;

    private boolean isImpulsePPVAllowed;

    private int maxOutstandingImpulsePPVPurchases;

    private int maxImpulsePPVCredit;

    public UpdateIPPVPurchaseSettingsRequest() {
    }

    public UpdateIPPVPurchaseSettingsRequest(
           java.lang.Long irisSubscriberId,
           tv.mirada.www.iris.core.types.OperatorSubscriberId operatorId,
           java.lang.String hardwareId,
           boolean isImpulsePPVAllowed,
           int maxOutstandingImpulsePPVPurchases,
           int maxImpulsePPVCredit) {
           this.irisSubscriberId = irisSubscriberId;
           this.operatorId = operatorId;
           this.hardwareId = hardwareId;
           this.isImpulsePPVAllowed = isImpulsePPVAllowed;
           this.maxOutstandingImpulsePPVPurchases = maxOutstandingImpulsePPVPurchases;
           this.maxImpulsePPVCredit = maxImpulsePPVCredit;
    }


    /**
     * Gets the irisSubscriberId value for this UpdateIPPVPurchaseSettingsRequest.
     * 
     * @return irisSubscriberId
     */
    public java.lang.Long getIrisSubscriberId() {
        return irisSubscriberId;
    }


    /**
     * Sets the irisSubscriberId value for this UpdateIPPVPurchaseSettingsRequest.
     * 
     * @param irisSubscriberId
     */
    public void setIrisSubscriberId(java.lang.Long irisSubscriberId) {
        this.irisSubscriberId = irisSubscriberId;
    }


    /**
     * Gets the operatorId value for this UpdateIPPVPurchaseSettingsRequest.
     * 
     * @return operatorId
     */
    public tv.mirada.www.iris.core.types.OperatorSubscriberId getOperatorId() {
        return operatorId;
    }


    /**
     * Sets the operatorId value for this UpdateIPPVPurchaseSettingsRequest.
     * 
     * @param operatorId
     */
    public void setOperatorId(tv.mirada.www.iris.core.types.OperatorSubscriberId operatorId) {
        this.operatorId = operatorId;
    }


    /**
     * Gets the hardwareId value for this UpdateIPPVPurchaseSettingsRequest.
     * 
     * @return hardwareId
     */
    public java.lang.String getHardwareId() {
        return hardwareId;
    }


    /**
     * Sets the hardwareId value for this UpdateIPPVPurchaseSettingsRequest.
     * 
     * @param hardwareId
     */
    public void setHardwareId(java.lang.String hardwareId) {
        this.hardwareId = hardwareId;
    }


    /**
     * Gets the isImpulsePPVAllowed value for this UpdateIPPVPurchaseSettingsRequest.
     * 
     * @return isImpulsePPVAllowed
     */
    public boolean isIsImpulsePPVAllowed() {
        return isImpulsePPVAllowed;
    }


    /**
     * Sets the isImpulsePPVAllowed value for this UpdateIPPVPurchaseSettingsRequest.
     * 
     * @param isImpulsePPVAllowed
     */
    public void setIsImpulsePPVAllowed(boolean isImpulsePPVAllowed) {
        this.isImpulsePPVAllowed = isImpulsePPVAllowed;
    }


    /**
     * Gets the maxOutstandingImpulsePPVPurchases value for this UpdateIPPVPurchaseSettingsRequest.
     * 
     * @return maxOutstandingImpulsePPVPurchases
     */
    public int getMaxOutstandingImpulsePPVPurchases() {
        return maxOutstandingImpulsePPVPurchases;
    }


    /**
     * Sets the maxOutstandingImpulsePPVPurchases value for this UpdateIPPVPurchaseSettingsRequest.
     * 
     * @param maxOutstandingImpulsePPVPurchases
     */
    public void setMaxOutstandingImpulsePPVPurchases(int maxOutstandingImpulsePPVPurchases) {
        this.maxOutstandingImpulsePPVPurchases = maxOutstandingImpulsePPVPurchases;
    }


    /**
     * Gets the maxImpulsePPVCredit value for this UpdateIPPVPurchaseSettingsRequest.
     * 
     * @return maxImpulsePPVCredit
     */
    public int getMaxImpulsePPVCredit() {
        return maxImpulsePPVCredit;
    }


    /**
     * Sets the maxImpulsePPVCredit value for this UpdateIPPVPurchaseSettingsRequest.
     * 
     * @param maxImpulsePPVCredit
     */
    public void setMaxImpulsePPVCredit(int maxImpulsePPVCredit) {
        this.maxImpulsePPVCredit = maxImpulsePPVCredit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateIPPVPurchaseSettingsRequest)) return false;
        UpdateIPPVPurchaseSettingsRequest other = (UpdateIPPVPurchaseSettingsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.irisSubscriberId==null && other.getIrisSubscriberId()==null) || 
             (this.irisSubscriberId!=null &&
              this.irisSubscriberId.equals(other.getIrisSubscriberId()))) &&
            ((this.operatorId==null && other.getOperatorId()==null) || 
             (this.operatorId!=null &&
              this.operatorId.equals(other.getOperatorId()))) &&
            ((this.hardwareId==null && other.getHardwareId()==null) || 
             (this.hardwareId!=null &&
              this.hardwareId.equals(other.getHardwareId()))) &&
            this.isImpulsePPVAllowed == other.isIsImpulsePPVAllowed() &&
            this.maxOutstandingImpulsePPVPurchases == other.getMaxOutstandingImpulsePPVPurchases() &&
            this.maxImpulsePPVCredit == other.getMaxImpulsePPVCredit();
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
        if (getIrisSubscriberId() != null) {
            _hashCode += getIrisSubscriberId().hashCode();
        }
        if (getOperatorId() != null) {
            _hashCode += getOperatorId().hashCode();
        }
        if (getHardwareId() != null) {
            _hashCode += getHardwareId().hashCode();
        }
        _hashCode += (isIsImpulsePPVAllowed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getMaxOutstandingImpulsePPVPurchases();
        _hashCode += getMaxImpulsePPVCredit();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateIPPVPurchaseSettingsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/subscriberPPV/messages", ">UpdateIPPVPurchaseSettingsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("irisSubscriberId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/subscriberPPV/messages", "IrisSubscriberId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/subscriberPPV/messages", "OperatorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "OperatorSubscriberId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hardwareId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/subscriberPPV/messages", "HardwareId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isImpulsePPVAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/subscriberPPV/messages", "IsImpulsePPVAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxOutstandingImpulsePPVPurchases");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/subscriberPPV/messages", "MaxOutstandingImpulsePPVPurchases"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxImpulsePPVCredit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/subscriberPPV/messages", "MaxImpulsePPVCredit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
