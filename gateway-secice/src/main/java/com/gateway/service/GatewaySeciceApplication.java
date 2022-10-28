package com.gateway.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GatewaySeciceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewaySeciceApplication.class, args);
	}

}
