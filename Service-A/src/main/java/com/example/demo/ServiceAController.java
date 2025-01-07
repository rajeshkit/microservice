package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servicea/api")
public class ServiceAController {
	@Value("${spring.application.name}")
	public String appName;
	
	@Value("${server.port}")
	public String port;
	
	@GetMapping
	public String getMethodName() {
		return appName+":"+port;
	}
	
}
