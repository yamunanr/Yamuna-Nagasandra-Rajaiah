
package com.inmemory.gleifparser.model.level2_rr;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidationSourcesTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValidationSourcesTypeEnum"&gt;
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
@XmlType(name = "ValidationSourcesTypeEnum")
@XmlEnum
public enum ValidationSourcesTypeEnum {


    /**
     * The validation of the relationship data provided by the
     *                         registrant has not yet occurred. Records with this
     *                             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ValidationSources&lt;/code&gt;
     * </pre>
     *  value MUST not be
     *                         published.
     * 
     */
    PENDING,

    /**
     * Based on the validation procedures in use by the LOU
     *                         responsible for the record, the information associated with this record has
     *                         significant reliance on the information that a submitter provided due to the
     *                         unavailability of corroborating information.
     * 
     */
    ENTITY_SUPPLIED_ONLY,

    /**
     * Based on the validation procedures in use by the LOU
     *                         responsible for the record, the information supplied by the submitter can be
     *                         partially corroborated by supporting sources (e.g. financial statements with
     *                         other definitions of the relevant relationship type; quarterly or annual
     *                         regulatory filings, contracts and other documents used in preparing
     *                         financial statements).
     * 
     */
    PARTIALLY_CORROBORATED,

    /**
     * The relationship data provided by the registrant has been
     *                         validated against an explicit relationship statement found in key sources
     *                         (e.g. consolidated financial statements).
     * 
     */
    FULLY_CORROBORATED;

    public String value() {
        return name();
    }

    public static ValidationSourcesTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
