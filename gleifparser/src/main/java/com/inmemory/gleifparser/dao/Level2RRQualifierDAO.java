package com.inmemory.gleifparser.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inmemory.gleifparser.entity.Level2RrRelationshipQualifier;

@Repository
public interface Level2RRQualifierDAO extends JpaRepository<Level2RrRelationshipQualifier, Long> {

	@Query(value = "Select Max(Qualifier_RR_ID) from Level2_Rr_Relationship_Qualifier", nativeQuery = true)
	public Long findMaxId();

	@Query(value = "Select Min(Qualifier_RR_ID) from Level2_Rr_Relationship_Qualifier", nativeQuery = true)
	public Long findMinId();
	
	@Modifying
	@Query(value = "DELETE FROM Level2_Rr_Relationship_Qualifier where Qualifier_RR_ID >= ? and Qualifier_RR_ID <= ?", nativeQuery = true)
	public void deleteAllRecordsInRange(Long startId, Long endId);
	
	@Modifying
	@Query(value = "DELETE FROM Level2_Rr_Relationship_Qualifier where Qualifier_RR_ID > ?  ", nativeQuery = true)
	public void deleteRecordKeyGreaterThan(Long startId);
}
