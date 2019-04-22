package com.inmemory.gleifparser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inmemory.gleifparser.beans.TypeAHeadResponseBean;
import com.inmemory.gleifparser.service.SearchService;

@RestController
public class QueryFinderController {
	@Autowired
	private SearchService searchService;

	@PostMapping(path = "/suggestLegalNames")
	public TypeAHeadResponseBean findLegalNamesContainingText(@RequestBody String searchText) {
		TypeAHeadResponseBean typeAHeadResponseBean = new TypeAHeadResponseBean();
		try {
			typeAHeadResponseBean.setSuggestions(searchService.findLegalNamesHavingText(searchText));
		} catch (Exception e) {
			typeAHeadResponseBean.setError(true);
		}
		return typeAHeadResponseBean;
	}

	@PostMapping(path = "/suggestCountryNames")
	public TypeAHeadResponseBean findCountryNamesContainingText(@RequestBody String searchText) {
		TypeAHeadResponseBean typeAHeadResponseBean = new TypeAHeadResponseBean();
		try {
			typeAHeadResponseBean.setSuggestions(searchService.findCountryNamesHavingText(searchText));
		} catch (Exception e) {
			typeAHeadResponseBean.setError(true);
		}
		return typeAHeadResponseBean;
	}

	
}
