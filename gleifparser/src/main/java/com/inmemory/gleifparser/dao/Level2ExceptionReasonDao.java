package com.inmemory.gleifparser.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inmemory.gleifparser.entity.Level2ExceptionReason;
@Repository
public interface Level2ExceptionReasonDao extends JpaRepository<Level2ExceptionReason, Long> {

}
