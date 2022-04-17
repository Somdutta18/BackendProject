package com.example.accolite.repository;
import java.util.List;
import com.example.accolite.model.interviewer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.accolite.model.interviewer;
@Repository
public interface interviewerRepo extends JpaRepository<interviewer,Integer> {
	
	
	
}
