package com.sushu.appointmentmodule.service;

import com.sushu.appointmentmodule.domain.Appointment;
import com.sushu.appointmentmodule.dto.AppointmentDto;
import com.sushu.appointmentmodule.exception.AppointmentAlreadyExisting;
import com.sushu.appointmentmodule.exception.DateOutOfBound;
import com.sushu.appointmentmodule.exception.DuplicateException;

import java.time.LocalDate;
import java.util.List;

public interface AppointmentService {
    public AppointmentDto createAppointment(AppointmentDto dto) throws DuplicateException;

    LocalDate setAppointment(Long id, LocalDate appointment, String type) throws DateOutOfBound, AppointmentAlreadyExisting;

    String cancelAppointment(Long id);

    String updateAppointment(Long id,String type);

    List<Appointment> findAllApp();

    List<AppointmentDto> getDaysBetweenDates(LocalDate startdate, LocalDate enddate);

}
