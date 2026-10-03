package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Job {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String company;
	private String location;
	private String description;
	private String salaryRange;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSalaryRange() {
		return salaryRange;
	}
	public void setSalaryRange(String salaryRange) {
		this.salaryRange = salaryRange;
	}
	public Job(Long id, String title, String company, String location, String description, String salaryRange) {
		super();
		this.id = id;
		this.title = title;
		this.company = company;
		this.location = location;
		this.description = description;
		this.salaryRange = salaryRange;
	}
	public Job() {
		super();
	}
	@Override
	public String toString() {
		return "Job [id=" + id + ", title=" + title + ", company=" + company + ", location=" + location
				+ ", description=" + description + ", salaryRange=" + salaryRange + "]";
	}
	
	

}
