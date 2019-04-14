package com.inmemory.gleifparser.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inmemory.gleifparser.entity.GleifHeader;
@Repository
public interface GleifHeaderDAO extends JpaRepository<GleifHeader, Long> {

}
