package com.patientserviceforrestapi.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patientserviceforrestapi.entity.patient_info;
import com.patientserviceforrestapi.service.patientservice;
import com.patientserviceforrestapi.utility.PatientInput;



@RestController
@RequestMapping("/patient")
public class patientController {
	
	
	@Autowired
	patientservice p;
	

	@GetMapping("/")
	public String WellCome() {

		return "WellCome to patient service..";

	}

	@PostMapping("/saveupdate")
	public ResponseEntity<?> saveUpdatePateint(@RequestBody PatientInput patInput) {

		Map<String, Object> map;
		
		try {
			
			
			map = p.savePatient(patInput);
			
			System.out.println("map: "+map);
			

			if (map != null) {
				return new ResponseEntity<>(map, HttpStatus.OK);

			} else {
				
				map = new HashMap<>();

				map.put("Message ", "No data has been updated or saved to the server...");

				return new ResponseEntity<>(map, HttpStatus.NO_CONTENT);
			}

		} catch (Exception e) {

			map = new HashMap<>();

			map.put("Error Message ", e.getMessage());

			return new ResponseEntity<>(map, HttpStatus.NO_CONTENT);
		}

	}



	
	
	@GetMapping("/allPatient")
	public ResponseEntity<?> getAllPatient(){

		List<patient_info> patients = p.getAllPatient();


		if(patients!=null && patients.size()>0){


			return new ResponseEntity<>(patients,HttpStatus.OK);
		}else{

			return new ResponseEntity<>(patients,HttpStatus.NO_CONTENT);


		}


	}
	
	@GetMapping("/test")
	public String test(){
		p.getmethod();
				
		
		
		return "executed";
	}

}

