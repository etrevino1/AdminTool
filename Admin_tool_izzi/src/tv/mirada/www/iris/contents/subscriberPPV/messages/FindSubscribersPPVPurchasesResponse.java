/**
 * FindSubscribersPPVPurchasesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.contents.subscriberPPV.messages;

public class FindSubscribersPPVPurchasesResponse  implements java.io.Serializable {
    private tv.mirada.www.iris.contents.types.PPVPurchase PPVPurchase;

    public FindSubscribersPPVPurchasesResponse() {
    }

    public FindSubscribersPPVPurchasesResponse(
           tv.mirada.www.iris.contents.types.PPVPurchase PPVPurchase) {
           this.PPVPurchase = PPVPurchase;
    }


    /**
     * Gets the PPVPurchase value for this FindSubscribersPPVPurchasesResponse.
     * 
     * @return PPVPurchase
     */
    public tv.mirada.www.iris.contents.types.PPVPurchase getPPVPurchase() {
        return PPVPurchase;
    }


    /**
     * Sets the PPVPurchase value for this FindSubscribersPPVPurchasesResponse.
     * 
     * @param PPVPurchase
     */
    public void setPPVPurchase(tv.mirada.www.iris.contents.types.PPVPurchase PPVPurchase) {
        this.PPVPurchase = PPVPurchase;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FindSubscribersPPVPurchasesResponse)) return false;
        FindSubscribersPPVPurchasesResponse other = (FindSubscribersPPVPurchasesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PPVPurchase==null && other.getPPVPurchase()==null) || 
             (this.PPVPurchase!=null &&
              this.PPVPurchase.equals(other.getPPVPurchase())));
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
        if (getPPVPurchase() != null) {
            _hashCode += getPPVPurchase().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FindSubscribersPPVPurchasesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/subscriberPPV/messages", ">FindSubscribersPPVPurchasesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PPVPurchase");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/subscriberPPV/messages", "PPVPurchase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "PPVPurchase"));
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
