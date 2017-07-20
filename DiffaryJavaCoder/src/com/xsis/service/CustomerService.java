package com.xsis.service;

import java.util.List;

import com.xsis.entity.Customer;

public interface CustomerService {

	public void save();

	public void update();

	public void delete();

	public List<Customer> getAllCus();

}