/**
 * CancelAdvancePPVPurchaseRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.contents.subscriberPPV.messages;

public class CancelAdvancePPVPurchaseRequest  implements java.io.Serializable {
    private tv.mirada.www.iris.contents.types.PurchaseId purchaseId;

    public CancelAdvancePPVPurchaseRequest() {
    }

    public CancelAdvancePPVPurchaseRequest(
           tv.mirada.www.iris.contents.types.PurchaseId purchaseId) {
           this.purchaseId = purchaseId;
    }


    /**
     * Gets the purchaseId value for this CancelAdvancePPVPurchaseRequest.
     * 
     * @return purchaseId
     */
    public tv.mirada.www.iris.contents.types.PurchaseId getPurchaseId() {
        return purchaseId;
    }


    /**
     * Sets the purchaseId value for this CancelAdvancePPVPurchaseRequest.
     * 
     * @param purchaseId
     */
    public void setPurchaseId(tv.mirada.www.iris.contents.types.PurchaseId purchaseId) {
        this.purchaseId = purchaseId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CancelAdvancePPVPurchaseRequest)) return false;
        CancelAdvancePPVPurchaseRequest other = (CancelAdvancePPVPurchaseRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.purchaseId==null && other.getPurchaseId()==null) || 
             (this.purchaseId!=null &&
              this.purchaseId.equals(other.getPurchaseId())));
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
        if (getPurchaseId() != null) {
            _hashCode += getPurchaseId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CancelAdvancePPVPurchaseRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/subscriberPPV/messages", ">CancelAdvancePPVPurchaseRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/subscriberPPV/messages", "PurchaseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "PurchaseId"));
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
