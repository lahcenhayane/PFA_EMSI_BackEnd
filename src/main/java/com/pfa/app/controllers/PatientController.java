package com.pfa.app.controllers;

import com.pfa.app.services.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/patient"})
public class PatientController {
    @Autowired
    IPatientService patientService;

    @GetMapping
    public String index(){
        return "Patient/index";
    }

    @GetMapping("/rdv")
    public String rdv(){
        return "Patient/rdv";
    }
}
