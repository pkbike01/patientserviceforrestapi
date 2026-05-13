package com.patientserviceforrestapi.entity;





import java.time.LocalDateTime;


import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "patient_info")

public class patient_info {

	@Id
	String patientid;
	String firstname;
	String lastname;
	String mobile;
	String email;

//	@JsonFormat(pattern = "yyyy-MM-dd")
	// @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSX")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	LocalDateTime createdon;

	public patient_info() {
		super();
	
	}

	public patient_info(String patientid, String firstname, String lastname, String mobile, String email,
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

