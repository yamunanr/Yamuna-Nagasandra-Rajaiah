
package com.inmemory.gleifparser.model.level2_rr;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeIDTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NodeIDTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LEI"/&gt;
 *     &lt;enumeration value="ISO_17442_COMPATIBLE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NodeIDTypeEnum")
@XmlEnum
public enum NodeIDTypeEnum {


    /**
     * An LEI code taken from the LEI issuing prefix namespace of a
     *                         GLEIS LOU.
     * 
     */
    LEI,

    /**
     * An ISO 17442-compatible code, not taken from the LEI issuing
     *                         prefix namespace of a GLEIS LOU.
     * 
     */
    ISO_17442_COMPATIBLE;

    public String value() {
        return name();
    }

    public static NodeIDTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
