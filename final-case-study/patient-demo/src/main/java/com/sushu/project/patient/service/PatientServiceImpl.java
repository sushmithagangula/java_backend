package com.sushu.project.patient.service;


import com.sushu.project.patient.domain.Patient;
import com.sushu.project.patient.dto.PatientDto;
import com.sushu.project.patient.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
    public PatientDto updatePatientInformation(PatientDto dto) {

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

    // @Override
   // public List<Patient> findAllRegisteredPatient(PatientDto dto) {

       // var patient4 = new Patient();
        //patient4.setId(dto.getId());
        //patient4.setName(dto.getName());
        //patient4.setMobile(dto.getMobile());
        //patient4.setAge(dto.getAge());
        //patient4.setStatus(dto.getStatus());
        //patient4.setLastVisited(dto.getLastVisited());
        //repository.findAll();
    //}


    //@Override
       //public PatientDto findMobileNumber,findName(PatientDto dto)

    //{
       // var patient9 = new Patient();
      //  patient9.setLastVisited(findMobileNumber.getLastVisited());
       // patient9.setLastVisited(findName.getLastVisited());
        //repository.save(patient9);
  //  }
}