package com.hackthon.solatech.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * 
 * @author hackathon Representative of the Corporate
 *
 */
@Entity
public class Representative {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String lastName;
	private String address;
	private String citizenShip;
	private LocalDateTime dateOfBirth;
	private String phoneNumber;
	private String passportNumber;

	@OneToOne
	@JoinColumn(name = "corporate_id")
	private Corporate corporate;

	public Representative() {
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

	public LocalDateTime getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDate(LocalDateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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

	@Override
	public String toString() {
		return String.format("Representative[id=%d, firstName='%s', lastName='%s']", id, firstName, lastName);
	}
}
