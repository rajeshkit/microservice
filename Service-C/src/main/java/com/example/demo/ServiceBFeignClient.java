package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("SERVICE-B")
public interface ServiceBFeignClient {
	@GetMapping("/serviceb/api")
	public String call();

}
