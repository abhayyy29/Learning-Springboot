package com.springrest.springrest.services;

import java.util.List;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

import com.springrest.entities.Course;
 @Service
public class CourseServiceImpl implements CourseService {
    List<Course> list;

    public  void CourseServiceimpl() {
        list = new ArrayList<>();
        list.add(new Course(145, "Java Core", "this course contains java basics concept"));
        list.add(new Course(434, "Spring Boot", "learning rest API"));
    }
    public List<Course> getCourses(){
    return list;
    }
    public Course getCourse(long courseId){
        Course c = null;
        for (Course course : list) {
            if(course.getId()==courseId){
                c=course;
                break;
            }    
        }
        return c;
    }
    public Course addCourse (Course course){
        list.add(course);
        return course;
    }
    
    public Course updateCourse (Course course){
            list.forEach(e ->{
                   if (e.getId() == course.getId()) {
                     e.setTitle(course.getTitle());
                     e.setDescription(course.getDescription());
                   }
        });
        return course;
    }

    public void deleteCourse(long courseId){
     list.removeIf(course -> course.getId() == courseId);
    }
}



