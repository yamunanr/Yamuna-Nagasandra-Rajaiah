
package com.inmemory.gleifparser.model.level2_parref;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PNIHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PNIHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Originator" type="{http://www.gleif.org/data/schema/pni/2016}PNIType" minOccurs="0"/&gt;
 *         &lt;element name="FileContent" type="{http://www.gleif.org/data/schema/pni/2016}FileContentEnum"/&gt;
 *         &lt;element name="DeltaStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RecordCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Extension" type="{http://www.gleif.org/data/schema/pni/2016}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PNIHeaderType", propOrder = {
    "contentDate",
    "originator",
    "fileContent",
    "deltaStart",
    "recordCount",
    "extension"
})
public class PNIHeaderType {

    @XmlElement(name = "ContentDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar contentDate;
    @XmlElement(name = "Originator")
    protected String originator;
    @XmlElement(name = "FileContent", required = true)
    @XmlSchemaType(name = "string")
    protected FileContentEnum fileContent;
    @XmlElement(name = "DeltaStart")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deltaStart;
    @XmlElement(name = "RecordCount")
    protected int recordCount;
    @XmlElement(name = "Extension")
    protected ExtensionType extension;

    /**
     * Gets the value of the contentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContentDate() {
        return contentDate;
    }

    /**
     * Sets the value of the contentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContentDate(XMLGregorianCalendar value) {
        this.contentDate = value;
    }

    /**
     * Gets the value of the originator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginator() {
        return originator;
    }

    /**
     * Sets the value of the originator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginator(String value) {
        this.originator = value;
    }

    /**
     * Gets the value of the fileContent property.
     * 
     * @return
     *     possible object is
     *     {@link FileContentEnum }
     *     
     */
    public FileContentEnum getFileContent() {
        return fileContent;
    }

    /**
     * Sets the value of the fileContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileContentEnum }
     *     
     */
    public void setFileContent(FileContentEnum value) {
        this.fileContent = value;
    }

    /**
     * Gets the value of the deltaStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeltaStart() {
        return deltaStart;
    }

    /**
     * Sets the value of the deltaStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeltaStart(XMLGregorianCalendar value) {
        this.deltaStart = value;
    }

    /**
     * Gets the value of the recordCount property.
     * 
     */
    public int getRecordCount() {
        return recordCount;
    }

    /**
     * Sets the value of the recordCount property.
     * 
     */
    public void setRecordCount(int value) {
        this.recordCount = value;
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
