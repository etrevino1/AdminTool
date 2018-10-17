/**
 * UpdatePPVProductRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.contents.iPPVProduct.messages;

public class UpdatePPVProductRequest  implements java.io.Serializable {
    private tv.mirada.www.iris.contents.types.PayPerViewProduct PPVProduct;

    public UpdatePPVProductRequest() {
    }

    public UpdatePPVProductRequest(
           tv.mirada.www.iris.contents.types.PayPerViewProduct PPVProduct) {
           this.PPVProduct = PPVProduct;
    }


    /**
     * Gets the PPVProduct value for this UpdatePPVProductRequest.
     * 
     * @return PPVProduct
     */
    public tv.mirada.www.iris.contents.types.PayPerViewProduct getPPVProduct() {
        return PPVProduct;
    }


    /**
     * Sets the PPVProduct value for this UpdatePPVProductRequest.
     * 
     * @param PPVProduct
     */
    public void setPPVProduct(tv.mirada.www.iris.contents.types.PayPerViewProduct PPVProduct) {
        this.PPVProduct = PPVProduct;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdatePPVProductRequest)) return false;
        UpdatePPVProductRequest other = (UpdatePPVProductRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PPVProduct==null && other.getPPVProduct()==null) || 
             (this.PPVProduct!=null &&
              this.PPVProduct.equals(other.getPPVProduct())));
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
        if (getPPVProduct() != null) {
            _hashCode += getPPVProduct().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdatePPVProductRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/iPPVProduct/messages", ">UpdatePPVProductRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PPVProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/iPPVProduct/messages", "PPVProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/contents/types", "PayPerViewProduct"));
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
