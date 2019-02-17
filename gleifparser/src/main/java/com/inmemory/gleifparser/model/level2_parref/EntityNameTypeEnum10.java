
package com.inmemory.gleifparser.model.level2_parref;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityNameTypeEnum1.0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityNameTypeEnum1.0"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OTHER_LEGAL"/&gt;
 *     &lt;enumeration value="PREFERRED_ASCII_TRANSLITERATED_LEGAL"/&gt;
 *     &lt;enumeration value="AUTO_ASCII_TRANSLITERATED_LEGAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EntityNameTypeEnum1.0")
@XmlEnum
public enum EntityNameTypeEnum10 {

    OTHER_LEGAL,
    PREFERRED_ASCII_TRANSLITERATED_LEGAL,
    AUTO_ASCII_TRANSLITERATED_LEGAL;

    public String value() {
        return name();
    }

    public static EntityNameTypeEnum10 fromValue(String v) {
        return valueOf(v);
    }

}
