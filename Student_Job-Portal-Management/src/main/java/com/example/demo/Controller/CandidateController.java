
package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Candidate;
import com.example.demo.Service.CandidateServiceImpl;

@RestController
@RequestMapping("/candidate")
public class CandidateController {
	
	
	@Autowired
	private CandidateServiceImpl csi;

	@PostMapping("/create")
	public ResponseEntity<Candidate> createCandidate(@RequestBody Candidate candidate)
	{
		return ResponseEntity.ok(csi.saveCandidate(candidate));
	}
	
	
	//Undone repeat this
	@GetMapping("/{id}")
	public ResponseEntity<Candidate> getCandidate(@PathVariable Long id){
		
		return ResponseEntity.ok(csi.getCandidateById(id));
	}
	
	//make it more Concise 
	@PutMapping("/update/{id}")
	public ResponseEntity<Candidate> updateCandidate(@PathVariable Long id,@RequestBody Candidate candidate){
		
		return ResponseEntity.ok(csi.updateCandidate(id,candidate));
	}
	
//	@GetMapping("/{id}")
//	public ResponseEntity<?> getCandidateById(@PathVariable Long id) {
//	    Optional<Candidate> candidate = csi.findById(id);
//
//	    if (candidate.isPresent()) {
//	        return ResponseEntity.ok(candidate.get());
//	    } else {
//	        return ResponseEntity.status(HttpStatus.NOT_FOUND)
//	                .body("Candidate with ID " + id + " not found");
//	    }
//	}

}
