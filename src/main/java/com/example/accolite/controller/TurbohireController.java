package com.example.accolite.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.accolite.model.Turbohire;
import com.example.accolite.model.reward;
import com.example.accolite.services.TurbohireServices;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
@RequestMapping("/turbohire")
@CrossOrigin(origins = "http://localhost:4200")
public class TurbohireController {
	@Autowired
	private TurbohireServices turboServices;	
	@GetMapping("/load")
    public String getData() throws JsonProcessingException {
        String rawJson=turboServices.consumeTurboAPI().getBody();
        ObjectMapper mapper=new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
        Turbohire[] interviewslot = mapper.readValue(rawJson, Turbohire[].class);
        List<Turbohire> interviewList=new ArrayList<Turbohire>(List.of(interviewslot));
        turboServices.saveAllInterviews(interviewList);
        return "All the Turbohire data is added to database!";
    }
	@GetMapping("/interviews/{interviews}")
	public List<Turbohire> getInterviewDetails(@PathVariable String interviews){
		return turboServices.viewAllInterviews(interviews);
	}	
	@GetMapping("/interviews/getDetails")
	public List<Turbohire> getDetails(@RequestBody Turbohire t){
		return turboServices.viewAllInterviews(t.getInterviewers());
	}
	
	@GetMapping("/interviews/reward/{interviewer}")
	public List<reward> getReward(@PathVariable String interviewer){
		return turboServices.getDetails(interviewer);
	}
	@PutMapping("/interviews/update")
	public String updateData(@RequestBody Turbohire t) {
		turboServices.saveInterview(t);
		return "Updated";
	}
	@GetMapping("/byjobstage/{jobstage}")
	public List<Turbohire> findByJobStageAllDetails(@PathVariable String jobstage ){
		return turboServices.findByJobStageDetails(jobstage);
	}
	@GetMapping("/all")
	public List<Turbohire> getAllData(){
		return turboServices.getAllDataFromTurbo();
	}
	@GetMapping("/StartDate={startDate}&EndDate={endDate}")
	public List<Turbohire>getByStartDateEndDate(@PathVariable String startDate,@PathVariable String endDate){
		return turboServices.getAllDataFromTurboData(startDate+"T00:00:00.000Z", endDate+"T23:59:59.999Z");
	}
}
