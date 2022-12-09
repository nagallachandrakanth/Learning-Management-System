package com.te.lms.dto;

import com.te.lms.entity.enums.MaritalStatus;

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
@ToString
@Builder

public class SecondaryInfoDto {

	private String panNo;
	private String aadhaarNo;
	private String fatherName;
	private String motherName;
	private String spouseName;
	private String passportNo;
	private MaritalStatus maritalStatus;
}
