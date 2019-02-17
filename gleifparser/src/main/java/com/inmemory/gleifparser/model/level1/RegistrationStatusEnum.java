
package com.inmemory.gleifparser.model.level1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistrationStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RegistrationStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PENDING_VALIDATION"/&gt;
 *     &lt;enumeration value="ISSUED"/&gt;
 *     &lt;enumeration value="DUPLICATE"/&gt;
 *     &lt;enumeration value="LAPSED"/&gt;
 *     &lt;enumeration value="MERGED"/&gt;
 *     &lt;enumeration value="RETIRED"/&gt;
 *     &lt;enumeration value="ANNULLED"/&gt;
 *     &lt;enumeration value="CANCELLED"/&gt;
 *     &lt;enumeration value="TRANSFERRED"/&gt;
 *     &lt;enumeration value="PENDING_TRANSFER"/&gt;
 *     &lt;enumeration value="PENDING_ARCHIVAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RegistrationStatusEnum")
@XmlEnum
public enum RegistrationStatusEnum {


    /**
     * An application for an LEI that has been submitted and which is being
     *             processed and validated.
     * 
     */
    PENDING_VALIDATION,

    /**
     * An LEI Registration that has been validated and issued, and which
     *             identifies an entity that was an operating legal entity as of the last update. 
     * 
     */
    ISSUED,

    /**
     * An LEI Registration that has been determined to be a duplicate
     *             registration of the same legal entity as another LEI Registration; the DUPLICATE status
     *             is assigned to the non-surviving registration (i.e. the LEI that should no longer be
     *             used).
     * 
     */
    DUPLICATE,

    /**
     * An LEI registration that has not been renewed by the
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:lei="http://www.gleif.org/data/schema/leidata/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;NextRenewalDate&lt;/code&gt;
     * </pre>
     *  and is not known by public sources to have ceased
     *             operation.
     * 
     */
    LAPSED,

    /**
     * An LEI registration for an entity that has been merged into another
     *             legal entity, such that this legal entity no longer exists as an operating
     *             entity.
     * 
     */
    MERGED,

    /**
     * An LEI registration for an entity that has ceased operation, without
     *             having been merged into another entity.
     * 
     */
    RETIRED,

    /**
     * An LEI registration that was marked as erroneous or invalid after it was
     *             issued
     * 
     */
    ANNULLED,

    /**
     * An LEI registration that was abandoned prior to issuance of an LEI
     *           
     * 
     */
    CANCELLED,

    /**
     * An LEI registration that has been transferred to a different LOU as the
     *             managing LOU.
     * 
     */
    TRANSFERRED,

    /**
     * An LEI registration that has been requested to be transferred to another
     *             LOU. The request is being processed at the sending LOU
     * 
     */
    PENDING_TRANSFER,

    /**
     * An LEI registration is about to be transferred to a different LOU, after
     *             which its registration status will revert to a non-pending status. 
     * 
     */
    PENDING_ARCHIVAL;

    public String value() {
        return name();
    }

    public static RegistrationStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}
