package com.te.lms.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.te.lms.entity.enums.AccountType;

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
@Builder
@Entity

@Table(name = "bank_details")
public class BankDetails {
	@Id
	@Column(name = "account_number")
	private String accountNo;
	@Column(name = "bank_name")
	private String bankName;

	@Enumerated(EnumType.STRING)
	@Column(name = "account_type")
	private AccountType accountType;
	@Column(name = "ifsc_code")
	private String ifscCode;
	@Column(name = "branch")
	private String branch;
	@Column(name = "state")
	private String state;
	
	
	@OneToOne(mappedBy = "bankDetails",cascade = CascadeType.ALL)
	private Employee employee;

}
