
package com.inmemory.gleifparser.model.level1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AddressTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALTERNATIVE_LANGUAGE_LEGAL_ADDRESS"/&gt;
 *     &lt;enumeration value="ALTERNATIVE_LANGUAGE_HEADQUARTERS_ADDRESS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AddressTypeEnum")
@XmlEnum
public enum AddressTypeEnum {


    /**
     * Registered address of the entity in the legal jurisdiction, in an
     *             alternative language used in the legal jurisdiction.
     * 
     */
    ALTERNATIVE_LANGUAGE_LEGAL_ADDRESS,

    /**
     * Address of the headquarters of the entity, in an alternative language
     *             used in the legal jurisdiction.
     * 
     */
    ALTERNATIVE_LANGUAGE_HEADQUARTERS_ADDRESS;

    public String value() {
        return name();
    }

    public static AddressTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
