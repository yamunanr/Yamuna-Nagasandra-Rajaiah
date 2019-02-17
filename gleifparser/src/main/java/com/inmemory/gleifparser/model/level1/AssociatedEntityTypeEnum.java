
package com.inmemory.gleifparser.model.level1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssociatedEntityTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssociatedEntityTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FUND_FAMILY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssociatedEntityTypeEnum")
@XmlEnum
public enum AssociatedEntityTypeEnum {


    /**
     * The legal entity is a fund, and the associated entity is the manager of
     *             the fund. 
     * 
     */
    FUND_FAMILY;

    public String value() {
        return name();
    }

    public static AssociatedEntityTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
