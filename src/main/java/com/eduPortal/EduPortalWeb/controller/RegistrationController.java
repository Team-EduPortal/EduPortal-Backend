package com.eduPortal.EduPortalWeb.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduPortal.EduPortalWeb.Entity.MessageBody;

@RestController
public class RegistrationController {
	
	@GetMapping(value="/register", produces="application/json")
	public ResponseEntity<MessageBody> loginMethod() {
		String response = "This is the response for Registration page .";
		return ResponseEntity.ok(new MessageBody(response));
	}
	
}
