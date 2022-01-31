package com.sushu.project.patient.repository;

import com.sushu.project.patient.domain.Patient;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;
@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE )

public class PatientRepositoryTests {
    @Autowired
private PatientRepository repository;

    @DisplayName("Patient Repo : Creating Patient")
    @Test
    public void testcreatePatientRegistration(){

        var patient = new Patient();
       patient.setId(56);
        patient.setName("abc");
        patient.setLastVisited(LocalDate.now());
        repository.save(patient);

    }



}
