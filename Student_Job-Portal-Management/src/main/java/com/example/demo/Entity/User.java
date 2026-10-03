package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String email;
	private String password;
	private String role;
//	private String otp;
//	private Boolean isverified=false;
//	
//	
//	public String getOtp() {
//		return otp;
//	}
//	public void setOtp(String otp) {
//		this.otp = otp;
//	}
//	public Boolean getIsverified() {
//		return isverified;
//	}
//	public void setIsverified(Boolean isverified) {
//		this.isverified = isverified;
//	}
	@OneToOne(mappedBy="user")
	private Candidate candidate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public User(Long id, String email, String password, String role) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.role = role;
	}
	public User() {
		super();
	}
	
	
	
	



}
