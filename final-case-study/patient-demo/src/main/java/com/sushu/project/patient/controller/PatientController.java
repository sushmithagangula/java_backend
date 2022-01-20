package com.sushu.project.patient.controller;

import com.sushu.project.patient.dto.PatientDto;

import com.sushu.project.patient.dto.PatientResponse;
import com.sushu.project.patient.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.http.ResponseEntity;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/abc")
@RestController
public class PatientController {

    @Autowired
    private PatientService service;

    @PostMapping
    public ResponseEntity<PatientResponse<PatientDto>> createAbc(@RequestBody PatientDto dto) {

        var svObj = service.createPatient(dto);

        var response = new PatientResponse<PatientDto>();
        response.setStatus("success");
        response.setMessage("Abc saved successfully");
        response.setBody(svObj);

        return ResponseEntity.ok(response);
    }
}