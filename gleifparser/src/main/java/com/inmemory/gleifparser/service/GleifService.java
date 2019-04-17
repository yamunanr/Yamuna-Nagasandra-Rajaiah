package com.inmemory.gleifparser.service;

import java.nio.file.Path;

public interface GleifService {

	String parseGleifFile(Path xmlFilePath,String subscriberId);

}