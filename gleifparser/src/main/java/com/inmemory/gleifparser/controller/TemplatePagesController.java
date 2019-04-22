package com.inmemory.gleifparser.controller;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.inmemory.gleifparser.beans.LeiDataResponseBean;
import com.inmemory.gleifparser.beans.SearchRequestBean;
import com.inmemory.gleifparser.beans.SearchResultBean;
import com.inmemory.gleifparser.constants.Constants;
import com.inmemory.gleifparser.service.SearchService;

@Controller
public class TemplatePagesController {
	@Autowired
	private SearchService searchService;


	@GetMapping("/")
	public String indexPage(Model model) {
		return "index";
	}

	@PostMapping(path = "/search")
	public String filterBySearchCriteria(Model model, @RequestBody SearchRequestBean searchRequestBean) {
		int currentPage = searchRequestBean.getPage() != null ? searchRequestBean.getPage() : 1;
		int pageSize = searchRequestBean.getSize() != null ? searchRequestBean.getSize() : 5;
		SearchResultBean resultBean = new SearchResultBean();
		try {
			resultBean.setResultPage(
					searchService.findPaginatedResult(searchRequestBean, PageRequest.of(currentPage - 1, pageSize)));
			resultBean.setHeaders(Constants.getHeaders());
			if (resultBean.getResultPage().getTotalPages() > 0) {
				if(resultBean.getResultPage().getTotalPages()>20 ) {
					if(currentPage+20<resultBean.getResultPage().getTotalPages()) {
						if(currentPage>10) {
						resultBean.setPageNumbers(IntStream.rangeClosed(currentPage-10,currentPage+10).boxed()
								.collect(Collectors.toList()));
						}else {
							resultBean.setPageNumbers(IntStream.rangeClosed(currentPage,currentPage+20).boxed()
									.collect(Collectors.toList()));
						}
					}else {
						
						resultBean.setPageNumbers(IntStream.rangeClosed(currentPage, resultBean.getResultPage().getTotalPages()).boxed()
								.collect(Collectors.toList()));
					}
					
				}else {
					resultBean.setPageNumbers(IntStream.rangeClosed(1, resultBean.getResultPage().getTotalPages()).boxed()
						.collect(Collectors.toList()));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			resultBean.setError(true);
		}
		model.addAttribute("searchResult", resultBean);
		return "SearchResults";
	}
	
	@PostMapping(path = "/loadLei")
	public String loadLei(Model model, @RequestBody String lei) {
		LeiDataResponseBean responseBean=new LeiDataResponseBean();
	 if(lei!=null) {	
		try {
			responseBean=searchService.findLeiData(lei);
		}catch(Exception e) {
			responseBean.setError(true);
			e.printStackTrace();
		}
	 }else {
		 responseBean.setError(true);
	 }
		model.addAttribute("data", responseBean);
	return "leiDetails";
	}

}
