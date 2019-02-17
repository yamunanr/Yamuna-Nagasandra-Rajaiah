
package com.inmemory.gleifparser.model.level2_parref;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssociatedEntityTypeEnum1.0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssociatedEntityTypeEnum1.0"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FUND_FAMILY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssociatedEntityTypeEnum1.0")
@XmlEnum
public enum AssociatedEntityTypeEnum10 {

    FUND_FAMILY;

    public String value() {
        return name();
    }

    public static AssociatedEntityTypeEnum10 fromValue(String v) {
        return valueOf(v);
    }

}
