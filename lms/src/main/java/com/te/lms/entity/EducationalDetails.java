package com.te.lms.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.te.lms.entity.enums.EducationalType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity

@Table(name = "educational_details")
public class EducationalDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "educational_id")
	private Integer educationalId;
	@Enumerated(EnumType.STRING)
	@Column(name = "educational_type")
	private EducationalType educationalType;
	@Column(name = "year_of_passing")
	private Integer yearOfPassing;
	@Column(name = "percentage")
	private String percentage;
	@Column(name = "university_name")
	private String universityName;
	@Column(name = "institute_name")
	private String instituteName;
	@Column(name = "specialization")
	private String specialization;
	@Column(name = "state")
	private String state;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "emp_fk")
	private Employee employee;
}
