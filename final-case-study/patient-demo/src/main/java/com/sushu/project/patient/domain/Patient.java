package com.sushu.project.patient.domain;


        import lombok.Data;

        import javax.persistence.*;
        import java.sql.Date;

@Data
@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    @Column(unique = false, nullable = true)
    private Date dt;

    @Column(unique = false, nullable = false)
    private Integer num;
}