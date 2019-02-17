
package com.inmemory.gleifparser.model.level2_rex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportingExceptionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportingExceptionDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Header" type="{http://www.gleif.org/data/schema/repex/2016}ExceptionHeaderType"/&gt;
 *         &lt;element name="ReportingExceptions" type="{http://www.gleif.org/data/schema/repex/2016}ReportingExceptionsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportingExceptionDataType", propOrder = {
    "header",
    "reportingExceptions"
})
public class ReportingExceptionDataType {

    @XmlElement(name = "Header", required = true)
    protected ExceptionHeaderType header;
    @XmlElement(name = "ReportingExceptions", required = true)
    protected ReportingExceptionsType reportingExceptions;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionHeaderType }
     *     
     */
    public ExceptionHeaderType getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionHeaderType }
     *     
     */
    public void setHeader(ExceptionHeaderType value) {
        this.header = value;
    }

    /**
     * Gets the value of the reportingExceptions property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingExceptionsType }
     *     
     */
    public ReportingExceptionsType getReportingExceptions() {
        return reportingExceptions;
    }

    /**
     * Sets the value of the reportingExceptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingExceptionsType }
     *     
     */
    public void setReportingExceptions(ReportingExceptionsType value) {
        this.reportingExceptions = value;
    }

}
