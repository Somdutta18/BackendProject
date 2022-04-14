package com.example.accolite.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.accolite.model.logIn;
import com.example.accolite.repository.logInRepo;

@CrossOrigin(origins="http://localhost:4200")
@RestController

public class logInController {
	
	@Autowired
	logInRepo repo;
	
	@PostMapping("/login")
	
	public logIn adduser(@RequestBody logIn s1)
	{
			return repo.save(s1);
	}
	@GetMapping("/login")
	
	public List<logIn> get()
	{
		return repo.findAll();
	}
	@PostMapping("/loginuser")
	@CrossOrigin(origins="http://localhost:4200/login")
	
	public logIn logindata(@RequestBody logIn logindata ) throws Exception
	{
		String mail=logindata.getMail();
		String pass=logindata.getPassword();
		logIn login=null;
		if(mail!=null && pass!=null)
		{
		login=repo.findByMailAndPassword(mail,pass);	
	}
		if(login==null)
		{
			throw new Exception("user does not exist");
		}
		return login;
	} 
	@PostMapping("/loginuser1")
	@CrossOrigin(origins="http://localhost:4200/login")
	public logIn logindata1(@RequestBody logIn logindata ) throws Exception
	{
		String mail=logindata.getMail();
		logIn login=null;
		if(mail!=null)
		{
		login=repo.findByMail(mail);	
		}
		if(login==null)
		{
			throw new Exception("user does not exist");
		}
		return login;
	} 

}
