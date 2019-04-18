package com.inmemory.gleifparser.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inmemory.gleifparser.entity.Level2ReportingException;

@Repository
public interface Level2ReportingExceptionDAO extends JpaRepository<Level2ReportingException, Long> {

	@Query(value = "Select Max(Exception_ID) from Level2_Reporting_Exception", nativeQuery = true)
	public Long findMaxId();

	@Query(value = "Select Min(Exception_ID) from Level2_Reporting_Exception", nativeQuery = true)
	public Long findMinId();

	@Modifying
	@Query(value = "DELETE FROM Level2_Reporting_Exception where Exception_ID >= ? and Exception_ID <= ?", nativeQuery = true)
	public void deleteAllRecordsInRange(Long startId, Long endId);
	
	@Modifying
	@Query(value = "DELETE FROM Level2_Reporting_Exception where Exception_ID > ?  ", nativeQuery = true)
	public void deleteRecordKeyGreaterThan(Long startId);
}
