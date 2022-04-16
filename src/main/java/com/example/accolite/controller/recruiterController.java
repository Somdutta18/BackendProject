package com.example.accolite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.accolite.model.interviewer;
import com.example.accolite.model.recruiter;
import com.example.accolite.repository.interviewerRepo;
import com.example.accolite.repository.recruiterRepo;

@RestController
@RequestMapping
@CrossOrigin(origins="http://localhost:4200")

public class recruiterController {
	@Autowired
	private recruiterRepo repositoryRecruiterRepo;
	@Autowired
	private interviewerRepo repositoryInterviewerRepo;
	
	@PostMapping("/saveRecruiter")
	public String saveRecruiter(@RequestBody recruiter recruiterObject) {
		repositoryRecruiterRepo.save(recruiterObject);
		return "Recruiter Saved successfully";
	}
	
	@GetMapping("/getAllRecruiter")
	public List<recruiter> getAllRecruiters(){
		return repositoryRecruiterRepo.findAll();
	}
	
//	to get all the available slots from the interviewer
	@GetMapping("/getAllSlotList")
	public List<interviewer> getAll(){
		return repositoryInterviewerRepo.findAll();
	}
}




