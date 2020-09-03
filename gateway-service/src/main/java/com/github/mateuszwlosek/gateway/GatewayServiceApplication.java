package com.github.mateuszwlosek.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
@EnableDiscoveryClient
public class GatewayServiceApplication {

	public static void main(final String[] args) {
		SpringApplication.run(GatewayServiceApplication.class, args);
	}
}
