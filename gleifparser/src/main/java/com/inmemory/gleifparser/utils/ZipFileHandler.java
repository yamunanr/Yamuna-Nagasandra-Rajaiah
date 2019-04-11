package com.inmemory.gleifparser.utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.springframework.web.multipart.MultipartFile;

public final class ZipFileHandler {

	/**
	 * created to avoid class Instantiation
	 */
	private ZipFileHandler() {

	}

	public static Path unzipFile(MultipartFile file, String destFile, Path destinationDir) throws IOException {
		byte[] buffer = new byte[1024];
		Path newFile = Paths.get(destinationDir.toAbsolutePath().toString(), destFile);
		ZipInputStream zis = new ZipInputStream(file.getInputStream());
		ZipEntry zipEntry = zis.getNextEntry();
		if (zipEntry != null) {
			Files.createFile(newFile);
			try (FileOutputStream fos = new FileOutputStream(newFile.toFile())) {
				int len;
				while ((len = zis.read(buffer)) > 0) {
					fos.write(buffer, 0, len);
				}
			}
		}

		zis.close();

		return newFile;
	}
}
