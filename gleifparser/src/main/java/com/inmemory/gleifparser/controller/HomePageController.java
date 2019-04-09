package com.inmemory.gleifparser.controller;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.inmemory.gleifparser.model.KeyValue;
import com.inmemory.gleifparser.service.GleifService;
import com.inmemory.gleifparser.utils.ZipFileHandler;

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
	
	@PostMapping("/xmlFileUpload")
	public String receiveXmlFile(@RequestParam("fileName") MultipartFile multipartFile) {
		//@RequestParam("fileName") MultipartFile multipartFile,@RequestParam("xmlfiletype") String xmlFileType
//		Path storageDir=Paths.get("/gleifparser/src/main/resources/uploadDir");
		Path storageDir=Paths.get("D:\\projects\\gleifparserandvisualier\\gleifparser\\src\\main\\resources\\uploadDir");
		
		String destFile=multipartFile.getOriginalFilename()+".xml";
		try {
			Path unzippefFilePath=ZipFileHandler.unzipFile(multipartFile, destFile, storageDir);
			gleifService.parseGleifFile(unzippefFilePath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "failure";
		}
		return "success";
	}
}
