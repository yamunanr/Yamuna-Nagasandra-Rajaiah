package com.inmemory.gleifparser.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inmemory.gleifparser.entity.Level2RelationshipRecord;

@Repository
public interface LevelTwoRRDao extends JpaRepository<Level2RelationshipRecord, Long> {

	@Query(value = "Select Max(RR_ID) from LEVEL2_RELATIONSHIP_RECORD", nativeQuery = true)
	public Long findMaxId();

	@Query(value = "Select Min(RR_ID) from LEVEL2_RELATIONSHIP_RECORD", nativeQuery = true)
	public Long findMinId();

	@Modifying
	@Query(value = "DELETE FROM LEVEL2_RELATIONSHIP_RECORD where RR_ID >= ? and RR_ID <= ?", nativeQuery = true)
	public void deleteAllRecordsInRange(Long startId, Long endId);

	@Modifying
	@Query(value = "DELETE FROM LEVEL2_RELATIONSHIP_RECORD where RR_ID > ?  ", nativeQuery = true)
	public void deleteRecordKeyGreaterThan(Long startId);
}
