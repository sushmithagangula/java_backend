package com.sushu.project.patient.service;


import com.sushu.project.patient.dto.PatientDto;

import java.util.List;

public interface PatientService {


        public PatientDto registerPatient(PatientDto dto);
        public PatientDto updatePatientInformation(PatientDto dto);
        public void deletePatient(int id);

    }