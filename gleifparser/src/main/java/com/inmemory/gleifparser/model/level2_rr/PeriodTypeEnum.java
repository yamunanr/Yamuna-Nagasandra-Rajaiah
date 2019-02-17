
package com.inmemory.gleifparser.model.level2_rr;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PeriodTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PeriodTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACCOUNTING_PERIOD"/&gt;
 *     &lt;enumeration value="RELATIONSHIP_PERIOD"/&gt;
 *     &lt;enumeration value="DOCUMENT_FILING_PERIOD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PeriodTypeEnum")
@XmlEnum
public enum PeriodTypeEnum {


    /**
     * The dates in this instance of 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;RelationshipPeriod&lt;/code&gt;
     * </pre>
     * 
     *                         indicate the accounting period covered by the most recent validation
     *                         documents for this relationship.
     * 
     */
    ACCOUNTING_PERIOD,

    /**
     * The dates in this instance of 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;RelationshipPeriod&lt;/code&gt;
     * </pre>
     * 
     *                         indicate the duration of validity of the relationship itself, as distinct
     *                         from any administrative or reporting aspects.
     * 
     */
    RELATIONSHIP_PERIOD,

    /**
     * The dates in this instance of 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;RelationshipPeriod&lt;/code&gt;
     * </pre>
     * 
     *                         indicate the validity period of a regulatory filing, accounting document, or
     *                         other document demonstrating the relationship's validity.
     * 
     */
    DOCUMENT_FILING_PERIOD;

    public String value() {
        return name();
    }

    public static PeriodTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
