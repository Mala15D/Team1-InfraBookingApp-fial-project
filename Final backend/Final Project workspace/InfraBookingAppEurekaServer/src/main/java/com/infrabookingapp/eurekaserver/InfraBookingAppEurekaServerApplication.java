package com.infrabookingapp.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class InfraBookingAppEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfraBookingAppEurekaServerApplication.class, args);
	}

}
