package com.hackthon.solatech.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.hackthon.solatech.model.Corporate;

/**
 * 
 * @author hackathon Representative of the Corporate
 *
 */
@Entity
public class Representative {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;
	private String address;
	private String citizenShip;
	private Date date;
	private String phoneNumber;
	private String passportNumber;

	@OneToOne
	@JoinColumn(name = "corporate_id")
	private Corporate corporate;

	protected Representative() {
	}

	public Representative(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCitizenShip() {
		return citizenShip;
	}

	public void setCitizenShip(String citizenShip) {
		this.citizenShip = citizenShip;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return String.format("Representative[id=%d, firstName='%s', lastName='%s']", id, firstName, lastName);
	}
}
