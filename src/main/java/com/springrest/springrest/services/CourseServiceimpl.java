package com.springrest.springrest.services;

import java.util.List;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

import com.springrest.entities.Course;
 @Service
public class CourseServiceimpl implements CourseService {
    List<Course> list;

    public CourseServiceimpl() {
        list = new ArrayList<>();
        list.add(new Course(145, "Java Core", "this course contains java basics concept"));
        list.add(new Course(434, "Spring Boot", "learning rest API"));
    }
    public List<Course> getCourses(){
    return list;
    }
}
