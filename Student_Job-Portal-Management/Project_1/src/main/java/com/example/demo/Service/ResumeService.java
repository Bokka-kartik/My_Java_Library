package com.example.demo.Service;

import com.example.demo.Entity.Resume;

public interface ResumeService {

//	String uploadResume(Long candidateId);
	Resume saveResume(Resume resume);
	Resume getResumeById(Long id);
}
