package com.example.accolite.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class skill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String skill_name;
	@Column
	private String skill_type;
	@Column	
	private int experience;
	@ManyToOne
	private logIn employeeID;
	public skill()
	{
		
	}
	public skill(String skill_name, String skill_type, int experience, logIn employeeID) {
		super();
		this.skill_name = skill_name;
		this.skill_type = skill_type;
		this.experience = experience;
		this.employeeID = employeeID;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getSkill_name() {
		return skill_name;
	}
	public void setSkill_name(String skill_name) {
		this.skill_name = skill_name;
	}
	public String getSkill_type() {
		return skill_type;
	}
	public void setSkill_type(String skill_type) {
		this.skill_type = skill_type;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public logIn getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(logIn employeeID) {
		this.employeeID = employeeID;
	}
	
}
