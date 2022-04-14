package com.example.accolite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.example.accolite.model.skill;

public interface skillRepo extends JpaRepository<skill, Integer> {
	  List<skill> findByEmployeeID_Id(Integer eid);
}