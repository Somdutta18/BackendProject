
package com.example.accolite.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class recruiter {
	@Id
	@GeneratedValue
	public int id;
	public String recruiterName;
	public String email;
}
