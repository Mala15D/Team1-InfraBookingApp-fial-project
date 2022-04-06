package com.infrabookingapp.service.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.infrabookingapp.entity.Booking;
import com.infrabookingapp.entity.Employee;
import com.infrabookingapp.entity.Room;

@FeignClient(value = "apigateway")
public interface BookingFeignClient {

	@GetMapping(path="/infrabookingapp/booking")
	public String callGetAllBookings();
	
	@GetMapping("/infrabookingapp/booking/{id}")
	public Booking getBookingById(@PathVariable(name="id") int id);
	
	@PostMapping(value = "/infrabookingapp/addBooking")
	public Booking addOlxUser(@RequestBody Booking booking);
	
	@PostMapping(value = "/infrabookingapp/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee);
	
	@PostMapping(value = "/infrabookingapp/addRoom")
	public Room addEmployee(@RequestBody Room room);
}
