package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Resume;
import com.example.demo.Service.ResumeServiceImpl;

@RestController
@RequestMapping("/resume")
public class ResumeController {
	
//	@PostMapping("/upload/{id}")
//	public String upload(@PathVariable Long id)
//	{
//		return "Resume Uploaded";
//	}
	
	@Autowired
	private ResumeServiceImpl rsi;
	
	@PostMapping("/upload")
	public ResponseEntity<Resume> uploadResume(@RequestBody Resume resume)
	{
		return ResponseEntity.ok(rsi.saveResume(resume));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Resume> getResume(@PathVariable Long id){
		return ResponseEntity.ok(rsi.getResumeById(id));
	}
}
