package com.springrest.assignment.springrest.assignment.q1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/")
	public String HelloWorld() {
		return "HelloWorld!";
	}
}
