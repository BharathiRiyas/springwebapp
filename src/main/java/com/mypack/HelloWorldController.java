package com.mypack;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping(path = "/helloworld")
	public String helloWorld() {
		return "Hello World"; 
	}
	
	
	
	
}
