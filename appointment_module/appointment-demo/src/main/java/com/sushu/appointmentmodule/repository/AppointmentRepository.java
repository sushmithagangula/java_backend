package com.sushu.appointmentmodule.repository;

import com.sushu.appointmentmodule.domain.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
    public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

        Optional<Appointment> findById(Long id);

        @Override
        List<Appointment> findAll();

        List<Appointment> findByAppointmentBetween(LocalDate start, LocalDate end);
    }

