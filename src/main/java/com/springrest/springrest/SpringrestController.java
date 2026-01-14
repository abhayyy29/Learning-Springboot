package com.springrest.springrest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
public class SpringrestController {
    @Autowired
    private CourseService courseSer;

    @GetMapping("/courses")
   public List<Course> getCourses(){
      return this.courseSer.getCourses();
    }
    @GetMapping("/courses/{courseId}")    
    public Course getCourse (@PathVariable long courseId){
        return this.courseSer.getCourse(courseId);
    }
    @PostMapping("/courses")
    public Course addCourse (@RequestBody Course course ) {
        return this.courseSer.addCourse(course);
    } 
    @PutMapping("/courses")
    public Course updatCourse( @RequestBody Course course){
        return this.courseSer.updateCourse(course);
    }
    @DeleteMapping("/courses/{courseId}")
    public void deleteCourse(@PathVariable long courseId){
         this.courseSer.deleteCourse(courseId);
    }
}
