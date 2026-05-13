package com.patientserviceforrestapi.service;

import java.util.List;
import java.util.Map;

import com.patientserviceforrestapi.entity.patient_info;
import com.patientserviceforrestapi.utility.PatientInput;

public interface patientservice {
	
	
	
	Map<String,Object> savePatient(PatientInput p);

   List<patient_info> getAllPatient();

}
