package com.hackthon.solatech.model;

import java.math.BigDecimal;

/**
 * @author hackathon
 *
 */
public class LoanApplicationRequestBo {

	private BigDecimal amount;
	private Integer term;
	private String puropse;
	private String corporateName;
	private String corporateAddress;
	private String corporateLegalStructure;
	private String corporateRevenueLastYear;
	private String corporateFinancialStatement;
	private Integer corporateAge;
	private BigDecimal corporateCurrentDebt;

	private String representiveName;
	private String representiveAddress;
	private String representiveCitizenShip;
	private String representiveDateOfBirth;
	private String representivePhoneNumber;
	private String representivePassportNumber;
	private String representiveEmail;

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
	 * @return the corporateName
	 */
	public String getCorporateName() {
		return corporateName;
	}

	/**
	 * @param corporateName the corporateName to set
	 */
	public void setCorporateName(String corporateName) {
		this.corporateName = corporateName;
	}

	/**
	 * @return the corporateAddress
	 */
	public String getCorporateAddress() {
		return corporateAddress;
	}

	/**
	 * @param corporateAddress the corporateAddress to set
	 */
	public void setCorporateAddress(String corporateAddress) {
		this.corporateAddress = corporateAddress;
	}

	/**
	 * @return the corporateLegalStructure
	 */
	public String getCorporateLegalStructure() {
		return corporateLegalStructure;
	}

	/**
	 * @param corporateLegalStructure the corporateLegalStructure to set
	 */
	public void setCorporateLegalStructure(String corporateLegalStructure) {
		this.corporateLegalStructure = corporateLegalStructure;
	}

	/**
	 * @return the corporateRevenueLastYear
	 */
	public String getCorporateRevenueLastYear() {
		return corporateRevenueLastYear;
	}

	/**
	 * @param corporateRevenueLastYear the corporateRevenueLastYear to set
	 */
	public void setCorporateRevenueLastYear(String corporateRevenueLastYear) {
		this.corporateRevenueLastYear = corporateRevenueLastYear;
	}

	/**
	 * @return the corporateFinancialStatement
	 */
	public String getCorporateFinancialStatement() {
		return corporateFinancialStatement;
	}

	/**
	 * @param corporateFinancialStatement the corporateFinancialStatement to set
	 */
	public void setCorporateFinancialStatement(String corporateFinancialStatement) {
		this.corporateFinancialStatement = corporateFinancialStatement;
	}

	/**
	 * @return the representiveAddress
	 */
	public String getRepresentiveAddress() {
		return representiveAddress;
	}

	/**
	 * @param representiveAddress the representiveAddress to set
	 */
	public void setRepresentiveAddress(String representiveAddress) {
		this.representiveAddress = representiveAddress;
	}

	/**
	 * @return the representiveCitizenShip
	 */
	public String getRepresentiveCitizenShip() {
		return representiveCitizenShip;
	}

	/**
	 * @param representiveCitizenShip the representiveCitizenShip to set
	 */
	public void setRepresentiveCitizenShip(String representiveCitizenShip) {
		this.representiveCitizenShip = representiveCitizenShip;
	}

	/**
	 * @return the representiveDateOfBirth
	 */
	public String getRepresentiveDateOfBirth() {
		return representiveDateOfBirth;
	}

	/**
	 * @param representiveDateOfBirth the representiveDateOfBirth to set
	 */
	public void setRepresentiveDateOfBirth(String representiveDateOfBirth) {
		this.representiveDateOfBirth = representiveDateOfBirth;
	}

	/**
	 * @return the representivePhoneNumber
	 */
	public String getRepresentivePhoneNumber() {
		return representivePhoneNumber;
	}

	/**
	 * @param representivePhoneNumber the representivePhoneNumber to set
	 */
	public void setRepresentivePhoneNumber(String representivePhoneNumber) {
		this.representivePhoneNumber = representivePhoneNumber;
	}

	/**
	 * @return the representivePassportNumber
	 */
	public String getRepresentivePassportNumber() {
		return representivePassportNumber;
	}

