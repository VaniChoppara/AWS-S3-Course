package com.infotech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infotech.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{

}
