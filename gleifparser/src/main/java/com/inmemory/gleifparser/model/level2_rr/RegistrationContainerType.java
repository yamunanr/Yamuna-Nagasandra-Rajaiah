
package com.inmemory.gleifparser.model.level2_rr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RegistrationContainerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistrationContainerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InitialRegistrationDate" type="{http://www.gleif.org/data/schema/rr/2016}LEIDateTimeProfile"/&gt;
 *         &lt;element name="LastUpdateDate" type="{http://www.gleif.org/data/schema/rr/2016}LEIDateTimeProfile"/&gt;
 *         &lt;element name="RegistrationStatus" type="{http://www.gleif.org/data/schema/rr/2016}RegistrationStatusEnum"/&gt;
 *         &lt;element name="NextRenewalDate" type="{http://www.gleif.org/data/schema/rr/2016}LEIDateTimeProfile" minOccurs="0"/&gt;
 *         &lt;element name="ManagingLOU" type="{http://www.gleif.org/data/schema/rr/2016}LEIType"/&gt;
 *         &lt;element name="ValidationSources" type="{http://www.gleif.org/data/schema/rr/2016}ValidationSourcesTypeEnum"/&gt;
 *         &lt;element name="ValidationDocuments" type="{http://www.gleif.org/data/schema/rr/2016}ValidationDocumentsTypeEnum"/&gt;
 *         &lt;element name="ValidationReference" type="{http://www.gleif.org/data/schema/rr/2016}Tokenized500Type" minOccurs="0"/&gt;
 *         &lt;element name="NextVersion" type="{http://www.gleif.org/data/schema/rr/2016}RegistrationNextVersionType" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.gleif.org/data/schema/rr/2016}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrationContainerType", propOrder = {
    "initialRegistrationDate",
    "lastUpdateDate",
    "registrationStatus",
    "nextRenewalDate",
    "managingLOU",
    "validationSources",
    "validationDocuments",
    "validationReference",
    "nextVersion",
    "extension"
})
public class RegistrationContainerType {

    @XmlElement(name = "InitialRegistrationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar initialRegistrationDate;
    @XmlElement(name = "LastUpdateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElement(name = "RegistrationStatus", required = true)
    @XmlSchemaType(name = "string")
    protected RegistrationStatusEnum registrationStatus;
    @XmlElement(name = "NextRenewalDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextRenewalDate;
    @XmlElement(name = "ManagingLOU", required = true)
    protected String managingLOU;
    @XmlElement(name = "ValidationSources", required = true)
    @XmlSchemaType(name = "string")
    protected ValidationSourcesTypeEnum validationSources;
    @XmlElement(name = "ValidationDocuments", required = true)
    @XmlSchemaType(name = "string")
    protected ValidationDocumentsTypeEnum validationDocuments;
    @XmlElement(name = "ValidationReference")
    protected String validationReference;
    @XmlElement(name = "NextVersion")
    protected RegistrationNextVersionType nextVersion;
    @XmlElement(name = "Extension")
    protected ExtensionType extension;

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
     *     {@link ValidationSourcesTypeEnum }
     *     
     */
    public ValidationSourcesTypeEnum getValidationSources() {
        return validationSources;
    }

    /**
     * Sets the value of the validationSources property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationSourcesTypeEnum }
     *     
     */
    public void setValidationSources(ValidationSourcesTypeEnum value) {
        this.validationSources = value;
    }

    /**
     * Gets the value of the validationDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationDocumentsTypeEnum }
     *     
     */
    public ValidationDocumentsTypeEnum getValidationDocuments() {
        return validationDocuments;
    }

    /**
     * Sets the value of the validationDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationDocumentsTypeEnum }
     *     
     */
    public void setValidationDocuments(ValidationDocumentsTypeEnum value) {
        this.validationDocuments = value;
    }

    /**
     * Gets the value of the validationReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationReference() {
        return validationReference;
    }

    /**
     * Sets the value of the validationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationReference(String value) {
        this.validationReference = value;
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

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setExtension(ExtensionType value) {
        this.extension = value;
    }

}
