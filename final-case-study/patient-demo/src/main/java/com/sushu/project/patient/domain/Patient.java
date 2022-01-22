package com.sushu.project.patient.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private Long mobile;
    private Integer age;
    private boolean status;
    private LocalDate lastVisited;

}



