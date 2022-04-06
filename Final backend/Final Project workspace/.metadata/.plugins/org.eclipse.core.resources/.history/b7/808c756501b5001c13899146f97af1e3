package com.infrabookingapp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infrabookingapp.entity.Booking;
import com.infrabookingapp.service.BookingService;

@RestController
public class BookingController {
	
	@Autowired
	private BookingService bookingService;
	
	@GetMapping("/booking")
	public List<Booking> getAllBookings(){
		return this.bookingService.getAllBookings();
	}
	
	@GetMapping("/booking/{id}")
	public Booking getBookingById(@PathVariable(name="id") int id){
		return this.bookingService.getBookingById(id);
	}
	
	@PostMapping(value = "/addBooking")
	public Booking addOlxUser(@RequestBody Booking booking) {
		return this.bookingService.addBooking(booking);
	}

}
