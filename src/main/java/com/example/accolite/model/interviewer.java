package com.example.accolite.model;

import java.sql.Timestamp;
import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import java.util.*;
//import java.text.*;
//import java.sql.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class interviewer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int Inter_id;
   
	public int employeeID;
//    @Column
//	public String date1;
	@Column
	public Date date1;
    @Column
	public Time tilltime;
    @Column
	public Time fromtime;
//	@Column
//	public Timestamp tilltime;
//    @Column
//	public Timestamp fromtime;
//	
	public int getInter_id() {
		return Inter_id;
	}
	public void setInter_id(int inter_id) {
		Inter_id = inter_id;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public Date getDate1() {
		return date1;
	}
	public void setDate1(Date date1) {
		this.date1 = date1;
	}
	public Time getTilltime() {
		return tilltime;
	}
	public void setTilltime(Time tilltime) {
		this.tilltime = tilltime;
	}
	public Time getFromtime() {
		return fromtime;
	}
	public void setFromtime(Time fromtime) {
		this.fromtime = fromtime;
	}
	public interviewer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public interviewer(int inter_id, int employeeID, Date date1, Time tilltime, Time fromtime) {
		super();
		this.Inter_id = inter_id;
		this.employeeID = employeeID;
		this.date1 = date1;
		this.tilltime = tilltime;
		this.fromtime = fromtime;
	}
   
    
	
	
}
    

