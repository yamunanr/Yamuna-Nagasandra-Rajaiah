
package com.inmemory.gleifparser.model.level1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FirstAddressLine" type="{http://www.gleif.org/data/schema/leidata/2016}Tokenized500Type"/&gt;
 *         &lt;element name="AddressNumber" type="{http://www.gleif.org/data/schema/leidata/2016}Tokenized500Type" minOccurs="0"/&gt;
 *         &lt;element name="AddressNumberWithinBuilding" type="{http://www.gleif.org/data/schema/leidata/2016}Tokenized500Type" minOccurs="0"/&gt;
 *         &lt;element name="MailRouting" type="{http://www.gleif.org/data/schema/leidata/2016}Tokenized500Type" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalAddressLine" type="{http://www.gleif.org/data/schema/leidata/2016}Tokenized500Type" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://www.gleif.org/data/schema/leidata/2016}Tokenized500Type"/&gt;
 *         &lt;element name="Region" type="{http://www.gleif.org/data/schema/leidata/2016}RegionCodeType" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://www.gleif.org/data/schema/leidata/2016}CountryCodeType"/&gt;
 *         &lt;element name="PostalCode" type="{http://www.gleif.org/data/schema/leidata/2016}Tokenized500Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", propOrder = {
    "firstAddressLine",
    "addressNumber",
    "addressNumberWithinBuilding",
    "mailRouting",
    "additionalAddressLine",
    "city",
    "region",
    "country",
    "postalCode"
})
@XmlSeeAlso({
    OtherAddressType.class
})
public class AddressType {

	
    @XmlElement(name = "FirstAddressLine", required = true)
    protected String firstAddressLine;
    @XmlElement(name = "AddressNumber")
    protected String addressNumber;
    @XmlElement(name = "AddressNumberWithinBuilding")
    protected String addressNumberWithinBuilding;
    @XmlElement(name = "MailRouting")
    protected String mailRouting;
    @XmlElement(name = "AdditionalAddressLine")
    protected List<String> additionalAddressLine;
    @XmlElement(name = "City", required = true)
    protected String city;
    @XmlElement(name = "Region")
    protected String region;
    @XmlElement(name = "Country", required = true)
    protected String country;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;

    /**
     * Gets the value of the firstAddressLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstAddressLine() {
        return firstAddressLine;
    }

    /**
     * Sets the value of the firstAddressLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstAddressLine(String value) {
        this.firstAddressLine = value;
    }

    /**
     * Gets the value of the addressNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressNumber() {
        return addressNumber;
    }

    /**
     * Sets the value of the addressNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressNumber(String value) {
        this.addressNumber = value;
    }

    /**
     * Gets the value of the addressNumberWithinBuilding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressNumberWithinBuilding() {
        return addressNumberWithinBuilding;
    }

    /**
     * Sets the value of the addressNumberWithinBuilding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressNumberWithinBuilding(String value) {
        this.addressNumberWithinBuilding = value;
    }

    /**
     * Gets the value of the mailRouting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailRouting() {
        return mailRouting;
    }

    /**
     * Sets the value of the mailRouting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailRouting(String value) {
        this.mailRouting = value;
    }

    /**
     * Gets the value of the additionalAddressLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalAddressLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalAddressLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAdditionalAddressLine() {
        if (additionalAddressLine == null) {
            additionalAddressLine = new ArrayList<String>();
        }
        return this.additionalAddressLine;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * The language in which all of the string- valued components of this address
     *           are expressed.An IETF Language Code conforming to the latest RFC from IETF BCP 47. Note
     *           that the first characters of an IETF Language Code, up to the hyphen (if any), are all
     *           lowercase, and those following the hyphen (if any) are all uppercase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}
