package com.inmemory.gleifparser.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the GLEIF_HEADER database table.
 * 
 */
@Entity
@Table(name = "COUNTRY_CODES")
@NamedQuery(name = "COUNTRY_CODES.findAll", query = "SELECT g FROM CountryCodes g order by country")
public class CountryCodes implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "code")
	private String code;

	@Column(name = "country")
	private String country;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}