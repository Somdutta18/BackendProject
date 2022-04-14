package com.example.accolite.controller;
import java.util.*;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;  
import com.example.accolite.model.skill;
import com.example.accolite.repository.skillRepo; 
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/") 
public class skillController 
{
	@Autowired
	skillRepo interRepo;
	@GetMapping("skill")
	public ResponseEntity<List<skill>> getSkill(@RequestParam Integer eid) {
		try {
			List<skill> skills = new ArrayList<skill>();
			if (eid == 0)
				interRepo.findAll().forEach(skills::add);
			else
				interRepo.findByEmployeeID_Id(eid).forEach(skills::add);
			if (skills.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(skills, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	/*
	 @GetMapping("skill/{id}")
	public ResponseEntity<skill> getTutorialById(@PathVariable("id") int id) {
		Optional<skill> tutorialData = interRepo.findById(id);
		if (tutorialData.isPresent()) {
			return new ResponseEntity<>(tutorialData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	*/
	@PostMapping("skill")
	public ResponseEntity<skill> createTutorial(@RequestBody skill tutorial) {
		try {
			skill _tutorial = interRepo.save(new skill(tutorial.getSkill_name(), tutorial.getSkill_type(), tutorial.getExperience(),tutorial.getEmployeeID()));
			return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}  

