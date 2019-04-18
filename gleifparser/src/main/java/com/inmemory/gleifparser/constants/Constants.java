package com.inmemory.gleifparser.constants;

public final class Constants {

	private Constants() {
	}

	public static final int SEQUENCE_ALLOCATION_SIZE = 1000;
	public static final int SAVE_RECORDS_BATCH_SIZE = 1000;
	public static final String STATUS_IN_PROGRESS = "In Progress";
	public static final String STATUS_FAILED = "FAILED";
	public static final String STATUS_COMPLETE = "COMPLETE";
	public static final String ONLY_FULL_PUBLISHED_FILES_ARE_SUPPORTED = "ONLY \"GLEIF_FULL_PUBLISHED\" are supported.This looks like a delta file";
	public static final String DELETE_OLD_RECORDS="DELETING OLD RECORDS";
}
