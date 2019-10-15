package com.hackthon.solatech.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long txnId;
	private BigDecimal amount;
	private Long debitAccountId;
	private Long creditAccountId;
	private Long loanId;

	public Long getTxnId() {
		return txnId;
	}

	public void setTxnId(Long txnId) {
		this.txnId = txnId;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Long getDebitAccountId() {
		return debitAccountId;
	}

	public void setDebitAccountId(Long debitAccountId) {
		this.debitAccountId = debitAccountId;
	}

	public Long getCreditAccountId() {
		return creditAccountId;
	}

	public void setCreditAccountId(Long creditAccountId) {
		this.creditAccountId = creditAccountId;
	}

	public Long getLoanId() {
		return loanId;
	}

	public void setLoanId(Long loanId) {
		this.loanId = loanId;
	}

}
