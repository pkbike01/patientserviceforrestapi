package com.patientserviceforrestapi.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patientserviceforrestapi.entity.patient_info;
import com.patientserviceforrestapi.repository.patientRepository;
import com.patientserviceforrestapi.utility.PatientInput;


@Service
public class patientServiceImple implements patientservice{

    	@Autowired
	private patientRepository patientRepository;

	@Override
	public Map<String, Object> savePatient(PatientInput p) {
		

		Map<String, Object> map = new HashMap<>();

		Optional<patient_info> existingPatientOptional = patientRepository.findById(p.getPatientid());

		boolean updated = existingPatientOptional.isPresent();

		patient_info patient = patientRepository.findById(p.getPatientid()).map(existingPatient -> {

			// Update existing patient
			existingPatient.setFirstname(p.getFirstname());
			existingPatient.setLastname(p.getLastname());
			existingPatient.setCreatedon(p.getCreatedon());
			existingPatient.setEmail(p.getEmail());
			existingPatient.setMobile(p.getMobile());

			return existingPatient;

		}).orElseGet(() -> {

			// Create new patient
			patient_info newPatient = new patient_info();

			if (p.getPatientid() != null && !p.getPatientid().isEmpty()) {
				newPatient.setPatientid(p.getPatientid());
			} else {
				newPatient.setPatientid(UUID.randomUUID().toString());
			}

			newPatient.setFirstname(p.getFirstname());
			newPatient.setLastname(p.getLastname());
			newPatient.setCreatedon(p.getCreatedon());
			newPatient.setEmail(p.getEmail());
			newPatient.setMobile(p.getMobile());

			return newPatient;
		});

		patient_info save = patientRepository.save(patient);

		map.put("PatientId", save.getPatientid());

	    if (updated) {

	        map.put("Message",
	                "Patient has been updated!");

	    } else {

	        map.put("Message",
	                "Patient has been saved!");
	    }

	    return map;

	}

	@Override
	public List<patient_info> getAllPatient() {
		
		

		List<patient_info> allPatient = patientRepository.findAll();

		return allPatient;


	}
    
}
