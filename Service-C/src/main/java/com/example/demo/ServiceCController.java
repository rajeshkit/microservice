package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.discovery.converters.Auto;

@RestController
@RequestMapping("/servicec/api")
public class ServiceCController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${spring.application.name}")
	public String appName;
	
	@Value("${server.port}")
	public String port;
	
	@GetMapping
	public String getMethodName() {
		//internally it going to call service-A, service-B
		ResponseEntity<String> responseA=restTemplate.exchange("http://SERVICE-A/servicea/api",HttpMethod.GET, null,String.class);
		String data = responseA.getBody();
		ResponseEntity<String> responseB=restTemplate.exchange("http://SERVICE-B/serviceb/api",HttpMethod.GET, null,String.class);
		String data1 = responseB.getBody();
		return appName+":"+port+ data1+data;
	}
	
}
