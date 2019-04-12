package com.inmemory.gleifparser.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.inmemory.gleifparser.model.KeyValue;
import com.inmemory.gleifparser.service.GleifService;

@Controller
public class HomePageController {
	@Autowired
	private GleifService gleifService;

	@GetMapping("/")
    public String homePage(Model model) {
		List<KeyValue> xmlFileList= new ArrayList<>();
		xmlFileList.add(new KeyValue("LEI", "LEI"));
		xmlFileList.add(new KeyValue("EXCEPTION", "Exception Records"));
        model.addAttribute("test", "test");
        model.addAttribute("xmlFileList", xmlFileList);
        return "home";
    }
	
	
}
