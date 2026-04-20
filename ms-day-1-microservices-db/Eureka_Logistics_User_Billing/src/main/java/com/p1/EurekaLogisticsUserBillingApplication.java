package com.p1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaLogisticsUserBillingApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaLogisticsUserBillingApplication.class, args);
	}

}
