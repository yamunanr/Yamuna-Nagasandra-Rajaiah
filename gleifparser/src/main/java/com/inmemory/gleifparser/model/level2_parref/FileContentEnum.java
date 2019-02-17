
package com.inmemory.gleifparser.model.level2_parref;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileContentEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FileContentEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LOU_FULL_INTERNAL"/&gt;
 *     &lt;enumeration value="GLEIF_FULL_INTERNAL"/&gt;
 *     &lt;enumeration value="GLEIF_DELTA_INTERNAL"/&gt;
 *     &lt;enumeration value="LOU_DELTA_INTERNAL"/&gt;
 *     &lt;enumeration value="QUERY_RESPONSE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FileContentEnum")
@XmlEnum
public enum FileContentEnum {


    /**
     * The file contains all Parent Reference Data records created for internal
     *             use by an LOU (all internal LEI Data Records for which the LOU is the
     *             ManagingLOU) as of the date/time the file is created
     * 
     */
    LOU_FULL_INTERNAL,

    /**
     * The file contains all Parent Reference Data records GLEIF manages
     *             internally to the GLEIS (including all internal Parent Reference Data records from all
     *             LOUs) as of the date/time the file is created
     * 
     */
    GLEIF_FULL_INTERNAL,

    /**
     * The file contains those Parent Reference Data records GLEIF manages
     *             internally to the GLEIS (including all internal Parent Reference Data records from all
     *             LOUs) which are new or changed since the DeltaStart date specified in the
     *             Header, as of the date/time the file is created
     * 
     */
    GLEIF_DELTA_INTERNAL,

    /**
     * The file contains those Parent Reference Data records created by an LOU for
     *             internal use (all internal Parent Reference Data records for which the LOU is the
     *             ManagingLOU) which are new or changed since the DeltaStart specified in the
     *             header, as of the date/time the file is created
     * 
     */
    LOU_DELTA_INTERNAL,
    QUERY_RESPONSE;

    public String value() {
        return name();
    }

    public static FileContentEnum fromValue(String v) {
        return valueOf(v);
    }

}
