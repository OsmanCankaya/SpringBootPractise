package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
     CommandLineRunner commandLineRunner(StudentRepository studentRepository){
         return args -> {
             Student osman= new Student(
                     1L,
                     "Osman",
                     "osmancankayabilmuh@gmail.com",
                     LocalDate.of(2000, JANUARY,1),
                     21
             );

             Student alex = new Student(
                     2L,
                     "Alex",
                     "alex@gmail.com",
                     LocalDate.of(2004, JANUARY,1),
                     21
             );
             studentRepository.saveAll(List.of(osman,alex));
         };
     }
}
