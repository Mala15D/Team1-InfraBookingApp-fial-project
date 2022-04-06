package com.infrabookingapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infrabookingapp.db.TokenStorage;
import com.infrabookingapp.entity.Employee;
import com.infrabookingapp.entity.LoginResponse;
import com.infrabookingapp.entity.LoginUser;
import com.infrabookingapp.service.EmployeeService;
import com.infrabookingapp.util.jwtutil.JwtUtil;

@RestController
public class EmployeeController {
	
	@Autowired
	private AuthenticationManager manager;
	
	@Autowired
	private UserDetailsService userDetailsService;

	@Autowired
	private JwtUtil jwtUtil;
	
	@Autowired
	private EmployeeService employeeService;

	@PostMapping(value = "/addEmployee")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		return new ResponseEntity<Employee>(this.employeeService.addEmployee(employee),
				HttpStatus.CREATED);
	}
	
	@PostMapping("/user/authenticate")
	public LoginResponse login(@RequestBody LoginUser user) {
		UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(
				user.getUserName(), user.getPassword());

		try {
			String token = jwtUtil.generateToken(user.getUserName());
			TokenStorage.storeToken(token, token);
			LoginResponse userResponse = new LoginResponse();
			userResponse.setJwt(token);
			return userResponse;
		} catch (Exception e) {
			throw e;
		}
	}
}
