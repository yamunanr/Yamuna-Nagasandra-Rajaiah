
package com.inmemory.gleifparser.model.level1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransliteratedEntityNameTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransliteratedEntityNameTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="PREFERRED_ASCII_TRANSLITERATED_LEGAL_NAME"/&gt;
 *     &lt;enumeration value="AUTO_ASCII_TRANSLITERATED_LEGAL_NAME"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransliteratedEntityNameTypeEnum")
@XmlEnum
public enum TransliteratedEntityNameTypeEnum {


    /**
     * Legal name of the entity transliterated to ASCII characters, provided by
     *             the entity for this purpose.
     * 
     */
    PREFERRED_ASCII_TRANSLITERATED_LEGAL_NAME,

    /**
     * Legal name of the entity transliterated to ASCII characters,
     *             auto-transliterated by the managing LOU.
     * 
     */
    AUTO_ASCII_TRANSLITERATED_LEGAL_NAME;

    public String value() {
        return name();
    }

    public static TransliteratedEntityNameTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
