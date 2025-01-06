package com.shivu.orderservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class JavaConfig {
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
