
package com.inmemory.gleifparser.model.level2_parref;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SuccessorEntityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SuccessorEntityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="SuccessorLEI" type="{http://www.gleif.org/data/schema/pni/2016}PNIType"/&gt;
 *         &lt;element name="SuccessorEntityName" type="{http://www.gleif.org/data/schema/pni/2016}NameType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuccessorEntityType", propOrder = {
    "successorLEI",
    "successorEntityName"
})
public class SuccessorEntityType {

    @XmlElement(name = "SuccessorLEI")
    protected String successorLEI;
    @XmlElement(name = "SuccessorEntityName")
    protected NameType successorEntityName;

    /**
     * Gets the value of the successorLEI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuccessorLEI() {
        return successorLEI;
    }

    /**
     * Sets the value of the successorLEI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuccessorLEI(String value) {
        this.successorLEI = value;
    }

    /**
     * Gets the value of the successorEntityName property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getSuccessorEntityName() {
        return successorEntityName;
    }

    /**
     * Sets the value of the successorEntityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setSuccessorEntityName(NameType value) {
        this.successorEntityName = value;
    }

}
