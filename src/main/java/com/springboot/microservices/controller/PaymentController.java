package com.springboot.microservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello from payment service";
	}
}
