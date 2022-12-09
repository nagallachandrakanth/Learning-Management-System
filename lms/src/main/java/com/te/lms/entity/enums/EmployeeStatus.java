package com.te.lms.entity.enums;

public enum EmployeeStatus {
	ABSCONDED("ABSCONDED"), TERMINATED("TERMINATED"), ACTIVE("ACTIVE"),INACTIVE("INACTIVE");

	private final String employeeStatusType;

	private EmployeeStatus(String employeeStatusType) {
		this.employeeStatusType = employeeStatusType;
	}

	public String getEmployeeStatusType() {
		return employeeStatusType;
	}

}
