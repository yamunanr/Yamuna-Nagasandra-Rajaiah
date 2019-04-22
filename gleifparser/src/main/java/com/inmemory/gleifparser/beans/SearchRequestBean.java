package com.inmemory.gleifparser.beans;

public class SearchRequestBean {

	private String legalName;
	
	private String countryName;
	
	private Integer size;
	
	private Integer page;
	

	public String getLegalName() {
		if(legalName==null) {
			legalName="";
		}
		return legalName;
	}

	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	public String getCountryName() {
		if(countryName==null) {
			countryName="";
		}
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	
	
	
}
