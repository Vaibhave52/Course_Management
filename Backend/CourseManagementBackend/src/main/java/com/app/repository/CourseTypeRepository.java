package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.BatchCycle;
import com.app.entity.CourseType;

@Repository
public interface CourseTypeRepository extends JpaRepository<CourseType, Long> {

}
