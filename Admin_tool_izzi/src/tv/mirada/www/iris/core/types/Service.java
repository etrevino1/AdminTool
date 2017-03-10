/**
 * Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.types;

public class Service  implements java.io.Serializable {
    private java.lang.Long irisId;

    private java.lang.String name;

    private java.lang.String description;

    private tv.mirada.www.iris.core.types.ServiceProviderDetails providerDetails;

    private java.util.Calendar creationDatetime;

    private java.util.Calendar deactivationDatetime;

    public Service() {
    }

    public Service(
           java.lang.Long irisId,
           java.lang.String name,
           java.lang.String description,
           tv.mirada.www.iris.core.types.ServiceProviderDetails providerDetails,
           java.util.Calendar creationDatetime,
           java.util.Calendar deactivationDatetime) {
           this.irisId = irisId;
           this.name = name;
           this.description = description;
           this.providerDetails = providerDetails;
           this.creationDatetime = creationDatetime;
           this.deactivationDatetime = deactivationDatetime;
    }


    /**
     * Gets the irisId value for this Service.
     * 
     * @return irisId
     */
    public java.lang.Long getIrisId() {
        return irisId;
    }


    /**
     * Sets the irisId value for this Service.
     * 
     * @param irisId
     */
    public void setIrisId(java.lang.Long irisId) {
        this.irisId = irisId;
    }


    /**
     * Gets the name value for this Service.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Service.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this Service.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Service.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the providerDetails value for this Service.
     * 
     * @return providerDetails
     */
    public tv.mirada.www.iris.core.types.ServiceProviderDetails getProviderDetails() {
        return providerDetails;
    }


    /**
     * Sets the providerDetails value for this Service.
     * 
     * @param providerDetails
     */
    public void setProviderDetails(tv.mirada.www.iris.core.types.ServiceProviderDetails providerDetails) {
        this.providerDetails = providerDetails;
    }


    /**
     * Gets the creationDatetime value for this Service.
     * 
     * @return creationDatetime
     */
    public java.util.Calendar getCreationDatetime() {
        return creationDatetime;
    }


    /**
     * Sets the creationDatetime value for this Service.
     * 
     * @param creationDatetime
     */
    public void setCreationDatetime(java.util.Calendar creationDatetime) {
        this.creationDatetime = creationDatetime;
    }


    /**
     * Gets the deactivationDatetime value for this Service.
     * 
     * @return deactivationDatetime
     */
    public java.util.Calendar getDeactivationDatetime() {
        return deactivationDatetime;
    }


    /**
     * Sets the deactivationDatetime value for this Service.
     * 
     * @param deactivationDatetime
     */
    public void setDeactivationDatetime(java.util.Calendar deactivationDatetime) {
        this.deactivationDatetime = deactivationDatetime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Service)) return false;
        Service other = (Service) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.providerDetails==null && other.getProviderDetails()==null) || 
             (this.providerDetails!=null &&
              this.providerDetails.equals(other.getProviderDetails()))) &&
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getProviderDetails() != null) {
            _hashCode += getProviderDetails().hashCode();
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
        new org.apache.axis.description.TypeDesc(Service.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "Service"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("irisId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "IrisId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "ProviderDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "ServiceProviderDetails"));
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

    public String toString(){
    	return irisId + ":" + name;
    }
    
}
