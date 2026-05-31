package com.patientserviceforrestapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.patientserviceforrestapi.entity.patient_info;
import com.patientserviceforrestapi.repository.patientRepository;

abstract public class PatientAbstractClass {

//	@Autowired
//	patientRepository p;

	int i;

	public PatientAbstractClass() {
		System.out.println("patient abstract class");

	}

	public PatientAbstractClass(int i) {
		this.i = i;

	}

	abstract void getPatient();

	
	
	void getpatientCount() {
//		List<Integer> count = new ArrayList<>();
//		List<patient_info> all = p.findAll();
		
		
		System.out.println(4);
		
	}

}
