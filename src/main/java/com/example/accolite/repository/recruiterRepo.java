
package com.example.accolite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.accolite.model.recruiter;
@Repository
public interface recruiterRepo extends JpaRepository<recruiter, Integer>{

}

