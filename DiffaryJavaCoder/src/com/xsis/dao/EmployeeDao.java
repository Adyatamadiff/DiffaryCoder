package com.xsis.dao;

import java.util.List;
import com.xsis.entity.Employee;

public interface EmployeeDao {

	// Insert
	public void save(Employee emp);

	// Update
	public void update(int id, Employee emp);

	// Delete
	public void delete(int id);

	// Search By Name
	public List<Employee> getEmployeeByName(String name);

	// Search By Email
	public Employee searchEmployeeByEmail(String email);

	// Get All Employee
	public List<Employee> getAllEmployee();
}