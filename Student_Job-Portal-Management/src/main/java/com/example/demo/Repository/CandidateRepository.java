package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Candidate;


@Repository
public interface CandidateRepository extends JpaRepository<Candidate,Long> {

	
}
