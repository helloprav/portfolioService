package com.way2learnonline.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableJpaRepositories
@EnableDiscoveryClient

public class PortfolioApplication {
	

	private static final String CURRENT_ACTIVE_PROFILE = "local";
	static {
		System.setProperty("spring.profiles.active", CURRENT_ACTIVE_PROFILE);
	}

	
	public static void main(String[] args) {
		SpringApplication.run(PortfolioApplication.class, args);
	}
	
	
	    @Bean
	 public   RestTemplate restTemplate() {
	        return new RestTemplate();
	    }
}
