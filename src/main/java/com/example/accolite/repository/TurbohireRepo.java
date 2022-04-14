package com.example.accolite.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.accolite.model.Turbohire;

@Repository
public interface TurbohireRepo extends JpaRepository<Turbohire, String>{
	List<Turbohire> findByInterviewers(String interviewers);
	//List<Turbohire> findBy
	List <Turbohire> findByJobStage(String interviews);
	List<Turbohire> findByEvaluationDateTimeBetween(String d1,String d2);
}

