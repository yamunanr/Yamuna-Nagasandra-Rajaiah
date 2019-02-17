
package com.inmemory.gleifparser.model.level2_parref;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressTypeEnum1.0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AddressTypeEnum1.0"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LEGAL_ADDRESS"/&gt;
 *     &lt;enumeration value="HEADQUARTERS_ADDRESS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AddressTypeEnum1.0")
@XmlEnum
public enum AddressTypeEnum10 {

    LEGAL_ADDRESS,
    HEADQUARTERS_ADDRESS;

    public String value() {
        return name();
    }

    public static AddressTypeEnum10 fromValue(String v) {
        return valueOf(v);
    }

}
