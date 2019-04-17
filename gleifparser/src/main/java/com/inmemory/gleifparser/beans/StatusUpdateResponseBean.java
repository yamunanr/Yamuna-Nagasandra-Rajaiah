package com.inmemory.gleifparser.beans;

public class StatusUpdateResponseBean extends BaseBean{

	
	private long totalNumberOfRecords;
	
	private long numberOfProcessedRecords;
	
	private String percentageProcessed;
	
	private String status;

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

	public String getPercentageProcessed() {
		return percentageProcessed;
	}

	public void setPercentageProcessed(String percentageProcessed) {
		this.percentageProcessed = percentageProcessed;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
}
