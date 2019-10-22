package com.experimental.approach_a;

import com.experimental.fixtures.PatientEntity;
import com.experimental.fixtures.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ControllerVersion1 {

    private final PatientRepository patientRepository;

    @PostMapping(path = "/v1/patients")
    public PatientEntity createPatient(@RequestBody PatientEntity patientEntity) {
        return patientRepository.save(patientEntity);
    }
}
