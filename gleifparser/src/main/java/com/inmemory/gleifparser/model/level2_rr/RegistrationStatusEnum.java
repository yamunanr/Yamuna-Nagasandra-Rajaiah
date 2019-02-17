
package com.inmemory.gleifparser.model.level2_rr;

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
 *     &lt;enumeration value="PUBLISHED"/&gt;
 *     &lt;enumeration value="DUPLICATE"/&gt;
 *     &lt;enumeration value="LAPSED"/&gt;
 *     &lt;enumeration value="RETIRED"/&gt;
 *     &lt;enumeration value="ANNULLED"/&gt;
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
     * A relationship data report that has been submitted to the LOU
     *                         and which is being processed and validated, prior to
     *                         publication.
     * 
     */
    PENDING_VALIDATION,

    /**
     * A relationship data report that has been validated and
     *                         published, and which is reported by an entity that was an operating legal
     *                         entity as of the last update.
     * 
     */
    PUBLISHED,

    /**
     * A relationship data report that has been determined to be a
     *                         duplicate registration of the same relationship. In many cases this will
     *                         mean more than one report with e.g. the same 2 entity IDs, the same
     *                         relationship type, certain status values and the same relationship date(s),
     *                         but this determination will depend on the relationship type in
     *                         question.
     * 
     */
    DUPLICATE,

    /**
     * A relationship data report that has not been renewed by the
     *                             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;NextRenewalDate&lt;/code&gt;
     * </pre>
     * .
     * 
     */
    LAPSED,

    /**
     * The relationship is considered to have ended, but the
     *                         relationship report is kept in publication for historical audit trail
     *                         purposes.
     * 
     */
    RETIRED,

    /**
     * A relationship data report that was marked as erroneous or
     *                         invalid after it was published. The relationship report is kept in
     *                         publication for historical audit trail purposes only (so that data
     *                         recipients can correct their local data).
     * 
     */
    ANNULLED,

    /**
     * A relationship data report that has been transferred to a
     *                         different LOU as the 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ManagingLOU&lt;/code&gt;
     * </pre>
     * . A record in this state is not
     *                         published, but may be used internally by the prior LOU for audit trail
     *                         purposes.
     * 
     */
    TRANSFERRED,

    /**
     * A relationship data report for which a transfer to another LOU
     *                         has been requested. The request is being processed at the sending LOU. When
     *                         the receiving LOU is ready, the status will be changed to
     *                             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PENDING_ARCHIVAL&lt;/code&gt;
     * </pre>
     *  by the sending LOU prior to completion of
     *                         the transfer.
     * 
     */
    PENDING_TRANSFER,

    /**
     * This relationship data report is about to be transferred to a
     *                         different LOU, after which its registration status will revert to a
     *                         non-pending status. The 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PENDING_ARCHIVAL&lt;/code&gt;
     * </pre>
     *  status serves to
     *                         inform recipients of LOU-provided data files that a relationship record will
     *                         be removed from that LOU’s published file after the transfer is
     *                         complete
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
