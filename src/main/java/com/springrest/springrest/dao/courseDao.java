package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.entities.Course;

public interface courseDao  extends JpaRepository<Course , Long>{

}
