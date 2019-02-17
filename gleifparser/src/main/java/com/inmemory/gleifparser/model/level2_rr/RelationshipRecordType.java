
package com.inmemory.gleifparser.model.level2_rr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelationshipRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelationshipRecordType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Relationship" type="{http://www.gleif.org/data/schema/rr/2016}RelationshipContainerType"/&gt;
 *         &lt;element name="Registration" type="{http://www.gleif.org/data/schema/rr/2016}RegistrationContainerType"/&gt;
 *         &lt;element name="NextVersion" type="{http://www.gleif.org/data/schema/rr/2016}RelationshipRecordNextVersionType" minOccurs="0"/&gt;
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
@XmlType(name = "RelationshipRecordType", propOrder = {
    "relationship",
    "registration",
    "nextVersion",
    "extension"
})
public class RelationshipRecordType {

    @XmlElement(name = "Relationship", required = true)
    protected RelationshipContainerType relationship;
    @XmlElement(name = "Registration", required = true)
    protected RegistrationContainerType registration;
    @XmlElement(name = "NextVersion")
    protected RelationshipRecordNextVersionType nextVersion;
    @XmlElement(name = "Extension")
    protected ExtensionType extension;

    /**
     * Gets the value of the relationship property.
     * 
     * @return
     *     possible object is
     *     {@link RelationshipContainerType }
     *     
     */
    public RelationshipContainerType getRelationship() {
        return relationship;
    }

    /**
     * Sets the value of the relationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipContainerType }
     *     
     */
    public void setRelationship(RelationshipContainerType value) {
        this.relationship = value;
    }

    /**
     * Gets the value of the registration property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationContainerType }
     *     
     */
    public RegistrationContainerType getRegistration() {
        return registration;
    }

    /**
     * Sets the value of the registration property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationContainerType }
     *     
     */
    public void setRegistration(RegistrationContainerType value) {
        this.registration = value;
    }

    /**
     * Gets the value of the nextVersion property.
     * 
     * @return
     *     possible object is
     *     {@link RelationshipRecordNextVersionType }
     *     
     */
    public RelationshipRecordNextVersionType getNextVersion() {
        return nextVersion;
    }

    /**
     * Sets the value of the nextVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipRecordNextVersionType }
     *     
     */
    public void setNextVersion(RelationshipRecordNextVersionType value) {
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
