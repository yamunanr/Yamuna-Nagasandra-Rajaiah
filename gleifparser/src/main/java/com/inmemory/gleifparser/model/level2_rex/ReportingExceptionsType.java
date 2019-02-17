
package com.inmemory.gleifparser.model.level2_rex;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportingExceptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportingExceptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Exception" type="{http://www.gleif.org/data/schema/repex/2016}ExceptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NextVersion" type="{http://www.gleif.org/data/schema/repex/2016}ReportingExceptionsContainerNextVersionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportingExceptionsType", propOrder = {
    "exception",
    "nextVersion"
})
public class ReportingExceptionsType {

    @XmlElement(name = "Exception")
    protected List<ExceptionType> exception;
    @XmlElement(name = "NextVersion")
    protected ReportingExceptionsContainerNextVersionType nextVersion;

    /**
     * Gets the value of the exception property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exception property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getException().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExceptionType }
     * 
     * 
     */
    public List<ExceptionType> getException() {
        if (exception == null) {
            exception = new ArrayList<ExceptionType>();
        }
        return this.exception;
    }

    /**
     * Gets the value of the nextVersion property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingExceptionsContainerNextVersionType }
     *     
     */
    public ReportingExceptionsContainerNextVersionType getNextVersion() {
        return nextVersion;
    }

    /**
     * Sets the value of the nextVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingExceptionsContainerNextVersionType }
     *     
     */
    public void setNextVersion(ReportingExceptionsContainerNextVersionType value) {
        this.nextVersion = value;
    }

}
