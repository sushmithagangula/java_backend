package com.sushu.project.patient.domain;


        import lombok.Data;
        import lombok.Getter;
        import lombok.Setter;

        import javax.persistence.*;
        import java.sql.Date;
        import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    @Column(unique = false, nullable = true)
    private Integer Num;

    @Column(unique = false, nullable = false)
    private LocalDate dt;

    @Column(unique = false, nullable = false)
    private boolean status;

    @Column(unique = false, nullable = false)
    private Date lastVisited;


    }
