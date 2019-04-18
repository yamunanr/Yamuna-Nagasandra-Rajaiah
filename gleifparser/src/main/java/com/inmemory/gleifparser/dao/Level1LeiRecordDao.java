package com.inmemory.gleifparser.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

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
}
