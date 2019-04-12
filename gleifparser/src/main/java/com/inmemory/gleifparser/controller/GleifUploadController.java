package com.inmemory.gleifparser.controller;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.inmemory.gleifparser.beans.XmlUploadResponseBean;
import com.inmemory.gleifparser.service.GleifAsyncService;
import com.inmemory.gleifparser.utils.ZipFileHandler;

@RestController
public class GleifUploadController {

	@Autowired
	private GleifAsyncService gleifAsyncService;

	@PostMapping("/xmlFileUpload")
	public XmlUploadResponseBean receiveXmlFile(@RequestParam("fileName") MultipartFile multipartFile) {
		XmlUploadResponseBean response = new XmlUploadResponseBean();
		Path storageDir = Paths.get(".\\src\\main\\resources\\uploadDir");
		String destFile = generateUniqueFileName();
		try {
			Path unzippefFilePath = ZipFileHandler.unzipFile(multipartFile, destFile, storageDir);
			gleifAsyncService.processAndSaveXmlData(unzippefFilePath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setError(true);
		}
		return response;
	}

	private String generateUniqueFileName() {
		String filename = "";
		String datetime = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		datetime = datetime.replace(" ", "");
		datetime = datetime.replace(":", "-");
		datetime = datetime.replace(".", "_");
		String rndchars = RandomStringUtils.randomAlphanumeric(10);
		filename = rndchars + "_" + datetime + ".xml";
		return filename;
	}

}
