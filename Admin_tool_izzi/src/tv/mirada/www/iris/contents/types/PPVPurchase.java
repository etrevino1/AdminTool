/**
 * PPVPurchase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.contents.types;

public class PPVPurchase  implements java.io.Serializable {
    private java.lang.Long irisId;

    private tv.mirada.www.iris.contents.types.PurchaserId purchaserId;

    private tv.mirada.www.iris.core.types.CustomerPremisesEquipmentId customerPremisesEquipmentId;

    private tv.mirada.www.iris.contents.types.ProductId productId;

    private tv.mirada.www.iris.contents.types.OperatorPurchaseId operatorPurchaseId;

    private int price;

    private boolean cancelled;

    private java.util.Calendar purchaseDate;

    public PPVPurchase() {
    }

    public PPVPurchase(
           java.lang.Long irisId,
           tv.mirada.www.iris.contents.types.PurchaserId purchaserId,
           tv.mirada.www.iris.core.types.CustomerPremisesEquipmentId customerPremisesEquipmentId,
           tv.mirada.www.iris.contents.types.ProductId productId,
           tv.mirada.www.iris.contents.types.OperatorPurchaseId operatorPurchaseId,
           int price,
           boolean cancelled,
           java.util.Calendar purchaseDate) {
           this.irisId = irisId;
           this.purchaserId = purchaserId;
           this.customerPremisesEquipmentId = customerPremisesEquipmentId;
           this.productId = productId;
           this.operatorPurchaseId = operatorPurchaseId;
           this.price = price;
           this.cancelled = cancelled;
           this.purchaseDate = purchaseDate;
    }


    /**
     * Gets the irisId value for this PPVPurchase.
     * 
     * @return irisId
     */
    public java.lang.Long getIrisId() {
        return irisId;
    }


    /**
     * Sets the irisId value for this PPVPurchase.
     * 
     * @param irisId
     */
    public void setIrisId(java.lang.Long irisId) {
        this.irisId = irisId;
    }


    /**
     * Gets the purchaserId value for this PPVPurchase.
     * 
     * @return purchaserId
     */
    public tv.mirada.www.iris.contents.types.PurchaserId getPurchaserId() {
        return purchaserId;
    }


    /**
     * Sets the purchaserId value for this PPVPurchase.
     * 
     * @param purchaserId
     */
    public void setPurchaserId(tv.mirada.www.iris.contents.types.PurchaserId purchaserId) {
        this.purchaserId = purchaserId;
    }


    /**
     * Gets the customerPremisesEquipmentId value for this PPVPurchase.
     * 
     * @return customerPremisesEquipmentId
     */
    public tv.mirada.www.iris.core.types.CustomerPremisesEquipmentId getCustomerPremisesEquipmentId() {
        return customerPremisesEquipmentId;
    }


    /**
     * Sets the customerPremisesEquipmentId value for this PPVPurchase.
     * 
     * @param customerPremisesEquipmentId
     */
    public void setCustomerPremisesEquipmentId(tv.mirada.www.iris.core.types.CustomerPremisesEquipmentId customerPremisesEquipmentId) {
        this.customerPremisesEquipmentId = customerPremisesEquipmentId;
    }


    /**
     * Gets the productId value for this PPVPurchase.
     * 
     * @return productId
     */
    public tv.mirada.www.iris.contents.types.ProductId getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this PPVPurchase.
     * 
     * @param productId
     */
    public void setProductId(tv.mirada.www.iris.contents.types.ProductId productId) {
        this.productId = productId;
    }


    /**
     * Gets the operatorPurchaseId value for this PPVPurchase.
     * 
     * @return operatorPurchaseId
     */
    public tv.mirada.www.iris.contents.types.OperatorPurchaseId getOperatorPurchaseId() {
        return operatorPurchaseId;
    }


    /**
     * Sets the operatorPurchaseId value for this PPVPurchase.
     * 
     * @param operatorPurchaseId
     */
    public void setOperatorPurchaseId(tv.mirada.www.iris.contents.types.OperatorPurchaseId operatorPurchaseId) {
        this.operatorPurchaseId = operatorPurchaseId;
    }


    /**
     * Gets the price value for this PPVPurchase.
     * 
     * @return price
     */
    public int getPrice() {
        return price;
    }


    /**
     * Sets the price value for this PPVPurchase.
     * 
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }


    /**
     * Gets the cancelled value for this PPVPurchase.
     * 
     * @return cancelled
     */
    public boolean isCancelled() {
        return cancelled;
    }


    /**
     * Sets the cancelled value for this PPVPurchase.
     * 
     * @param cancelled
     */
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }


    /**
     * Gets the purchaseDate value for this PPVPurchase.
     * 
     * @return purchaseDate
     */
    public java.util.Calendar getPurchaseDate() {
        return purchaseDate;
    }


    /**
     * Sets the purchaseDate value for this PPVPurchase.
     * 
     * @param purchaseDate
     */
    public void setPurchaseDate(java.util.Calendar purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PPVPurchase)) return false;
        PPVPurchase other = (PPVPurchase) obj;
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
            ((this.purchaserId==null && other.getPurchaserId()==null) || 
             (this.purchaserId!=null &&
              this.purchaserId.equals(other.getPurchaserId()))) &&
            ((this.customerPremisesEquipmentId==null && other.getCustomerPremisesEquipmentId()==null) || 
             (this.customerPremisesEquipmentId!=null &&
              this.customerPremisesEquipmentId.equals(other.getCustomerPremisesEquipmentId()))) &&
            ((this.productId==null && other.getProductId()==null) || 
             (this.productId!=null &&
              this.productId.equals(other.getProductId()))) &&
            ((this.operatorPurchaseId==null && other.getOperatorPurchaseId()==null) || 
             (this.operatorPurchaseId!=null &&
              this.operatorPurchaseId.equals(other.getOperatorPurchaseId()))) &&
            this.price == other.getPrice() &&
            this.cancelled == other.isCancelled() &&
            ((this.purchaseDate==null && other.getPurchaseDate()==null) || 
             (this.purchaseDate!=null &&
              this.purchaseDate.equals(other.getPurchaseDate())));
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
        if (getPurchaserId() != null) {
            _hashCode += getPurchaserId().hashCode();
        }
        if (getCustomerPremisesEquipmentId() != null) {
            _hashCode += getCustomerPremisesEquipmentId().hashCode();
        }
        if (getProductId() != null) {
            _hashCode += getProductId().hashCode();
        }
        if (getOperatorPurchaseId() != null) {
            _hashCode += getOperatorPurchaseId().hashCode();
        }
        _hashCode += getPrice();
        _hashCode += (isCancelled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPurchaseDate() != null) {
            _hashCode += getPurchaseDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PPVPurchase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "PPVPurchase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("irisId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "IrisId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaserId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "PurchaserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "PurchaserId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerPremisesEquipmentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "CustomerPremisesEquipmentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "CustomerPremisesEquipmentId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "ProductId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "ProductId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorPurchaseId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "OperatorPurchaseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "OperatorPurchaseId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "Price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "Cancelled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "PurchaseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
