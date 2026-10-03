package com.example.demo.Service;

import com.example.demo.Entity.User;

public interface AuthService {

	public User register(User user);
	public boolean login(String email,String password);
	
	
}
