
package com.inmemory.gleifparser.model.level2_rr;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeasurementMethodTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MeasurementMethodTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACCOUNTING_CONSOLIDATION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MeasurementMethodTypeEnum")
@XmlEnum
public enum MeasurementMethodTypeEnum {


    /**
     * Accounting consolidation holds when "[in the] financial
     *                         statements of a group [...] the assets, liabilities, equity, income,
     *                         expenses and cash flows of the parent and its subsidiaries are presented as
     *                         those of a single economic entity (please see
     *                         http://www.iasplus.com/en/standards/ias/ias27-2011).
     * 
     */
    ACCOUNTING_CONSOLIDATION;

    public String value() {
        return name();
    }

    public static MeasurementMethodTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
