package com.te.lms.entity.enums;

public enum EducationalType {
	UG("UG"), PG("PG"), PHD("PHD");

	private final String educationType;

	private EducationalType(String educationType) {
		this.educationType = educationType;
	}

	public String getEducationType() {
		return educationType;
	}

}
