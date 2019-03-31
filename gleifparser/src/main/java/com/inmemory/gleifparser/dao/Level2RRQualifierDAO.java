package com.inmemory.gleifparser.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inmemory.gleifparser.entity.Level2RrRelationshipQualifier;

@Repository
public interface Level2RRQualifierDAO extends JpaRepository<Level2RrRelationshipQualifier, Long> {

}
