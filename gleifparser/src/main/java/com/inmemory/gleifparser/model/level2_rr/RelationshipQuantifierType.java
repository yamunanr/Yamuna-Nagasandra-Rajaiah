
package com.inmemory.gleifparser.model.level2_rr;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelationshipQuantifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelationshipQuantifierType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MeasurementMethod" type="{http://www.gleif.org/data/schema/rr/2016}MeasurementMethodTypeEnum"/&gt;
 *         &lt;element name="QuantifierAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="QuantifierUnits" type="{http://www.gleif.org/data/schema/rr/2016}QuantifierUnitsTypeEnum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelationshipQuantifierType", propOrder = {
    "measurementMethod",
    "quantifierAmount",
    "quantifierUnits"
})
public class RelationshipQuantifierType {

    @XmlElement(name = "MeasurementMethod", required = true)
    @XmlSchemaType(name = "string")
    protected MeasurementMethodTypeEnum measurementMethod;
    @XmlElement(name = "QuantifierAmount", required = true)
    protected BigDecimal quantifierAmount;
    @XmlElement(name = "QuantifierUnits")
    @XmlSchemaType(name = "string")
    protected QuantifierUnitsTypeEnum quantifierUnits;

    /**
     * Gets the value of the measurementMethod property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementMethodTypeEnum }
     *     
     */
    public MeasurementMethodTypeEnum getMeasurementMethod() {
        return measurementMethod;
    }

    /**
     * Sets the value of the measurementMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementMethodTypeEnum }
     *     
     */
    public void setMeasurementMethod(MeasurementMethodTypeEnum value) {
        this.measurementMethod = value;
    }

    /**
     * Gets the value of the quantifierAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantifierAmount() {
        return quantifierAmount;
    }

    /**
     * Sets the value of the quantifierAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantifierAmount(BigDecimal value) {
        this.quantifierAmount = value;
    }

    /**
     * Gets the value of the quantifierUnits property.
     * 
     * @return
     *     possible object is
     *     {@link QuantifierUnitsTypeEnum }
     *     
     */
    public QuantifierUnitsTypeEnum getQuantifierUnits() {
        return quantifierUnits;
    }

    /**
     * Sets the value of the quantifierUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantifierUnitsTypeEnum }
     *     
     */
    public void setQuantifierUnits(QuantifierUnitsTypeEnum value) {
        this.quantifierUnits = value;
    }

}
