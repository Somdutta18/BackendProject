package com.example.accolite.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Turbohire {
	@Id
	@JsonProperty("RecordId")
	private String recordId;
	@JsonProperty("ApplicantName")
	private String applicantName;
	@JsonProperty("ApplicantEmail")
	private String applicantEmail;
	@JsonProperty("JobStage")
	private String jobStage;
	@JsonProperty("EvaluationDateTime")
	private String evaluationDateTime;
	@JsonProperty("Interviewers")
	private String interviewers;
	public String getRecordId() {
		return recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getApplicantEmail() {
		return applicantEmail;
	}
	public void setApplicantEmail(String applicantEmail) {
		this.applicantEmail = applicantEmail;
	}
	public String getJobStage() {
		return jobStage;
	}
	public void setJobStage(String jobStage) {
		this.jobStage = jobStage;
	}
	public String getEvaluationDateTime() {
		return evaluationDateTime;
	}
	public void setEvaluationDateTime(String evaluationDateAndTime) {
		this.evaluationDateTime = evaluationDateAndTime;
	}
	public String getInterviewers() {
		return interviewers;
	}
	public void setInterviewers(String interviewers) {
		this.interviewers = interviewers;
	}
	@Override
	public String toString() {
		return "Turbohire [recordId=" + recordId + ", applicantName=" + applicantName + ", applicantEmail="
				+ applicantEmail + ", jobStage=" + jobStage + ", evaluationDateAndTime=" + evaluationDateTime
				+ ", interviewers=" + interviewers + "]";
	}
	public Turbohire(String recordId, String applicantName, String applicantEmail, String jobStage,
			String evaluationDateTime, String interviewers) {
		super();
		this.recordId = recordId;
		this.applicantName = applicantName;
		this.applicantEmail = applicantEmail;
		this.jobStage = jobStage;
		this.evaluationDateTime = evaluationDateTime;
		this.interviewers = interviewers;
	}
	public Turbohire() {
		super();
	}	
}
