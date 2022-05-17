package com.dxc.springboot.dao;

import java.util.List;

import com.dxc.springboot.model.Employee;

public interface EmployeeDAO 
{
	public List<Employee> getAllEmployees();
}