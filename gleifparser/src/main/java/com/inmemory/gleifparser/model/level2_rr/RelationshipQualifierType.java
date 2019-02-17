
package com.inmemory.gleifparser.model.level2_rr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelationshipQualifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelationshipQualifierType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QualifierDimension" type="{http://www.gleif.org/data/schema/rr/2016}QualifierDimensionEnum"/&gt;
 *         &lt;element name="QualifierCategory" type="{http://www.gleif.org/data/schema/rr/2016}QualifierCategoryTypeEnum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelationshipQualifierType", propOrder = {
    "qualifierDimension",
    "qualifierCategory"
})
public class RelationshipQualifierType {

    @XmlElement(name = "QualifierDimension", required = true)
    @XmlSchemaType(name = "string")
    protected QualifierDimensionEnum qualifierDimension;
    @XmlElement(name = "QualifierCategory")
    @XmlSchemaType(name = "string")
    protected QualifierCategoryTypeEnum qualifierCategory;

    /**
     * Gets the value of the qualifierDimension property.
     * 
     * @return
     *     possible object is
     *     {@link QualifierDimensionEnum }
     *     
     */
    public QualifierDimensionEnum getQualifierDimension() {
        return qualifierDimension;
    }

    /**
     * Sets the value of the qualifierDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifierDimensionEnum }
     *     
     */
    public void setQualifierDimension(QualifierDimensionEnum value) {
        this.qualifierDimension = value;
    }

    /**
     * Gets the value of the qualifierCategory property.
     * 
     * @return
     *     possible object is
     *     {@link QualifierCategoryTypeEnum }
     *     
     */
    public QualifierCategoryTypeEnum getQualifierCategory() {
        return qualifierCategory;
    }

    /**
     * Sets the value of the qualifierCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifierCategoryTypeEnum }
     *     
     */
    public void setQualifierCategory(QualifierCategoryTypeEnum value) {
        this.qualifierCategory = value;
    }

}
