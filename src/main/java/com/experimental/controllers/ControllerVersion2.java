package com.experimental.controllers;

import com.experimental.model.Patient;
import com.experimental.model.PatientEntity;
import com.experimental.model.PatientRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class ControllerVersion2 {

    private final PatientRepository patientRepository;

    @PostMapping(path = "/v2/patients")
    public PatientEntity createPatient(@RequestBody PatientResource patientResource) {
        return patientRepository.save(patientResource.toEntity());
    }

    @AllArgsConstructor
    @Getter
    private class PatientResource implements Patient {
        
        private UUID id;

        private LocalDate dateOfBirth;

        private String name;

        PatientEntity toEntity() {
            return PatientEntity.builder()
                    .id(id)
                    .name(name)
                    .dateOfBirth(dateOfBirth)
                    .build();
        }
    }

}
