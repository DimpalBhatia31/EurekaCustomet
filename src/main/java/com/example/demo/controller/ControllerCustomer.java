package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerCustomer {

	@GetMapping("/customer")
	public String createCustomerService()
	{
		return "Hello WOld";
	}
	
	
}
