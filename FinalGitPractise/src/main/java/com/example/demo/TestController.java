package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/Show")
	public String showView() {
		System.out.println("====+++++++++++++++++++========");
		return "Hello Good Morning";
		
	}
	
	@GetMapping("/hello")
	public String showHello() {
		System.out.println("====================");
		return "Hello Good Morning-shekhar from showHello";
	}

}
