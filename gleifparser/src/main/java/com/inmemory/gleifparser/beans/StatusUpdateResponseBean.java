package com.inmemory.gleifparser.beans;

public class StatusUpdateResponseBean extends BaseResponseBean{

	private long totalNumberOfRecords;
	
	private long numberOfProcessedRecords;
	
	private int percentageProcessed;

	public long getTotalNumberOfRecords() {
		return totalNumberOfRecords;
	}

	public void setTotalNumberOfRecords(long totalNumberOfRecords) {
		this.totalNumberOfRecords = totalNumberOfRecords;
	}

	public long getNumberOfProcessedRecords() {
		return numberOfProcessedRecords;
	}

	public void setNumberOfProcessedRecords(long numberOfProcessedRecords) {
		this.numberOfProcessedRecords = numberOfProcessedRecords;
	}

	public int getPercentageProcessed() {
		return percentageProcessed;
	}

	public void setPercentageProcessed(int percentageProcessed) {
		this.percentageProcessed = percentageProcessed;
	}
	
	
	
	
}
