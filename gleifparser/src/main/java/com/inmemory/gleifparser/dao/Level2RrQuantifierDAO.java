package com.inmemory.gleifparser.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inmemory.gleifparser.entity.Level2RrRelationshipQuantifier;
@Repository
public interface Level2RrQuantifierDAO extends JpaRepository<Level2RrRelationshipQuantifier, Long> {

}
