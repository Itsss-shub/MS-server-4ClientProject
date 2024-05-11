package com.save;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsClientSaveApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsClientSaveApplication.class, args);
	}

}
