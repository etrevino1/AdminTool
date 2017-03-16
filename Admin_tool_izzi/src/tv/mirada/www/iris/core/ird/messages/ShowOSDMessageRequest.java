/**
 * ShowOSDMessageRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.ird.messages;

public class ShowOSDMessageRequest  implements java.io.Serializable {
    private java.lang.String hardwareId;

    private java.lang.Boolean blocking;

    private java.lang.Short timeout;

    private tv.mirada.www.iris.core.ird.messages.Message[] message;

    public ShowOSDMessageRequest() {
    }

    public ShowOSDMessageRequest(
           java.lang.String hardwareId,
           java.lang.Boolean blocking,
           java.lang.Short timeout,
           tv.mirada.www.iris.core.ird.messages.Message[] message) {
           this.hardwareId = hardwareId;
           this.blocking = blocking;
           this.timeout = timeout;
           this.message = message;
    }


    /**
     * Gets the hardwareId value for this ShowOSDMessageRequest.
     * 
     * @return hardwareId
     */
    public java.lang.String getHardwareId() {
        return hardwareId;
    }


    /**
     * Sets the hardwareId value for this ShowOSDMessageRequest.
     * 
     * @param hardwareId
     */
    public void setHardwareId(java.lang.String hardwareId) {
        this.hardwareId = hardwareId;
    }


    /**
     * Gets the blocking value for this ShowOSDMessageRequest.
     * 
     * @return blocking
     */
    public java.lang.Boolean getBlocking() {
        return blocking;
    }


    /**
     * Sets the blocking value for this ShowOSDMessageRequest.
     * 
     * @param blocking
     */
    public void setBlocking(java.lang.Boolean blocking) {
        this.blocking = blocking;
    }


    /**
     * Gets the timeout value for this ShowOSDMessageRequest.
     * 
     * @return timeout
     */
    public java.lang.Short getTimeout() {
        return timeout;
    }


    /**
     * Sets the timeout value for this ShowOSDMessageRequest.
     * 
     * @param timeout
     */
    public void setTimeout(java.lang.Short timeout) {
        this.timeout = timeout;
    }


    /**
     * Gets the message value for this ShowOSDMessageRequest.
     * 
     * @return message
     */
    public tv.mirada.www.iris.core.ird.messages.Message[] getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ShowOSDMessageRequest.
     * 
     * @param message
     */
    public void setMessage(tv.mirada.www.iris.core.ird.messages.Message[] message) {
        this.message = message;
    }

    public tv.mirada.www.iris.core.ird.messages.Message getMessage(int i) {
        return this.message[i];
    }

    public void setMessage(int i, tv.mirada.www.iris.core.ird.messages.Message _value) {
        this.message[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShowOSDMessageRequest)) return false;
        ShowOSDMessageRequest other = (ShowOSDMessageRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hardwareId==null && other.getHardwareId()==null) || 
             (this.hardwareId!=null &&
              this.hardwareId.equals(other.getHardwareId()))) &&
            ((this.blocking==null && other.getBlocking()==null) || 
             (this.blocking!=null &&
              this.blocking.equals(other.getBlocking()))) &&
            ((this.timeout==null && other.getTimeout()==null) || 
             (this.timeout!=null &&
              this.timeout.equals(other.getTimeout()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              java.util.Arrays.equals(this.message, other.getMessage())));
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
        if (getHardwareId() != null) {
            _hashCode += getHardwareId().hashCode();
        }
        if (getBlocking() != null) {
            _hashCode += getBlocking().hashCode();
        }
        if (getTimeout() != null) {
            _hashCode += getTimeout().hashCode();
        }
        if (getMessage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMessage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMessage(), i);
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
        new org.apache.axis.description.TypeDesc(ShowOSDMessageRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/ird/messages", ">ShowOSDMessageRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hardwareId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/ird/messages", "HardwareId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blocking");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/ird/messages", "Blocking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeout");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/ird/messages", "Timeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/ird/messages", "Message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/ird/messages", "Message"));
        elemField.setMinOccurs(0);
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

    public String toString(){
    	return "{" + message[0] + ", " + hardwareId + "}";
    }
    
}
