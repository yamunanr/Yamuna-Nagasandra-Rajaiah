
package com.inmemory.gleifparser.model.level2_parref;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityExpirationReasonEnum1.0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityExpirationReasonEnum1.0"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DISSOLVED"/&gt;
 *     &lt;enumeration value="CORPORATE_ACTION"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EntityExpirationReasonEnum1.0")
@XmlEnum
public enum EntityExpirationReasonEnum10 {

    DISSOLVED,
    CORPORATE_ACTION,
    OTHER;

    public String value() {
        return name();
    }

    public static EntityExpirationReasonEnum10 fromValue(String v) {
        return valueOf(v);
    }

}
