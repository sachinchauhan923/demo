package com.example.demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TstControlller {

	@GetMapping("/hey")

	public static ResponseEntity<String> name() throws IOException {

		File source = new File("C:\\Users\\sachin\\Downloads\\demo\\demo\\target\\demo-0.0.1-SNAPSHOT.war");
		File destination = new File("D:\\New folder\\ demo-0.0.1-SNAPSHOT11a"+ ""+".war");
		File del = new File("C:\\Users\\sachin\\Downloads\\apache-tomcat-8.5.61-windows-x64\\apache-tomcat-8.5.61\\webapps\\demo.war");

		Files.deleteIfExists(del.toPath());
		//Files.copy(source.toPath(), destination.toPath(),StandardCopyOption.REPLACE_EXISTING);
		
	System.out.println(LocalDateTime.now().toString().replace("", ""));
		
		
	//2020-12-16T12:28:41.249
		return null;

	}

	public static void copy(File src, File dest) throws IOException {

		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(src);
			os = new FileOutputStream(dest);
			byte[] buf = new byte[1024];
			int bytesRead;
			while ((bytesRead = is.read(buf)) > 0) {
				os.write(buf, 0, bytesRead);
			}
			
			catch (Exception e) {
				e.getLocalizedMessage()
			}
		} finally {
			is.close();
			os.close();
		}
	}

	public static void main(String[] args) throws IOException {
		name();
	}
}
