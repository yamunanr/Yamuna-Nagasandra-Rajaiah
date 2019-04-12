package com.inmemory.gleifparser.service;

import java.nio.file.Path;

public interface GleifAsyncService {

	public String processAndSaveXmlData(Path xmlFilePath);
}
