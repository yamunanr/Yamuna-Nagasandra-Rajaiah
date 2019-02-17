
package com.inmemory.gleifparser.model.level1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTIVE"/&gt;
 *     &lt;enumeration value="INACTIVE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EntityStatusEnum")
@XmlEnum
public enum EntityStatusEnum {


    /**
     * As of the last report or update, the legal entity reported that it was
     *             legally registered and operating. 
     * 
     */
    ACTIVE,

    /**
     * It has been determined that the entity that was assigned the LEI is no
     *             longer legally registered and/or operating, whether as a result of business closure,
     *             acquisition by or merger with another (or new) entity, or determination of illegitimacy. 
     * 
     */
    INACTIVE;

    public String value() {
        return name();
    }

    public static EntityStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}
