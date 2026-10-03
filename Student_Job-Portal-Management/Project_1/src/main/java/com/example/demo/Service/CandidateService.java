package com.example.demo.Service;

import com.example.demo.Entity.Candidate;

public interface CandidateService {
	
//	String updateProfile(Long candidateId);
	
	Candidate saveCandidate(Candidate candidate);
	Candidate getCandidateById(Long id);
	Candidate updateCandidate(Long id,Candidate updateCandidate);

}
