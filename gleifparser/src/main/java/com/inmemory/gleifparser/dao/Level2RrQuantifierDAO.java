package com.inmemory.gleifparser.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inmemory.gleifparser.entity.Level2RrRelationshipQuantifier;

@Repository
public interface Level2RrQuantifierDAO extends JpaRepository<Level2RrRelationshipQuantifier, Long> {

	@Query(value = "Select Max(Quantifier_RR_ID) from Level2_Rr_Relationship_Quantifier", nativeQuery = true)
	public Long findMaxId();

	@Query(value = "Select Min(Quantifier_RR_ID) from Level2_Rr_Relationship_Quantifier", nativeQuery = true)
	public Long findMinId();

	@Modifying
	@Query(value = "DELETE FROM Level2_Rr_Relationship_Quantifier where Quantifier_RR_ID >= ? and Quantifier_RR_ID <= ?", nativeQuery = true)
	public void deleteAllRecordsInRange(Long startId, Long endId);
	
	@Modifying
	@Query(value = "DELETE FROM Level2_Rr_Relationship_Quantifier where Quantifier_RR_ID > ?  ", nativeQuery = true)
	public void deleteRecordKeyGreaterThan(Long startId);
	
	
}
