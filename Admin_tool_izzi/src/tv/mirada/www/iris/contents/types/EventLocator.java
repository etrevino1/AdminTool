/**
 * EventLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.contents.types;

public class EventLocator  implements java.io.Serializable {
    private tv.mirada.www.iris.contents.types.TimeSpan eventTimeSpan;

    private java.lang.String channelName;

    private java.lang.String broadcastServiceExternalRef;

    public EventLocator() {
    }

    public EventLocator(
           tv.mirada.www.iris.contents.types.TimeSpan eventTimeSpan,
           java.lang.String channelName,
           java.lang.String broadcastServiceExternalRef) {
           this.eventTimeSpan = eventTimeSpan;
           this.channelName = channelName;
           this.broadcastServiceExternalRef = broadcastServiceExternalRef;
    }


    /**
     * Gets the eventTimeSpan value for this EventLocator.
     * 
     * @return eventTimeSpan
     */
    public tv.mirada.www.iris.contents.types.TimeSpan getEventTimeSpan() {
        return eventTimeSpan;
    }


    /**
     * Sets the eventTimeSpan value for this EventLocator.
     * 
     * @param eventTimeSpan
     */
    public void setEventTimeSpan(tv.mirada.www.iris.contents.types.TimeSpan eventTimeSpan) {
        this.eventTimeSpan = eventTimeSpan;
    }


    /**
     * Gets the channelName value for this EventLocator.
     * 
     * @return channelName
     */
    public java.lang.String getChannelName() {
        return channelName;
    }


    /**
     * Sets the channelName value for this EventLocator.
     * 
     * @param channelName
     */
    public void setChannelName(java.lang.String channelName) {
        this.channelName = channelName;
    }


    /**
     * Gets the broadcastServiceExternalRef value for this EventLocator.
     * 
     * @return broadcastServiceExternalRef
     */
    public java.lang.String getBroadcastServiceExternalRef() {
        return broadcastServiceExternalRef;
    }


    /**
     * Sets the broadcastServiceExternalRef value for this EventLocator.
     * 
     * @param broadcastServiceExternalRef
     */
    public void setBroadcastServiceExternalRef(java.lang.String broadcastServiceExternalRef) {
        this.broadcastServiceExternalRef = broadcastServiceExternalRef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EventLocator)) return false;
        EventLocator other = (EventLocator) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eventTimeSpan==null && other.getEventTimeSpan()==null) || 
             (this.eventTimeSpan!=null &&
              this.eventTimeSpan.equals(other.getEventTimeSpan()))) &&
            ((this.channelName==null && other.getChannelName()==null) || 
             (this.channelName!=null &&
              this.channelName.equals(other.getChannelName()))) &&
            ((this.broadcastServiceExternalRef==null && other.getBroadcastServiceExternalRef()==null) || 
             (this.broadcastServiceExternalRef!=null &&
              this.broadcastServiceExternalRef.equals(other.getBroadcastServiceExternalRef())));
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
        if (getEventTimeSpan() != null) {
            _hashCode += getEventTimeSpan().hashCode();
        }
        if (getChannelName() != null) {
            _hashCode += getChannelName().hashCode();
        }
        if (getBroadcastServiceExternalRef() != null) {
            _hashCode += getBroadcastServiceExternalRef().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EventLocator.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "EventLocator"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventTimeSpan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "EventTimeSpan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "TimeSpan"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "ChannelName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("broadcastServiceExternalRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "BroadcastServiceExternalRef"));
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
