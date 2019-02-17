
package com.inmemory.gleifparser.model.level2_rr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelationshipPeriodsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelationshipPeriodsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RelationshipPeriod" type="{http://www.gleif.org/data/schema/rr/2016}RelationshipPeriodType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelationshipPeriodsType", propOrder = {
    "relationshipPeriod"
})
public class RelationshipPeriodsType {

    @XmlElement(name = "RelationshipPeriod", required = true)
    protected List<RelationshipPeriodType> relationshipPeriod;

    /**
     * Gets the value of the relationshipPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationshipPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationshipPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationshipPeriodType }
     * 
     * 
     */
    public List<RelationshipPeriodType> getRelationshipPeriod() {
        if (relationshipPeriod == null) {
            relationshipPeriod = new ArrayList<RelationshipPeriodType>();
        }
        return this.relationshipPeriod;
    }

}
