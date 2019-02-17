
package com.inmemory.gleifparser.model.level2_rr;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QualifierDimensionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QualifierDimensionEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACCOUNTING_STANDARD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QualifierDimensionEnum")
@XmlEnum
public enum QualifierDimensionEnum {


    /**
     * The accounting standard applied to determine the definition of
     *                         e.g. ultimate or direct accounting consolidating parent for the relationship
     *                         detailed in this 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;RelationshipRecord&lt;/code&gt;
     * </pre>
     * . The relevant accounting
     *                         standard is that applicable to the 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;EndNode&lt;/code&gt;
     * </pre>
     *  (the "parent"
     *                         entity).
     * 
     */
    ACCOUNTING_STANDARD;

    public String value() {
        return name();
    }

    public static QualifierDimensionEnum fromValue(String v) {
        return valueOf(v);
    }

}
