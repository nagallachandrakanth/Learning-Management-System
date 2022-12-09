package com.te.lms.entity;

import java.time.LocalDate;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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

@Table(name = "experience_table")
public class Experience {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "experience_id")
	private Integer experienceId;
	@Column(name = "company_name")
	private String companyName;
	@Column(name = "years_of_experience")
	private Double yearsOfExperience;
	@Column(name = "date_of_joining")
	private LocalDate dateOfJoining;
	@Column(name = "date_of_relieving")
	private LocalDate dateOfRelieving;
	@Column(name = "designation")
	private String designation;
	@Column(name = "location")
	private String location;

	@ManyToOne( cascade = CascadeType.ALL)
	@JoinColumn(name = "emp_fk")
	private Employee employee;
}
