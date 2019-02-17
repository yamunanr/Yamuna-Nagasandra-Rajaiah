
package com.inmemory.gleifparser.model.level1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegalFormType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegalFormType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntityLegalFormCode" type="{http://www.gleif.org/data/schema/leidata/2016}LegalFormEnum"/&gt;
 *         &lt;element name="OtherLegalForm" type="{http://www.gleif.org/data/schema/leidata/2016}Tokenized500Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalFormType", propOrder = {
    "entityLegalFormCode",
    "otherLegalForm"
})
public class LegalFormType {

    @XmlElement(name = "EntityLegalFormCode", required = true)
    protected String entityLegalFormCode;
    @XmlElement(name = "OtherLegalForm")
    protected String otherLegalForm;

    /**
     * Gets the value of the entityLegalFormCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityLegalFormCode() {
        return entityLegalFormCode;
    }

    /**
     * Sets the value of the entityLegalFormCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityLegalFormCode(String value) {
        this.entityLegalFormCode = value;
    }

    /**
     * Gets the value of the otherLegalForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherLegalForm() {
        return otherLegalForm;
    }

    /**
     * Sets the value of the otherLegalForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherLegalForm(String value) {
        this.otherLegalForm = value;
    }

}
