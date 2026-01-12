package com.springrest.entities;

public class Course {
     long id;
     String title;
     String description;
     public Course(long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
     }
     public Course() {
        super();
     }
     public long getId() {
         return id;
     }
     public String getTitle() {
         return title;
     } 
     public String getDescription() {
         return description;
     }
     public void setId(long id) {
         this.id = id;
     }
     public void setTitle(String title) {
         this.title = title;
     }
     public void setDescription(String description) {
         this.description = description;
     }
     @Override
     public String toString() {
        return "Course [id=" + id + ", title=" + title + ", description=" + description + "]";
     }
     



}
