
package com.inmemory.gleifparser.model.level2_rr;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelationshipStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RelationshipStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTIVE"/&gt;
 *     &lt;enumeration value="INACTIVE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RelationshipStatusEnum")
@XmlEnum
public enum RelationshipStatusEnum {


    /**
     * As of the last report or update, the reporting legal entity
     *                         reported that it is legally registered and/or operating, AND that the
     *                         relationship detailed in this 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;RelationshipRecord&lt;/code&gt;
     * </pre>
     *  is still
     *                         valid.
     * 
     */
    ACTIVE,

    /**
     * It has been determined that the relationship ended, e.g.
     *                         because entity that reported this relationship is no longer legally
     *                         registered and/or operating; or the relationship is no longer valid for
     *                         other reasons.
     * 
     */
    INACTIVE;

    public String value() {
        return name();
    }

    public static RelationshipStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}
