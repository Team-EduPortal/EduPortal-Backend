package com.eduPortal.EduPortalWeb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduPortal.EduPortalWeb.Entity.MessageBody;
import com.eduPortal.EduPortalWeb.repository.DeveloperRepository;
import com.eduPortal.EduPortalWeb.Entity.Developer;
@RestController
public class HomeController {
	
	@Autowired
	private DeveloperRepository developerRepository;
	
	@GetMapping(value="/home", produces="application/json")
	public ResponseEntity<MessageBody> homeMethod() {
		String response = "This is the response for Home page .";
		return ResponseEntity.ok(new MessageBody(response));
	}
	
	@GetMapping(value="/getDevelopers", produces="application/json")
	public ResponseEntity<List<Developer>> getDevelopers() {
		return ResponseEntity.ok(developerRepository.findAll());
	}
}