
package com.inmemory.gleifparser.model.level1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EntityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LegalName" type="{http://www.gleif.org/data/schema/leidata/2016}NameType"/&gt;
 *         &lt;element name="OtherEntityNames" type="{http://www.gleif.org/data/schema/leidata/2016}OtherEntityNamesType" minOccurs="0"/&gt;
 *         &lt;element name="TransliteratedOtherEntityNames" type="{http://www.gleif.org/data/schema/leidata/2016}TransliteratedOtherEntityNamesType" minOccurs="0"/&gt;
 *         &lt;element name="LegalAddress" type="{http://www.gleif.org/data/schema/leidata/2016}AddressType"/&gt;
 *         &lt;element name="HeadquartersAddress" type="{http://www.gleif.org/data/schema/leidata/2016}AddressType"/&gt;
 *         &lt;element name="OtherAddresses" type="{http://www.gleif.org/data/schema/leidata/2016}OtherAddressesType" minOccurs="0"/&gt;
 *         &lt;element name="TransliteratedOtherAddresses" type="{http://www.gleif.org/data/schema/leidata/2016}TransliteratedOtherAddressesType" minOccurs="0"/&gt;
 *         &lt;element name="RegistrationAuthority" type="{http://www.gleif.org/data/schema/leidata/2016}RegistrationAuthorityType" minOccurs="0"/&gt;
 *         &lt;element name="LegalJurisdiction" type="{http://www.gleif.org/data/schema/leidata/2016}JurisdictionCodeType" minOccurs="0"/&gt;
 *         &lt;element name="EntityCategory" type="{http://www.gleif.org/data/schema/leidata/2016}EntityCategoryTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="LegalForm" type="{http://www.gleif.org/data/schema/leidata/2016}LegalFormType" minOccurs="0"/&gt;
 *         &lt;element name="AssociatedEntity" type="{http://www.gleif.org/data/schema/leidata/2016}AssociatedEntityType" minOccurs="0"/&gt;
 *         &lt;element name="EntityStatus" type="{http://www.gleif.org/data/schema/leidata/2016}EntityStatusEnum"/&gt;
 *         &lt;element name="EntityExpirationDate" type="{http://www.gleif.org/data/schema/leidata/2016}LEIDateTimeProfile" minOccurs="0"/&gt;
 *         &lt;element name="EntityExpirationReason" type="{http://www.gleif.org/data/schema/leidata/2016}EntityExpirationReasonEnum" minOccurs="0"/&gt;
 *         &lt;element name="SuccessorEntity" type="{http://www.gleif.org/data/schema/leidata/2016}SuccessorEntityType" minOccurs="0"/&gt;
 *         &lt;element name="NextVersion" type="{http://www.gleif.org/data/schema/leidata/2016}EntityNextVersionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityType", propOrder = {
    "legalName",
    "otherEntityNames",
    "transliteratedOtherEntityNames",
    "legalAddress",
    "headquartersAddress",
    "otherAddresses",
    "transliteratedOtherAddresses",
    "registrationAuthority",
    "legalJurisdiction",
    "entityCategory",
    "legalForm",
    "associatedEntity",
    "entityStatus",
    "entityExpirationDate",
    "entityExpirationReason",
    "successorEntity",
    "nextVersion"
})
public class EntityType {

    @XmlElement(name = "LegalName", required = true)
    protected NameType legalName;
    @XmlElement(name = "OtherEntityNames")
    protected OtherEntityNamesType otherEntityNames;
    @XmlElement(name = "TransliteratedOtherEntityNames")
    protected TransliteratedOtherEntityNamesType transliteratedOtherEntityNames;
    @XmlElement(name = "LegalAddress", required = true)
    protected AddressType legalAddress;
    @XmlElement(name = "HeadquartersAddress", required = true)
    protected AddressType headquartersAddress;
    @XmlElement(name = "OtherAddresses")
    protected OtherAddressesType otherAddresses;
    @XmlElement(name = "TransliteratedOtherAddresses")
    protected TransliteratedOtherAddressesType transliteratedOtherAddresses;
    @XmlElement(name = "RegistrationAuthority")
    protected RegistrationAuthorityType registrationAuthority;
    @XmlElement(name = "LegalJurisdiction")
    protected String legalJurisdiction;
    @XmlElement(name = "EntityCategory")
    @XmlSchemaType(name = "token")
    protected EntityCategoryTypeEnum entityCategory;
    @XmlElement(name = "LegalForm")
    protected LegalFormType legalForm;
    @XmlElement(name = "AssociatedEntity")
    protected AssociatedEntityType associatedEntity;
    @XmlElement(name = "EntityStatus", required = true)
    @XmlSchemaType(name = "string")
    protected EntityStatusEnum entityStatus;
    @XmlElement(name = "EntityExpirationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar entityExpirationDate;
    @XmlElement(name = "EntityExpirationReason")
    @XmlSchemaType(name = "string")
    protected EntityExpirationReasonEnum entityExpirationReason;
    @XmlElement(name = "SuccessorEntity")
    protected SuccessorEntityType successorEntity;
    @XmlElement(name = "NextVersion")
    protected EntityNextVersionType nextVersion;

    /**
     * Gets the value of the legalName property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getLegalName() {
        return legalName;
    }

    /**
     * Sets the value of the legalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setLegalName(NameType value) {
        this.legalName = value;
    }

    /**
     * Gets the value of the otherEntityNames property.
     * 
     * @return
     *     possible object is
     *     {@link OtherEntityNamesType }
     *     
     */
    public OtherEntityNamesType getOtherEntityNames() {
        return otherEntityNames;
    }

    /**
     * Sets the value of the otherEntityNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherEntityNamesType }
     *     
     */
    public void setOtherEntityNames(OtherEntityNamesType value) {
        this.otherEntityNames = value;
    }

    /**
     * Gets the value of the transliteratedOtherEntityNames property.
     * 
     * @return
     *     possible object is
     *     {@link TransliteratedOtherEntityNamesType }
     *     
     */
    public TransliteratedOtherEntityNamesType getTransliteratedOtherEntityNames() {
        return transliteratedOtherEntityNames;
    }

    /**
     * Sets the value of the transliteratedOtherEntityNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransliteratedOtherEntityNamesType }
     *     
     */
    public void setTransliteratedOtherEntityNames(TransliteratedOtherEntityNamesType value) {
        this.transliteratedOtherEntityNames = value;
    }

    /**
     * Gets the value of the legalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getLegalAddress() {
        return legalAddress;
    }

    /**
     * Sets the value of the legalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setLegalAddress(AddressType value) {
        this.legalAddress = value;
    }

    /**
     * Gets the value of the headquartersAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getHeadquartersAddress() {
        return headquartersAddress;
    }

    /**
     * Sets the value of the headquartersAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setHeadquartersAddress(AddressType value) {
        this.headquartersAddress = value;
    }

    /**
     * Gets the value of the otherAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAddressesType }
     *     
     */
    public OtherAddressesType getOtherAddresses() {
        return otherAddresses;
    }

    /**
     * Sets the value of the otherAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAddressesType }
     *     
     */
    public void setOtherAddresses(OtherAddressesType value) {
        this.otherAddresses = value;
    }

    /**
     * Gets the value of the transliteratedOtherAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link TransliteratedOtherAddressesType }
     *     
     */
    public TransliteratedOtherAddressesType getTransliteratedOtherAddresses() {
        return transliteratedOtherAddresses;
    }

    /**
     * Sets the value of the transliteratedOtherAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransliteratedOtherAddressesType }
     *     
     */
    public void setTransliteratedOtherAddresses(TransliteratedOtherAddressesType value) {
        this.transliteratedOtherAddresses = value;
    }

    /**
     * Gets the value of the registrationAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationAuthorityType }
     *     
     */
    public RegistrationAuthorityType getRegistrationAuthority() {
        return registrationAuthority;
    }

    /**
     * Sets the value of the registrationAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationAuthorityType }
     *     
     */
    public void setRegistrationAuthority(RegistrationAuthorityType value) {
        this.registrationAuthority = value;
    }

    /**
     * Gets the value of the legalJurisdiction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalJurisdiction() {
        return legalJurisdiction;
    }

    /**
     * Sets the value of the legalJurisdiction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalJurisdiction(String value) {
        this.legalJurisdiction = value;
    }

    /**
     * Gets the value of the entityCategory property.
     * 
     * @return
     *     possible object is
     *     {@link EntityCategoryTypeEnum }
     *     
     */
    public EntityCategoryTypeEnum getEntityCategory() {
        return entityCategory;
    }

    /**
     * Sets the value of the entityCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityCategoryTypeEnum }
     *     
     */
    public void setEntityCategory(EntityCategoryTypeEnum value) {
        this.entityCategory = value;
    }

    /**
     * Gets the value of the legalForm property.
     * 
     * @return
     *     possible object is
     *     {@link LegalFormType }
     *     
     */
    public LegalFormType getLegalForm() {
        return legalForm;
    }

    /**
     * Sets the value of the legalForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalFormType }
     *     
     */
    public void setLegalForm(LegalFormType value) {
        this.legalForm = value;
    }

    /**
     * Gets the value of the associatedEntity property.
     * 
     * @return
     *     possible object is
     *     {@link AssociatedEntityType }
     *     
     */
    public AssociatedEntityType getAssociatedEntity() {
        return associatedEntity;
    }

    /**
     * Sets the value of the associatedEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociatedEntityType }
     *     
     */
    public void setAssociatedEntity(AssociatedEntityType value) {
        this.associatedEntity = value;
    }

    /**
     * Gets the value of the entityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatusEnum }
     *     
     */
    public EntityStatusEnum getEntityStatus() {
        return entityStatus;
    }

    /**
     * Sets the value of the entityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatusEnum }
     *     
     */
    public void setEntityStatus(EntityStatusEnum value) {
        this.entityStatus = value;
    }

    /**
     * Gets the value of the entityExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntityExpirationDate() {
        return entityExpirationDate;
    }

    /**
     * Sets the value of the entityExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntityExpirationDate(XMLGregorianCalendar value) {
        this.entityExpirationDate = value;
    }

    /**
     * Gets the value of the entityExpirationReason property.
     * 
     * @return
     *     possible object is
     *     {@link EntityExpirationReasonEnum }
     *     
     */
    public EntityExpirationReasonEnum getEntityExpirationReason() {
        return entityExpirationReason;
    }

    /**
     * Sets the value of the entityExpirationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityExpirationReasonEnum }
     *     
     */
    public void setEntityExpirationReason(EntityExpirationReasonEnum value) {
        this.entityExpirationReason = value;
    }

    /**
     * Gets the value of the successorEntity property.
     * 
     * @return
     *     possible object is
     *     {@link SuccessorEntityType }
     *     
     */
    public SuccessorEntityType getSuccessorEntity() {
        return successorEntity;
    }

    /**
     * Sets the value of the successorEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuccessorEntityType }
     *     
     */
    public void setSuccessorEntity(SuccessorEntityType value) {
        this.successorEntity = value;
    }

    /**
     * Gets the value of the nextVersion property.
     * 
     * @return
     *     possible object is
     *     {@link EntityNextVersionType }
     *     
     */
    public EntityNextVersionType getNextVersion() {
        return nextVersion;
    }

    /**
     * Sets the value of the nextVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityNextVersionType }
     *     
     */
    public void setNextVersion(EntityNextVersionType value) {
        this.nextVersion = value;
    }

}
