package com.inmemory.gleifparser.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.inmemory.gleifparser.entity.CountryCodes;

public interface CountryCodesDao extends JpaRepository<CountryCodes, String> {

	@Query("Select code from CountryCodes c where lower(c.country)=lower(:country)")
	public String findCodeByCountry(@Param("country")String country);
	
}