	/**
	 * @param representivePassportNumber the representivePassportNumber to set
	 */
	public void setRepresentivePassportNumber(String representivePassportNumber) {
		this.representivePassportNumber = representivePassportNumber;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LoanApplicationRequestBo [amount=");
		builder.append(amount);
		builder.append(", term=");
		builder.append(term);
		builder.append(", puropse=");
		builder.append(puropse);
		builder.append(", corporateName=");
		builder.append(corporateName);
		builder.append(", corporateAddress=");
		builder.append(corporateAddress);
		builder.append(", corporateLegalStructure=");
		builder.append(corporateLegalStructure);
		builder.append(", corporateRevenueLastYear=");
		builder.append(corporateRevenueLastYear);
		builder.append(", corporateFinancialStatement=");
		builder.append(corporateFinancialStatement);
		builder.append(", corporateAge=");
		builder.append(corporateAge);
		builder.append(", corporateCurrentDebt=");
		builder.append(corporateCurrentDebt);
		builder.append(", representiveName=");
		builder.append(representiveName);
		builder.append(", representiveAddress=");
		builder.append(representiveAddress);
		builder.append(", representiveCitizenShip=");
		builder.append(representiveCitizenShip);
		builder.append(", representiveDateOfBirth=");
		builder.append(representiveDateOfBirth);
		builder.append(", representivePhoneNumber=");
		builder.append(representivePhoneNumber);
		builder.append(", representivePassportNumber=");
		builder.append(representivePassportNumber);
		builder.append(", representiveEmail=");
		builder.append(representiveEmail);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * @return the corporateAge
	 */
	public Integer getCorporateAge() {
		return corporateAge;
	}

	/**
	 * @param corporateAge the corporateAge to set
	 */
	public void setCorporateAge(Integer corporateAge) {
		this.corporateAge = corporateAge;
	}

	/**
	 * @return the corporateCurrentDebt
	 */
	public BigDecimal getCorporateCurrentDebt() {
		return corporateCurrentDebt;
	}

	/**
	 * @param corporateCurrentDebt the corporateCurrentDebt to set
	 */
	public void setCorporateCurrentDebt(BigDecimal corporateCurrentDebt) {
		this.corporateCurrentDebt = corporateCurrentDebt;
	}

	/**
	 * @return the representiveName
	 */
	public String getRepresentiveName() {
		return representiveName;
	}

	/**
	 * @param representiveName the representiveName to set
	 */
	public void setRepresentiveName(String representiveName) {
		this.representiveName = representiveName;
	}

	/**
	 * @return the representiveEmail
	 */
	public String getRepresentiveEmail() {
		return representiveEmail;
	}

	/**
	 * @param representiveEmail the representiveEmail to set
	 */
	public void setRepresentiveEmail(String representiveEmail) {
		this.representiveEmail = representiveEmail;
	}

	@Override
	public int hashCode() { //NO SONAR
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((corporateAddress == null) ? 0 : corporateAddress.hashCode());
		result = prime * result + ((corporateAge == null) ? 0 : corporateAge.hashCode());
		result = prime * result + ((corporateCurrentDebt == null) ? 0 : corporateCurrentDebt.hashCode());
		result = prime * result + ((corporateFinancialStatement == null) ? 0 : corporateFinancialStatement.hashCode());
		result = prime * result + ((corporateLegalStructure == null) ? 0 : corporateLegalStructure.hashCode());
		result = prime * result + ((corporateName == null) ? 0 : corporateName.hashCode());
		result = prime * result + ((corporateRevenueLastYear == null) ? 0 : corporateRevenueLastYear.hashCode());
		result = prime * result + ((puropse == null) ? 0 : puropse.hashCode());
		result = prime * result + ((representiveAddress == null) ? 0 : representiveAddress.hashCode());
		result = prime * result + ((representiveCitizenShip == null) ? 0 : representiveCitizenShip.hashCode());
		result = prime * result + ((representiveDateOfBirth == null) ? 0 : representiveDateOfBirth.hashCode());
		result = prime * result + ((representiveEmail == null) ? 0 : representiveEmail.hashCode());
		result = prime * result + ((representiveName == null) ? 0 : representiveName.hashCode());
		result = prime * result + ((representivePassportNumber == null) ? 0 : representivePassportNumber.hashCode());
		result = prime * result + ((representivePhoneNumber == null) ? 0 : representivePhoneNumber.hashCode());
		result = prime * result + ((term == null) ? 0 : term.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {//NOSONAR
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoanApplicationRequestBo other = (LoanApplicationRequestBo) obj;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (corporateAddress == null) {
			if (other.corporateAddress != null)
				return false;
		} else if (!corporateAddress.equals(other.corporateAddress))
			return false;
		if (corporateAge == null) {
			if (other.corporateAge != null)
				return false;
		} else if (!corporateAge.equals(other.corporateAge))
			return false;
		if (corporateCurrentDebt == null) {
			if (other.corporateCurrentDebt != null)
				return false;
		} else if (!corporateCurrentDebt.equals(other.corporateCurrentDebt))
			return false;
		if (corporateFinancialStatement == null) {
			if (other.corporateFinancialStatement != null)
				return false;
		} else if (!corporateFinancialStatement.equals(other.corporateFinancialStatement))
			return false;
		if (corporateLegalStructure == null) {
			if (other.corporateLegalStructure != null)
				return false;
		} else if (!corporateLegalStructure.equals(other.corporateLegalStructure))
			return false;
		if (corporateName == null) {
			if (other.corporateName != null)
				return false;
		} else if (!corporateName.equals(other.corporateName))
			return false;
		if (corporateRevenueLastYear == null) {
			if (other.corporateRevenueLastYear != null)
				return false;
		} else if (!corporateRevenueLastYear.equals(other.corporateRevenueLastYear))
			return false;
		if (puropse == null) {
			if (other.puropse != null)
				return false;
		} else if (!puropse.equals(other.puropse))
			return false;
		if (representiveAddress == null) {
			if (other.representiveAddress != null)
				return false;
		} else if (!representiveAddress.equals(other.representiveAddress))
			return false;
		if (representiveCitizenShip == null) {
			if (other.representiveCitizenShip != null)
				return false;
		} else if (!representiveCitizenShip.equals(other.representiveCitizenShip))
			return false;
		if (representiveDateOfBirth == null) {
			if (other.representiveDateOfBirth != null)
				return false;
		} else if (!representiveDateOfBirth.equals(other.representiveDateOfBirth))
			return false;
		if (representiveEmail == null) {
			if (other.representiveEmail != null)
				return false;
		} else if (!representiveEmail.equals(other.representiveEmail))
			return false;
		if (representiveName == null) {
			if (other.representiveName != null)
				return false;
		} else if (!representiveName.equals(other.representiveName))
			return false;
		if (representivePassportNumber == null) {
			if (other.representivePassportNumber != null)
				return false;
		} else if (!representivePassportNumber.equals(other.representivePassportNumber))
			return false;
		if (representivePhoneNumber == null) {
			if (other.representivePhoneNumber != null)
				return false;
		} else if (!representivePhoneNumber.equals(other.representivePhoneNumber))
			return false;
		if (term == null) {
			if (other.term != null)
				return false;
		} else if (!term.equals(other.term))
			return false;
		return true;
	}

}
