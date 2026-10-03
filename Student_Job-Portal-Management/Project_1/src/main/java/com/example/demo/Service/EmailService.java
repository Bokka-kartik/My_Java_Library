//package com.example.demo.Service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.stereotype.Service;
//
//@Service
//public class EmailService {
//	
//	@Autowired
//	private JavaMailSender mailSender;
//	
//	public void sendOtpEmail(String toEmail,String otp)
//	{
//		SimpleMailMessage msg=new SimpleMailMessage();
//		
//		msg.setTo(toEmail);
//		msg.setSubject("Your OTP for Login");
//		msg.setText("Your OTP Is"+ otp+ "\n\n Use this to verfiy your acount");
//		mailSender.send(msg);
//	}
//
//}
