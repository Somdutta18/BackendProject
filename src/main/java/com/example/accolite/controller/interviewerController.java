package com.example.accolite.controller;

import java.util.List;
import java.util.*;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.accolite.model.interviewer;
import com.example.accolite.repository.interviewerRepo;

@RestController
//@RequestMapping("/provided_slots")
@CrossOrigin(origins="http://localhost:4200")
public class interviewerController {
	@Autowired
	private interviewerRepo repository;
	
//	@GetMapping("/provided_slots")
//	public String getProvided_slots()
//	{
//		return "Http get request was ent";
//	}
	@PostMapping("/saveSlot")
	public String saveInterviewer(@RequestBody interviewer i)
	{
		//System.out.println(((Object)i.tilltime).getClass().getSimpleName());
		System.out.println(i.date1);
		repository.save(i);
		return "Slot provided";}
//		
//		
//	}
	@GetMapping("/getAllinterviewers")
	public List<interviewer> getAll(){
		return repository.findAll();
	}
//	@GetMapping("/getAllinterviewers")
//	public ResponseEntity<List<interviewer>> getSkill(@RequestParam Integer eid)
//	{
//		try {
//			List<interviewer> inters = new ArrayList<interviewer>();
//			if(eid==0)
//				repository.findAll().forEach(inters::add);
//			else
//				repository.findByEmployeeID_Id(eid).forEach(inters::add);
//			if (inters.isEmpty()) {
//				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//			}
//			return new ResponseEntity<>(inters, HttpStatus.OK);
//		} catch (Exception e) {
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//			
//		}
//	}
//	@PostMapping("/saveSlot")
//	public ResponseEntity<interviewer> createInter(@RequestBody interviewer i)
//	{ 
//		
//		System.out.println(i);
//		try {
//			interviewer _i = repository.save(new interviewer(i.getDate1(), i.getTilltime(), i.getFromtime(),i.getEmployeeID()));
//			
//			return new ResponseEntity<>(_i, HttpStatus.CREATED);
//		} catch (Exception e) {
//			System.out.println("");
//			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}
	
//	@PostMapping("/saveSlot")
//	public interviewer createInter(@RequestBody interviewer i)
//	{ 
//		
//		System.out.println(i);
//		return repository.save(i);
// 
//	}

}
