/**
 * EventId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.contents.types;

public class EventId  implements java.io.Serializable {
    private java.lang.Long irisId;

    private java.lang.String eventExternalRef;

    private tv.mirada.www.iris.contents.types.EventLocator eventLocator;

    public EventId() {
    }

    public EventId(
           java.lang.Long irisId,
           java.lang.String eventExternalRef,
           tv.mirada.www.iris.contents.types.EventLocator eventLocator) {
           this.irisId = irisId;
           this.eventExternalRef = eventExternalRef;
           this.eventLocator = eventLocator;
    }


    /**
     * Gets the irisId value for this EventId.
     * 
     * @return irisId
     */
    public java.lang.Long getIrisId() {
        return irisId;
    }


    /**
     * Sets the irisId value for this EventId.
     * 
     * @param irisId
     */
    public void setIrisId(java.lang.Long irisId) {
        this.irisId = irisId;
    }


    /**
     * Gets the eventExternalRef value for this EventId.
     * 
     * @return eventExternalRef
     */
    public java.lang.String getEventExternalRef() {
        return eventExternalRef;
    }


    /**
     * Sets the eventExternalRef value for this EventId.
     * 
     * @param eventExternalRef
     */
    public void setEventExternalRef(java.lang.String eventExternalRef) {
        this.eventExternalRef = eventExternalRef;
    }


    /**
     * Gets the eventLocator value for this EventId.
     * 
     * @return eventLocator
     */
    public tv.mirada.www.iris.contents.types.EventLocator getEventLocator() {
        return eventLocator;
    }


    /**
     * Sets the eventLocator value for this EventId.
     * 
     * @param eventLocator
     */
    public void setEventLocator(tv.mirada.www.iris.contents.types.EventLocator eventLocator) {
        this.eventLocator = eventLocator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EventId)) return false;
        EventId other = (EventId) obj;
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
            ((this.eventExternalRef==null && other.getEventExternalRef()==null) || 
             (this.eventExternalRef!=null &&
              this.eventExternalRef.equals(other.getEventExternalRef()))) &&
            ((this.eventLocator==null && other.getEventLocator()==null) || 
             (this.eventLocator!=null &&
              this.eventLocator.equals(other.getEventLocator())));
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
        if (getEventExternalRef() != null) {
            _hashCode += getEventExternalRef().hashCode();
        }
        if (getEventLocator() != null) {
            _hashCode += getEventLocator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EventId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "EventId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("irisId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "IrisId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventExternalRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "EventExternalRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventLocator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "EventLocator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "EventLocator"));
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
