package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Section;

@Repository
public interface SectionRepository extends JpaRepository<Section, Long> {

//	List<Section> findAllBySubjectId(Long subjectId);
}
