package com.sushu.project.patient.service;


import com.sushu.project.patient.domain.Patient;
import com.sushu.project.patient.dto.MobileAndNameDto;
import com.sushu.project.patient.dto.PatientDto;
import com.sushu.project.patient.exception.DuplicateException;
import com.sushu.project.patient.exception.PatientNotFoundException;
import com.sushu.project.patient.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.transaction.Transactional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class PatientServiceImpl implements PatientService {


    @Autowired
    private PatientRepository repository;

    @Override
    public PatientDto registerPatient(PatientDto dto) {

        Patient pt = new Patient();
        pt.setId(dto.getId());
        pt.setName(dto.getName());
        pt.setMobile(dto.getMobile());
        pt.setAge(dto.getAge());
        pt.setStatus(dto.getStatus());
        pt.setLastVisited(dto.getLastVisited());
        repository.save(pt);
        return dto;
    }



   @Override
    public PatientDto updatePatientInformation(PatientDto dto) throws PatientNotFoundException {


           Patient pa = new Patient();
           pa.setId(dto.getId());
           pa.setName(dto.getName());
           pa.setMobile(dto.getMobile());
           pa.setAge(dto.getAge());
           pa.setStatus(dto.getStatus());
           pa.setLastVisited(dto.getLastVisited());
           Patient update = repository.save(pa);
           return new PatientDto(update.getId(), update.getName(), update.getMobile(), update.getAge(), update.isStatus(), update.getLastVisited());
       }





    @Override
    public void deletePatient(int id) {
        repository.deletePatient(id);
    }
    @Override
    public List<Patient> findAllPatient() {
        return repository.findAll();
    }
    @Override
    public List<MobileAndNameDto> findMobileAndNameVisitedToday() {
        LocalDate dt = LocalDate.now();
        List<Patient> patients = repository.findBylastVisited(dt);

        List<MobileAndNameDto> patientDtos = new ArrayList<>();

        for(int i=0;i<patients.size();i++) {
            Patient patient1 = patients.get(i);
            MobileAndNameDto dto = new MobileAndNameDto();
            dto.setMobile(patient1.getMobile());
            dto.setName(patient1.getName());

            patientDtos.add(dto);
        }
        return patientDtos;

    }

}
