package com.keyholesoftware.lambda.service;


import java.util.Collection;

import com.keyholesoftware.lambda.repository.StudentRepository;
import com.keyholesoftware.lambda.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Collection<Student> getAllStudents(){
        return this.studentRepository.findAll();
    }

    public Student getStudentById(int id){
        return this.studentRepository.findOne(id);
    }

    public void removeStudentById(int id) {
        this.studentRepository.delete(id);
    }

    public void save(Student student){
        this.studentRepository.save(student);
    }

}
