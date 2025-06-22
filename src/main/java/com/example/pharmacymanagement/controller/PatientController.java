package com.example.pharmacymanagement.controller;

import com.example.pharmacymanagement.model.Patient;
import com.example.pharmacymanagement.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/patients")
public class PatientController {


    @Autowired
    private PatientService service;

    @GetMapping
    public List<Patient> getAllPatients() {
        return service.getAllPatients();
    }

    @GetMapping("/{ssn}")
    public Optional<Patient> getPatient(@PathVariable String ssn) {
        return service.getPatientById(ssn);
    }

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient) {
        return service.savePatient(patient);
    }

    @DeleteMapping("/{ssn}")
    public void deletePatient(@PathVariable String ssn) {
        service.deletePatient(ssn);
    }
}
