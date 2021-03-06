package com.sushu.project.patient.service;


import com.sushu.project.patient.domain.Patient;
import com.sushu.project.patient.dto.MobileAndNameDto;
import com.sushu.project.patient.dto.PatientDto;
import com.sushu.project.patient.exception.DuplicateException;

import java.util.List;

public interface PatientService {


        public PatientDto registerPatient(PatientDto dto);
        public PatientDto updatePatientInformation(PatientDto dto) ;
        public void deletePatient(int id) ;
    List<Patient> findAllPatient();
    List<MobileAndNameDto> findMobileAndNameVisitedToday();



}