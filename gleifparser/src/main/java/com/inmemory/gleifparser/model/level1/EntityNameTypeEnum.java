
package com.inmemory.gleifparser.model.level1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityNameTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityNameTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALTERNATIVE_LANGUAGE_LEGAL_NAME"/&gt;
 *     &lt;enumeration value="PREVIOUS_LEGAL_NAME"/&gt;
 *     &lt;enumeration value="TRADING_OR_OPERATING_NAME"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EntityNameTypeEnum")
@XmlEnum
public enum EntityNameTypeEnum {


    /**
     * Registered name of the entity in an alternative language in the legal
     *             jurisdiction in which the entity is registered.
     * 
     */
    ALTERNATIVE_LANGUAGE_LEGAL_NAME,

    /**
     * A primary legal name previously used by this entity.
     * 
     */
    PREVIOUS_LEGAL_NAME,

    /**
     * A "trading as", "brand name" or "operating under" name currently used by
     *             this entity in addition to, but not replacing, the (primary) legal, official registered
     *             name.
     * 
     */
    TRADING_OR_OPERATING_NAME;

    public String value() {
        return name();
    }

    public static EntityNameTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
