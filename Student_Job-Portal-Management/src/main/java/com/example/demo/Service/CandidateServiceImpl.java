package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Candidate;
import com.example.demo.Repository.CandidateRepository;

@Service
public class CandidateServiceImpl implements CandidateService {

	
	@Autowired 
	private CandidateRepository cr;
	
//	@Override
//	public String updateProfile(Long candidateId) {
//		// TODO Auto-generated method stub
//		return "Profile Updated";
//	}
	
	@Override
	public Candidate saveCandidate(Candidate candidate) {
		return cr.save(candidate);
	}
	
	@Override
	public Candidate getCandidateById(Long id) {
		return cr.findById(id).orElse(null);
	}
	
	@Override
	public Candidate updateCandidate(Long id, Candidate updateCandidate) {
		
		Candidate existing=cr.findById(id).orElse(null);
		if(existing==null)
			return null;
		
		existing.setFullName(updateCandidate.getFullName());
		existing.setPhone(updateCandidate.getPhone());
		existing.setSkills(updateCandidate.getSkills());
		
		return cr.save(existing);
	}
	
	
	

}
