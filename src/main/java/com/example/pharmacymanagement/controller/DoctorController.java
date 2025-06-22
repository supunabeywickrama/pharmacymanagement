package com.example.pharmacymanagement.controller;

import com.example.pharmacymanagement.model.Doctor;
import com.example.pharmacymanagement.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    @Autowired
    private DoctorService service;

    @GetMapping
    public List<Doctor> getAllDoctors() {
        return service.getAllDoctors();
    }

    @GetMapping("/{ssn}")
    public Optional<Doctor> getDoctor(@PathVariable String ssn) {
        return service.getDoctorById(ssn);
    }

    @PostMapping
    public Doctor createDoctor(@RequestBody Doctor doctor) {
        return service.saveDoctor(doctor);
    }

    @DeleteMapping("/{ssn}")
    public void deleteDoctor(@PathVariable String ssn) {
        service.deleteDoctor(ssn);
    }
}
