package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.JobApplication;


@Repository
public interface JobApplicationRepository extends JpaRepository<JobApplication,Long> {
	
	List<JobApplication> findByCandidateId(Long candidateId);

}
