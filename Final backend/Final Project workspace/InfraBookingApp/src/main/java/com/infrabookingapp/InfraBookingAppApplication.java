package com.infrabookingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
@ComponentScan(basePackages = {"com.infrabookingapp"})
@EnableEurekaClient
//@EnableFeignClients(basePackages = "com.infrabookingapp.service.feign.client")
public class InfraBookingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfraBookingAppApplication.class, args);
	}

}
