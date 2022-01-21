package com.sushu.project.patient.domain;

        import org.junit.jupiter.api.Assertions;
        import org.junit.jupiter.api.DisplayName;
        import org.junit.jupiter.api.Test;

        import java.sql.Date;
        import java.time.LocalDate;

public class PatientsTests {

    @DisplayName("Domain : Checking Object Creation")
    @Test
    void testObjectCreation() {
        var patient = new Patient();
        Assertions.assertNotNull(patient);
    }

    @DisplayName("Domain : Checking getters and setters")
    @Test
    void testObjectGettersSetters() {
        var patient = new Patient();
        patient.setNum(10);
        patient.setDt(LocalDate.of(2021,1,1));
        patient.setName("abc");
        patient.setId(10L);

       Assertions.assertEquals(10, patient.getNum());
        Assertions.assertEquals(Date.valueOf(LocalDate.of(2021,1,1)), patient.getDt());
        Assertions.assertEquals("abc", patient.getName());
        Assertions.assertEquals(10, patient.getId());
    }

}