package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.JobApplication;
import com.example.demo.Repository.JobApplicationRepository;

@Service
public class JobApplicationServiceImpl  implements JobApplicationService{

	
	@Autowired
	private JobApplicationRepository jar;
//	@Override
//	public String apply(Long candidareId, Long jobId) {
//		return "Applied Successfully";
//	}

	@Override
	public JobApplication apply(JobApplication application) {
		
		application.setStatus("APPLIED");
		return jar.save(application);
	}
	@Override
	public List<JobApplication> getApplicationByCandidate(Long candidateId) {
		return jar.findByCandidateId(candidateId);
	}

	@Override
	public JobApplication updateStatus(long id, String status) {
		
		JobApplication application=jar.findById(id).orElse(null);
		if(application==null)
			return null;
		
		application.setStatus(status);
		return jar.save(application);	
	}
	
}
