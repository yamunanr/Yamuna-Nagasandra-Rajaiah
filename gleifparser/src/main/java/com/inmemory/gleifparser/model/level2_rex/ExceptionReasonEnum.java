
package com.inmemory.gleifparser.model.level2_rex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExceptionReasonEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExceptionReasonEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NO_LEI"/&gt;
 *     &lt;enumeration value="NATURAL_PERSONS"/&gt;
 *     &lt;enumeration value="NON_CONSOLIDATING"/&gt;
 *     &lt;enumeration value="NO_KNOWN_PERSON"/&gt;
 *     &lt;enumeration value="LEGAL_OBSTACLES"/&gt;
 *     &lt;enumeration value="CONSENT_NOT_OBTAINED"/&gt;
 *     &lt;enumeration value="BINDING_LEGAL_COMMITMENTS"/&gt;
 *     &lt;enumeration value="DETRIMENT_NOT_EXCLUDED"/&gt;
 *     &lt;enumeration value="DISCLOSURE_DETRIMENTAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExceptionReasonEnum")
@XmlEnum
public enum ExceptionReasonEnum {


    /**
     *  The parent does not consent to have an LEI.
     *                     
     * 
     */
    NO_LEI,

    /**
     * There is no parent according to the definition used, because
     *                         the entity is controlled by natural person(s) without any intermediate legal
     *                         entity meeting the definition of accounting consolidating parent.
     *                     
     * 
     */
    NATURAL_PERSONS,

    /**
     *  There is no parent according to the definition used, because
     *                         the entity is controlled by legal entities not subject to preparing
     *                         consolidated financial statements. 
     * 
     */
    NON_CONSOLIDATING,

    /**
     *  There is no parent according to the definition used, because
     *                         there is no known person controlling the entity (e.g.., diversified
     *                         shareholding). 
     * 
     */
    NO_KNOWN_PERSON,

    /**
     *  Obstacles in the laws or regulations of a jurisdiction
     *                         prevent providing or publishing this information. This does not include
     *                         cases where, under the applicable legal framework disclosing the parent
     *                         relationship would require the consent of one of the entities in the
     *                         relationship, or both, and such consent could not be obtained (in these
     *                         cases "CONSENT_NOT_OBTAINED" is the applicable code). The LOU is not
     *                         expected to verify or analyze whether the legal framework constitutes a
     *                         legal obstacle. 
     * 
     */
    LEGAL_OBSTACLES,

    /**
     *  Obstacles in the laws or regulations of a jurisdiction
     *                         prevent providing or publishing this information: “the consent of the parent
     *                         was necessary under the applicable legal framework and the parent did not
     *                         consent or could not be contacted”. Note that it is a responsibility of a
     *                         child entity to seek parent consent when necessary for disclosing the parent
     *                         relationship, for instance by inviting in writing the parent entity to
     *                         provide consent. The LOU is not expected to verify or analyze whether the
     *                         legal framework constitutes a legal obstacle. 
     * 
     */
    CONSENT_NOT_OBTAINED,

    /**
     *  Binding legal commitments (other than the laws or regulations
     *                         of a jurisdiction), such as articles governing the legal entity or a
     *                         contract, prevent providing or publishing this information. The LOU is not
     *                         expected to verify or analyze whether the legal framework constitutes a
     *                         legal obstacle. 
     * 
     */
    BINDING_LEGAL_COMMITMENTS,

    /**
     *  The child entity has sought to consult the parent entity
     *                         about the reporting of the parent information to the GLEIS but could not
     *                         confirm the absence of detriment in a way that can appropriately prevent
     *                         liability risks for the child entity (or those acting on its behalf) under
     *                         the applicable legal framework. The disclosure of this information would be
     *                         detrimental to the legal entity or the relevant parent. This will include
     *                         reasons generally accepted by public authorities in similar circumstances,
     *                         based on a declaration by the entity. 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:repex="http://www.gleif.org/data/schema/repex/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:repex="http://www.gleif.org/data/schema/repex/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     * This reason may be used only when all
     *                         following cumulative circumstances apply: [i) the parent could not be
     *                         informed via the GLEIS and have the possibility to correct the relationship
     *                         information before publication (including raising a cause for opt out,
     *                         either because the parent does not have an LEI, or it has an LEI but the
     *                         GLEIS has not yet implemented such system;] ii) the relationship is not
     *                         already in the public domain (information being in the public domain assumes
     *                         here that the way the information came into the public domain did not
     *                         infringe the applicable legal framework); iii) the child entity has reasons
     *                         to believe that the parent may consider disclosure to be detrimental; (iv)
     *                         the child entity has sought to consult the parent entity of the reporting of
     *                         the parent information to the GLEIS but could not confirm the absence of
     *                         detriment in a way that can appropriately prevent liability risks for the
     *                         child entity (or those acting on its behalf) under the applicable legal
     *                         framework.
     * 
     */
    DETRIMENT_NOT_EXCLUDED,

    /**
     *  The disclosure of this information would be detrimental to
     *                         the legal entity or the relevant parent. This will include reasons generally
     *                         accepted by public authorities in similar circumstances, based on a
     *                         declaration by the entity. 
     * 
     */
    DISCLOSURE_DETRIMENTAL;

    public String value() {
        return name();
    }

    public static ExceptionReasonEnum fromValue(String v) {
        return valueOf(v);
    }

}
