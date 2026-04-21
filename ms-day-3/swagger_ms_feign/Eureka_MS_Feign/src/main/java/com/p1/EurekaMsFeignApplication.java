package com.p1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaMsFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaMsFeignApplication.class, args);
	}

}
