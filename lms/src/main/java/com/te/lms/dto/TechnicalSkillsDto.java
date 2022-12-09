package com.te.lms.dto;

import com.te.lms.entity.enums.SkillRating;

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

public class TechnicalSkillsDto {

	private Integer skillsId;
	private String skillType;
	private SkillRating skillRating;
	private String yearOfExperience;

}
