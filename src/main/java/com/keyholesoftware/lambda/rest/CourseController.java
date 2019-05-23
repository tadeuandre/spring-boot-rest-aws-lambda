package com.keyholesoftware.lambda.rest;

import com.keyholesoftware.lambda.model.Course;
import com.keyholesoftware.lambda.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Course getCourseById(@PathVariable("id") int id){
        return courseService.getCourseById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteCourseById(@PathVariable("id") int id){
        courseService.removeCourseById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void deleteCourseById(@RequestBody Course course){
        courseService.save(course);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertCourse(@RequestBody Course course){
        courseService.save(course);
    }
}
