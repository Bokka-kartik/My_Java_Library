package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Job;
import com.example.demo.Repository.JobRepository;

@Service
public class JobServiceImpl implements JobService {

	
	@Autowired
	private JobRepository jr;
	
//	@Override
//	public String getRecommendedJobs(Long candidateId) {
//		return "Job List Fetched";
//	}
	
	@Override
	public Job saveJob(Job job) {
		return jr.save(job);
	}
	
	@Override
	public List<Job> getAllJobs() {
		return jr.findAll();
	}
	
	@Override
	public Job getJobById(Long id) {
		return jr.findById(id).orElse(null);
	}	
}
