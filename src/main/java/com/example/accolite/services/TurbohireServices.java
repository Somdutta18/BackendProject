package com.example.accolite.services;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.accolite.model.Turbohire;
import com.example.accolite.model.reward;
import com.example.accolite.repository.TurbohireRepo;

@Service
public class TurbohireServices {
	@Autowired
	private TurbohireRepo repo;
	
	private final RestTemplate restTemplate;
	
	@Autowired
    public TurbohireServices(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
	
	
	public ResponseEntity<String> consumeTurboAPI(){
        HttpHeaders headers=new HttpHeaders();
        headers.set("X-API-KEY", "");
        final HttpEntity<String> entity = new HttpEntity<String>(headers);
        return  restTemplate.exchange("https://api.turbohire.co/api/analytics/evaluations?startDate=2021-11-24&endDate=2021-11-25", HttpMethod.GET, entity, String.class);
    }
	public Turbohire saveInterview(Turbohire ob) {
		return repo.save(ob);
		
	}
	public List<Turbohire> saveAllInterviews(List<Turbohire> ob){
		return repo.saveAll(ob);
	}
	public List<Turbohire> viewAllInterviews(String interviewer){
		return repo.findByInterviewers(interviewer);
	}
	public List<Turbohire> findByJobStageDetails(String jobstage){
		return repo.findByJobStage(jobstage);
		
	}
	
	public List<reward> getDetails(String interviewer){
//		long c=repo.findByInterviewers(interviewer).stream().count();
//		List<Turbohire> ob=repo.findByInterviewers(interviewer);
//		List<reward> ob1=new ArrayList<>();
//		for(int i=0;i<c;i++) {
//			if(ob.get(i).getJobStage().equals("Round 1")) {
//				reward r=new reward("Week 1",1,2000,100,2100);
//				ob1.add(r);
//			}
//			else if(ob.get(i).getJobStage().equals("Round 2")) {
//				reward r=new reward("Week 2",2,2000,200,2200);
//				ob1.add(r);
//			}
//		}
		List<Turbohire> ob=repo.findByInterviewers(interviewer);
		List<reward> ob1=new ArrayList<>();
		int base=2000;
		int incentive=100;
		for(Turbohire t:ob) {
			int total=0;
			if(t.getJobStage().equals("Round 1")) {
				total=base+incentive;
				ob1.add(new reward(t.getApplicantEmail(),t.getApplicantName(),1,base,incentive,total));
			}
			else if(t.getJobStage().equals("Round 2")) {
				total=base+2*incentive;
				ob1.add(new reward(t.getApplicantEmail(),t.getApplicantName(),2,base,2*incentive,total));
			}
			else if(t.getJobStage().equals("HR Manager Approval")) {
				total=base+3*incentive;
				ob1.add(new reward(t.getApplicantEmail(),t.getApplicantName(),3,base,3*incentive,total));
			}
		}
		return ob1;
	}
	public List<Turbohire> getAllDataFromTurbo(){
		return repo.findAll();
	}
	
	public List<Turbohire> getAllDataFromTurboData(String sDate,String eDate){
		return repo.findByEvaluationDateTimeBetween(sDate, eDate);
	}
	
}
