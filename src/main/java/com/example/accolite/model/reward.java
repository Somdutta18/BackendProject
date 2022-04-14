package com.example.accolite.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class reward {

	@Id
	@JsonProperty("ApplicantEmail")
	private String applicantEmail;
	@JsonProperty("ApplicantName")
	private String applicantName;
	@JsonProperty("Interview_Rounds")
	private int interviewRounds;
	@JsonProperty("Base")
	private int base;
	@JsonProperty("Reward")
	private int reward;
	@JsonProperty("Amount")
	private int amount;
	
	
	
	public int getInterviewRounds() {
		return interviewRounds;
	}
	public void setInterviewRounds(int interviewRounds) {
		this.interviewRounds = interviewRounds;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getReward() {
		return reward;
	}
	public void setReward(int reward) {
		this.reward = reward;
	}
	public int getAmount() {
		return amount;
	}
	
	public String getApplicantEmail() {
		return applicantEmail;
	}
	public void setApplicantEmail(String applicantEmail) {
		this.applicantEmail = applicantEmail;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "reward [applicantEmail=" + applicantEmail + ", applicantName=" + applicantName + ", interviewRounds="
				+ interviewRounds + ", base=" + base + ", reward=" + reward + ", amount=" + amount + "]";
	}
	public reward() {
		super();
	}
	public reward(String applicantEmail, String applicantName, int interviewRounds, int base, int reward, int amount) {
		super();
		this.applicantEmail = applicantEmail;
		this.applicantName = applicantName;
		this.interviewRounds = interviewRounds;
		this.base = base;
		this.reward = reward;
		this.amount = amount;
	}
	
}
