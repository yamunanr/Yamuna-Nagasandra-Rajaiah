
package com.inmemory.gleifparser.model.level2_parref;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PNIRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PNIRecordType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PNI" type="{http://www.gleif.org/data/schema/pni/2016}PNIType"/&gt;
 *         &lt;element name="Entity" type="{http://www.gleif.org/data/schema/pni/2016}EntityType"/&gt;
 *         &lt;element name="Registration" type="{http://www.gleif.org/data/schema/pni/2016}RegistrationType"/&gt;
 *         &lt;element name="NextVersion" type="{http://www.gleif.org/data/schema/pni/2016}PNIRecordNextVersionType" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.gleif.org/data/schema/pni/2016}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PNIRecordType", propOrder = {
    "pni",
    "entity",
    "registration",
    "nextVersion",
    "extension"
})
public class PNIRecordType {

    @XmlElement(name = "PNI", required = true)
    protected String pni;
    @XmlElement(name = "Entity", required = true)
    protected EntityType entity;
    @XmlElement(name = "Registration", required = true)
    protected RegistrationType registration;
    @XmlElement(name = "NextVersion")
    protected PNIRecordNextVersionType nextVersion;
    @XmlElement(name = "Extension")
    protected ExtensionType extension;

    /**
     * Gets the value of the pni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNI() {
        return pni;
    }

    /**
     * Sets the value of the pni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNI(String value) {
        this.pni = value;
    }

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link EntityType }
     *     
     */
    public EntityType getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityType }
     *     
     */
    public void setEntity(EntityType value) {
        this.entity = value;
    }

    /**
     * Gets the value of the registration property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationType }
     *     
     */
    public RegistrationType getRegistration() {
        return registration;
    }

    /**
     * Sets the value of the registration property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationType }
     *     
     */
    public void setRegistration(RegistrationType value) {
        this.registration = value;
    }

    /**
     * Gets the value of the nextVersion property.
     * 
     * @return
     *     possible object is
     *     {@link PNIRecordNextVersionType }
     *     
     */
    public PNIRecordNextVersionType getNextVersion() {
        return nextVersion;
    }

    /**
     * Sets the value of the nextVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNIRecordNextVersionType }
     *     
     */
    public void setNextVersion(PNIRecordNextVersionType value) {
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
