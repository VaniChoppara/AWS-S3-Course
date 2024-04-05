package com.infotech.service;

import java.io.IOException;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.infotech.dto.CourseDto;
import com.infotech.entity.Course;
import com.infotech.repository.CourseRepository;

@Service
public class CourseService{
	
	private CourseRepository courseRepository;
	private S3Service s3Service;

	public CourseService(CourseRepository courseRepository, S3Service s3Service) {
		this.courseRepository = courseRepository;
		this.s3Service=s3Service;
	}

	public boolean saveCourse(CourseDto courseDto) throws IOException {
		Course courseEntity= new Course();
		BeanUtils.copyProperties(courseDto, courseEntity);
		courseEntity.setImageUrl(courseDto.getFile().getOriginalFilename());
		
		s3Service.saveFile(courseDto.getFile());
		 
		Course savedCourse = courseRepository.save(courseEntity);
		if(savedCourse!=null)
			return true;
		return false;
		
	}
	
}
