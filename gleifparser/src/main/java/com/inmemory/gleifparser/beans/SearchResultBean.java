package com.inmemory.gleifparser.beans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;

public class SearchResultBean extends BaseBean{

	private List<Integer> pageNumbers;
	private Page<SearchResultRow>  resultPage;
	private List<String> headers;
	
	
	public List<Integer> getPageNumbers() {
		if(pageNumbers==null) {
			return new ArrayList<>();
		}else {
			return pageNumbers;
		}
	}
	public void setPageNumbers(List<Integer> pageNumbers) {
		this.pageNumbers = pageNumbers;
	}
	public Page<SearchResultRow> getResultPage() {
		return resultPage;
	}
	public void setResultPage(Page<SearchResultRow> resultPage) {
		this.resultPage = resultPage;
	}
	public List<String> getHeaders() {
		return headers;
	}
	public void setHeaders(List<String> headers) {
		this.headers = headers;
	}
	
	
	
}
