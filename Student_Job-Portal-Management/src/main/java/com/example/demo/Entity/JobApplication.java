package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class JobApplication {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Candidate candidate;
	
	@ManyToOne
	private Job job;
	
	private String status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public JobApplication(Long id, Candidate candidate, Job job, String status) {
		super();
		this.id = id;
		this.candidate = candidate;
		this.job = job;
		this.status = status;
	}

	public JobApplication() {
		super();
	}

	@Override
	public String toString() {
		return "JobApplication [id=" + id + ", candidate=" + candidate + ", job=" + job + ", status=" + status + "]";
	}
	
	

}
