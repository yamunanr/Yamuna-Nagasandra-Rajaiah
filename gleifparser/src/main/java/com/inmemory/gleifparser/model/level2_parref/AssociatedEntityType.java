
package com.inmemory.gleifparser.model.level2_parref;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssociatedEntityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssociatedEntityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="AssociatedLEI" type="{http://www.gleif.org/data/schema/pni/2016}PNIType"/&gt;
 *         &lt;element name="AssociatedEntityName" type="{http://www.gleif.org/data/schema/pni/2016}NameType"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="type" use="required" type="{http://www.gleif.org/data/schema/pni/2016}AssociatedEntityTypeEnum" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociatedEntityType", propOrder = {
    "associatedLEI",
    "associatedEntityName"
})
public class AssociatedEntityType {

    @XmlElement(name = "AssociatedLEI")
    protected String associatedLEI;
    @XmlElement(name = "AssociatedEntityName")
    protected NameType associatedEntityName;
    @XmlAttribute(name = "type", required = true)
    protected String type;

    /**
     * Gets the value of the associatedLEI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedLEI() {
        return associatedLEI;
    }

    /**
     * Sets the value of the associatedLEI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociatedLEI(String value) {
        this.associatedLEI = value;
    }

    /**
     * Gets the value of the associatedEntityName property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getAssociatedEntityName() {
        return associatedEntityName;
    }

    /**
     * Sets the value of the associatedEntityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setAssociatedEntityName(NameType value) {
        this.associatedEntityName = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
