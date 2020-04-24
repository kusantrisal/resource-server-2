package com.example.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class EntryController {

	@GetMapping("/secure")
	public Principal secure(Principal principle) {
		return principle;
	}

}
