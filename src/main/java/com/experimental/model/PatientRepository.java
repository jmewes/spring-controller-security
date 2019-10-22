package com.experimental.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Transactional
@Repository
public interface PatientRepository extends CrudRepository<PatientEntity, UUID> {
}
