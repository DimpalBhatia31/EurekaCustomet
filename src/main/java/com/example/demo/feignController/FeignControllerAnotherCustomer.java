package com.example.demo.feignController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.feignInterface.AnotherServiceCustomerInterface;
@RestController
public class FeignControllerAnotherCustomer {

	@Autowired
	AnotherServiceCustomerInterface a;
	
	@GetMapping("/feign/get")
	public String getA()
	{
		return "Alll of "+" "+a.getAll();
	}
}
