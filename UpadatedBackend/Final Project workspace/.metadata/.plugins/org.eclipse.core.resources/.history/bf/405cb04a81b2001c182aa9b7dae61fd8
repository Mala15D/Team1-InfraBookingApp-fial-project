package com.infrabookingapp.service.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "apigateway")
public interface BookingFeignClient {

	@GetMapping(path="/infrabookingapp/booking")
	public String callGetAllBookings();
}
