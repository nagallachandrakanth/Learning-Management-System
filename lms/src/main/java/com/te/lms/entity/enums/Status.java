package com.te.lms.entity.enums;

public enum Status {
	INPROGRESS("INPROGRESS"), COMPLETED("COMPLETED"),TOBESTARTED("TO BE STARTED");
	
	private final String status;

	private Status(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	
	
}
