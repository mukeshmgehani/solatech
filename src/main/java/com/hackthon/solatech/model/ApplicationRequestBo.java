package com.hackthon.solatech.model;

import java.math.BigDecimal;

/**
 * @author hackathon
 *
 */
public class ApplicationRequestBo {

	private BigDecimal amount;
	private Integer term;
	private String puropse;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((puropse == null) ? 0 : puropse.hashCode());
		result = prime * result + ((term == null) ? 0 : term.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApplicationRequestBo other = (ApplicationRequestBo) obj;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (puropse == null) {
			if (other.puropse != null)
				return false;
		} else if (!puropse.equals(other.puropse))
			return false;
		if (term == null) {
			if (other.term != null)
				return false;
		} else if (!term.equals(other.term))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ApplicationRequestBo [amount=");
		builder.append(amount);
		builder.append(", term=");
		builder.append(term);
		builder.append(", puropse=");
		builder.append(puropse);
		builder.append("]");
		return builder.toString();
	}

}
