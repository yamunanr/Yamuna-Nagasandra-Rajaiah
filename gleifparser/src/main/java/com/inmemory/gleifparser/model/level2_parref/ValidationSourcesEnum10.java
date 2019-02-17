
package com.inmemory.gleifparser.model.level2_parref;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidationSourcesEnum1.0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValidationSourcesEnum1.0"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PENDING"/&gt;
 *     &lt;enumeration value="ENTITY_SUPPLIED_ONLY"/&gt;
 *     &lt;enumeration value="PARTIALLY_CORROBORATED"/&gt;
 *     &lt;enumeration value="FULLY_CORROBORATED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ValidationSourcesEnum1.0")
@XmlEnum
public enum ValidationSourcesEnum10 {

    PENDING,
    ENTITY_SUPPLIED_ONLY,
    PARTIALLY_CORROBORATED,
    FULLY_CORROBORATED;

    public String value() {
        return name();
    }

    public static ValidationSourcesEnum10 fromValue(String v) {
        return valueOf(v);
    }

}
