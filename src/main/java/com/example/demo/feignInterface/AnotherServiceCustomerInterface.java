package com.example.demo.feignInterface;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("AnotherConsumer")
@RibbonClient(name="AnotherConsumer")
public interface AnotherServiceCustomerInterface {
	
	@GetMapping("/details")
	public String getAll();
	

}
