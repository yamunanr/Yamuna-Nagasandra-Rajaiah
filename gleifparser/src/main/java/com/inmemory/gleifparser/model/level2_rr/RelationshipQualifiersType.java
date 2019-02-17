
package com.inmemory.gleifparser.model.level2_rr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelationshipQualifiersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelationshipQualifiersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RelationshipQualifier" type="{http://www.gleif.org/data/schema/rr/2016}RelationshipQualifierType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelationshipQualifiersType", propOrder = {
    "relationshipQualifier"
})
public class RelationshipQualifiersType {

    @XmlElement(name = "RelationshipQualifier")
    protected List<RelationshipQualifierType> relationshipQualifier;

    /**
     * Gets the value of the relationshipQualifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationshipQualifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationshipQualifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationshipQualifierType }
     * 
     * 
     */
    public List<RelationshipQualifierType> getRelationshipQualifier() {
        if (relationshipQualifier == null) {
            relationshipQualifier = new ArrayList<RelationshipQualifierType>();
        }
        return this.relationshipQualifier;
    }

}
