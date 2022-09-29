package com.example.demo.student;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//lombok
@AllArgsConstructor
public class StudentService {

    @Autowired
    private final  StudentRepository studentRepository;

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
}
