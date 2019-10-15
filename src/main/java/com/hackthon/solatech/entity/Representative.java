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
	private String name;
	private String address;
	private String citizenShip;
	private LocalDateTime dateOfBirth;
	private String phoneNumber;
	private String passportNumber;
	private String email;

	@OneToOne
	@JoinColumn(name = "corporate_id")
	private Corporate corporate;

	public Representative() {
	}

	

	public Long getId() {
		return id;
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

	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(LocalDateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Representative [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", address=");
		builder.append(address);
		builder.append(", citizenShip=");
		builder.append(citizenShip);
		builder.append(", dateOfBirth=");
		builder.append(dateOfBirth);
		builder.append(", phoneNumber=");
		builder.append(phoneNumber);
		builder.append(", passportNumber=");
		builder.append(passportNumber);
		builder.append(", email=");
		builder.append(email);
		builder.append(", corporate=");
		builder.append(corporate);
		builder.append("]");
		return builder.toString();
	}
}
