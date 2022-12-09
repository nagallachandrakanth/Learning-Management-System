package com.te.lms.entity.enums;

public enum MaritalStatus {
	MARRIED("MARRIED"), UNMARRIED("UNMARRIED");

	private final String maritalStatusType;

	private MaritalStatus(String maritalStatusType) {
		this.maritalStatusType = maritalStatusType;
	}

	public String getMaritalStatusType() {
		return maritalStatusType;
	}

}
