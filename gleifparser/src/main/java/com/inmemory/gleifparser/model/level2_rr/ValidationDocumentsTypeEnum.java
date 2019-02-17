
package com.inmemory.gleifparser.model.level2_rr;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidationDocumentsTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValidationDocumentsTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACCOUNTS_FILING"/&gt;
 *     &lt;enumeration value="REGULATORY_FILING"/&gt;
 *     &lt;enumeration value="SUPPORTING_DOCUMENTS"/&gt;
 *     &lt;enumeration value="CONTRACTS"/&gt;
 *     &lt;enumeration value="OTHER_OFFICIAL_DOCUMENTS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ValidationDocumentsTypeEnum")
@XmlEnum
public enum ValidationDocumentsTypeEnum {


    /**
     * A consolidated financial (accounting) statement, prepared and
     *                         submitted to the relevant authority.
     * 
     */
    ACCOUNTS_FILING,

    /**
     * An annual regulatory filing providing public information on
     *                         parent relationships.
     * 
     */
    REGULATORY_FILING,

    /**
     * Other documents supporting the preparation of consolidated
     *                         financial statements.
     * 
     */
    SUPPORTING_DOCUMENTS,

    /**
     * Contract(s) attesting to the validity of the
     *                         relationship.
     * 
     */
    CONTRACTS,

    /**
     * Other official document(s) attesting to the validity of the
     *                         relationship.
     * 
     */
    OTHER_OFFICIAL_DOCUMENTS;

    public String value() {
        return name();
    }

    public static ValidationDocumentsTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
