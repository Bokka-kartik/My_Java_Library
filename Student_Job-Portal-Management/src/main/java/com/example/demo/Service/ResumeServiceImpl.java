package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Resume;
import com.example.demo.Repository.ResumeRepository;


@Service
public class ResumeServiceImpl implements ResumeService{
	
	
	@Autowired
	private ResumeRepository rr;


//	@Override
//	public String uploadResume(Long candidateId) {
//		return "Resume Uploaded";
//	}

	@Override
	public Resume saveResume(Resume resume) {
		return rr.save(resume);
	}
	
	@Override
	public Resume getResumeById(Long id) {
		return rr.findById(id).orElse(null);
	}
}
