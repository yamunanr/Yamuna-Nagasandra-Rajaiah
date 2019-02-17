
package com.inmemory.gleifparser.model.level1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistrationAuthorityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistrationAuthorityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RegistrationAuthorityID" type="{http://www.gleif.org/data/schema/leidata/2016}RegistrationAuthorityEnum"/&gt;
 *         &lt;element name="OtherRegistrationAuthorityID" type="{http://www.gleif.org/data/schema/leidata/2016}Tokenized500Type" minOccurs="0"/&gt;
 *         &lt;element name="RegistrationAuthorityEntityID" type="{http://www.gleif.org/data/schema/leidata/2016}Tokenized500Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrationAuthorityType", propOrder = {
    "registrationAuthorityID",
    "otherRegistrationAuthorityID",
    "registrationAuthorityEntityID"
})
public class RegistrationAuthorityType {

    @XmlElement(name = "RegistrationAuthorityID", required = true)
    protected String registrationAuthorityID;
    @XmlElement(name = "OtherRegistrationAuthorityID")
    protected String otherRegistrationAuthorityID;
    @XmlElement(name = "RegistrationAuthorityEntityID")
    protected String registrationAuthorityEntityID;

    /**
     * Gets the value of the registrationAuthorityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationAuthorityID() {
        return registrationAuthorityID;
    }

    /**
     * Sets the value of the registrationAuthorityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationAuthorityID(String value) {
        this.registrationAuthorityID = value;
    }

    /**
     * Gets the value of the otherRegistrationAuthorityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherRegistrationAuthorityID() {
        return otherRegistrationAuthorityID;
    }

    /**
     * Sets the value of the otherRegistrationAuthorityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherRegistrationAuthorityID(String value) {
        this.otherRegistrationAuthorityID = value;
    }

    /**
     * Gets the value of the registrationAuthorityEntityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationAuthorityEntityID() {
        return registrationAuthorityEntityID;
    }

    /**
     * Sets the value of the registrationAuthorityEntityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationAuthorityEntityID(String value) {
        this.registrationAuthorityEntityID = value;
    }

}
