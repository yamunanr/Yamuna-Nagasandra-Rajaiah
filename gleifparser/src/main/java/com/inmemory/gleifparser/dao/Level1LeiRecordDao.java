package com.inmemory.gleifparser.dao;

import java.util.List;
import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.inmemory.gleifparser.beans.KeyValue;
import com.inmemory.gleifparser.beans.LeiDataResponseBean;
import com.inmemory.gleifparser.beans.SearchResultRow;
import com.inmemory.gleifparser.entity.Level1LeiRecord;

@Repository
public interface Level1LeiRecordDao extends JpaRepository<Level1LeiRecord, Long> {

	@Query(value = "Select Max(LEI_ID) from LEVEL1_LEI_RECORD", nativeQuery = true)
	public Long findMaxId();

	@Query(value = "Select Min(LEI_ID) from LEVEL1_LEI_RECORD", nativeQuery = true)
	public Long findMinId();

	@Modifying
	@Query(value = "DELETE FROM LEVEL1_LEI_RECORD where LEI_ID >= ? and LEI_ID <= ? ", nativeQuery = true)
	public void deleteAllRecordsInRange(Long startId, Long endId);

	@Modifying
	@Query(value = "DELETE FROM LEVEL1_LEI_RECORD where LEI_ID > ?  ", nativeQuery = true)
	public void deleteRecordKeyGreaterThan(Long startId);

	@Query(value = "Select E_LEGAL_NAME_TYPE_VALUE from LEVEL1_LEI_RECORD where "
			+ "LOWER(E_LEGAL_NAME_TYPE_VALUE) like LOWER(?)  ORDER BY E_LEGAL_NAME_TYPE_VALUE  ASC  LIMIT 30 ", nativeQuery = true)
	public List<String> findLegalNames(String searchText);

	@Query(value = "SELECT COUNTRY FROM COUNTRY_CODES where code in(SELECT DISTINCT E_HQ_Country "
			+ "FROM LEVEL1_LEI_RECORD WHERE E_HQ_COUNTRY  IN (SELECT code FROM COUNTRY_CODES "
			+ " where lower(country) like lower(?) or lower(code) like lower(?)) ) order by country ASC", nativeQuery = true)
	public List<String> findCountryNames(String countrySearchText, String codeSearchText);

	@Query("Select new com.inmemory.gleifparser.beans.SearchResultRow(l1.lei,l1.eLegalNameTypeValue,cc.country,l1.rRegistrationStatus,l1.eOtherLegalForm) "
			+ "from Level1LeiRecord l1, "
			+ "CountryCodes cc where "
			+ "cc.code=l1.eHqCountry and "
			+ "lower(l1.eLegalNameTypeValue) like lower(concat(:legalName,'%')) and "
			+ "l1.eHqCountry like concat(:country,'%')")
	Page<SearchResultRow> findByLegalNames(@Param("legalName")String legalName,@Param("country")String country, Pageable pageable);
	
	@Query("Select new com.inmemory.gleifparser.beans.LeiDataResponseBean(l1.lei,"
			+ "l1.eLegalNameTypeValue,"
			+ "l1.rValidationAuthorityEntityId,"
			+ "cc1.country,"
			+ "l1.eEntityLegalFormCode,"
			+ "l1.eEntityStatus,"
			+ "l1.eLegalAddressFirstAddressLine,"
			+ "l1.eLegalAddressAddressNumber,"
			+ "l1.eLegalAddressAddressNumberWithinBuilding,"
			+ "l1.eLegalAddressMailRouting,"
			+ "l1.eLegalAddressAdditionalAddressLine1,"
			+ "l1.eLegalAddressAdditionalAddressLine2,"
			+ "l1.eLegalAddressAdditionalAddressLine3,"
			+ "l1.eLegalAddressPostalcode,"
			+ "l1.eLegalAddressCity,"
			+ "l1.eLegalAddressRegion,"
			+ "l1.eLegalAddressCountry,"
			+ "l1.rInitialRegistrationDate,"
			+ "l1.rLastUpdateDate,"
			+ "l1.rRegistrationStatus,"
			+ "l1.rNextRenewalDate,"
			+ "l1.rManagingLou,"
			+ "l1.rValidationSources) from Level1LeiRecord l1,CountryCodes cc1 where "
			+ "cc1.code=l1.eLegalAddressCountry and "
			+ "lower(l1.lei) = lower(:lei)")
	public LeiDataResponseBean findLeiData(@Param("lei")String lei);
	
	@Query(value = "Select new  com.inmemory.gleifparser.beans.KeyValue(l1.lei,l1.eLegalNameTypeValue) from"
			+ " Level1LeiRecord l1,Level2RelationshipRecord rr"
			+ " where "
			+ "l1.lei=rr.relationshipEndNodeId and "
			+ "rr.relationshipStartNodeId=:childLei and rr.relationshipType='IS_ULTIMATELY_CONSOLIDATED_BY'")
	public Set<KeyValue> findParents(@Param("childLei")String childLei);
	
	
	@Query(value = "Select new  com.inmemory.gleifparser.beans.KeyValue(l1.lei,l1.eLegalNameTypeValue) from"
			+ " Level1LeiRecord l1,Level2RelationshipRecord rr"
			+ " where "
			+ "l1.lei=rr.relationshipStartNodeId and "
			+ "rr.relationshipEndNodeId=:parentLei and rr.relationshipType='IS_ULTIMATELY_CONSOLIDATED_BY'")
	public Set<KeyValue> findChilds(@Param("parentLei")String parentLei);
	
}
