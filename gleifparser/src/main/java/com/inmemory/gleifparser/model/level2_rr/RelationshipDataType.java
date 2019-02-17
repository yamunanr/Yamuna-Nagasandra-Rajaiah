
package com.inmemory.gleifparser.model.level2_rr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelationshipDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelationshipDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Header" type="{http://www.gleif.org/data/schema/rr/2016}RRHeaderType"/&gt;
 *         &lt;element name="RelationshipRecords" type="{http://www.gleif.org/data/schema/rr/2016}RelationshipRecordsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelationshipDataType", propOrder = {
    "header",
    "relationshipRecords"
})
public class RelationshipDataType {

    @XmlElement(name = "Header", required = true)
    protected RRHeaderType header;
    @XmlElement(name = "RelationshipRecords", required = true)
    protected RelationshipRecordsType relationshipRecords;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link RRHeaderType }
     *     
     */
    public RRHeaderType getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link RRHeaderType }
     *     
     */
    public void setHeader(RRHeaderType value) {
        this.header = value;
    }

    /**
     * Gets the value of the relationshipRecords property.
     * 
     * @return
     *     possible object is
     *     {@link RelationshipRecordsType }
     *     
     */
    public RelationshipRecordsType getRelationshipRecords() {
        return relationshipRecords;
    }

    /**
     * Sets the value of the relationshipRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipRecordsType }
     *     
     */
    public void setRelationshipRecords(RelationshipRecordsType value) {
        this.relationshipRecords = value;
    }

}
