package com.experimental.fixtures;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PatientRepositoryTest {

    @Autowired
    private PatientRepository patientRepository;

    @Test
    public void should_create_patient() {
        PatientEntity patient = PatientEntity.builder()
                .dateOfBirth(LocalDate.now())
                .name("John Doe")
                .build();

        PatientEntity createdPatient = patientRepository.save(patient);

        assertNotNull(createdPatient.getId());
    }
}
