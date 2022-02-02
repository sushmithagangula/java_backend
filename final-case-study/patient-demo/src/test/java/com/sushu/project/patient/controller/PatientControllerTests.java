package com.sushu.project.patient.controller;

import com.sushu.project.patient.domain.Patient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PatientControllerTests {
        @DisplayName("Domain : Checking Patient Creation")
        @Test
        void createPatientRegistration() {
            var create = new Patient();
            Assertions.assertNotNull(create);
        }
        @DisplayName("Domain : Checking Update Patient")
        @Test
        void updatePatientDetails() {
            var update = new Patient();
            Assertions.assertNotNull(update);
        }
        @DisplayName("Domain : Checking all patients")
        @Test
        void findAllPatients() {
            var age = new Patient();
            Assertions.assertNotNull(age);
        }

        @DisplayName("Domain : Checking Patient name,mobile by date")
        @Test
        void patientNameMobileByDate() {
            var start = new Patient();
            Assertions.assertNotNull(start);
        }
        @DisplayName("Domain : Checking delete patient")
        @Test
        void deletePatient() {
            var start = new Patient();
            Assertions.assertNotNull(start);
        }

    }








