package com.example.app_back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AppBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppBackApplication.class, args);
	}

}
