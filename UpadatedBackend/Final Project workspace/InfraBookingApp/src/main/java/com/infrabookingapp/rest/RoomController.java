package com.infrabookingapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infrabookingapp.entity.Room;
import com.infrabookingapp.service.RoomService;

@RestController
public class RoomController {
	
	@Autowired
	private RoomService roomService;
	
	@PostMapping(value = "/addRoom")
	public Room addEmployee(@RequestBody Room room) {
		
		return this.roomService.addRoom(room);
	}
}
