
package com.inmemory.gleifparser.model.level1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidationAuthorityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidationAuthorityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValidationAuthorityID" type="{http://www.gleif.org/data/schema/leidata/2016}RegistrationAuthorityEnum"/&gt;
 *         &lt;element name="OtherValidationAuthorityID" type="{http://www.gleif.org/data/schema/leidata/2016}Tokenized500Type" minOccurs="0"/&gt;
 *         &lt;element name="ValidationAuthorityEntityID" type="{http://www.gleif.org/data/schema/leidata/2016}Tokenized500Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationAuthorityType", propOrder = {
    "validationAuthorityID",
    "otherValidationAuthorityID",
    "validationAuthorityEntityID"
})
public class ValidationAuthorityType {

    @XmlElement(name = "ValidationAuthorityID", required = true)
    protected String validationAuthorityID;
    @XmlElement(name = "OtherValidationAuthorityID")
    protected String otherValidationAuthorityID;
    @XmlElement(name = "ValidationAuthorityEntityID")
    protected String validationAuthorityEntityID;

    /**
     * Gets the value of the validationAuthorityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationAuthorityID() {
        return validationAuthorityID;
    }

    /**
     * Sets the value of the validationAuthorityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationAuthorityID(String value) {
        this.validationAuthorityID = value;
    }

    /**
     * Gets the value of the otherValidationAuthorityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherValidationAuthorityID() {
        return otherValidationAuthorityID;
    }

    /**
     * Sets the value of the otherValidationAuthorityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherValidationAuthorityID(String value) {
        this.otherValidationAuthorityID = value;
    }

    /**
     * Gets the value of the validationAuthorityEntityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationAuthorityEntityID() {
        return validationAuthorityEntityID;
    }

    /**
     * Sets the value of the validationAuthorityEntityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationAuthorityEntityID(String value) {
        this.validationAuthorityEntityID = value;
    }

}
