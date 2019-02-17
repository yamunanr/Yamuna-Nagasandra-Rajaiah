
package com.inmemory.gleifparser.model.level1;

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
 *     &lt;enumeration value="LOU_FULL_PUBLISHED"/&gt;
 *     &lt;enumeration value="LOU_DELTA_PUBLISHED"/&gt;
 *     &lt;enumeration value="GLEIF_FULL_PUBLISHED"/&gt;
 *     &lt;enumeration value="GLEIF_DELTA_PUBLISHED"/&gt;
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
     * The file contains all LEI Data Records published by an LOU (all LEI Data
     *             Records for which the LOU is the 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:lei="http://www.gleif.org/data/schema/leidata/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ManagingLOU&lt;/code&gt;
     * </pre>
     * ) as of the date/time the file
     *             is created. 
     * 
     */
    LOU_FULL_PUBLISHED,

    /**
     * The file contains those LEI Data Records published by an LOU (all LEI
     *             Data Records for which the LOU is the 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:lei="http://www.gleif.org/data/schema/leidata/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ManagingLOU&lt;/code&gt;
     * </pre>
     * ) which are new or changed
     *             since the 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:lei="http://www.gleif.org/data/schema/leidata/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DeltaStart&lt;/code&gt;
     * </pre>
     *  date specified in the header, as of the date/time the
     *             file is created.
     * 
     */
    LOU_DELTA_PUBLISHED,

    /**
     * The file contains all LEI Data Records published by GLEIF (including all
     *             LEI Data Records from all LOUs) as of the date/time the file is created.
     *           
     * 
     */
    GLEIF_FULL_PUBLISHED,

    /**
     * The file contains those LEI Data Records published by GLEIF (including
     *             all LEI Data Records from all LOUs) which are new or changed since the
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:lei="http://www.gleif.org/data/schema/leidata/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DeltaStart&lt;/code&gt;
     * </pre>
     *  specified in the header, as of the date/time the file is
     *             created.
     * 
     */
    GLEIF_DELTA_PUBLISHED,

    /**
     * The file contains records matching criteria specified in a query.
     *           
     * 
     */
    QUERY_RESPONSE;

    public String value() {
        return name();
    }

    public static FileContentEnum fromValue(String v) {
        return valueOf(v);
    }

}
