
package com.inmemory.gleifparser.model.level2_rr;

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
 *     &lt;enumeration value="LOU_DELTA_INTERNAL"/&gt;
 *     &lt;enumeration value="LOU_FULL_PUBLISHED"/&gt;
 *     &lt;enumeration value="LOU_DELTA_PUBLISHED"/&gt;
 *     &lt;enumeration value="GLEIF_FULL_INTERNAL"/&gt;
 *     &lt;enumeration value="GLEIF_DELTA_INTERNAL"/&gt;
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
     * The file contains all relationship records created for
     *                         internal use by an LOU (all internal relationship records for which the LOU
     *                         is the 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ManagingLOU&lt;/code&gt;
     * </pre>
     * ) as of the date/time the file is
     *                         created.
     * 
     */
    LOU_FULL_INTERNAL,

    /**
     * The file contains those relationship records created by an LOU
     *                         for internal use (all internal relationship records for which the LOU is the
     *                             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ManagingLOU&lt;/code&gt;
     * </pre>
     * ) which are new or changed since the
     *                             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DeltaStart&lt;/code&gt;
     * </pre>
     *  specified in the 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Header&lt;/code&gt;
     * </pre>
     * , as of the
     *                         date/time the file is created.
     * 
     */
    LOU_DELTA_INTERNAL,

    /**
     * The file contains all relationship records published by an LOU
     *                         (all relationship records for which the LOU is the 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ManagingLOU&lt;/code&gt;
     * </pre>
     * )
     *                         as of the date/time the file is created.
     * 
     */
    LOU_FULL_PUBLISHED,

    /**
     * The file contains those relationship records published by an
     *                         LOU (all relationship records for which the LOU is the
     *                             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ManagingLOU&lt;/code&gt;
     * </pre>
     * ) which are new or changed since the
     *                             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DeltaStart&lt;/code&gt;
     * </pre>
     *  specified in the 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Header&lt;/code&gt;
     * </pre>
     * , as of the
     *                         date/time the file is created
     * 
     */
    LOU_DELTA_PUBLISHED,

    /**
     * The file contains all relationship records GLEIF manages
     *                         internally to the GLEIS (including all internal relationship records from
     *                         all LOUs) as of the date/time the file is created.
     * 
     */
    GLEIF_FULL_INTERNAL,

    /**
     * The file contains those relationship records GLEIF manages
     *                         internally to the GLEIS (including all internal relationship records from
     *                         all LOUs) which are new or changed since the 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DeltaStart&lt;/code&gt;
     * </pre>
     *  date
     *                         specified in the 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Header&lt;/code&gt;
     * </pre>
     * , as of the date/time the file is
     *                         created.
     * 
     */
    GLEIF_DELTA_INTERNAL,

    /**
     * The file contains all relationship records published by GLEIF
     *                         (including all relationship records from all LOUs) as of the date/time the
     *                         file is created.
     * 
     */
    GLEIF_FULL_PUBLISHED,

    /**
     * The file contains those relationship records published by
     *                         GLEIF (including all relationship records from all LOUs) which are new or
     *                         changed since the 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DeltaStart&lt;/code&gt;
     * </pre>
     *  date specified in the
     *                             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:rr="http://www.gleif.org/data/schema/rr/2016" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Header&lt;/code&gt;
     * </pre>
     * , as of the date/time the file is
     *                         created.
     * 
     */
    GLEIF_DELTA_PUBLISHED,

    /**
     * The file contains records matching criteria specified in a
     *                         query.
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
