package com.example.accolite.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class logIn {
	
@Id	
private int id;
@Column(name="Email")
private String mail;
private String name;
private String designation;
private String password;

public logIn() {
	super();
}
public logIn(int id, String mail, String name, String designation, String password) {
	super();
	this.id = id;
	this.mail = mail;
	this.name = name;
	this.designation = designation;
	this.password = password;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}



	
	
}
