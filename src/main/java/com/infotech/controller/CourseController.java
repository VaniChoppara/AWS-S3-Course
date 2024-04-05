package com.infotech.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.infotech.dto.CourseDto;
import com.infotech.service.CourseService;

@Controller
public class CourseController {

	CourseService courseService;

	public CourseController(CourseService courseService) {
		this.courseService = courseService;
	}

	@GetMapping("/course")
	public String showCourse(@ModelAttribute CourseDto courseDto) {
		return "courseview";
	}

	@PostMapping("/saveCourse")
	public String saveCourse(@ModelAttribute CourseDto courseDto, Model model) throws IOException {

		boolean saveCourse = courseService.saveCourse(courseDto);

		if (saveCourse) {
			model.addAttribute("msg", "Course successfully saved");
		} else {
			model.addAttribute("errMsg", "Course not saved");
		}
		return "courseview";

	}
}
