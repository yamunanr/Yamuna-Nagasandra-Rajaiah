
package com.inmemory.gleifparser.model.level1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherEntityNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherEntityNameType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.gleif.org/data/schema/leidata/2016&gt;NameType"&gt;
 *       &lt;attribute name="type" use="required" type="{http://www.gleif.org/data/schema/leidata/2016}EntityNameTypeEnum" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherEntityNameType")
public class OtherEntityNameType
    extends NameType
{

    @XmlAttribute(name = "type", required = true)
    protected EntityNameTypeEnum type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EntityNameTypeEnum }
     *     
     */
    public EntityNameTypeEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityNameTypeEnum }
     *     
     */
    public void setType(EntityNameTypeEnum value) {
        this.type = value;
    }

}
