package com.hackthon.solatech.entity;

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
    @GeneratedValue(strategy = GenerationType.AUTO)
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
	
	
	public long getCorporate_id() {
		return corporate_id;
	}
	public void setCorporate_id(long corporate_id) {
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
	
	
}
