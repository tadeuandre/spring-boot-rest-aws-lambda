package com.keyholesoftware.lambda.model;

import javax.persistence.*;
import java.io.*;
import java.util.*;

@Entity
public class Material implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fileName;
    @OneToMany
    private List<Course> courses;

    public Material() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Material material = (Material) o;
        return id.equals(material.id) &&
                fileName.equals(material.fileName) &&
                courses.equals(material.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fileName, courses);
    }
}
