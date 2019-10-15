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

/**
 * @author hackathon
 *
 */
@Entity
public class Application {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private BigDecimal amount;
	private Integer term;
	private String puropse;

	public Application() {

	}

	/**
	 * @param amount
	 * @param term
	 * @param puropse
	 */
	public Application(BigDecimal amount, Integer term, String puropse) {
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

}
