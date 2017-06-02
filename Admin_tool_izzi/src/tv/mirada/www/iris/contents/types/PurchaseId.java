/**
 * PurchaseId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.contents.types;

public class PurchaseId  implements java.io.Serializable {
    private java.lang.Long irisId;

    private tv.mirada.www.iris.contents.types.OperatorPurchaseId operatorId;

    public PurchaseId() {
    }

    public PurchaseId(
           java.lang.Long irisId,
           tv.mirada.www.iris.contents.types.OperatorPurchaseId operatorId) {
           this.irisId = irisId;
           this.operatorId = operatorId;
    }


    /**
     * Gets the irisId value for this PurchaseId.
     * 
     * @return irisId
     */
    public java.lang.Long getIrisId() {
        return irisId;
    }


    /**
     * Sets the irisId value for this PurchaseId.
     * 
     * @param irisId
     */
    public void setIrisId(java.lang.Long irisId) {
        this.irisId = irisId;
    }


    /**
     * Gets the operatorId value for this PurchaseId.
     * 
     * @return operatorId
     */
    public tv.mirada.www.iris.contents.types.OperatorPurchaseId getOperatorId() {
        return operatorId;
    }


    /**
     * Sets the operatorId value for this PurchaseId.
     * 
     * @param operatorId
     */
    public void setOperatorId(tv.mirada.www.iris.contents.types.OperatorPurchaseId operatorId) {
        this.operatorId = operatorId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseId)) return false;
        PurchaseId other = (PurchaseId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.irisId==null && other.getIrisId()==null) || 
             (this.irisId!=null &&
              this.irisId.equals(other.getIrisId()))) &&
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
        if (getIrisId() != null) {
            _hashCode += getIrisId().hashCode();
        }
        if (getOperatorId() != null) {
            _hashCode += getOperatorId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchaseId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "PurchaseId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("irisId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "IrisId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "OperatorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "OperatorPurchaseId"));
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
