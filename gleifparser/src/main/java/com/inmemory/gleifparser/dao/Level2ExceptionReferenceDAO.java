package com.inmemory.gleifparser.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inmemory.gleifparser.entity.Level2ExceptionReference;

@Repository
public interface Level2ExceptionReferenceDAO extends JpaRepository<Level2ExceptionReference, Long> {

}
