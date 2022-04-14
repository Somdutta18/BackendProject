package com.example.accolite.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.accolite.model.logIn;

public interface logInRepo extends JpaRepository<logIn,Integer>{

	public logIn findByMailAndPassword(String mail,String password);
	public logIn findByMail(String mail);

}
