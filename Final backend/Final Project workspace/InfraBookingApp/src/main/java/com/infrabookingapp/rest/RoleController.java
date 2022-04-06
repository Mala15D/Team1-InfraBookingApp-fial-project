package com.infrabookingapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infrabookingapp.entity.Role;
import com.infrabookingapp.service.RoleService;

@RestController
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@PostMapping(value = "/addRole")
	public ResponseEntity<Role> addRole(@RequestBody Role role) {
		return new ResponseEntity<Role>(this.roleService.addRole(role),HttpStatus.CREATED);
	}

}
