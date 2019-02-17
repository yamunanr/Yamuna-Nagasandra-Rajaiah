
package com.inmemory.gleifparser.model.level1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransliteratedOtherAddressesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransliteratedOtherAddressesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransliteratedOtherAddress" type="{http://www.gleif.org/data/schema/leidata/2016}TransliteratedOtherAddressType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransliteratedOtherAddressesType", propOrder = {
    "transliteratedOtherAddress"
})
public class TransliteratedOtherAddressesType {

    @XmlElement(name = "TransliteratedOtherAddress", required = true)
    protected List<TransliteratedOtherAddressType> transliteratedOtherAddress;

    /**
     * Gets the value of the transliteratedOtherAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transliteratedOtherAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransliteratedOtherAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransliteratedOtherAddressType }
     * 
     * 
     */
    public List<TransliteratedOtherAddressType> getTransliteratedOtherAddress() {
        if (transliteratedOtherAddress == null) {
            transliteratedOtherAddress = new ArrayList<TransliteratedOtherAddressType>();
        }
        return this.transliteratedOtherAddress;
    }

}
