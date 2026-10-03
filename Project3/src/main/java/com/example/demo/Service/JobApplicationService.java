package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.JobApplication;

public interface JobApplicationService {
	
//	String apply(Long candidareId,Long jobId);
	
	JobApplication apply(JobApplication application);
	List<JobApplication> getApplicationByCandidate(Long candidateId);
	JobApplication updateStatus(long id,String status);

}
