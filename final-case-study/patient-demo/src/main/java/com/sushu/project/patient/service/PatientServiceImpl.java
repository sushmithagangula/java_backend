package com.sushu.project.patient.service;

import com.sushu.project.patient.domain.Patient;
import com.sushu.project.patient.dto.PatientDto;
import com.sushu.project.patient.repository.PatientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService{

    @Autowired
    private PatientRepository repository;

    @Override
    public PatientDto createPatient(PatientDto dto) {

        var abc= new Patient();
        abc.setDt(dto.getDt());
        abc.setName(dto.getName());
        abc.setNum(dto.getNum());
        repository.save(abc);

        return dto;
    }
}