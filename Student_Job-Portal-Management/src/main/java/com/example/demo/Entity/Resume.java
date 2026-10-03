package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Resume {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String filePath;
	
	@OneToOne
	private Candidate candidate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public Resume(Long id, String filePath, Candidate candidate) {
		super();
		this.id = id;
		this.filePath = filePath;
		this.candidate = candidate;
	}

	public Resume() {
		super();
	}

	@Override
	public String toString() {
		return "Resume [id=" + id + ", filePath=" + filePath + ", candidate=" + candidate + "]";
	}

	
	
}
