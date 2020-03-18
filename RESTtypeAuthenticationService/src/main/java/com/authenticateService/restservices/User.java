package com.authenticateService.restservices;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
	
	private String firstName;
	private String lastName;
	private String userID;
	private String password;
	private String repeatPassword;
	
	public User(String firstName,String lastName,String userID,String password,String repeatPassword) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.userID=userID;
		this.password=password;
		this.repeatPassword=repeatPassword;
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

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepeatPassword() {
		return repeatPassword;
	}

	public void setRepeatPassword(String repeatPassword) {
		this.repeatPassword = repeatPassword;
	}

}
