package com.patientserviceforrestapi.utility;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PatientInput {

	
	String patientid;
	String firstname;
	String lastname;
	String mobile;
	String email;

//	@JsonFormat(pattern = "yyyy-MM-dd")
//	Date createdon;
	
	
	// @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSX")
@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")

	private LocalDateTime createdon;

	public PatientInput() {
		super();
		
	}

	public PatientInput(String patientid, String firstname, String lastname, String mobile, String email,
			LocalDateTime createdon) {
		super();
		this.patientid = patientid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobile = mobile;
		this.email = email;
		this.createdon = createdon;
	}

	public String getPatientid() {
		return patientid;
	}

	public void setPatientid(String patientid) {
		this.patientid = patientid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getCreatedon() {
		return createdon;
	}

	public void setCreatedon(LocalDateTime createdon) {
		this.createdon = createdon;
	}
}
