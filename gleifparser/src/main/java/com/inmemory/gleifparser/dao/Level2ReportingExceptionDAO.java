package com.inmemory.gleifparser.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inmemory.gleifparser.entity.Level2ReportingException;
@Repository
public interface Level2ReportingExceptionDAO extends JpaRepository<Level2ReportingException, Long> {

}
