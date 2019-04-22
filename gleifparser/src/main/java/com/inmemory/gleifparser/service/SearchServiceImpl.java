package com.inmemory.gleifparser.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.inmemory.gleifparser.beans.LeiDataResponseBean;
import com.inmemory.gleifparser.beans.SearchRequestBean;
import com.inmemory.gleifparser.beans.SearchResultRow;
import com.inmemory.gleifparser.dao.CountryCodesDao;
import com.inmemory.gleifparser.dao.Level1LeiRecordDao;

@Service
public class SearchServiceImpl implements SearchService {
@Autowired
private Level1LeiRecordDao level1LeiRecordDao;

@Autowired
private CountryCodesDao countryCodesDao;
	
	@Override
	public List<String> findLegalNamesHavingText(String searchText) {
		List<String> legalNames=new ArrayList<>();
			if(searchText!=null) {
				searchText="%"+searchText+"%";
				legalNames=level1LeiRecordDao.findLegalNames(searchText);
			}
			return legalNames;
	}

	@Override
	public List<String> findCountryNamesHavingText(String searchText) {
		List<String> countryNames=new ArrayList<>();
		if(searchText!=null) {
			searchText=searchText+"%";
			countryNames=level1LeiRecordDao.findCountryNames(searchText,searchText);
		}
		return countryNames;
		
		
	}

	@Override
	public Page<SearchResultRow> findPaginatedResult(SearchRequestBean searchRequestBean, Pageable pageable) {
		String countryCode="";
		if(searchRequestBean.getCountryName()!=null) {
			if(searchRequestBean.getCountryName().length()>2) {
				countryCode=countryCodesDao.findCodeByCountry(searchRequestBean.getCountryName());
			}else {
				countryCode=searchRequestBean.getCountryName();
			}
		}
		return level1LeiRecordDao.findByLegalNames(searchRequestBean.getLegalName(),countryCode, pageable);
	}

	@Override
	public LeiDataResponseBean findLeiData(String lei) {
		
		LeiDataResponseBean responseBean = level1LeiRecordDao.findLeiData(lei);
		responseBean.setChildLeis(level1LeiRecordDao.findChilds(lei));	
		responseBean.setParentLeis(level1LeiRecordDao.findParents(lei));
		return responseBean;
	}
	
	
	

}
