package com.eduPortal.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduPortal.Entity.MessageBody;

@RestController
public class LoginController {

	@GetMapping(value="/login", produces="application/json")
	public ResponseEntity<MessageBody> loginMethod() {
		String response = "This is the response for Login page .";
		return ResponseEntity.ok(new MessageBody(response));
	}
	
}
