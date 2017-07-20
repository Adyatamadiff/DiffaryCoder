package com.xsis.dao;

import java.util.List;
import com.xsis.entity.User;

public interface UserDao {

	// Insert
	public void save(User usr);

	// Update
	public void update(int id, User usr);

	// Delete
	public void delete(int id);

	// Get All Employee
	public List<User> getAllUser();

}