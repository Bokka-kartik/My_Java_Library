package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Job;
import com.example.demo.Service.JobServiceImpl;

@RestController
@RequestMapping("/jobs")
public class JobController {
	
//	@GetMapping("/recommended/{id}")
//	public String getRecommended(@PathVariable Long id)
//	{
//		return "Recommended Jobs";
//	}
	
	@Autowired
	private JobServiceImpl js;
	
	@PostMapping("/create")
	public ResponseEntity<Job> createJob(@RequestBody Job job){
		return ResponseEntity.ok(js.saveJob(job));
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Job>> getAllJobs()
	{
		return ResponseEntity.ok(js.getAllJobs());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Job> getJob(@PathVariable Long id)
	{
		return ResponseEntity.ok(js.getJobById(id));
	}

}
