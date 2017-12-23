/**
 * PayPerViewProduct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.contents.types;

public class PayPerViewProduct  implements java.io.Serializable {
    private java.lang.Long irisId;

    private tv.mirada.www.iris.contents.types.OperatorProductId operatorProductId;

    private tv.mirada.www.iris.contents.types.EventId eventId;

    private int price;

    private java.lang.Boolean isImpulsePPVAllowed;

    private java.lang.Boolean isRecordingAllowed;

    private tv.mirada.www.iris.contents.types.TimeSpan freeviewTimeSpan;

    private tv.mirada.www.iris.contents.types.TimeSpan purchaseTimeSpan;

    private tv.mirada.www.iris.contents.types.TimeSpan cancelTimeSpan;

    private tv.mirada.www.iris.contents.types.LocalizedProductData[] localizedProductData;

    public PayPerViewProduct() {
    }

    public PayPerViewProduct(
           java.lang.Long irisId,
           tv.mirada.www.iris.contents.types.OperatorProductId operatorProductId,
           tv.mirada.www.iris.contents.types.EventId eventId,
           int price,
           java.lang.Boolean isImpulsePPVAllowed,
           java.lang.Boolean isRecordingAllowed,
           tv.mirada.www.iris.contents.types.TimeSpan freeviewTimeSpan,
           tv.mirada.www.iris.contents.types.TimeSpan purchaseTimeSpan,
           tv.mirada.www.iris.contents.types.TimeSpan cancelTimeSpan,
           tv.mirada.www.iris.contents.types.LocalizedProductData[] localizedProductData) {
           this.irisId = irisId;
           this.operatorProductId = operatorProductId;
           this.eventId = eventId;
           this.price = price;
           this.isImpulsePPVAllowed = isImpulsePPVAllowed;
           this.isRecordingAllowed = isRecordingAllowed;
           this.freeviewTimeSpan = freeviewTimeSpan;
           this.purchaseTimeSpan = purchaseTimeSpan;
           this.cancelTimeSpan = cancelTimeSpan;
           this.localizedProductData = localizedProductData;
    }


    /**
     * Gets the irisId value for this PayPerViewProduct.
     * 
     * @return irisId
     */
    public java.lang.Long getIrisId() {
        return irisId;
    }


    /**
     * Sets the irisId value for this PayPerViewProduct.
     * 
     * @param irisId
     */
    public void setIrisId(java.lang.Long irisId) {
        this.irisId = irisId;
    }


    /**
     * Gets the operatorProductId value for this PayPerViewProduct.
     * 
     * @return operatorProductId
     */
    public tv.mirada.www.iris.contents.types.OperatorProductId getOperatorProductId() {
        return operatorProductId;
    }


    /**
     * Sets the operatorProductId value for this PayPerViewProduct.
     * 
     * @param operatorProductId
     */
    public void setOperatorProductId(tv.mirada.www.iris.contents.types.OperatorProductId operatorProductId) {
        this.operatorProductId = operatorProductId;
    }


    /**
     * Gets the eventId value for this PayPerViewProduct.
     * 
     * @return eventId
     */
    public tv.mirada.www.iris.contents.types.EventId getEventId() {
        return eventId;
    }


    /**
     * Sets the eventId value for this PayPerViewProduct.
     * 
     * @param eventId
     */
    public void setEventId(tv.mirada.www.iris.contents.types.EventId eventId) {
        this.eventId = eventId;
    }


    /**
     * Gets the price value for this PayPerViewProduct.
     * 
     * @return price
     */
    public int getPrice() {
        return price;
    }


    /**
     * Sets the price value for this PayPerViewProduct.
     * 
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }


    /**
     * Gets the isImpulsePPVAllowed value for this PayPerViewProduct.
     * 
     * @return isImpulsePPVAllowed
     */
    public java.lang.Boolean getIsImpulsePPVAllowed() {
        return isImpulsePPVAllowed;
    }


    /**
     * Sets the isImpulsePPVAllowed value for this PayPerViewProduct.
     * 
     * @param isImpulsePPVAllowed
     */
    public void setIsImpulsePPVAllowed(java.lang.Boolean isImpulsePPVAllowed) {
        this.isImpulsePPVAllowed = isImpulsePPVAllowed;
    }


    /**
     * Gets the isRecordingAllowed value for this PayPerViewProduct.
     * 
     * @return isRecordingAllowed
     */
    public java.lang.Boolean getIsRecordingAllowed() {
        return isRecordingAllowed;
    }


    /**
     * Sets the isRecordingAllowed value for this PayPerViewProduct.
     * 
     * @param isRecordingAllowed
     */
    public void setIsRecordingAllowed(java.lang.Boolean isRecordingAllowed) {
        this.isRecordingAllowed = isRecordingAllowed;
    }


    /**
     * Gets the freeviewTimeSpan value for this PayPerViewProduct.
     * 
     * @return freeviewTimeSpan
     */
    public tv.mirada.www.iris.contents.types.TimeSpan getFreeviewTimeSpan() {
        return freeviewTimeSpan;
    }


    /**
     * Sets the freeviewTimeSpan value for this PayPerViewProduct.
     * 
     * @param freeviewTimeSpan
     */
    public void setFreeviewTimeSpan(tv.mirada.www.iris.contents.types.TimeSpan freeviewTimeSpan) {
        this.freeviewTimeSpan = freeviewTimeSpan;
    }


    /**
     * Gets the purchaseTimeSpan value for this PayPerViewProduct.
     * 
     * @return purchaseTimeSpan
     */
    public tv.mirada.www.iris.contents.types.TimeSpan getPurchaseTimeSpan() {
        return purchaseTimeSpan;
    }


    /**
     * Sets the purchaseTimeSpan value for this PayPerViewProduct.
     * 
     * @param purchaseTimeSpan
     */
    public void setPurchaseTimeSpan(tv.mirada.www.iris.contents.types.TimeSpan purchaseTimeSpan) {
        this.purchaseTimeSpan = purchaseTimeSpan;
    }


    /**
     * Gets the cancelTimeSpan value for this PayPerViewProduct.
     * 
     * @return cancelTimeSpan
     */
    public tv.mirada.www.iris.contents.types.TimeSpan getCancelTimeSpan() {
        return cancelTimeSpan;
    }


    /**
     * Sets the cancelTimeSpan value for this PayPerViewProduct.
     * 
     * @param cancelTimeSpan
     */
    public void setCancelTimeSpan(tv.mirada.www.iris.contents.types.TimeSpan cancelTimeSpan) {
        this.cancelTimeSpan = cancelTimeSpan;
    }


    /**
     * Gets the localizedProductData value for this PayPerViewProduct.
     * 
     * @return localizedProductData
     */
    public tv.mirada.www.iris.contents.types.LocalizedProductData[] getLocalizedProductData() {
        return localizedProductData;
    }


    /**
     * Sets the localizedProductData value for this PayPerViewProduct.
     * 
     * @param localizedProductData
     */
    public void setLocalizedProductData(tv.mirada.www.iris.contents.types.LocalizedProductData[] localizedProductData) {
        this.localizedProductData = localizedProductData;
    }

    public tv.mirada.www.iris.contents.types.LocalizedProductData getLocalizedProductData(int i) {
        return this.localizedProductData[i];
    }

    public void setLocalizedProductData(int i, tv.mirada.www.iris.contents.types.LocalizedProductData _value) {
        this.localizedProductData[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PayPerViewProduct)) return false;
        PayPerViewProduct other = (PayPerViewProduct) obj;
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
            ((this.operatorProductId==null && other.getOperatorProductId()==null) || 
             (this.operatorProductId!=null &&
              this.operatorProductId.equals(other.getOperatorProductId()))) &&
            ((this.eventId==null && other.getEventId()==null) || 
             (this.eventId!=null &&
              this.eventId.equals(other.getEventId()))) &&
            this.price == other.getPrice() &&
            ((this.isImpulsePPVAllowed==null && other.getIsImpulsePPVAllowed()==null) || 
             (this.isImpulsePPVAllowed!=null &&
              this.isImpulsePPVAllowed.equals(other.getIsImpulsePPVAllowed()))) &&
            ((this.isRecordingAllowed==null && other.getIsRecordingAllowed()==null) || 
             (this.isRecordingAllowed!=null &&
              this.isRecordingAllowed.equals(other.getIsRecordingAllowed()))) &&
            ((this.freeviewTimeSpan==null && other.getFreeviewTimeSpan()==null) || 
             (this.freeviewTimeSpan!=null &&
              this.freeviewTimeSpan.equals(other.getFreeviewTimeSpan()))) &&
            ((this.purchaseTimeSpan==null && other.getPurchaseTimeSpan()==null) || 
             (this.purchaseTimeSpan!=null &&
              this.purchaseTimeSpan.equals(other.getPurchaseTimeSpan()))) &&
            ((this.cancelTimeSpan==null && other.getCancelTimeSpan()==null) || 
             (this.cancelTimeSpan!=null &&
              this.cancelTimeSpan.equals(other.getCancelTimeSpan()))) &&
            ((this.localizedProductData==null && other.getLocalizedProductData()==null) || 
             (this.localizedProductData!=null &&
              java.util.Arrays.equals(this.localizedProductData, other.getLocalizedProductData())));
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
        if (getOperatorProductId() != null) {
            _hashCode += getOperatorProductId().hashCode();
        }
        if (getEventId() != null) {
            _hashCode += getEventId().hashCode();
        }
        _hashCode += getPrice();
        if (getIsImpulsePPVAllowed() != null) {
            _hashCode += getIsImpulsePPVAllowed().hashCode();
        }
        if (getIsRecordingAllowed() != null) {
            _hashCode += getIsRecordingAllowed().hashCode();
        }
        if (getFreeviewTimeSpan() != null) {
            _hashCode += getFreeviewTimeSpan().hashCode();
        }
        if (getPurchaseTimeSpan() != null) {
            _hashCode += getPurchaseTimeSpan().hashCode();
        }
        if (getCancelTimeSpan() != null) {
            _hashCode += getCancelTimeSpan().hashCode();
        }
        if (getLocalizedProductData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocalizedProductData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocalizedProductData(), i);
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
        new org.apache.axis.description.TypeDesc(PayPerViewProduct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "PayPerViewProduct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("irisId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "IrisId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorProductId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "OperatorProductId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "OperatorProductId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "EventId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "EventId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "Price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isImpulsePPVAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "IsImpulsePPVAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRecordingAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "IsRecordingAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeviewTimeSpan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "FreeviewTimeSpan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "TimeSpan"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseTimeSpan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "PurchaseTimeSpan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "TimeSpan"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelTimeSpan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "CancelTimeSpan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "TimeSpan"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localizedProductData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "LocalizedProductData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "LocalizedProductData"));
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
