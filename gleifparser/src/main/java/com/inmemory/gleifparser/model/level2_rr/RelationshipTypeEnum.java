
package com.inmemory.gleifparser.model.level2_rr;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelationshipTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RelationshipTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IS_DIRECTLY_CONSOLIDATED_BY"/&gt;
 *     &lt;enumeration value="IS_ULTIMATELY_CONSOLIDATED_BY"/&gt;
 *     &lt;enumeration value="IS_INTERNATIONAL_BRANCH_OF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RelationshipTypeEnum")
@XmlEnum
public enum RelationshipTypeEnum {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;StartNode&lt;/code&gt;
     * </pre>
     *  is directly consolidated by
     *                             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;EndNode&lt;/code&gt;
     * </pre>
     * . The 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;StartNode&lt;/code&gt;
     * </pre>
     *  "child" entity has its
     *                         accounts fully consolidated by the 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;EndNode&lt;/code&gt;
     * </pre>
     *  "parent" entity, in
     *                         the sense given by the accounting standard(s) specified in
     *                         RelationshipQualifiers; the 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;EndNode&lt;/code&gt;
     * </pre>
     *  entity is the closest fully
     *                         consolidating parent to the 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;StartNode&lt;/code&gt;
     * </pre>
     *  entity in any applicable
     *                         hierarchical ownership structure.
     * 
     */
    IS_DIRECTLY_CONSOLIDATED_BY,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;StartNode&lt;/code&gt;
     * </pre>
     *  is ultimately consolidated by
     *                             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;EndNode&lt;/code&gt;
     * </pre>
     * . The 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;StartNode&lt;/code&gt;
     * </pre>
     *  "child" entity has its
     *                         accounts fully consolidated by the 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;EndNode&lt;/code&gt;
     * </pre>
     *  "parent" entity, in
     *                         the sense given by the accounting standard(s) specified in
     *                         RelationshipQualifiers; the 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;EndNode&lt;/code&gt;
     * </pre>
     *  entity is the most distant
     *                         fully consolidating parent from the 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;StartNode&lt;/code&gt;
     * </pre>
     *  entity in any
     *                         applicable hierarchical ownership structure.
     * 
     */
    IS_ULTIMATELY_CONSOLIDATED_BY,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;StartNode&lt;/code&gt;
     * </pre>
     *  is an international branch of the legal
     *                         entity designated by 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;EndNode&lt;/code&gt;
     * </pre>
     *  (in jurisdiction country of
     *                             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;StartNode&lt;/code&gt;
     * </pre>
     * ). The 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;EndNode&lt;/code&gt;
     * </pre>
     *  is the Head Office and
     *                         MUST be an LEI.
     * 
     */
    IS_INTERNATIONAL_BRANCH_OF;

    public String value() {
        return name();
    }

    public static RelationshipTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
