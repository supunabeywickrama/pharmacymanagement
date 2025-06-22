package com.example.pharmacymanagement.service;

import com.example.pharmacymanagement.model.Patient;
import com.example.pharmacymanagement.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    @Autowired
    private PatientRepository repo;

    public List<Patient> getAllPatients() {
        return repo.findAll();
    }

    public Optional<Patient> getPatientById(String ssn) {
        return repo.findById(ssn);
    }

    public Patient savePatient(Patient patient) {
        return repo.save(patient);
    }

    public void deletePatient(String ssn) {
        repo.deleteById(ssn);
    }
}
