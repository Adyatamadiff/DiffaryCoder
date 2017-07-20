package com.xsis.service;

import java.util.List;
import com.xsis.entity.User;

public interface UserService {

	public void save();

	public void update();

	public void delete();

	public List<User> getAllUser();

}