package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Job;

public interface JobService {
	
//	String getRecommendedJobs(Long candidateId);
	
	Job saveJob(Job job);
	List<Job> getAllJobs();
	Job getJobById(Long id);

}
