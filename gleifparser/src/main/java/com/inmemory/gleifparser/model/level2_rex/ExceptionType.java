
package com.inmemory.gleifparser.model.level2_rex;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExceptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExceptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LEI" type="{http://www.gleif.org/data/schema/repex/2016}LEIType"/&gt;
 *         &lt;element name="ExceptionCategory" type="{http://www.gleif.org/data/schema/repex/2016}ExceptionCategoryEnum"/&gt;
 *         &lt;element name="ExceptionReason" type="{http://www.gleif.org/data/schema/repex/2016}ExceptionReasonEnum" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ExceptionReference" type="{http://www.gleif.org/data/schema/repex/2016}Tokenized500Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NextVersion" type="{http://www.gleif.org/data/schema/repex/2016}ReportingExceptionNextVersionType" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.gleif.org/data/schema/repex/2016}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExceptionType", propOrder = {
    "lei",
    "exceptionCategory",
    "exceptionReason",
    "exceptionReference",
    "nextVersion",
    "extension"
})
public class ExceptionType {

    @XmlElement(name = "LEI", required = true)
    protected String lei;
    @XmlElement(name = "ExceptionCategory", required = true)
    @XmlSchemaType(name = "string")
    protected ExceptionCategoryEnum exceptionCategory;
    @XmlElement(name = "ExceptionReason", required = true)
    @XmlSchemaType(name = "string")
    protected List<ExceptionReasonEnum> exceptionReason;
    @XmlElement(name = "ExceptionReference")
    protected List<String> exceptionReference;
    @XmlElement(name = "NextVersion")
    protected ReportingExceptionNextVersionType nextVersion;
    @XmlElement(name = "Extension")
    protected ExtensionType extension;

    /**
     * Gets the value of the lei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEI() {
        return lei;
    }

    /**
     * Sets the value of the lei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEI(String value) {
        this.lei = value;
    }

    /**
     * Gets the value of the exceptionCategory property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionCategoryEnum }
     *     
     */
    public ExceptionCategoryEnum getExceptionCategory() {
        return exceptionCategory;
    }

    /**
     * Sets the value of the exceptionCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionCategoryEnum }
     *     
     */
    public void setExceptionCategory(ExceptionCategoryEnum value) {
        this.exceptionCategory = value;
    }

    /**
     * Gets the value of the exceptionReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exceptionReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExceptionReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExceptionReasonEnum }
     * 
     * 
     */
    public List<ExceptionReasonEnum> getExceptionReason() {
        if (exceptionReason == null) {
            exceptionReason = new ArrayList<ExceptionReasonEnum>();
        }
        return this.exceptionReason;
    }

    /**
     * Gets the value of the exceptionReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exceptionReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExceptionReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExceptionReference() {
        if (exceptionReference == null) {
            exceptionReference = new ArrayList<String>();
        }
        return this.exceptionReference;
    }

    /**
     * Gets the value of the nextVersion property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingExceptionNextVersionType }
     *     
     */
    public ReportingExceptionNextVersionType getNextVersion() {
        return nextVersion;
    }

    /**
     * Sets the value of the nextVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingExceptionNextVersionType }
     *     
     */
    public void setNextVersion(ReportingExceptionNextVersionType value) {
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
