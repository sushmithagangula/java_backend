package com.sushu.appointmentmodule.domain;

import com.sun.istack.NotNull;
import lombok.Data;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;


    @Data
    @Entity
    public class Appointment {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

    @NotNull
        @NotBlank
        @Column(unique = false, nullable = false)
        private String type;

        @Column(unique = false, nullable = false)
        private LocalDate placed;

        @Column(unique = false, nullable = false)
        private LocalDate appointment;

        @Column(unique = true, nullable = true)
        private String doctorName;

    }

