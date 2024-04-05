package com.infotech.dto;

import org.springframework.web.multipart.MultipartFile;

public class CourseDto {

	Integer id;
	String courseName;
	String duration;
	Double price;
	String imageUrl;
	MultipartFile file;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", duration=" + duration + ", price=" + price
				+ ", imageUrl=" + imageUrl + "]";
	}
}
