package com.inmemory.gleifparser.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inmemory.gleifparser.entity.Level2RelationshipRecord;
@Repository
public interface LevelTwoRRDao extends JpaRepository<Level2RelationshipRecord, Long > {

}
