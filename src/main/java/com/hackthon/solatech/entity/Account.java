package com.hackthon.solatech.entity;

import java.math.BigDecimal;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long accountId;
	private String accountType;
	private Long representativeId;
	private BigDecimal balance;

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Long getRepresentativeId() {
		return representativeId;
	}

	public void setRepresentativeId(Long representativeId) {
		this.representativeId = representativeId;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

}
