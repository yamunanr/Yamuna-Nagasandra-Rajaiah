package com.inmemory.gleifparser.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inmemory.gleifparser.entity.Level2ExceptionReason;

@Repository
public interface Level2ExceptionReasonDao extends JpaRepository<Level2ExceptionReason, Long> {

	@Query(value = "Select Max(Exception_Reason_ID) from Level2_Exception_Reason", nativeQuery = true)
	public Long findMaxId();

	@Query(value = "Select Min(Exception_Reason_ID) from Level2_Exception_Reason", nativeQuery = true)
	public Long findMinId();

	@Modifying
	@Query(value = "DELETE FROM Level2_Exception_Reason where Exception_Reason_ID >= ? and Exception_Reason_ID <= ? ", nativeQuery = true)
	public void deleteAllRecordsInRange(Long startId, Long endId);
	
	@Modifying
	@Query(value = "DELETE FROM Level2_Exception_Reason where Exception_Reason_ID > ?  ", nativeQuery = true)
	public void deleteRecordKeyGreaterThan(Long startId);
}
