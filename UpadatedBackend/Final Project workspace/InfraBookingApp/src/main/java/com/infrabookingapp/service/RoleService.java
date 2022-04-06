package com.infrabookingapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infrabookingapp.dao.RoleDAO;
import com.infrabookingapp.entity.Role;

@Service
public class RoleService {
	
	@Autowired
	private RoleDAO roleDAO;
	
	public Role addRole(Role role) {
		return this.roleDAO.save(role);
	}

}
