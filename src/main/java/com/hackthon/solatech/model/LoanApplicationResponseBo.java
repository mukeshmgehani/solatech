package com.hackthon.solatech.model;

/**
 * @author hackathon
 *
 */
public class LoanApplicationResponseBo extends SolaTechResponseBO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer loanApplicationId;

	/**
	 * @return the loanApplicationId
	 */
	public Integer getLoanApplicationId() {
		return loanApplicationId;
	}

	/**
	 * @param loanApplicationId the loanApplicationId to set
	 */
	public void setLoanApplicationId(Integer loanApplicationId) {
		this.loanApplicationId = loanApplicationId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((loanApplicationId == null) ? 0 : loanApplicationId.hashCode());
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
		LoanApplicationResponseBo other = (LoanApplicationResponseBo) obj;
		if (loanApplicationId == null) {
			if (other.loanApplicationId != null)
				return false;
		} else if (!loanApplicationId.equals(other.loanApplicationId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LoanApplicationResponseBo [loanApplicationId=");
		builder.append(loanApplicationId);
		builder.append("]");
		return builder.toString();
	}

}
