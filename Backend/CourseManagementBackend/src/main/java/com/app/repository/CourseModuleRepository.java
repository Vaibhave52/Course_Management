package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.CourseModule;

@Repository
public interface CourseModuleRepository extends JpaRepository<CourseModule, Long> {

}
