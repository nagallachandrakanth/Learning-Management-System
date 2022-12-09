package com.te.lms.entity.enums;

public enum AdminStatus {
	ACTIVE("ACTIVE"),INACTIVE("INACTIVE");
	
	private final String adminStatus;

	private AdminStatus(String adminStatus) {
		this.adminStatus = adminStatus;
	}

	public String getAdminStatus() {
		return adminStatus;
	}
	
	
	
	

}
