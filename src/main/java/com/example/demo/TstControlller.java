package com.example.demo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TstControlller {

	@GetMapping("/hey")

	public static ResponseEntity<String> name() throws IOException {


		
		
	//2020-12-16T12:28:41.249
		return new ResponseEntity<String>("hey i am deployed", HttpStatus.OK);

	}

	
}
