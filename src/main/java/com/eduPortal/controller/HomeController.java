package com.eduPortal.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduPortal.Entity.MessageBody;

@RestController
public class HomeController {
	
	@GetMapping(value="/home", produces="application/json")
	public ResponseEntity<MessageBody> homeMethod() {
		String response = "This is the response for home page .";
		return ResponseEntity.ok(new MessageBody(response));
	}
	
	@GetMapping(value="/gallery", produces="application/json")
	public ResponseEntity<MessageBody> galleryMethod() {
		String response = "This is the response for gallery page .";
		return ResponseEntity.ok(new MessageBody(response));
	}

}
