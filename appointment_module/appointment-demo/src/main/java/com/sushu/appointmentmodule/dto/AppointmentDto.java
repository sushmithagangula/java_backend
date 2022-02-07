package com.sushu.appointmentmodule.dto;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;


    @NoArgsConstructor
    @AllArgsConstructor
    @Setter
    @Getter
    public class AppointmentDto {
        private Long id;
        @NotNull
       @NotBlank
        private String type;
        private LocalDate placed;
        private LocalDate appointment;
        private String doctorName;
    }
