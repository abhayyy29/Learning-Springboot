package com.springrest.springrest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class SpringrestController {
    @Autowired
    private CourseService courseSer;

    @GetMapping("/courses")
   public List<Course> getCourses(){
      return this.courseSer.getCourses();
    }
    
    
    
}
