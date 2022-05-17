package com.dxc.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.springboot.dao.EmployeeDAO;
import com.dxc.springboot.model.Employee;

@Service
public class EmployeeManagerImpl implements EmployeeManager {

	@Autowired
	EmployeeDAO dao;
	
	public List<Employee> getAllEmployees() 
	{
		return dao.getAllEmployees();
	}
}
