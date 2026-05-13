package com.patientserviceforrestapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RequestMapping("/welComePage")

@RestController
public class IndexController {
    


    @GetMapping("/")
    public String WelcomeToPatientService(){
        return "WelCome to patient service...";
    }


}
