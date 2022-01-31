package com.sushu.project.patient.service;

import com.sushu.project.patient.domain.Patient;
import com.sushu.project.patient.repository.PatientRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class PatientServiceTests {
    @Mock
private PatientRepository repository;

    @InjectMocks
    private PatientService service = new PatientServiceImpl();


    @Test
    void testSize() {
        var patient = new Patient();
        Assertions.assertNotNull(patient);
    }
}
