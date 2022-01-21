package com.sushu.project.patient.Repository;



        import com.sushu.project.patient.domain.Patient;
        import com.sushu.project.patient.dto.PatientDto;
        import com.sushu.project.patient.repository.PatientRepository;
        import org.junit.jupiter.api.DisplayName;
        import org.junit.jupiter.api.Test;
        import org.junit.jupiter.api.extension.ExtendWith;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
        import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
        import org.springframework.test.context.junit.jupiter.SpringExtension;

        import java.sql.Date;
        import java.time.LocalDate;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class PatientRepositoryTests {

    @Autowired
    private PatientRepository repository;

    @DisplayName("Patient Repo : Creating Patient")
    @Test
    public void testCreatePatient() {

        var patient = new Patient();
        patient.setId(565L);
        patient.setName("abc");
        patient.setNum(56);
        patient.setDt(LocalDate.now());

      repository.save(patient);

    }
}