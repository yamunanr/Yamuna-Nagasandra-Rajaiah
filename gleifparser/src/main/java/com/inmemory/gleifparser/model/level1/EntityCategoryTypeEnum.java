
package com.inmemory.gleifparser.model.level1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityCategoryTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityCategoryTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="BRANCH"/&gt;
 *     &lt;enumeration value="FUND"/&gt;
 *     &lt;enumeration value="SOLE_PROPRIETOR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EntityCategoryTypeEnum")
@XmlEnum
public enum EntityCategoryTypeEnum {


    /**
     * The legal entity is a branch of another legal entity.
     * 
     */
    BRANCH,

    /**
     * The legal entity is a fund managed by another legal
     *             entity.
     * 
     */
    FUND,

    /**
     * The legal entity is an individual acting in a business
     *             capacity.
     * 
     */
    SOLE_PROPRIETOR;

    public String value() {
        return name();
    }

    public static EntityCategoryTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
