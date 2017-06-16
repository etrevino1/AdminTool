/**
 * CustomerPremisesEquipment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.types;

public class CustomerPremisesEquipment  implements java.io.Serializable {
    private java.lang.Long irisId;

    private java.lang.String hardwareId;

    private java.lang.Long irisSubscriberId;

    private java.lang.Long irisUserId;

    private tv.mirada.www.iris.core.types.OperatorSubscriberId operatorId;

    private java.lang.String type;

    private java.util.Calendar creationDatetime;

    private java.util.Calendar removalDate;

    private java.lang.String regionName;

    private java.lang.String regionCode;

    public CustomerPremisesEquipment() {
    }

    public CustomerPremisesEquipment(
           java.lang.Long irisId,
           java.lang.String hardwareId,
           java.lang.Long irisSubscriberId,
           java.lang.Long irisUserId,
           tv.mirada.www.iris.core.types.OperatorSubscriberId operatorId,
           java.lang.String type,
           java.util.Calendar creationDatetime,
           java.util.Calendar removalDate,
           java.lang.String regionName,
           java.lang.String regionCode) {
           this.irisId = irisId;
           this.hardwareId = hardwareId;
           this.irisSubscriberId = irisSubscriberId;
           this.irisUserId = irisUserId;
           this.operatorId = operatorId;
           this.type = type;
           this.creationDatetime = creationDatetime;
           this.removalDate = removalDate;
           this.regionName = regionName;
           this.regionCode = regionCode;
    }


    /**
     * Gets the irisId value for this CustomerPremisesEquipment.
     * 
     * @return irisId
     */
    public java.lang.Long getIrisId() {
        return irisId;
    }


    /**
     * Sets the irisId value for this CustomerPremisesEquipment.
     * 
     * @param irisId
     */
    public void setIrisId(java.lang.Long irisId) {
        this.irisId = irisId;
    }


    /**
     * Gets the hardwareId value for this CustomerPremisesEquipment.
     * 
     * @return hardwareId
     */
    public java.lang.String getHardwareId() {
        return hardwareId;
    }


    /**
     * Sets the hardwareId value for this CustomerPremisesEquipment.
     * 
     * @param hardwareId
     */
    public void setHardwareId(java.lang.String hardwareId) {
        this.hardwareId = hardwareId;
    }


    /**
     * Gets the irisSubscriberId value for this CustomerPremisesEquipment.
     * 
     * @return irisSubscriberId
     */
    public java.lang.Long getIrisSubscriberId() {
        return irisSubscriberId;
    }


    /**
     * Sets the irisSubscriberId value for this CustomerPremisesEquipment.
     * 
     * @param irisSubscriberId
     */
    public void setIrisSubscriberId(java.lang.Long irisSubscriberId) {
        this.irisSubscriberId = irisSubscriberId;
    }


    /**
     * Gets the irisUserId value for this CustomerPremisesEquipment.
     * 
     * @return irisUserId
     */
    public java.lang.Long getIrisUserId() {
        return irisUserId;
    }


    /**
     * Sets the irisUserId value for this CustomerPremisesEquipment.
     * 
     * @param irisUserId
     */
    public void setIrisUserId(java.lang.Long irisUserId) {
        this.irisUserId = irisUserId;
    }


    /**
     * Gets the operatorId value for this CustomerPremisesEquipment.
     * 
     * @return operatorId
     */
    public tv.mirada.www.iris.core.types.OperatorSubscriberId getOperatorId() {
        return operatorId;
    }


    /**
     * Sets the operatorId value for this CustomerPremisesEquipment.
     * 
     * @param operatorId
     */
    public void setOperatorId(tv.mirada.www.iris.core.types.OperatorSubscriberId operatorId) {
        this.operatorId = operatorId;
    }


    /**
     * Gets the type value for this CustomerPremisesEquipment.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this CustomerPremisesEquipment.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the creationDatetime value for this CustomerPremisesEquipment.
     * 
     * @return creationDatetime
     */
    public java.util.Calendar getCreationDatetime() {
        return creationDatetime;
    }


    /**
     * Sets the creationDatetime value for this CustomerPremisesEquipment.
     * 
     * @param creationDatetime
     */
    public void setCreationDatetime(java.util.Calendar creationDatetime) {
        this.creationDatetime = creationDatetime;
    }


    /**
     * Gets the removalDate value for this CustomerPremisesEquipment.
     * 
     * @return removalDate
     */
    public java.util.Calendar getRemovalDate() {
        return removalDate;
    }


    /**
     * Sets the removalDate value for this CustomerPremisesEquipment.
     * 
     * @param removalDate
     */
    public void setRemovalDate(java.util.Calendar removalDate) {
        this.removalDate = removalDate;
    }


    /**
     * Gets the regionName value for this CustomerPremisesEquipment.
     * 
     * @return regionName
     */
    public java.lang.String getRegionName() {
        return regionName;
    }


    /**
     * Sets the regionName value for this CustomerPremisesEquipment.
     * 
     * @param regionName
     */
    public void setRegionName(java.lang.String regionName) {
        this.regionName = regionName;
    }


    /**
     * Gets the regionCode value for this CustomerPremisesEquipment.
     * 
     * @return regionCode
     */
    public java.lang.String getRegionCode() {
        return regionCode;
    }


    /**
     * Sets the regionCode value for this CustomerPremisesEquipment.
     * 
     * @param regionCode
     */
    public void setRegionCode(java.lang.String regionCode) {
        this.regionCode = regionCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerPremisesEquipment)) return false;
        CustomerPremisesEquipment other = (CustomerPremisesEquipment) obj;
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
            ((this.hardwareId==null && other.getHardwareId()==null) || 
             (this.hardwareId!=null &&
              this.hardwareId.equals(other.getHardwareId()))) &&
            ((this.irisSubscriberId==null && other.getIrisSubscriberId()==null) || 
             (this.irisSubscriberId!=null &&
              this.irisSubscriberId.equals(other.getIrisSubscriberId()))) &&
            ((this.irisUserId==null && other.getIrisUserId()==null) || 
             (this.irisUserId!=null &&
              this.irisUserId.equals(other.getIrisUserId()))) &&
            ((this.operatorId==null && other.getOperatorId()==null) || 
             (this.operatorId!=null &&
              this.operatorId.equals(other.getOperatorId()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.creationDatetime==null && other.getCreationDatetime()==null) || 
             (this.creationDatetime!=null &&
              this.creationDatetime.equals(other.getCreationDatetime()))) &&
            ((this.removalDate==null && other.getRemovalDate()==null) || 
             (this.removalDate!=null &&
              this.removalDate.equals(other.getRemovalDate()))) &&
            ((this.regionName==null && other.getRegionName()==null) || 
             (this.regionName!=null &&
              this.regionName.equals(other.getRegionName()))) &&
            ((this.regionCode==null && other.getRegionCode()==null) || 
             (this.regionCode!=null &&
              this.regionCode.equals(other.getRegionCode())));
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
        if (getHardwareId() != null) {
            _hashCode += getHardwareId().hashCode();
        }
        if (getIrisSubscriberId() != null) {
            _hashCode += getIrisSubscriberId().hashCode();
        }
        if (getIrisUserId() != null) {
            _hashCode += getIrisUserId().hashCode();
        }
        if (getOperatorId() != null) {
            _hashCode += getOperatorId().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getCreationDatetime() != null) {
            _hashCode += getCreationDatetime().hashCode();
        }
        if (getRemovalDate() != null) {
            _hashCode += getRemovalDate().hashCode();
        }
        if (getRegionName() != null) {
            _hashCode += getRegionName().hashCode();
        }
        if (getRegionCode() != null) {
            _hashCode += getRegionCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerPremisesEquipment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "CustomerPremisesEquipment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("irisId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "IrisId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hardwareId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "HardwareId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("operatorId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "OperatorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "OperatorSubscriberId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDatetime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "CreationDatetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removalDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "RemovalDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "RegionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "RegionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
