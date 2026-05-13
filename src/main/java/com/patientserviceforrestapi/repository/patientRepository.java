 package com.patientserviceforrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.patientserviceforrestapi.entity.patient_info;


@Repository
public interface patientRepository extends JpaRepository<patient_info, String>{

    
}