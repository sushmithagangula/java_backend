package com.sushu.project.patient.controller;

import com.sushu.project.patient.domain.Patient;
import com.sushu.project.patient.dto.AppResponse;
import com.sushu.project.patient.dto.PatientDto;
import com.sushu.project.patient.exception.InvalidPatientException;
import com.sushu.project.patient.exception.PatientNotFoundException;
import com.sushu.project.patient.service.PatientService;
import org.springframework.beans.factory.UnsatisfiedDependencyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;


@RequestMapping("/pt")
@RestController
public class PatientController
{
    @Autowired
    private PatientService service;

    @PostMapping("/pt")
    public ResponseEntity<AppResponse<PatientDto>> registerPatient(@Valid @RequestBody PatientDto dto) {
        var svObj = service.registerPatient(dto);
        var response = new AppResponse<PatientDto>();
        response.setStatus("success");
        response.setMessage("Patient saved successfully");
        response.setBody(svObj);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/pt1")
    public ResponseEntity<AppResponse<PatientDto>> updatePatientInformation(@RequestBody PatientDto dto) throws PatientNotFoundException {

        PatientDto svObj1 = service.updatePatientInformation(dto);
        var response = new AppResponse<PatientDto>();
        response.setStatus("success");
        response.setMessage("Patient saved successfully");
        response.setBody(svObj1);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<AppResponse<Integer>> deletePatient(@PathVariable int id) throws InvalidPatientException {

        service.deletePatient(id);
        var response = new AppResponse<Integer>();
        response.setStatus("success");
        response.setMessage("Patient delete successfully");
        response.setBody(1);
        return ResponseEntity.ok(response);
    }
    @GetMapping("/show")
    public List<Patient> findAllPatient() {
        return service.findAllPatient();
    }
}