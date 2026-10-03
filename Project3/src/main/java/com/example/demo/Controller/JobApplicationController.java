package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.JobApplication;
import com.example.demo.Service.JobApplicationServiceImpl;

@RestController
@RequestMapping("/apply")
public class JobApplicationController {
//	
//	@PostMapping("/{candidateId}/{jobId}")
//	public String apply(@PathVariable Long candidateId,@PathVariable Long jobId) {
//		return "Applied";
//	}
	
	@Autowired
	private JobApplicationServiceImpl jasi;
	
	@PostMapping("/apply")
	public ResponseEntity<JobApplication> applyForJob(@RequestBody JobApplication application){
		return ResponseEntity.ok(jasi.apply(application));
	}
	
	@GetMapping("/candidate/{id}")
	public ResponseEntity<List<JobApplication>> getApplications(@PathVariable Long id){
		return ResponseEntity.ok(jasi.getApplicationByCandidate(id));
	}
	
	@PutMapping("/updateStatus/{id}")
	public ResponseEntity<JobApplication> updateStatus(@PathVariable Long id,@RequestParam String status)
	{
		return ResponseEntity.ok(jasi.updateStatus(id,status));
	}
	
}
