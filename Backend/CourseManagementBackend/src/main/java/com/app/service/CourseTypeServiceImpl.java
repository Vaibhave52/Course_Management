package com.app.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.CourseTypeDto;
import com.app.entity.CourseType;
import com.app.exception.ResourseNotFoundException;
import com.app.repository.CourseTypeRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CourseTypeServiceImpl implements CourseTypeService {

	@Autowired
	private CourseTypeRepository courseTypeRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CourseTypeDto createCourseType(CourseTypeDto courseTypeDto) {

		CourseType courseType = modelMapper.map(courseTypeDto, CourseType.class);

		CourseType savedCourseType = courseTypeRepository.save(courseType);

		log.info("Service layer title : {}, description : {}", courseType.getTitle(), courseType.getDescription());

		return modelMapper.map(savedCourseType, CourseTypeDto.class);

	}

	@Override
	public CourseTypeDto updateCourseType(Long courseTypeId, CourseTypeDto updatedcourseTypeDto) {

		CourseType courseType = courseTypeRepository.findById(courseTypeId).orElseThrow(

				() -> new ResourseNotFoundException("CourseType is not found with given Id: " + courseTypeId));

		courseType.setTitle(updatedcourseTypeDto.getTitle());

		courseType.setDescription(updatedcourseTypeDto.getDescription());

		CourseType savedCourseType = courseTypeRepository.save(courseType);

		return modelMapper.map(savedCourseType, CourseTypeDto.class);

	}

	@Override
	public void deleteCourseType(Long courseTypeId) {

		CourseType courseType = courseTypeRepository.findById(courseTypeId).orElseThrow(

				() -> new ResourseNotFoundException("CourseType is not found with given Id: " + courseTypeId));

		log.info("In Service  layer coursetype deleted having id {}", courseTypeId);

		courseTypeRepository.delete(courseType);

	}

	@Override
	public CourseTypeDto getCourseTypeById(Long courseTypeId) {
		// TODO Auto-generated method stub

		log.info("In Service  layer coursetype id is {}", courseTypeId);

		CourseType courseType = courseTypeRepository.findById(courseTypeId).orElseThrow(
				() -> new ResourseNotFoundException("CourseType is not found with given Id: " + courseTypeId));

		log.info("In Service  layer coursetype id is {}", courseType.getCourseTypeId());

		return modelMapper.map(courseType, CourseTypeDto.class);

	}

	@Override
	public List<CourseTypeDto> getAllCourseTypes() {

		log.info("In Service  layer getAllCourseType");

		List<CourseType> courseTypesList = courseTypeRepository.findAll();

		return courseTypesList.stream().map(courseType -> modelMapper.map(courseType, CourseTypeDto.class))
				.collect(Collectors.toList());
	}

}
