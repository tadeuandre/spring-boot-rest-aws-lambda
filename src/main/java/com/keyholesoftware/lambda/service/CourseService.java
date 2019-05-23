package com.keyholesoftware.lambda.service;


import com.keyholesoftware.lambda.model.Course;
import com.keyholesoftware.lambda.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Collection<Course> getAllCourses(){
        return this.courseRepository.findAll();
    }

    public Course getCourseById(int id){
        return this.courseRepository.findOne(id);
    }

    public void removeCourseById(int id) {
        this.courseRepository.delete(id);
    }

    public void save(Course course){
        this.courseRepository.save(course);
    }

}
