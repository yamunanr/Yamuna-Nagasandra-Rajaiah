
package com.inmemory.gleifparser.model.level1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherValidationAuthoritiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherValidationAuthoritiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OtherValidationAuthority" type="{http://www.gleif.org/data/schema/leidata/2016}ValidationAuthorityType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherValidationAuthoritiesType", propOrder = {
    "otherValidationAuthority"
})
public class OtherValidationAuthoritiesType {

    @XmlElement(name = "OtherValidationAuthority", required = true)
    protected List<ValidationAuthorityType> otherValidationAuthority;

    /**
     * Gets the value of the otherValidationAuthority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherValidationAuthority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherValidationAuthority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidationAuthorityType }
     * 
     * 
     */
    public List<ValidationAuthorityType> getOtherValidationAuthority() {
        if (otherValidationAuthority == null) {
            otherValidationAuthority = new ArrayList<ValidationAuthorityType>();
        }
        return this.otherValidationAuthority;
    }

}
