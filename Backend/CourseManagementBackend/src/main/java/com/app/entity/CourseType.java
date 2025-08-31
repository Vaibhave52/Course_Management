package com.app.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "course_type")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class CourseType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "course_type_id")
	private Long courseTypeId;

	@Column(name = "title", nullable = false, length = 30)
	private String title;

	@Column(name = "description", nullable = false, length = 200)
	private String description;

	@OneToMany(mappedBy = "courseType", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Course> courses;

}
