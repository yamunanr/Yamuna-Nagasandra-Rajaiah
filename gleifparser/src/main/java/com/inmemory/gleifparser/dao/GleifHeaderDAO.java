package com.inmemory.gleifparser.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.inmemory.gleifparser.entity.GleifHeader;
@Repository
public interface GleifHeaderDAO extends JpaRepository<GleifHeader, Long> {

	@Query(value = "from GleifHeader where fileContent=:fileContent")
	GleifHeader findByFileContent(@Param("fileContent") String fileContent);
}
