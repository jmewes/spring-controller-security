package com.experimental.model;

import java.time.LocalDate;
import java.util.UUID;

public interface Patient {

    UUID getId();

    LocalDate getDateOfBirth();

    String getName();
}
