package com.app.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "course_module")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class CourseModule {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "course_module_id")
	private Long courseModuleId;
	
	@Column(name = "title",nullable = false,length = 30)
	private String title;
	
	@Column(name = "description",nullable = false,length = 200)
	private String description;
	
	@Column(name = "theory_hours",nullable = false,length = 20)
	private String theoryHours;
	
	@Column(name = "practical_hours",nullable = false,length = 20)
	private String practicalHours;
	
	@OneToOne
	@JoinColumn(name="module_router")
	private Staff staff;
	
	@OneToMany
	@JoinColumn(name = "subject_id")
	private List<Subject> subject;

}
