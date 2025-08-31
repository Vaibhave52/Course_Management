package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "premises")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Premises {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "premises_id")
	private Long premisesId;

	@Column(name = "institute_name", nullable = false, length = 50)
	private String instituteNames;

	@Column(name = "address", nullable = false, length = 150)
	private String addresses;

	@Column(name = "description", nullable = false, length = 200)
	private String descriptions;

}
