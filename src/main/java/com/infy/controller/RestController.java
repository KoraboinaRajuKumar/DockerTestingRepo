package com.infy.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping("/")
	public String msg() {
		return "hello Springboot Application...!";
	}

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to Springboot Application...!";
	}

}
