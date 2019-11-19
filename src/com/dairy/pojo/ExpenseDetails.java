package com.dairy.pojo;

import java.time.LocalDate;

public class ExpenseDetails {
private int id;
private int userid;
private LocalDate date;
private int food;
private int golgappa;
private int transport;
private int other;
private String reason;
private int total;
public ExpenseDetails(int id, int userid, LocalDate date, int food, int golgappa, int transport, int other,
		String reason, int total) {
	super();
	this.id = id;
	this.userid = userid;
	this.date = date;
	this.food = food;
	this.golgappa = golgappa;
	this.transport = transport;
	this.other = other;
	this.reason = reason;
	this.total = total;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
public int getFood() {
	return food;
}
public void setFood(int food) {
	this.food = food;
}
public int getGolgappa() {
	return golgappa;
}
public void setGolgappa(int golgappa) {
	this.golgappa = golgappa;
}
public int getTransport() {
	return transport;
}
public void setTransport(int transport) {
	this.transport = transport;
}
public int getOther() {
	return other;
}
public void setOther(int other) {
	this.other = other;
}
public String getReason() {
	return reason;
}
public void setReason(String reason) {
	this.reason = reason;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}


}