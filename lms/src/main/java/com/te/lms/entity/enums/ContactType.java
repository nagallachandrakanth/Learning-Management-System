package com.te.lms.entity.enums;

public enum ContactType {
	OFFICAL("OFFICAL"), PERSONAL("PERSONAL");

	private final String contactType;

	private ContactType(String contactType) {
		this.contactType = contactType;
	}

	public String getContactType() {
		return contactType;
	}

}
