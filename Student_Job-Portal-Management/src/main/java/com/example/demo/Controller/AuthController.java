package com.example.demo.Controller;

//import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.User;
import com.example.demo.Service.AuthServiceImpl;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	@Autowired
	private AuthServiceImpl asi;
	
	@PostMapping("/register")
	public ResponseEntity<User> register(@RequestBody User user)
	{
		
//		String otp=String.format("%06d",new Random().nextInt(999999));
//		
//		user.setOtp(otp);
//		user.setIsverified(false);
		return ResponseEntity.ok(asi.register(user));
	}
	
	
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody User user){
		boolean success=asi.login(user.getEmail(),user.getPassword());
		if(success)
		{
			return ResponseEntity.ok("login Successful");
		}
		return ResponseEntity.status(401).body("Invlid Credentials");
	}
	
//	@PostMapping()
}
