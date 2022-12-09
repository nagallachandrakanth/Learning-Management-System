package com.te.lms.entity.enums;

public enum AccountType {
	SAVINGS("SAVINGS"), CURRENT("CURRENT"), SALARY("SALARY");

	private final String accountType;

	private AccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountType() {
		return accountType;
	}

}
