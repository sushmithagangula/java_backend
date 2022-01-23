package com.sushu.project.patient.dto;



import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
@AllArgsConstructor
@Setter
@Getter
public class PatientDto {
    private int id;
    @NotNull
    private String name;
    private long mobile;
    @NotNull
    private int age;
    @NotNull

    private Boolean status;
    private LocalDate lastVisited;
}



