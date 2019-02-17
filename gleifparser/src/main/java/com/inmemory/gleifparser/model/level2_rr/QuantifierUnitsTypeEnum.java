
package com.inmemory.gleifparser.model.level2_rr;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuantifierUnitsTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuantifierUnitsTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PERCENTAGE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QuantifierUnitsTypeEnum")
@XmlEnum
public enum QuantifierUnitsTypeEnum {

    PERCENTAGE;

    public String value() {
        return name();
    }

    public static QuantifierUnitsTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
