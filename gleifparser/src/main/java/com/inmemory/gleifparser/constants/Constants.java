package com.inmemory.gleifparser.constants;

import java.util.ArrayList;
import java.util.List;

public final class Constants {

	private Constants() {
	}

	public static final int SEQUENCE_ALLOCATION_SIZE = 200;
	public static final int SAVE_RECORDS_BATCH_SIZE = 200;
	public static final String STATUS_IN_PROGRESS = "In Progress";
	public static final String STATUS_FAILED = "FAILED";
	public static final String STATUS_COMPLETE = "COMPLETE";
	public static final String STATUS_DELETION = "CLEANING UP";
	public static final String ONLY_FULL_PUBLISHED_FILES_ARE_SUPPORTED = "ONLY \"GLEIF_FULL_PUBLISHED\" are supported.This looks like a delta file";
	public static final String DELETE_OLD_RECORDS="DELETING OBSOLETE RECORDS";
	public static final String FILE_PARSED_SUCCESSFULLY="File parsed and saved successfully in SAP HANA";
	
	public static List<String> getHeaders(){
		List<String> headers=new ArrayList<>();
		headers.add("LEI");
		headers.add("Legal Name");
		headers.add("Country");
		headers.add("Registration Status");
		headers.add("Entity Legal Form");
		
		return headers;
	}
}
