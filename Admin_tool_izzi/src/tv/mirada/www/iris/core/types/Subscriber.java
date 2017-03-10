/**
 * Subscriber.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.types;

public class Subscriber  implements java.io.Serializable {
    private java.lang.Long irisId;

    private tv.mirada.www.iris.core.types.OperatorSubscriberId operatorSubscriberId;

    private java.lang.String password;

    private java.lang.String parentalControlPin;

    private java.lang.String purchasePin;

    private java.util.Calendar creationDatetime;

    private java.util.Calendar deactivationDatetime;

    private java.lang.String title;

    private java.lang.String firstName;

    private java.lang.String lastName;

    private java.lang.String nickname;

    private tv.mirada.www.iris.core.types.Gender gender;

    private java.lang.String usage;

    private tv.mirada.www.iris.core.types.MaritalStatus maritalStatus;

    private java.util.Date birthdate;

    private java.lang.String email;

    private java.lang.String mobilePhone;

    private tv.mirada.www.iris.core.types.Address address;

    private java.lang.String parentalControl;

    private java.lang.String socioeconomicStatus;

    private java.lang.String educationalLevel;

    private tv.mirada.www.iris.core.types.Profile profile;

    private java.lang.String regionName;

    private java.lang.String regionCode;

    private java.math.BigInteger OTTMaxDevices;

    private java.math.BigInteger OTTCooldown;

    private java.lang.Boolean VIP;

    public Subscriber() {
    }

    public Subscriber(
           java.lang.Long irisId,
           tv.mirada.www.iris.core.types.OperatorSubscriberId operatorSubscriberId,
           java.lang.String password,
           java.lang.String parentalControlPin,
           java.lang.String purchasePin,
           java.util.Calendar creationDatetime,
           java.util.Calendar deactivationDatetime,
           java.lang.String title,
           java.lang.String firstName,
           java.lang.String lastName,
           java.lang.String nickname,
           tv.mirada.www.iris.core.types.Gender gender,
           java.lang.String usage,
           tv.mirada.www.iris.core.types.MaritalStatus maritalStatus,
           java.util.Date birthdate,
           java.lang.String email,
           java.lang.String mobilePhone,
           tv.mirada.www.iris.core.types.Address address,
           java.lang.String parentalControl,
           java.lang.String socioeconomicStatus,
           java.lang.String educationalLevel,
           tv.mirada.www.iris.core.types.Profile profile,
           java.lang.String regionName,
           java.lang.String regionCode,
           java.math.BigInteger OTTMaxDevices,
           java.math.BigInteger OTTCooldown,
           java.lang.Boolean VIP) {
           this.irisId = irisId;
           this.operatorSubscriberId = operatorSubscriberId;
           this.password = password;
           this.parentalControlPin = parentalControlPin;
           this.purchasePin = purchasePin;
           this.creationDatetime = creationDatetime;
           this.deactivationDatetime = deactivationDatetime;
           this.title = title;
           this.firstName = firstName;
           this.lastName = lastName;
           this.nickname = nickname;
           this.gender = gender;
           this.usage = usage;
           this.maritalStatus = maritalStatus;
           this.birthdate = birthdate;
           this.email = email;
           this.mobilePhone = mobilePhone;
           this.address = address;
           this.parentalControl = parentalControl;
           this.socioeconomicStatus = socioeconomicStatus;
           this.educationalLevel = educationalLevel;
           this.profile = profile;
           this.regionName = regionName;
           this.regionCode = regionCode;
           this.OTTMaxDevices = OTTMaxDevices;
           this.OTTCooldown = OTTCooldown;
           this.VIP = VIP;
    }


    /**
     * Gets the irisId value for this Subscriber.
     * 
     * @return irisId
     */
    public java.lang.Long getIrisId() {
        return irisId;
    }


    /**
     * Sets the irisId value for this Subscriber.
     * 
     * @param irisId
     */
    public void setIrisId(java.lang.Long irisId) {
        this.irisId = irisId;
    }


    /**
     * Gets the operatorSubscriberId value for this Subscriber.
     * 
     * @return operatorSubscriberId
     */
    public tv.mirada.www.iris.core.types.OperatorSubscriberId getOperatorSubscriberId() {
        return operatorSubscriberId;
    }


    /**
     * Sets the operatorSubscriberId value for this Subscriber.
     * 
     * @param operatorSubscriberId
     */
    public void setOperatorSubscriberId(tv.mirada.www.iris.core.types.OperatorSubscriberId operatorSubscriberId) {
        this.operatorSubscriberId = operatorSubscriberId;
    }


    /**
     * Gets the password value for this Subscriber.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this Subscriber.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the parentalControlPin value for this Subscriber.
     * 
     * @return parentalControlPin
     */
    public java.lang.String getParentalControlPin() {
        return parentalControlPin;
    }


    /**
     * Sets the parentalControlPin value for this Subscriber.
     * 
     * @param parentalControlPin
     */
    public void setParentalControlPin(java.lang.String parentalControlPin) {
        this.parentalControlPin = parentalControlPin;
    }


    /**
     * Gets the purchasePin value for this Subscriber.
     * 
     * @return purchasePin
     */
    public java.lang.String getPurchasePin() {
        return purchasePin;
    }


    /**
     * Sets the purchasePin value for this Subscriber.
     * 
     * @param purchasePin
     */
    public void setPurchasePin(java.lang.String purchasePin) {
        this.purchasePin = purchasePin;
    }


    /**
     * Gets the creationDatetime value for this Subscriber.
     * 
     * @return creationDatetime
     */
    public java.util.Calendar getCreationDatetime() {
        return creationDatetime;
    }


    /**
     * Sets the creationDatetime value for this Subscriber.
     * 
     * @param creationDatetime
     */
    public void setCreationDatetime(java.util.Calendar creationDatetime) {
        this.creationDatetime = creationDatetime;
    }


    /**
     * Gets the deactivationDatetime value for this Subscriber.
     * 
     * @return deactivationDatetime
     */
    public java.util.Calendar getDeactivationDatetime() {
        return deactivationDatetime;
    }


    /**
     * Sets the deactivationDatetime value for this Subscriber.
     * 
     * @param deactivationDatetime
     */
    public void setDeactivationDatetime(java.util.Calendar deactivationDatetime) {
        this.deactivationDatetime = deactivationDatetime;
    }


    /**
     * Gets the title value for this Subscriber.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Subscriber.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the firstName value for this Subscriber.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this Subscriber.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this Subscriber.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this Subscriber.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the nickname value for this Subscriber.
     * 
     * @return nickname
     */
    public java.lang.String getNickname() {
        return nickname;
    }


    /**
     * Sets the nickname value for this Subscriber.
     * 
     * @param nickname
     */
    public void setNickname(java.lang.String nickname) {
        this.nickname = nickname;
    }


    /**
     * Gets the gender value for this Subscriber.
     * 
     * @return gender
     */
    public tv.mirada.www.iris.core.types.Gender getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this Subscriber.
     * 
     * @param gender
     */
    public void setGender(tv.mirada.www.iris.core.types.Gender gender) {
        this.gender = gender;
    }


    /**
     * Gets the usage value for this Subscriber.
     * 
     * @return usage
     */
    public java.lang.String getUsage() {
        return usage;
    }


    /**
     * Sets the usage value for this Subscriber.
     * 
     * @param usage
     */
    public void setUsage(java.lang.String usage) {
        this.usage = usage;
    }


    /**
     * Gets the maritalStatus value for this Subscriber.
     * 
     * @return maritalStatus
     */
    public tv.mirada.www.iris.core.types.MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }


    /**
     * Sets the maritalStatus value for this Subscriber.
     * 
     * @param maritalStatus
     */
    public void setMaritalStatus(tv.mirada.www.iris.core.types.MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }


    /**
     * Gets the birthdate value for this Subscriber.
     * 
     * @return birthdate
     */
    public java.util.Date getBirthdate() {
        return birthdate;
    }


    /**
     * Sets the birthdate value for this Subscriber.
     * 
     * @param birthdate
     */
    public void setBirthdate(java.util.Date birthdate) {
        this.birthdate = birthdate;
    }


    /**
     * Gets the email value for this Subscriber.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Subscriber.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the mobilePhone value for this Subscriber.
     * 
     * @return mobilePhone
     */
    public java.lang.String getMobilePhone() {
        return mobilePhone;
    }


    /**
     * Sets the mobilePhone value for this Subscriber.
     * 
     * @param mobilePhone
     */
    public void setMobilePhone(java.lang.String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }


    /**
     * Gets the address value for this Subscriber.
     * 
     * @return address
     */
    public tv.mirada.www.iris.core.types.Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this Subscriber.
     * 
     * @param address
     */
    public void setAddress(tv.mirada.www.iris.core.types.Address address) {
        this.address = address;
    }


    /**
     * Gets the parentalControl value for this Subscriber.
     * 
     * @return parentalControl
     */
    public java.lang.String getParentalControl() {
        return parentalControl;
    }


    /**
     * Sets the parentalControl value for this Subscriber.
     * 
     * @param parentalControl
     */
    public void setParentalControl(java.lang.String parentalControl) {
        this.parentalControl = parentalControl;
    }


    /**
     * Gets the socioeconomicStatus value for this Subscriber.
     * 
     * @return socioeconomicStatus
     */
    public java.lang.String getSocioeconomicStatus() {
        return socioeconomicStatus;
    }


    /**
     * Sets the socioeconomicStatus value for this Subscriber.
     * 
     * @param socioeconomicStatus
     */
    public void setSocioeconomicStatus(java.lang.String socioeconomicStatus) {
        this.socioeconomicStatus = socioeconomicStatus;
    }


    /**
     * Gets the educationalLevel value for this Subscriber.
     * 
     * @return educationalLevel
     */
    public java.lang.String getEducationalLevel() {
        return educationalLevel;
    }


    /**
     * Sets the educationalLevel value for this Subscriber.
     * 
     * @param educationalLevel
     */
    public void setEducationalLevel(java.lang.String educationalLevel) {
        this.educationalLevel = educationalLevel;
    }


    /**
     * Gets the profile value for this Subscriber.
     * 
     * @return profile
     */
    public tv.mirada.www.iris.core.types.Profile getProfile() {
        return profile;
    }


    /**
     * Sets the profile value for this Subscriber.
     * 
     * @param profile
     */
    public void setProfile(tv.mirada.www.iris.core.types.Profile profile) {
        this.profile = profile;
    }


    /**
     * Gets the regionName value for this Subscriber.
     * 
     * @return regionName
     */
    public java.lang.String getRegionName() {
        return regionName;
    }


    /**
     * Sets the regionName value for this Subscriber.
     * 
     * @param regionName
     */
    public void setRegionName(java.lang.String regionName) {
        this.regionName = regionName;
    }


    /**
     * Gets the regionCode value for this Subscriber.
     * 
     * @return regionCode
     */
    public java.lang.String getRegionCode() {
        return regionCode;
    }


    /**
     * Sets the regionCode value for this Subscriber.
     * 
     * @param regionCode
     */
    public void setRegionCode(java.lang.String regionCode) {
        this.regionCode = regionCode;
    }


    /**
     * Gets the OTTMaxDevices value for this Subscriber.
     * 
     * @return OTTMaxDevices
     */
    public java.math.BigInteger getOTTMaxDevices() {
        return OTTMaxDevices;
    }


    /**
     * Sets the OTTMaxDevices value for this Subscriber.
     * 
     * @param OTTMaxDevices
     */
    public void setOTTMaxDevices(java.math.BigInteger OTTMaxDevices) {
        this.OTTMaxDevices = OTTMaxDevices;
    }


    /**
     * Gets the OTTCooldown value for this Subscriber.
     * 
     * @return OTTCooldown
     */
    public java.math.BigInteger getOTTCooldown() {
        return OTTCooldown;
    }


    /**
     * Sets the OTTCooldown value for this Subscriber.
     * 
     * @param OTTCooldown
     */
    public void setOTTCooldown(java.math.BigInteger OTTCooldown) {
        this.OTTCooldown = OTTCooldown;
    }


    /**
     * Gets the VIP value for this Subscriber.
     * 
     * @return VIP
     */
    public java.lang.Boolean getVIP() {
        return VIP;
    }


    /**
     * Sets the VIP value for this Subscriber.
     * 
     * @param VIP
     */
    public void setVIP(java.lang.Boolean VIP) {
        this.VIP = VIP;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Subscriber)) return false;
        Subscriber other = (Subscriber) obj;
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
            ((this.operatorSubscriberId==null && other.getOperatorSubscriberId()==null) || 
             (this.operatorSubscriberId!=null &&
              this.operatorSubscriberId.equals(other.getOperatorSubscriberId()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.parentalControlPin==null && other.getParentalControlPin()==null) || 
             (this.parentalControlPin!=null &&
              this.parentalControlPin.equals(other.getParentalControlPin()))) &&
            ((this.purchasePin==null && other.getPurchasePin()==null) || 
             (this.purchasePin!=null &&
              this.purchasePin.equals(other.getPurchasePin()))) &&
            ((this.creationDatetime==null && other.getCreationDatetime()==null) || 
             (this.creationDatetime!=null &&
              this.creationDatetime.equals(other.getCreationDatetime()))) &&
            ((this.deactivationDatetime==null && other.getDeactivationDatetime()==null) || 
             (this.deactivationDatetime!=null &&
              this.deactivationDatetime.equals(other.getDeactivationDatetime()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.nickname==null && other.getNickname()==null) || 
             (this.nickname!=null &&
              this.nickname.equals(other.getNickname()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.usage==null && other.getUsage()==null) || 
             (this.usage!=null &&
              this.usage.equals(other.getUsage()))) &&
            ((this.maritalStatus==null && other.getMaritalStatus()==null) || 
             (this.maritalStatus!=null &&
              this.maritalStatus.equals(other.getMaritalStatus()))) &&
            ((this.birthdate==null && other.getBirthdate()==null) || 
             (this.birthdate!=null &&
              this.birthdate.equals(other.getBirthdate()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.mobilePhone==null && other.getMobilePhone()==null) || 
             (this.mobilePhone!=null &&
              this.mobilePhone.equals(other.getMobilePhone()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.parentalControl==null && other.getParentalControl()==null) || 
             (this.parentalControl!=null &&
              this.parentalControl.equals(other.getParentalControl()))) &&
            ((this.socioeconomicStatus==null && other.getSocioeconomicStatus()==null) || 
             (this.socioeconomicStatus!=null &&
              this.socioeconomicStatus.equals(other.getSocioeconomicStatus()))) &&
            ((this.educationalLevel==null && other.getEducationalLevel()==null) || 
             (this.educationalLevel!=null &&
              this.educationalLevel.equals(other.getEducationalLevel()))) &&
            ((this.profile==null && other.getProfile()==null) || 
             (this.profile!=null &&
              this.profile.equals(other.getProfile()))) &&
            ((this.regionName==null && other.getRegionName()==null) || 
             (this.regionName!=null &&
              this.regionName.equals(other.getRegionName()))) &&
            ((this.regionCode==null && other.getRegionCode()==null) || 
             (this.regionCode!=null &&
              this.regionCode.equals(other.getRegionCode()))) &&
            ((this.OTTMaxDevices==null && other.getOTTMaxDevices()==null) || 
             (this.OTTMaxDevices!=null &&
              this.OTTMaxDevices.equals(other.getOTTMaxDevices()))) &&
            ((this.OTTCooldown==null && other.getOTTCooldown()==null) || 
             (this.OTTCooldown!=null &&
              this.OTTCooldown.equals(other.getOTTCooldown()))) &&
            ((this.VIP==null && other.getVIP()==null) || 
             (this.VIP!=null &&
              this.VIP.equals(other.getVIP())));
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
        if (getOperatorSubscriberId() != null) {
            _hashCode += getOperatorSubscriberId().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getParentalControlPin() != null) {
            _hashCode += getParentalControlPin().hashCode();
        }
        if (getPurchasePin() != null) {
            _hashCode += getPurchasePin().hashCode();
        }
        if (getCreationDatetime() != null) {
            _hashCode += getCreationDatetime().hashCode();
        }
        if (getDeactivationDatetime() != null) {
            _hashCode += getDeactivationDatetime().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getNickname() != null) {
            _hashCode += getNickname().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getUsage() != null) {
            _hashCode += getUsage().hashCode();
        }
        if (getMaritalStatus() != null) {
            _hashCode += getMaritalStatus().hashCode();
        }
        if (getBirthdate() != null) {
            _hashCode += getBirthdate().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getMobilePhone() != null) {
            _hashCode += getMobilePhone().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getParentalControl() != null) {
            _hashCode += getParentalControl().hashCode();
        }
        if (getSocioeconomicStatus() != null) {
            _hashCode += getSocioeconomicStatus().hashCode();
        }
        if (getEducationalLevel() != null) {
            _hashCode += getEducationalLevel().hashCode();
        }
        if (getProfile() != null) {
            _hashCode += getProfile().hashCode();
        }
        if (getRegionName() != null) {
            _hashCode += getRegionName().hashCode();
        }
        if (getRegionCode() != null) {
            _hashCode += getRegionCode().hashCode();
        }
        if (getOTTMaxDevices() != null) {
            _hashCode += getOTTMaxDevices().hashCode();
        }
        if (getOTTCooldown() != null) {
            _hashCode += getOTTCooldown().hashCode();
        }
        if (getVIP() != null) {
            _hashCode += getVIP().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Subscriber.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "Subscriber"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("irisId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "IrisId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorSubscriberId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "OperatorSubscriberId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "OperatorSubscriberId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "Password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentalControlPin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "ParentalControlPin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchasePin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "PurchasePin"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "FirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "LastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nickname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "Nickname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "Gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "Gender"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "Usage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maritalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "MaritalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "MaritalStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthdate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "Birthdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobilePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "MobilePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentalControl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "ParentalControl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("socioeconomicStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "SocioeconomicStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("educationalLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "EducationalLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "Profile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "Profile"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OTTMaxDevices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "OTTMaxDevices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OTTCooldown");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "OTTCooldown"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VIP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "VIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
    	return nickname;
    }

}
