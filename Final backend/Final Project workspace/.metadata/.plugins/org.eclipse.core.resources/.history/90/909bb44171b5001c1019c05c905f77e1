package com.infrabookingapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.infrabookingapp.dao.EmployeeDAO;
import com.infrabookingapp.entity.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	public Employee addEmployee(Employee employee) {
		return this.employeeDAO.save(employee);
	}
	
	public Employee findOlxUserByName(String name) {
		return this.employeeDAO.findByUserName(name);
	}

}
