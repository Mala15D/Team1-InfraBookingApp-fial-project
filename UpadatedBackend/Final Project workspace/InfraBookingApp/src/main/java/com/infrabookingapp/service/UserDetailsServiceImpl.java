package com.infrabookingapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.infrabookingapp.dao.EmployeeDAO;
import com.infrabookingapp.entity.Employee;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Employee foundUser=employeeDAO.findByEmail(email);
		System.out.println(foundUser);
		if(foundUser==null) {
			throw new UsernameNotFoundException(email);
		}
		User authenticatedUser=new User(foundUser.getEmail(), foundUser.getPassword(), foundUser.getRoles());
		return authenticatedUser;
	}
}
