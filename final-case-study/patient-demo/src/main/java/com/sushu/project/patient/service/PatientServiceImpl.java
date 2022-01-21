package com.sushu.project.patient.service;

import com.sushu.project.patient.domain.Patient;
import com.sushu.project.patient.dto.PatientDto;
import com.sushu.project.patient.repository.PatientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService{

    @Autowired
    private PatientRepository repository;

    @Override
    public PatientDto createPatient(PatientDto dto) {

        var patient = new Patient();
        patient.setDt(dto.getDt());
        patient.setName(dto.getName());
        repository.save(patient);

        return dto;

    }
  @Override
    public List<PatientDto> findall() {

        List<Patient> patients = repository.findAll();

        List<PatientDto> dtos = new ArrayList<>();
        for(int i=0; i < patients.size();i++);
        {
            Patient patient = patients.get();

            PatientDto dto = new PatientDto(
                    patient.getId(),
                    patient.getName(),
                    patient.getDt(),patient.getNum());
            dtos.add(dto);
        }

        @Override
              public PatientDto registerPatient(PatientDto dto){

                  var patient1 = new Patient();
                  patient1.setId(dto.getId());
                  patient1.setName(dto.getName());
                  patient1.setMobile(dto.getMobile());
                  patient1.setAge(dto.getAge());
                  patient1.setStatus(dto.getStatus());
                  patient1.setLastVisited(dto.getLastVisited());
                  repository.save(patient1);
                  return dto;

              }
      @Override
      public Patient updatePatient(){

          var patient2 = new Patient();
          patient2.setId(updatePatient.getId());
          patient2.setName(updatePatient.getName());
          patient2.setMobile(updatePatient.getMobile());
          patient2.setAge(updatePatient.getAge());
          patient2.setStatus(updatePatient.isStatus());
          patient2.setLastVisited(updatePatient.getLastVisited());
          repository.save(patient2);
          return updatePatient;

      }
      @Override
      public PatientDto deletePatient(){

          var patient3 = new Patient();
          patient3.setId(deletePatient.getId());
          patient3.setName(deletePatient.getName());
          patient3.setMobile(deletePatient.getMobile());
          patient3.setAge(deletePatient.getAge());
          patient3.setStatus(deletePatient.getStatus());
          patient3.setLastVisited(deletePatient.getLastVisited());
          repository.save(patient3);
          return deletePatient;

      }



      @Override
      public List<Patient> findAllRegisteredPatient() {

            var patient4 = new Patient();
          patient4.setId(registerPatient.getId());
          patient4.setName(registerPatient.getName());
          patient4.setMobile(registerPatient.getMobile());
          patient4.setAge(registerPatient.getAge());
          patient4.setStatus(registerPatient.getStatus());
          patient4.setLastVisited(registerPatient.getLastVisited());
          repository.save(patient4);
          return findAll();
      }
      @Override
      public PatientDto findMobileNumber,Name() {

          var patient9 = new Patient();

          patient9.setDt(findMobileNumber.getDt());
          patient9.setDt(findName.getDt());

          repository.save(patient9);
          return Dto();

        }
}