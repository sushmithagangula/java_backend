package com.sushu.project.patient.repository;


import com.sushu.project.patient.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    @Modifying // allows firing insert,update and delete queries
    @Query(value = "update from patient_info set name,mobile,dob,status,lastVisited where id = :id",nativeQuery = true)
    void updatepatientRepository(@Param("id") Long id);

    @Modifying // allows firing insert,update and delete queries
    @Query(value = "delete from patient_info where id = :id",nativeQuery = true)
    void deleteRepository(@Param("id") Long id);

    List<Patient> findByAgeBetween(Date st, Date ed);
}

