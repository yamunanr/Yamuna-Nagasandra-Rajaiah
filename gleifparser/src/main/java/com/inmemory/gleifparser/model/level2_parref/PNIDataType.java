
package com.inmemory.gleifparser.model.level2_parref;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PNIDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PNIDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PNIHeader" type="{http://www.gleif.org/data/schema/pni/2016}PNIHeaderType"/&gt;
 *         &lt;element name="PNIRecords" type="{http://www.gleif.org/data/schema/pni/2016}PNIRecordsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PNIDataType", propOrder = {
    "pniHeader",
    "pniRecords"
})
public class PNIDataType {

    @XmlElement(name = "PNIHeader", required = true)
    protected PNIHeaderType pniHeader;
    @XmlElement(name = "PNIRecords", required = true)
    protected PNIRecordsType pniRecords;

    /**
     * Gets the value of the pniHeader property.
     * 
     * @return
     *     possible object is
     *     {@link PNIHeaderType }
     *     
     */
    public PNIHeaderType getPNIHeader() {
        return pniHeader;
    }

    /**
     * Sets the value of the pniHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNIHeaderType }
     *     
     */
    public void setPNIHeader(PNIHeaderType value) {
        this.pniHeader = value;
    }

    /**
     * Gets the value of the pniRecords property.
     * 
     * @return
     *     possible object is
     *     {@link PNIRecordsType }
     *     
     */
    public PNIRecordsType getPNIRecords() {
        return pniRecords;
    }

    /**
     * Sets the value of the pniRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNIRecordsType }
     *     
     */
    public void setPNIRecords(PNIRecordsType value) {
        this.pniRecords = value;
    }

}
