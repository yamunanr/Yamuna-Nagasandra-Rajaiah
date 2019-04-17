/**
 * 
 */
package com.inmemory.gleifparser.constants;

/**
 * @author Bhuvanesh
 *
 */
public final class XmlDataConstants {

	// lei xml relation
	public static final String LEVEL_1_LEI_XML_ROOT_TYPE = "LEIData";
	public static final String LEVEL_1_LEI_HEADER_ROOT = "leiHeader";
	public static final String LEVEL_1_LEI_RECORDS_ROOT = "leiRecords";
	public static final String LEVEL_1_LEI_RECORD_ROOT = "leiRecord";

	// Relationship record related
	public static final String LEVEL_2_RELATIONSHIP_RECORD_XML_ROOT_TYPE = "RelationshipData";
	public static final String LEVEL_2_RELATIONSHIP_RECORD_HEADER = "Header";
	public static final String LEVEL_2_RELATIONSHIP_RECORDS = "RelationshipRecords";
	public static final String LEVEL_2_RELATIONSHIP_RECORD = "RelationshipRecord";

	// reporting exception related
	public static final String LEVEL_2_REPORTING_EXCEPTION_XML_ROOT_TYPE = "ReportingExceptionData";
	public static final String LEVEL_2_REPORTING_EXCEPTION_HEADER = "Header";
	public static final String LEVEL_2_REPORTING_EXCEPTION_RECORDS = "ReportingExceptions";
	public static final String LEVEL_2_REPORTING_EXCEPTION_RECORD = "Exception";

	public static final String FILE_TYPE_LEVEL1_LEI = "LEVEL_1_LEI";
	public static final String FILE_TYPE_LEVEL2_RR = "LEVEL_2_RR";
	public static final String FILE_TYPE_LEVEL2_REP_EXCEPTION = "LEVEL_2_REPORTING_EXCEPTION";
	public static final String FILE_CONTENT_FULL_PUBLISHED = "GLEIF_FULL_PUBLISHED";
}
