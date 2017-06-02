/**
 * PurchaserId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.contents.types;

public class PurchaserId  implements java.io.Serializable {
    private java.lang.Long irisSubscriberId;

    private java.lang.Long irisUserId;

    private tv.mirada.www.iris.core.types.OperatorSubscriberId operatorId;

    public PurchaserId() {
    }

    public PurchaserId(
           java.lang.Long irisSubscriberId,
           java.lang.Long irisUserId,
           tv.mirada.www.iris.core.types.OperatorSubscriberId operatorId) {
           this.irisSubscriberId = irisSubscriberId;
           this.irisUserId = irisUserId;
           this.operatorId = operatorId;
    }


    /**
     * Gets the irisSubscriberId value for this PurchaserId.
     * 
     * @return irisSubscriberId
     */
    public java.lang.Long getIrisSubscriberId() {
        return irisSubscriberId;
    }


    /**
     * Sets the irisSubscriberId value for this PurchaserId.
     * 
     * @param irisSubscriberId
     */
    public void setIrisSubscriberId(java.lang.Long irisSubscriberId) {
        this.irisSubscriberId = irisSubscriberId;
    }


    /**
     * Gets the irisUserId value for this PurchaserId.
     * 
     * @return irisUserId
     */
    public java.lang.Long getIrisUserId() {
        return irisUserId;
    }


    /**
     * Sets the irisUserId value for this PurchaserId.
     * 
     * @param irisUserId
     */
    public void setIrisUserId(java.lang.Long irisUserId) {
        this.irisUserId = irisUserId;
    }


    /**
     * Gets the operatorId value for this PurchaserId.
     * 
     * @return operatorId
     */
    public tv.mirada.www.iris.core.types.OperatorSubscriberId getOperatorId() {
        return operatorId;
    }


    /**
     * Sets the operatorId value for this PurchaserId.
     * 
     * @param operatorId
     */
    public void setOperatorId(tv.mirada.www.iris.core.types.OperatorSubscriberId operatorId) {
        this.operatorId = operatorId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaserId)) return false;
        PurchaserId other = (PurchaserId) obj;
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
            ((this.irisUserId==null && other.getIrisUserId()==null) || 
             (this.irisUserId!=null &&
              this.irisUserId.equals(other.getIrisUserId()))) &&
            ((this.operatorId==null && other.getOperatorId()==null) || 
             (this.operatorId!=null &&
              this.operatorId.equals(other.getOperatorId())));
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
        if (getIrisUserId() != null) {
            _hashCode += getIrisUserId().hashCode();
        }
        if (getOperatorId() != null) {
            _hashCode += getOperatorId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchaserId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "PurchaserId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("irisSubscriberId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "IrisSubscriberId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("irisUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "IrisUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "OperatorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "OperatorSubscriberId"));
        elemField.setMinOccurs(0);
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
