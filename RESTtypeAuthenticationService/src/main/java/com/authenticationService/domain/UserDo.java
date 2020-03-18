package com.authenticationService.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;



@Entity
@Table(name="user_table")
public class UserDo {
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Id
	@Column(name="sl_no")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int slNo;
	
	@Column(name="userID")
	private String userID;
	
	@Column(name="password")
	private String password;
	
	private String repeatPassword;
	
	public UserDo() {}
	
	
	
	public String getRepeatPassword() {
		return repeatPassword;
	}

	public void setRepeatPassword(String repeatPassword) {
		this.repeatPassword = repeatPassword;
	}

	public UserDo(String fname,String lname,String uid,String pwd) {
		this.firstName= fname;
		this.lastName=lname;
		this.userID=uid;
		this.password=pwd;
		
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

	public int getSlNo() {
		return slNo;
	}

	public void setSlNo(int slNo) {
		this.slNo = slNo;
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
	
	
	
	

}



