
package com.inmemory.gleifparser.model.level2_rr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelationshipContainerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelationshipContainerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartNode" type="{http://www.gleif.org/data/schema/rr/2016}NodeType"/&gt;
 *         &lt;element name="EndNode" type="{http://www.gleif.org/data/schema/rr/2016}NodeType"/&gt;
 *         &lt;element name="RelationshipType" type="{http://www.gleif.org/data/schema/rr/2016}RelationshipTypeEnum"/&gt;
 *         &lt;element name="RelationshipPeriods" type="{http://www.gleif.org/data/schema/rr/2016}RelationshipPeriodsType" minOccurs="0"/&gt;
 *         &lt;element name="RelationshipStatus" type="{http://www.gleif.org/data/schema/rr/2016}RelationshipStatusEnum"/&gt;
 *         &lt;element name="RelationshipQualifiers" type="{http://www.gleif.org/data/schema/rr/2016}RelationshipQualifiersType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RelationshipQuantifiers" type="{http://www.gleif.org/data/schema/rr/2016}RelationshipQuantifiersType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NextVersion" type="{http://www.gleif.org/data/schema/rr/2016}RelationshipNextVersionType" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.gleif.org/data/schema/rr/2016}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelationshipContainerType", propOrder = {
    "startNode",
    "endNode",
    "relationshipType",
    "relationshipPeriods",
    "relationshipStatus",
    "relationshipQualifiers",
    "relationshipQuantifiers",
    "nextVersion",
    "extension"
})
public class RelationshipContainerType {

	
    @XmlElement(name = "StartNode", required = true)
    protected NodeType startNode;
    @XmlElement(name = "EndNode", required = true)
    protected NodeType endNode;
    @XmlElement(name = "RelationshipType", required = true)
    @XmlSchemaType(name = "string")
    protected RelationshipTypeEnum relationshipType;
    @XmlElement(name = "RelationshipPeriods")
    protected RelationshipPeriodsType relationshipPeriods;
    @XmlElement(name = "RelationshipStatus", required = true)
    @XmlSchemaType(name = "string")
    protected RelationshipStatusEnum relationshipStatus;
    @XmlElement(name = "RelationshipQualifiers")
    protected List<RelationshipQualifiersType> relationshipQualifiers;
    @XmlElement(name = "RelationshipQuantifiers")
    protected List<RelationshipQuantifiersType> relationshipQuantifiers;
    @XmlElement(name = "NextVersion")
    protected RelationshipNextVersionType nextVersion;
    @XmlElement(name = "Extension")
    protected ExtensionType extension;

    /**
     * Gets the value of the startNode property.
     * 
     * @return
     *     possible object is
     *     {@link NodeType }
     *     
     */
    public NodeType getStartNode() {
        return startNode;
    }

    /**
     * Sets the value of the startNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeType }
     *     
     */
    public void setStartNode(NodeType value) {
        this.startNode = value;
    }

    /**
     * Gets the value of the endNode property.
     * 
     * @return
     *     possible object is
     *     {@link NodeType }
     *     
     */
    public NodeType getEndNode() {
        return endNode;
    }

    /**
     * Sets the value of the endNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeType }
     *     
     */
    public void setEndNode(NodeType value) {
        this.endNode = value;
    }

    /**
     * Gets the value of the relationshipType property.
     * 
     * @return
     *     possible object is
     *     {@link RelationshipTypeEnum }
     *     
     */
    public RelationshipTypeEnum getRelationshipType() {
        return relationshipType;
    }

    /**
     * Sets the value of the relationshipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipTypeEnum }
     *     
     */
    public void setRelationshipType(RelationshipTypeEnum value) {
        this.relationshipType = value;
    }

    /**
     * Gets the value of the relationshipPeriods property.
     * 
     * @return
     *     possible object is
     *     {@link RelationshipPeriodsType }
     *     
     */
    public RelationshipPeriodsType getRelationshipPeriods() {
        return relationshipPeriods;
    }

    /**
     * Sets the value of the relationshipPeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipPeriodsType }
     *     
     */
    public void setRelationshipPeriods(RelationshipPeriodsType value) {
        this.relationshipPeriods = value;
    }

    /**
     * Gets the value of the relationshipStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RelationshipStatusEnum }
     *     
     */
    public RelationshipStatusEnum getRelationshipStatus() {
        return relationshipStatus;
    }

    /**
     * Sets the value of the relationshipStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipStatusEnum }
     *     
     */
    public void setRelationshipStatus(RelationshipStatusEnum value) {
        this.relationshipStatus = value;
    }

    /**
     * Gets the value of the relationshipQualifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationshipQualifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationshipQualifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationshipQualifiersType }
     * 
     * 
     */
    public List<RelationshipQualifiersType> getRelationshipQualifiers() {
        if (relationshipQualifiers == null) {
            relationshipQualifiers = new ArrayList<RelationshipQualifiersType>();
        }
        return this.relationshipQualifiers;
    }

    /**
     * Gets the value of the relationshipQuantifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationshipQuantifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationshipQuantifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationshipQuantifiersType }
     * 
     * 
     */
    public List<RelationshipQuantifiersType> getRelationshipQuantifiers() {
        if (relationshipQuantifiers == null) {
            relationshipQuantifiers = new ArrayList<RelationshipQuantifiersType>();
        }
        return this.relationshipQuantifiers;
    }

    /**
     * Gets the value of the nextVersion property.
     * 
     * @return
     *     possible object is
     *     {@link RelationshipNextVersionType }
     *     
     */
    public RelationshipNextVersionType getNextVersion() {
        return nextVersion;
    }

    /**
     * Sets the value of the nextVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipNextVersionType }
     *     
     */
    public void setNextVersion(RelationshipNextVersionType value) {
        this.nextVersion = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setExtension(ExtensionType value) {
        this.extension = value;
    }

}
