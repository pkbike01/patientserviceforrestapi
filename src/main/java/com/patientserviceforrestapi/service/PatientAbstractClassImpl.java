package com.patientserviceforrestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.patientserviceforrestapi.PatientserviceforrestapiApplication;
import com.patientserviceforrestapi.entity.patient_info;
import com.patientserviceforrestapi.repository.patientRepository;

@Service
public class PatientAbstractClassImpl extends PatientAbstractClass{

//    private final PatientserviceforrestapiApplication patientserviceforrestapiApplication;

	
//	@Autowired
//	patientRepository p;

	PatientAbstractClassImpl(){
		System.out.println("patient service abstract impl...");
	}

    
	
	
	@Override
	void getPatient() {
//		List<patient_info> all = p.findAll();
//		
//		for(patient_info p : all) {
//			System.out.println(p.getEmail());
//			System.out.println(p.getFirstname());
//		}
		System.out.println("get patient...");
		
		
	}
	
	
	
	public static void main(String[] args) {
		PatientAbstractClass pac = new PatientAbstractClassImpl();
		
		pac.getPatient();
		pac.getpatientCount();
		
	}
	
	
	

	
	
	
}
