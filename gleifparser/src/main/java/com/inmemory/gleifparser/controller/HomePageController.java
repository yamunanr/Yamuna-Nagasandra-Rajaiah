package com.inmemory.gleifparser.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.inmemory.gleifparser.model.KeyValue;

@Controller
public class HomePageController {
	

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
