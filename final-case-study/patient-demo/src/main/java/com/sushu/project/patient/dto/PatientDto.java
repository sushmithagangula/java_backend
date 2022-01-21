package com.sushu.project.patient.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.sql.Date;
import java.time.LocalDate;


@AllArgsConstructor
@Setter
@Getter
public class PatientDto {
    private Long id;
    private String name;
    private LocalDate dt;
    private Integer num;

}