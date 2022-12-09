package com.te.lms.entity.enums;

public enum SkillRating {
	LOW("LOW"), MEDIUM("MEDIUM"), AVERAGE("AVERAGE"), GOOD("GOOD"), EXCELLENT("EXCELLENT");

	private final String skillRatingType;

	private SkillRating(String skillRatingType) {
		this.skillRatingType = skillRatingType;
	}

	public String getSkillRatingType() {
		return skillRatingType;
	}

}
