package com.sushu.project.patient.service;

import com.sushu.project.patient.domain.Patient;
import com.sushu.project.patient.dto.PatientDto;

import java.util.List;

public interface PatientService {


    public PatientDto createPatient(PatientDto dto);

    public List<PatientDto> findAll();

    List<PatientDto> findPatientByLocalityAndDoctor(String loc, String doc);
}