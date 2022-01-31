package com.sushu.project.patient.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PatientTests {
    @DisplayName("Domain : Checking Object Creation")
    @Test
    void testObjectCreation() {
        var patient = new Patient();
        Assertions.assertNotNull(patient);
    }
}


