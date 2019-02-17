
package com.inmemory.gleifparser.model.level2_rex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExceptionCategoryEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExceptionCategoryEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DIRECT_ACCOUNTING_CONSOLIDATION_PARENT"/&gt;
 *     &lt;enumeration value="ULTIMATE_ACCOUNTING_CONSOLIDATION_PARENT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExceptionCategoryEnum")
@XmlEnum
public enum ExceptionCategoryEnum {


    /**
     * The legal entity has declined to report a direct accounting
     *                         consolidation parent, based on applicable accounting standards.
     *                     
     * 
     */
    DIRECT_ACCOUNTING_CONSOLIDATION_PARENT,

    /**
     * The legal entity has declined to report an ultimate accounting
     *                         consolidation parent, based on applicable accounting standards.
     *                     
     * 
     */
    ULTIMATE_ACCOUNTING_CONSOLIDATION_PARENT;

    public String value() {
        return name();
    }

    public static ExceptionCategoryEnum fromValue(String v) {
        return valueOf(v);
    }

}
