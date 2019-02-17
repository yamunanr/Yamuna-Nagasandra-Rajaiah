
package com.inmemory.gleifparser.model.level2_parref;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherEntityNamesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherEntityNamesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OtherEntityName" type="{http://www.gleif.org/data/schema/pni/2016}OtherEntityNameType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherEntityNamesType", propOrder = {
    "otherEntityName"
})
public class OtherEntityNamesType {

    @XmlElement(name = "OtherEntityName", required = true)
    protected List<OtherEntityNameType> otherEntityName;

    /**
     * Gets the value of the otherEntityName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherEntityName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherEntityName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherEntityNameType }
     * 
     * 
     */
    public List<OtherEntityNameType> getOtherEntityName() {
        if (otherEntityName == null) {
            otherEntityName = new ArrayList<OtherEntityNameType>();
        }
        return this.otherEntityName;
    }

}
