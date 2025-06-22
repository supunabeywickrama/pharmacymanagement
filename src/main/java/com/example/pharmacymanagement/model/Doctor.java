package com.example.pharmacymanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Doctor {

    @Id
    private String ssn; // Unique doctor ID (e.g., license number)
    private String name;
    private String specialty;
    private int yearsOfExperience;
}

