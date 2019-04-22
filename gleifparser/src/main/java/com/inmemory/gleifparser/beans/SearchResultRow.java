package com.inmemory.gleifparser.beans;

public class SearchResultRow {
 
	private String lei;
	private String legalName;
	private String country;
	private String registrationStatus;
	private String entityLegalForm;
	private String legalAddress;
	
	public String getLei() {
		return lei;
	}
	public void setLei(String lei) {
		this.lei = lei;
	}
	public String getLegalName() {
		return legalName;
	}
	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getRegistrationStatus() {
		return registrationStatus;
	}
	public void setRegistrationStatus(String registrationStatus) {
		this.registrationStatus = registrationStatus;
	}
	public String getEntityLegalForm() {
		return entityLegalForm;
	}
	public void setEntityLegalForm(String entityLegalForm) {
		this.entityLegalForm = entityLegalForm;
	}
	public String getLegalAddress() {
		return legalAddress;
	}
	public void setLegalAddress(String legalAddress) {
		this.legalAddress = legalAddress;
	}
	public SearchResultRow(String lei, String legalName, String country, String registrationStatus,
			String entityLegalForm) {
		super();
		this.lei = lei;
		this.legalName = legalName;
		this.country = country;
		this.registrationStatus = registrationStatus;
		this.entityLegalForm = entityLegalForm;
	}
	
	
}
