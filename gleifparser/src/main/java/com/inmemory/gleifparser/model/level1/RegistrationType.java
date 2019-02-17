
package com.inmemory.gleifparser.model.level1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RegistrationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistrationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InitialRegistrationDate" type="{http://www.gleif.org/data/schema/leidata/2016}LEIDateTimeProfile"/&gt;
 *         &lt;element name="LastUpdateDate" type="{http://www.gleif.org/data/schema/leidata/2016}LEIDateTimeProfile"/&gt;
 *         &lt;element name="RegistrationStatus" type="{http://www.gleif.org/data/schema/leidata/2016}RegistrationStatusEnum"/&gt;
 *         &lt;element name="NextRenewalDate" type="{http://www.gleif.org/data/schema/leidata/2016}LEIDateTimeProfile"/&gt;
 *         &lt;element name="ManagingLOU" type="{http://www.gleif.org/data/schema/leidata/2016}LEIType"/&gt;
 *         &lt;element name="ValidationSources" type="{http://www.gleif.org/data/schema/leidata/2016}ValidationSourcesEnum" minOccurs="0"/&gt;
 *         &lt;element name="ValidationAuthority" type="{http://www.gleif.org/data/schema/leidata/2016}ValidationAuthorityType" minOccurs="0"/&gt;
 *         &lt;element name="OtherValidationAuthorities" type="{http://www.gleif.org/data/schema/leidata/2016}OtherValidationAuthoritiesType" minOccurs="0"/&gt;
 *         &lt;element name="NextVersion" type="{http://www.gleif.org/data/schema/leidata/2016}RegistrationNextVersionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrationType", propOrder = {
    "initialRegistrationDate",
    "lastUpdateDate",
    "registrationStatus",
    "nextRenewalDate",
    "managingLOU",
    "validationSources",
    "validationAuthority",
    "otherValidationAuthorities",
    "nextVersion"
})
public class RegistrationType {

    @XmlElement(name = "InitialRegistrationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar initialRegistrationDate;
    @XmlElement(name = "LastUpdateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElement(name = "RegistrationStatus", required = true)
    @XmlSchemaType(name = "string")
    protected RegistrationStatusEnum registrationStatus;
    @XmlElement(name = "NextRenewalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextRenewalDate;
    @XmlElement(name = "ManagingLOU", required = true)
    protected String managingLOU;
    @XmlElement(name = "ValidationSources")
    @XmlSchemaType(name = "string")
    protected ValidationSourcesEnum validationSources;
    @XmlElement(name = "ValidationAuthority")
    protected ValidationAuthorityType validationAuthority;
    @XmlElement(name = "OtherValidationAuthorities")
    protected OtherValidationAuthoritiesType otherValidationAuthorities;
    @XmlElement(name = "NextVersion")
    protected RegistrationNextVersionType nextVersion;

    /**
     * Gets the value of the initialRegistrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInitialRegistrationDate() {
        return initialRegistrationDate;
    }

    /**
     * Sets the value of the initialRegistrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInitialRegistrationDate(XMLGregorianCalendar value) {
        this.initialRegistrationDate = value;
    }

    /**
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateDate(XMLGregorianCalendar value) {
        this.lastUpdateDate = value;
    }

    /**
     * Gets the value of the registrationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationStatusEnum }
     *     
     */
    public RegistrationStatusEnum getRegistrationStatus() {
        return registrationStatus;
    }

    /**
     * Sets the value of the registrationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationStatusEnum }
     *     
     */
    public void setRegistrationStatus(RegistrationStatusEnum value) {
        this.registrationStatus = value;
    }

    /**
     * Gets the value of the nextRenewalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextRenewalDate() {
        return nextRenewalDate;
    }

    /**
     * Sets the value of the nextRenewalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextRenewalDate(XMLGregorianCalendar value) {
        this.nextRenewalDate = value;
    }

    /**
     * Gets the value of the managingLOU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagingLOU() {
        return managingLOU;
    }

    /**
     * Sets the value of the managingLOU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagingLOU(String value) {
        this.managingLOU = value;
    }

    /**
     * Gets the value of the validationSources property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationSourcesEnum }
     *     
     */
    public ValidationSourcesEnum getValidationSources() {
        return validationSources;
    }

    /**
     * Sets the value of the validationSources property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationSourcesEnum }
     *     
     */
    public void setValidationSources(ValidationSourcesEnum value) {
        this.validationSources = value;
    }

    /**
     * Gets the value of the validationAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationAuthorityType }
     *     
     */
    public ValidationAuthorityType getValidationAuthority() {
        return validationAuthority;
    }

    /**
     * Sets the value of the validationAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationAuthorityType }
     *     
     */
    public void setValidationAuthority(ValidationAuthorityType value) {
        this.validationAuthority = value;
    }

    /**
     * Gets the value of the otherValidationAuthorities property.
     * 
     * @return
     *     possible object is
     *     {@link OtherValidationAuthoritiesType }
     *     
     */
    public OtherValidationAuthoritiesType getOtherValidationAuthorities() {
        return otherValidationAuthorities;
    }

    /**
     * Sets the value of the otherValidationAuthorities property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherValidationAuthoritiesType }
     *     
     */
    public void setOtherValidationAuthorities(OtherValidationAuthoritiesType value) {
        this.otherValidationAuthorities = value;
    }

    /**
     * Gets the value of the nextVersion property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationNextVersionType }
     *     
     */
    public RegistrationNextVersionType getNextVersion() {
        return nextVersion;
    }

    /**
     * Sets the value of the nextVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationNextVersionType }
     *     
     */
    public void setNextVersion(RegistrationNextVersionType value) {
        this.nextVersion = value;
    }

}
