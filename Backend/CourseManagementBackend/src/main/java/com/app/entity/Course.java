package com.app.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Table(name = "course")
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "course_id")
	private Long courseId;
	
	@Column(name = "name",nullable = false,length = 30)
	private String name;
	
	@Column(name = "description",nullable = false,length = 200)
	private String description;
	
	@Column(name = "start_date",nullable = false)
	private LocalDateTime startDate;
	
	@Column(name = "end_date",nullable = false)
	private LocalDateTime endDate;
	
	@ManyToOne
    @JoinColumn(name = "batch_cycle_id")
	private BatchCycle batchCycle;
	
	@OneToMany
    @JoinColumn(name = "premises_id")
	private List<Premises> premises;
	
	@ManyToOne
	@JoinColumn(name="course_type_id")
	private CourseType courseType;
	
	@ManyToMany
    @JoinTable(
        name = "course_staff", // name of the join table
        joinColumns = @JoinColumn(name = "course_id"), // foreign key for the course
        inverseJoinColumns = @JoinColumn(name = "staff_id") // foreign key for the staff member
    )
	private List<Staff> staff;
	
	

}
