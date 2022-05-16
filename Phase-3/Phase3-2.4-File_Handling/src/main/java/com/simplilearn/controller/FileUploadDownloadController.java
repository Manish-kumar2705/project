package com.simplilearn.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadDownloadController {

	@RequestMapping(value = "/upload", method = RequestMethod.POST, consumes = MediaType. MULTIPART_FORM_DATA_VALUE)
	public String fileUpload(@RequestParam("file") MultipartFile file) {
		String result = "File uploaded successfully";

		try {

			File convertFile = new File("/var/tmp/" + file.getOriginalFilename());
			convertFile.createNewFile();

			FileOutputStream fout = new FileOutputStream(convertFile);
			fout.write(file.getBytes());
			fout.close();

		} catch (Exception e) {
			e.printStackTrace();
			result = "Error :" + e.getMessage();
		}

		return result;
	}
	/*@RequestMapping(value="/download", method=RequestMethod.GET)
	public ResponseEntity<Object> downloadFile(@RequestParam("fileName") String fileName) throws FileNotFoundException {
		File file = new File("/var/tmp/"+fileName);
		
		InputStreamResource resource =  new InputStreamResource(new FileInputStream(file));
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", String.format("attachment; fileName=\"%s\"", file.getName()));
		
		return ResponseEntity.ok().headers(headers).contentType(MediaType.parseMediaType("application/txt")).body(resource);
	}*/
	
}
