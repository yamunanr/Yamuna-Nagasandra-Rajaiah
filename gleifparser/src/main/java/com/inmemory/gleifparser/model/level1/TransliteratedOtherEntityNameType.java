
package com.inmemory.gleifparser.model.level1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransliteratedOtherEntityNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransliteratedOtherEntityNameType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.gleif.org/data/schema/leidata/2016&gt;TransliteratedNameType"&gt;
 *       &lt;attribute name="type" use="required" type="{http://www.gleif.org/data/schema/leidata/2016}TransliteratedEntityNameTypeEnum" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransliteratedOtherEntityNameType")
public class TransliteratedOtherEntityNameType
    extends TransliteratedNameType
{

    @XmlAttribute(name = "type", required = true)
    protected TransliteratedEntityNameTypeEnum type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TransliteratedEntityNameTypeEnum }
     *     
     */
    public TransliteratedEntityNameTypeEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransliteratedEntityNameTypeEnum }
     *     
     */
    public void setType(TransliteratedEntityNameTypeEnum value) {
        this.type = value;
    }

}
