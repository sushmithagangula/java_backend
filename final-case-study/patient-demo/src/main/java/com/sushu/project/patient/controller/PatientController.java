package com.sushu.project.patient.controller;

import com.sushu.project.patient.dto.AppResponse;
import com.sushu.project.patient.dto.PatientDto;

import com.sushu.project.patient.service.PatientService;

import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/patient")

@RestController
public class PatientController {

    @Autowired
    private PatientService service;

    @PostMapping
    public ResponseEntity<AppResponse<PatientDto>> createAbc(@RequestBody PatientDto dto) {

        var svObj = service.createPatient(dto);

        var response = new AppResponse<PatientDto>();
        response.setStatus("success");
        response.setMessage("Abc saved successfully");
        response.setBody(svObj);

        return ResponseEntity.ok(response);
    }
    @GetMapping("/{locality}/{doctor}")
    public ResponseEntity<AppResponse<List<PatientDto>>> findLocalityDoctor(@PathVariable String locality, @PathVariable String doctor) {


        return null;
    }
}