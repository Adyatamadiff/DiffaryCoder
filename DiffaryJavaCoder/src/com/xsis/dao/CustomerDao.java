package com.xsis.dao;

import java.util.List;
import com.xsis.entity.Customer;

public interface CustomerDao {

	// Insert
	public void save(Customer cus);

	// Update
	public void update(int id, Customer cus);

	// Delete
	public void delete(int id);

	// Get All Employee
	public List<Customer> getAllCustomer();

}