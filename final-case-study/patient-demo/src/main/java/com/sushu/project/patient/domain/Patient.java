package com.sushu.project.patient.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Patient {

    @Id
    @NotBlank
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private Long mobile;
    private Integer age;
    private boolean status;
    private LocalDate lastVisited;

}



