
package com.inmemory.gleifparser.model.level1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransliteratedOtherAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransliteratedOtherAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.gleif.org/data/schema/leidata/2016}TransliteratedAddressType"&gt;
 *       &lt;attribute name="type" use="required" type="{http://www.gleif.org/data/schema/leidata/2016}TransliteratedAddressTypeEnum" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransliteratedOtherAddressType")
public class TransliteratedOtherAddressType
    extends TransliteratedAddressType
{

    @XmlAttribute(name = "type", required = true)
    protected TransliteratedAddressTypeEnum type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TransliteratedAddressTypeEnum }
     *     
     */
    public TransliteratedAddressTypeEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransliteratedAddressTypeEnum }
     *     
     */
    public void setType(TransliteratedAddressTypeEnum value) {
        this.type = value;
    }

}
