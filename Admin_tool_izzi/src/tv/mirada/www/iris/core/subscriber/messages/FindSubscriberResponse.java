/**
 * FindSubscriberResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.subscriber.messages;

public class FindSubscriberResponse  implements java.io.Serializable {
    private tv.mirada.www.iris.core.types.Subscriber subscriber;

    public FindSubscriberResponse() {
    }

    public FindSubscriberResponse(
           tv.mirada.www.iris.core.types.Subscriber subscriber) {
           this.subscriber = subscriber;
    }


    /**
     * Gets the subscriber value for this FindSubscriberResponse.
     * 
     * @return subscriber
     */
    public tv.mirada.www.iris.core.types.Subscriber getSubscriber() {
        return subscriber;
    }


    /**
     * Sets the subscriber value for this FindSubscriberResponse.
     * 
     * @param subscriber
     */
    public void setSubscriber(tv.mirada.www.iris.core.types.Subscriber subscriber) {
        this.subscriber = subscriber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FindSubscriberResponse)) return false;
        FindSubscriberResponse other = (FindSubscriberResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscriber==null && other.getSubscriber()==null) || 
             (this.subscriber!=null &&
              this.subscriber.equals(other.getSubscriber())));
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
        if (getSubscriber() != null) {
            _hashCode += getSubscriber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FindSubscriberResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/subscriber/messages", ">FindSubscriberResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/subscriber/messages", "Subscriber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "Subscriber"));
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
