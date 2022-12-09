package com.te.lms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.te.lms.entity.enums.Action;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Request {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "no")
	private Integer no;

	@Column(name = "employee_id")
	private Integer employeeId;

	@Column(name = "employee_name")
	private String employeeName;

	@Column(name = "yop")
	private Integer yop;

	@Column(name = "percentage")
	private String percentage;

	@Column(name = "experience")
	private String experience;

	@Column(name = "contact_no")
	private String contactNo;

	@Enumerated(EnumType.STRING)
	private Action action;

}
