package com.github.mateuszwlosek.hazelcasttestservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableCaching
@EnableEurekaClient
@SpringBootApplication
@EnableAutoConfiguration
public class HazelcastTestService {

	public static void main(final String[] args) {
		SpringApplication.run(HazelcastTestService.class, args);
	}
}
