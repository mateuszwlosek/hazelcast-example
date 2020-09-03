package com.github.mateuszwlosek.discoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoveryServiceApplication {

	public static void main(final String[] args) {
		SpringApplication.run(DiscoveryServiceApplication.class, args);
	}
}