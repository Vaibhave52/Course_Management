package com.app.entity;



import com.app.entity.enums.StaffType;

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
@Table(name = "staff")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Staff  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "staff_id")
	private Long staffId;
	
	@Column(name = "name",nullable = false,length = 30)
	private String name;
	
	@Column(name = "password",nullable = false,length = 30)
	private String password;
	
	@Column(name = "mobile_no",nullable = false,length = 13,unique = true)
	private String mobileNo;
	
	@Column(name = "email",nullable = false,length = 30,unique = true)
	private String email;
	
	@Enumerated(EnumType.STRING)
	private StaffType staffType;
	
	@ManyToOne
	@JoinColumn(name = "role_id")
	private Role role;

	public String getPassword() {
		return this.password;
	}

}
