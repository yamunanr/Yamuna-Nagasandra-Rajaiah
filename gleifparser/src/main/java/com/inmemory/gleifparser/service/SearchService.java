package com.inmemory.gleifparser.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.inmemory.gleifparser.beans.LeiDataResponseBean;
import com.inmemory.gleifparser.beans.SearchRequestBean;
import com.inmemory.gleifparser.beans.SearchResultRow;

public interface SearchService {

	public List<String> findLegalNamesHavingText(String searchText);

	public List<String> findCountryNamesHavingText(String searchText);

	public Page<SearchResultRow> findPaginatedResult(SearchRequestBean searchRequestBean, Pageable pageable);
	
	public LeiDataResponseBean findLeiData(String lei);

}
