package com.xsis.service;

import java.util.List;
import com.xsis.entity.Employee;

public interface EmployeeService {

	public void save();

	public void update();

	public void delete();

	public List<Employee> getAllEmployee();
	
	public List<Employee> getEmployeeByName();
}