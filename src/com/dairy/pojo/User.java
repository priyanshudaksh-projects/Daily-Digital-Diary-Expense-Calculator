package com.dairy.pojo;

import java.time.LocalDate;

public class User {
private int id;
private String name;

private double mobile;
private String password;
private LocalDate dob;
private String email;




public User(int id, String name, double mobile, String password, LocalDate dob, String email) {
	super();
	this.id = id;
	this.name = name;
	this.mobile = mobile;
	this.password = password;
	this.dob = dob;
	this.email = email;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public double getMobile() {
	return mobile;
}
public void setMobile(double mobile) {
	this.mobile = mobile;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}


}
