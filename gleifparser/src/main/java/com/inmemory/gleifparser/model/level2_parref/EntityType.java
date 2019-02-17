
package com.inmemory.gleifparser.model.level2_parref;

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
 *         &lt;element name="LegalName" type="{http://www.gleif.org/data/schema/pni/2016}NameType"/&gt;
 *         &lt;element name="OtherEntityNames" type="{http://www.gleif.org/data/schema/pni/2016}OtherEntityNamesType" minOccurs="0"/&gt;
 *         &lt;element name="LegalAddress" type="{http://www.gleif.org/data/schema/pni/2016}AddressType"/&gt;
 *         &lt;element name="HeadquartersAddress" type="{http://www.gleif.org/data/schema/pni/2016}AddressType"/&gt;
 *         &lt;element name="OtherAddresses" type="{http://www.gleif.org/data/schema/pni/2016}OtherAddressesType" minOccurs="0"/&gt;
 *         &lt;element name="BusinessRegisterEntityID" type="{http://www.gleif.org/data/schema/pni/2016}BusinessRegisterEntityIDType" minOccurs="0"/&gt;
 *         &lt;element name="LegalJurisdiction" type="{http://www.gleif.org/data/schema/pni/2016}JurisdictionCodeType" minOccurs="0"/&gt;
 *         &lt;element name="LegalForm" type="{http://www.gleif.org/data/schema/pni/2016}NameType" minOccurs="0"/&gt;
 *         &lt;element name="AssociatedEntity" type="{http://www.gleif.org/data/schema/pni/2016}AssociatedEntityType" minOccurs="0"/&gt;
 *         &lt;element name="EntityStatus" type="{http://www.gleif.org/data/schema/pni/2016}EntityStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="EntityExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EntityExpirationReason" type="{http://www.gleif.org/data/schema/pni/2016}EntityExpirationReasonEnum" minOccurs="0"/&gt;
 *         &lt;element name="SuccessorEntity" type="{http://www.gleif.org/data/schema/pni/2016}SuccessorEntityType" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.gleif.org/data/schema/pni/2016}ExtensionType" minOccurs="0"/&gt;
 *         &lt;element name="NextVersion" type="{http://www.gleif.org/data/schema/pni/2016}EntityNextVersionType" minOccurs="0"/&gt;
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
    "legalAddress",
    "headquartersAddress",
    "otherAddresses",
    "businessRegisterEntityID",
    "legalJurisdiction",
    "legalForm",
    "associatedEntity",
    "entityStatus",
    "entityExpirationDate",
    "entityExpirationReason",
    "successorEntity",
    "extension",
    "nextVersion"
})
public class EntityType {

    @XmlElement(name = "LegalName", required = true)
    protected NameType legalName;
    @XmlElement(name = "OtherEntityNames")
    protected OtherEntityNamesType otherEntityNames;
    @XmlElement(name = "LegalAddress", required = true)
    protected AddressType legalAddress;
    @XmlElement(name = "HeadquartersAddress", required = true)
    protected AddressType headquartersAddress;
    @XmlElement(name = "OtherAddresses")
    protected OtherAddressesType otherAddresses;
    @XmlElement(name = "BusinessRegisterEntityID")
    protected BusinessRegisterEntityIDType businessRegisterEntityID;
    @XmlElement(name = "LegalJurisdiction")
    protected String legalJurisdiction;
    @XmlElement(name = "LegalForm")
    protected NameType legalForm;
    @XmlElement(name = "AssociatedEntity")
    protected AssociatedEntityType associatedEntity;
    @XmlElement(name = "EntityStatus")
    protected String entityStatus;
    @XmlElement(name = "EntityExpirationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar entityExpirationDate;
    @XmlElement(name = "EntityExpirationReason")
    protected String entityExpirationReason;
    @XmlElement(name = "SuccessorEntity")
    protected SuccessorEntityType successorEntity;
    @XmlElement(name = "Extension")
    protected ExtensionType extension;
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
     * Gets the value of the businessRegisterEntityID property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessRegisterEntityIDType }
     *     
     */
    public BusinessRegisterEntityIDType getBusinessRegisterEntityID() {
        return businessRegisterEntityID;
    }

    /**
     * Sets the value of the businessRegisterEntityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessRegisterEntityIDType }
     *     
     */
    public void setBusinessRegisterEntityID(BusinessRegisterEntityIDType value) {
        this.businessRegisterEntityID = value;
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
     * Gets the value of the legalForm property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getLegalForm() {
        return legalForm;
    }

    /**
     * Sets the value of the legalForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setLegalForm(NameType value) {
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
     *     {@link String }
     *     
     */
    public String getEntityStatus() {
        return entityStatus;
    }

    /**
     * Sets the value of the entityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityStatus(String value) {
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
     *     {@link String }
     *     
     */
    public String getEntityExpirationReason() {
        return entityExpirationReason;
    }

    /**
     * Sets the value of the entityExpirationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityExpirationReason(String value) {
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
