
package com.inmemory.gleifparser.model.level1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransliteratedOtherEntityNamesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransliteratedOtherEntityNamesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransliteratedOtherEntityName" type="{http://www.gleif.org/data/schema/leidata/2016}TransliteratedOtherEntityNameType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransliteratedOtherEntityNamesType", propOrder = {
    "transliteratedOtherEntityName"
})
public class TransliteratedOtherEntityNamesType {

    @XmlElement(name = "TransliteratedOtherEntityName", required = true)
    protected List<TransliteratedOtherEntityNameType> transliteratedOtherEntityName;

    /**
     * Gets the value of the transliteratedOtherEntityName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transliteratedOtherEntityName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransliteratedOtherEntityName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransliteratedOtherEntityNameType }
     * 
     * 
     */
    public List<TransliteratedOtherEntityNameType> getTransliteratedOtherEntityName() {
        if (transliteratedOtherEntityName == null) {
            transliteratedOtherEntityName = new ArrayList<TransliteratedOtherEntityNameType>();
        }
        return this.transliteratedOtherEntityName;
    }

}
