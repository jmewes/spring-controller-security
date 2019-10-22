package com.experimental.controller;

import com.experimental.model.PatientEntity;
import com.experimental.model.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Example which violates RSPEC-4684.
 */
@RestController
@RequiredArgsConstructor
public class ControllerVersion1 {

    private final PatientRepository patientRepository;

    @PostMapping(path = "/v1/patients")
    public PatientEntity createPatient(@RequestBody PatientEntity patientEntity) {
        return patientRepository.save(patientEntity);
    }
}
