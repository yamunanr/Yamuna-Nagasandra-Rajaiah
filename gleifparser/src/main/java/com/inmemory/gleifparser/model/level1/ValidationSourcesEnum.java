
package com.inmemory.gleifparser.model.level1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidationSourcesEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValidationSourcesEnum"&gt;
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
@XmlType(name = "ValidationSourcesEnum")
@XmlEnum
public enum ValidationSourcesEnum {


    /**
     * The validation of the reference data provided by the registrant has not
     *             yet occurred.
     * 
     */
    PENDING,

    /**
     * Based on the validation procedures in use by the LOU responsible for the
     *             record, the information associated with this record has significant reliance on the
     *             information that a submitter provided due to the unavailability of corroborating
     *             information. 
     * 
     */
    ENTITY_SUPPLIED_ONLY,

    /**
     * Based on the validation procedures in use by the LOU responsible for the
     *             record, the information supplied by the registrant can be partially corroborated by
     *             public authoritative sources, while some of the record is dependent upon the information
     *             that the registrant submitted, either due to conflicts with authoritative information,
     *             or due to data unavailability. 
     * 
     */
    PARTIALLY_CORROBORATED,

    /**
     * Based on the validation procedures in use by the LOU responsible for the
     *             record, there is sufficient information contained in authoritative public sources to
     *             corroborate the information that the submitter has provided for the
     *             record.
     * 
     */
    FULLY_CORROBORATED;

    public String value() {
        return name();
    }

    public static ValidationSourcesEnum fromValue(String v) {
        return valueOf(v);
    }

}
