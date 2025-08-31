package com.app.service;

import java.util.List;
import com.app.dto.CourseTypeDto;

public interface CourseTypeService {

	public CourseTypeDto createCourseType(CourseTypeDto courseTypeDto);

	public CourseTypeDto updateCourseType(Long courseTypeId, CourseTypeDto courseTypeDto);

	public void deleteCourseType(Long courseTypeId);

	public CourseTypeDto getCourseTypeById(Long courseTypeId);

	public List<CourseTypeDto> getAllCourseTypes();

}
