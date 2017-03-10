/**
 * Subscription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.types;

public class Subscription  implements java.io.Serializable {
    private java.lang.Long irisId;

    private java.lang.String operatorSubscriptionId;

    private java.lang.Long irisSubscriberId;

    private java.lang.Long irisUserId;

    private tv.mirada.www.iris.core.types.OperatorSubscriberId operatorSubscriberId;

    private java.lang.Long irisHardwareId;

    private java.lang.Long hardwareId;

    private java.lang.Long irisPackageId;

    private java.lang.String packageName;

    private java.lang.String conditionalAccessId;

    private java.util.Calendar creationDatetime;

    private java.util.Calendar deactivationDatetime;

    public Subscription() {
    }

    public Subscription(
           java.lang.Long irisId,
           java.lang.String operatorSubscriptionId,
           java.lang.Long irisSubscriberId,
           java.lang.Long irisUserId,
           tv.mirada.www.iris.core.types.OperatorSubscriberId operatorSubscriberId,
           java.lang.Long irisHardwareId,
           java.lang.Long hardwareId,
           java.lang.Long irisPackageId,
           java.lang.String packageName,
           java.lang.String conditionalAccessId,
           java.util.Calendar creationDatetime,
           java.util.Calendar deactivationDatetime) {
           this.irisId = irisId;
           this.operatorSubscriptionId = operatorSubscriptionId;
           this.irisSubscriberId = irisSubscriberId;
           this.irisUserId = irisUserId;
           this.operatorSubscriberId = operatorSubscriberId;
           this.irisHardwareId = irisHardwareId;
           this.hardwareId = hardwareId;
           this.irisPackageId = irisPackageId;
           this.packageName = packageName;
           this.conditionalAccessId = conditionalAccessId;
           this.creationDatetime = creationDatetime;
           this.deactivationDatetime = deactivationDatetime;
    }


    /**
     * Gets the irisId value for this Subscription.
     * 
     * @return irisId
     */
    public java.lang.Long getIrisId() {
        return irisId;
    }


    /**
     * Sets the irisId value for this Subscription.
     * 
     * @param irisId
     */
    public void setIrisId(java.lang.Long irisId) {
        this.irisId = irisId;
    }


    /**
     * Gets the operatorSubscriptionId value for this Subscription.
     * 
     * @return operatorSubscriptionId
     */
    public java.lang.String getOperatorSubscriptionId() {
        return operatorSubscriptionId;
    }


    /**
     * Sets the operatorSubscriptionId value for this Subscription.
     * 
     * @param operatorSubscriptionId
     */
    public void setOperatorSubscriptionId(java.lang.String operatorSubscriptionId) {
        this.operatorSubscriptionId = operatorSubscriptionId;
    }


    /**
     * Gets the irisSubscriberId value for this Subscription.
     * 
     * @return irisSubscriberId
     */
    public java.lang.Long getIrisSubscriberId() {
        return irisSubscriberId;
    }


    /**
     * Sets the irisSubscriberId value for this Subscription.
     * 
     * @param irisSubscriberId
     */
    public void setIrisSubscriberId(java.lang.Long irisSubscriberId) {
        this.irisSubscriberId = irisSubscriberId;
    }


    /**
     * Gets the irisUserId value for this Subscription.
     * 
     * @return irisUserId
     */
    public java.lang.Long getIrisUserId() {
        return irisUserId;
    }


    /**
     * Sets the irisUserId value for this Subscription.
     * 
     * @param irisUserId
     */
    public void setIrisUserId(java.lang.Long irisUserId) {
        this.irisUserId = irisUserId;
    }


    /**
     * Gets the operatorSubscriberId value for this Subscription.
     * 
     * @return operatorSubscriberId
     */
    public tv.mirada.www.iris.core.types.OperatorSubscriberId getOperatorSubscriberId() {
        return operatorSubscriberId;
    }


    /**
     * Sets the operatorSubscriberId value for this Subscription.
     * 
     * @param operatorSubscriberId
     */
    public void setOperatorSubscriberId(tv.mirada.www.iris.core.types.OperatorSubscriberId operatorSubscriberId) {
        this.operatorSubscriberId = operatorSubscriberId;
    }


    /**
     * Gets the irisHardwareId value for this Subscription.
     * 
     * @return irisHardwareId
     */
    public java.lang.Long getIrisHardwareId() {
        return irisHardwareId;
    }


    /**
     * Sets the irisHardwareId value for this Subscription.
     * 
     * @param irisHardwareId
     */
    public void setIrisHardwareId(java.lang.Long irisHardwareId) {
        this.irisHardwareId = irisHardwareId;
    }


    /**
     * Gets the hardwareId value for this Subscription.
     * 
     * @return hardwareId
     */
    public java.lang.Long getHardwareId() {
        return hardwareId;
    }


    /**
     * Sets the hardwareId value for this Subscription.
     * 
     * @param hardwareId
     */
    public void setHardwareId(java.lang.Long hardwareId) {
        this.hardwareId = hardwareId;
    }


    /**
     * Gets the irisPackageId value for this Subscription.
     * 
     * @return irisPackageId
     */
    public java.lang.Long getIrisPackageId() {
        return irisPackageId;
    }


    /**
     * Sets the irisPackageId value for this Subscription.
     * 
     * @param irisPackageId
     */
    public void setIrisPackageId(java.lang.Long irisPackageId) {
        this.irisPackageId = irisPackageId;
    }


    /**
     * Gets the packageName value for this Subscription.
     * 
     * @return packageName
     */
    public java.lang.String getPackageName() {
        return packageName;
    }


    /**
     * Sets the packageName value for this Subscription.
     * 
     * @param packageName
     */
    public void setPackageName(java.lang.String packageName) {
        this.packageName = packageName;
    }


    /**
     * Gets the conditionalAccessId value for this Subscription.
     * 
     * @return conditionalAccessId
     */
    public java.lang.String getConditionalAccessId() {
        return conditionalAccessId;
    }


    /**
     * Sets the conditionalAccessId value for this Subscription.
     * 
     * @param conditionalAccessId
     */
    public void setConditionalAccessId(java.lang.String conditionalAccessId) {
        this.conditionalAccessId = conditionalAccessId;
    }


    /**
     * Gets the creationDatetime value for this Subscription.
     * 
     * @return creationDatetime
     */
    public java.util.Calendar getCreationDatetime() {
        return creationDatetime;
    }


    /**
     * Sets the creationDatetime value for this Subscription.
     * 
     * @param creationDatetime
     */
    public void setCreationDatetime(java.util.Calendar creationDatetime) {
        this.creationDatetime = creationDatetime;
    }


    /**
     * Gets the deactivationDatetime value for this Subscription.
     * 
     * @return deactivationDatetime
     */
    public java.util.Calendar getDeactivationDatetime() {
        return deactivationDatetime;
    }


    /**
     * Sets the deactivationDatetime value for this Subscription.
     * 
     * @param deactivationDatetime
     */
    public void setDeactivationDatetime(java.util.Calendar deactivationDatetime) {
        this.deactivationDatetime = deactivationDatetime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Subscription)) return false;
        Subscription other = (Subscription) obj;
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
            ((this.operatorSubscriptionId==null && other.getOperatorSubscriptionId()==null) || 
             (this.operatorSubscriptionId!=null &&
              this.operatorSubscriptionId.equals(other.getOperatorSubscriptionId()))) &&
            ((this.irisSubscriberId==null && other.getIrisSubscriberId()==null) || 
             (this.irisSubscriberId!=null &&
              this.irisSubscriberId.equals(other.getIrisSubscriberId()))) &&
            ((this.irisUserId==null && other.getIrisUserId()==null) || 
             (this.irisUserId!=null &&
              this.irisUserId.equals(other.getIrisUserId()))) &&
            ((this.operatorSubscriberId==null && other.getOperatorSubscriberId()==null) || 
             (this.operatorSubscriberId!=null &&
              this.operatorSubscriberId.equals(other.getOperatorSubscriberId()))) &&
            ((this.irisHardwareId==null && other.getIrisHardwareId()==null) || 
             (this.irisHardwareId!=null &&
              this.irisHardwareId.equals(other.getIrisHardwareId()))) &&
            ((this.hardwareId==null && other.getHardwareId()==null) || 
             (this.hardwareId!=null &&
              this.hardwareId.equals(other.getHardwareId()))) &&
            ((this.irisPackageId==null && other.getIrisPackageId()==null) || 
             (this.irisPackageId!=null &&
              this.irisPackageId.equals(other.getIrisPackageId()))) &&
            ((this.packageName==null && other.getPackageName()==null) || 
             (this.packageName!=null &&
              this.packageName.equals(other.getPackageName()))) &&
            ((this.conditionalAccessId==null && other.getConditionalAccessId()==null) || 
             (this.conditionalAccessId!=null &&
              this.conditionalAccessId.equals(other.getConditionalAccessId()))) &&
            ((this.creationDatetime==null && other.getCreationDatetime()==null) || 
             (this.creationDatetime!=null &&
              this.creationDatetime.equals(other.getCreationDatetime()))) &&
            ((this.deactivationDatetime==null && other.getDeactivationDatetime()==null) || 
             (this.deactivationDatetime!=null &&
              this.deactivationDatetime.equals(other.getDeactivationDatetime())));
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
        if (getOperatorSubscriptionId() != null) {
            _hashCode += getOperatorSubscriptionId().hashCode();
        }
        if (getIrisSubscriberId() != null) {
            _hashCode += getIrisSubscriberId().hashCode();
        }
        if (getIrisUserId() != null) {
            _hashCode += getIrisUserId().hashCode();
        }
        if (getOperatorSubscriberId() != null) {
            _hashCode += getOperatorSubscriberId().hashCode();
        }
        if (getIrisHardwareId() != null) {
            _hashCode += getIrisHardwareId().hashCode();
        }
        if (getHardwareId() != null) {
            _hashCode += getHardwareId().hashCode();
        }
        if (getIrisPackageId() != null) {
            _hashCode += getIrisPackageId().hashCode();
        }
        if (getPackageName() != null) {
            _hashCode += getPackageName().hashCode();
        }
        if (getConditionalAccessId() != null) {
            _hashCode += getConditionalAccessId().hashCode();
        }
        if (getCreationDatetime() != null) {
            _hashCode += getCreationDatetime().hashCode();
        }
        if (getDeactivationDatetime() != null) {
            _hashCode += getDeactivationDatetime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Subscription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "Subscription"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("irisId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "IrisId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorSubscriptionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "OperatorSubscriptionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("irisSubscriberId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "IrisSubscriberId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("irisUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "IrisUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorSubscriberId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "OperatorSubscriberId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "OperatorSubscriberId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("irisHardwareId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "IrisHardwareId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hardwareId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "HardwareId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("irisPackageId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "IrisPackageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "PackageName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditionalAccessId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "ConditionalAccessId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDatetime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "CreationDatetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deactivationDatetime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "DeactivationDatetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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

    @Override
    public String toString(){
    	return packageName;
    }
    
}
