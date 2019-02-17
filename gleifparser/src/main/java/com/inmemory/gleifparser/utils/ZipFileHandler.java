package com.inmemory.gleifparser.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

public final class ZipFileHandler {

	public static Path unzipFile(MultipartFile file, String destFile, Path destinationDir) throws IOException {
		// save received file temporarily
		Path zipFilePath = Paths.get(destinationDir.toString(), StringUtils.cleanPath(file.getOriginalFilename()));
		Files.copy(file.getInputStream(), zipFilePath, StandardCopyOption.REPLACE_EXISTING);

		byte[] buffer = new byte[1024];
		ZipInputStream zis = new ZipInputStream(new FileInputStream(zipFilePath.toString()));
		ZipEntry zipEntry = zis.getNextEntry();
		 Path newFile =null;
		if (zipEntry != null) {
			 newFile = Paths.get(destinationDir.toString(), destFile);
			 Files.createFile(newFile);
	            FileOutputStream fos = new FileOutputStream(newFile.toFile());
	            int len;
	            while ((len = zis.read(buffer)) > 0) {
	                fos.write(buffer, 0, len);
	            }
	            fos.close();
	            zipEntry = zis.getNextEntry();
		}
		zis.close();
		Files.delete(zipFilePath);
		return newFile;
	}
}
