package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepository;

@Service
public class AuthServiceImpl implements AuthService {
	
	
	@Autowired
	private UserRepository ur;

//	@Override
//	public String register(User user) {
//		
////		user.save(user.getEmail());
//		ur.save(user);
//		return "true";
//	}

//	@Override
//	public String login(String email, String password) {
//		return "Login Successful";
//	}

//	public String register(User user) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	@Override
	public User register(User user) {
		
		
		return ur.save(user);
	}
	
	@Override
	public boolean login(String email,String password)
	{
		User user=ur.findByEmail(email);
		return user!=null && user.getPassword().equals(password);
	}

}
