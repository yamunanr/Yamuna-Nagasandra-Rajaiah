
package com.inmemory.gleifparser.model.level2_rr;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QualifierCategoryTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QualifierCategoryTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="US_GAAP"/&gt;
 *     &lt;enumeration value="IFRS"/&gt;
 *     &lt;enumeration value="OTHER_ACCOUNTING_STANDARD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QualifierCategoryTypeEnum")
@XmlEnum
public enum QualifierCategoryTypeEnum {


    /**
     * United States-Generally Accepted Accounting
     *                         Principles.
     * 
     */
    US_GAAP,

    /**
     * International Financial Reporting Standard (developed by the
     *                         International Accounting Standards Board – IASB see
     *                         http://www.ifrs.org).
     * 
     */
    IFRS,

    /**
     * A financial reporting (accounting) standard not otherwise
     *                         listed in the latest version of the relationship data file
     *                         format.
     * 
     */
    OTHER_ACCOUNTING_STANDARD;

    public String value() {
        return name();
    }

    public static QualifierCategoryTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
