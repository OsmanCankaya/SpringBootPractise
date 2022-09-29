package com.example.demo.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import javax.persistence.*;
import java.time.LocalDate;

//spring
@Entity
@Table
//lombok
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {

    //Sequence yapısı, mysql deki autoincrement yapısına karşılık geliyor
    //allocationSize artış miktarını belirtiyoruz
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;
    private String name;
    private String email;
    //date of birth
    private LocalDate dob;
    private Integer age;

    public Student(String name, String email, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.dob = dob;
    }
}
