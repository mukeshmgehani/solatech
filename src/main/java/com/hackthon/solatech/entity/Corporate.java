package com.hackthon.solatech.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * @author hackathon
 *
 */
@Entity
public class Corporate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long corporate_id;

	@Column(name = "Name")
	String name;
	@Column(name = "Address")
	String address;
	@Column(name = "LegalStructure")
	String legalStructure;
	@Column(name = "RevenueLastYear")
	String revenueLastYear;
	@Column(name = "FinancialStatement")
	String financialStatement;

	private Integer age;
	private BigDecimal currentDebt;

	public Long getCorporate_id() {
		return corporate_id;
	}

	public void setCorporate_id(Long corporate_id) {
		this.corporate_id = corporate_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLegalStructure() {
		return legalStructure;
	}

	public void setLegalStructure(String legalStructure) {
		this.legalStructure = legalStructure;
	}

	public String getRevenueLastYear() {
		return revenueLastYear;
	}

	public void setRevenueLastYear(String revenueLastYear) {
		this.revenueLastYear = revenueLastYear;
	}

	public String getFinancialStatement() {
		return financialStatement;
	}

	public void setFinancialStatement(String financialStatement) {
		this.financialStatement = financialStatement;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return the currentDebt
	 */
	public BigDecimal getCurrentDebt() {
		return currentDebt;
	}

	/**
	 * @param currentDebt the currentDebt to set
	 */
	public void setCurrentDebt(BigDecimal currentDebt) {
		this.currentDebt = currentDebt;
	}

}
