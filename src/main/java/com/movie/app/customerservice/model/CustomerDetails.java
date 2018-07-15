package com.movie.app.customerservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerDetails {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer custId;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String dob;
	@Column
	private String address;
	@Column
	private Integer pincode;
	@Column
	private Long contactNo;
	@Column
	private String emailId;

	@Override
	public String toString() {
		return "CustomerDetails [custId=" + custId + ", firstName=" + firstName + ", lastName=" + lastName + ", dob="
				+ dob + ", address=" + address + ", pincode=" + pincode + ", contactNo=" + contactNo + ", emailId="
				+ emailId + "]";
	}

	public CustomerDetails() {
		super();
	}

	public CustomerDetails(Integer custId, String firstName, String lastName, String dob, String address,
			Integer pincode, Long contactNo, String emailId) {
		super();
		this.custId = custId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.address = address;
		this.pincode = pincode;
		this.contactNo = contactNo;
		this.emailId = emailId;
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public Long getContactNo() {
		return contactNo;
	}

	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
