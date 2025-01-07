package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "SERVICE-A")
public interface ServiceAFeignClient {
	
	@GetMapping("/servicea/api")
	public String call();
	
}
