package com.app.entity;

import com.app.entity.enums.InfrastructureType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "infrastructure")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Infrastructure {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "infrastructure_id")
	private Long infrastructureId;

	@Column(name = "title", nullable = false, length = 30)
	private String title;
	@Enumerated(EnumType.STRING)
	private InfrastructureType infrastructureType;

	@Column(name = "description", nullable = false, length = 200)
	private String description;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "premise_id")
	private Premises premises;

}
