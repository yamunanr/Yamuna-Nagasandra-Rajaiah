package com.inmemory.gleifparser.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inmemory.gleifparser.entity.Level2ExceptionReference;

@Repository
public interface Level2ExceptionReferenceDAO extends JpaRepository<Level2ExceptionReference, Long> {

	@Query(value = "Select Max(Exception_Reference_ID) from Level2_Exception_Reference", nativeQuery = true)
	public Long findMaxId();

	@Query(value = "Select Min(Exception_Reference_ID) from Level2_Exception_Reference", nativeQuery = true)
	public Long findMinId();

	@Modifying
	@Query(value = "DELETE FROM Level2_Exception_Reference where Exception_Reference_ID >= ? and Exception_Reference_ID <= ? ", nativeQuery = true)
	public void deleteAllRecordsInRange(Long startId, Long endId);
	
	@Modifying
	@Query(value = "DELETE FROM Level2_Exception_Reference where Exception_Reference_ID > ?  ", nativeQuery = true)
	public void deleteRecordKeyGreaterThan(Long startId);
}
