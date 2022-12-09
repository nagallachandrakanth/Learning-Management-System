package com.te.lms.entity.enums;

public enum Designation {
	ADMIN("ADMIN"), MENTOR("MENTOR"), EMPLOYEE("EMPLOYEE");

	private final String designationType;

	private Designation(String designationType) {
		this.designationType = designationType;
	}

	public String getDesignationType() {
		return designationType;
	}

}
