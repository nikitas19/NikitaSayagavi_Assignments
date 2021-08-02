package com.springsecurity.assignment.securityassignment1q1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	@GetMapping("/")
	public String home() {
		return ("<h1>Hello World!</h1>");
	}
	
	@GetMapping("/admin")
	public String admin() {
		return ("<h1>Hello Admin!</h1>");
	}
	
}
