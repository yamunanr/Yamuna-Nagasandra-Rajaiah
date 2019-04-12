package com.inmemory.gleifparser.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inmemory.gleifparser.entity.Level1LeiRecord;

@Repository
public interface Level1LeiRecordDao extends JpaRepository<Level1LeiRecord, String> {

}
