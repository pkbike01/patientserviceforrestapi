package com.patientserviceforrestapi.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.patientserviceforrestapi.entity.patient_info;
import com.patientserviceforrestapi.utility.PatientInput;

@Service
public interface patientservice {

	Map<String, Object> savePatient(PatientInput p);

	List<patient_info> getAllPatient();

	default void getmethod() {
		System.out.println("default method inside patient service..");
	}

    static String getmethod2() {
	   System.out.println("default method inside patient service..");

	   return "default method inside patient service..";
   }

}
