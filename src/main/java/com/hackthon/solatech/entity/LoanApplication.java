/**
 * @author User1
 * @name User.java
 * @date Sep 25, 2019
 */
package com.hackthon.solatech.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * @author hackathon
 *
 */
@Entity
public class LoanApplication {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private BigDecimal amount;
	private Integer term;
	private String puropse;
	private String status;

	@OneToOne
	@JoinColumn(name = "corporate_id")
	private Corporate corporate;

	@OneToOne
	@JoinColumn(name = "representative_id")
	private Representative representative;

	public LoanApplication() {

	}

	/**
	 * @param amount
	 * @param term
	 * @param puropse
	 */
	public LoanApplication(BigDecimal amount, Integer term, String puropse) {
		super();
		this.amount = amount;
		this.term = term;
		this.puropse = puropse;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * @return the term
	 */
	public Integer getTerm() {
		return term;
	}

	/**
	 * @param term the term to set
	 */
	public void setTerm(Integer term) {
		this.term = term;
	}

	/**
	 * @return the puropse
	 */
	public String getPuropse() {
		return puropse;
	}

	/**
	 * @param puropse the puropse to set
	 */
	public void setPuropse(String puropse) {
		this.puropse = puropse;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the corporate
	 */
	public Corporate getCorporate() {
		return corporate;
	}

	/**
	 * @param corporate the corporate to set
	 */
	public void setCorporate(Corporate corporate) {
		this.corporate = corporate;
	}

	/**
	 * @return the representative
	 */
	public Representative getRepresentative() {
		return representative;
	}

	/**
	 * @param representative the representative to set
	 */
	public void setRepresentative(Representative representative) {
		this.representative = representative;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Application [id=");
		builder.append(id);
		builder.append(", amount=");
		builder.append(amount);
		builder.append(", term=");
		builder.append(term);
		builder.append(", puropse=");
		builder.append(puropse);
		builder.append(", status=");
		builder.append(status);
		builder.append(", corporate=");
		builder.append(corporate);
		builder.append(", representative=");
		builder.append(representative);
		builder.append("]");
		return builder.toString();
	}

}
