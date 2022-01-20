package com.sushu.project.patient.Repository;



        import com.sushu.project.patient.domain.Patient;
        import com.sushu.project.patient.dto.PatientDto;
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
    private PatientDto repository;

    @DisplayName("Patient Repo : Creating Patient")
    @Test
    public void testCreateAbc() {

        var abc = new Patient();
        abc.setId(565L);
        abc.setName("abc");
        abc.setNum(56);
        abc.setDt(Date.valueOf(LocalDate.now()));
       // repository.save(abc);

    }
}