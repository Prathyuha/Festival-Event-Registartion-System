package com.cts.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="visitor")
public class Visitor {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	@NotNull
	@Column(name="firstName")
	private String firstName;
	@NotNull
	@Column(name="lastName")
	private String lastName;
	@NotNull
	@Column(name="userName")
	private String userName;
	@NotNull
	@Column(name="password")
	private String password;
	@NotNull
	@Column(name="confirmPassword")
	private String confirmPassword;
	@NotNull
	@Column(name="phoneNumber")
	private String phoneNumber;
	@NotNull
	@Column(name="email")
	private String email;
	@Column(name="address")
	private String address;
	
	public Visitor() {
		
	}

	

	 

	public Visitor(String firstName, String lastName, String userName, String password, String confirmPassword,
			String phoneNumber, String email, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
	}





	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName
				+ ", password=" + password + ", confirmPassword=" + confirmPassword + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + ", address=" + address + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	

}
