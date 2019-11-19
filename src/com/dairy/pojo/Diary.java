package com.dairy.pojo;

import java.time.LocalDate;

public class Diary {
	private int id;
	private int uid;
	private LocalDate date;
	private String mood;
	private String day;
	private String extra;
	public Diary(int id, int uid, LocalDate date, String mood, String day, String extra) {
		super();
		this.id = id;
		this.uid = uid;
		this.date = date;
		this.mood = mood;
		this.day = day;
		this.extra = extra;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getMood() {
		return mood;
	}
	public void setMood(String mood) {
		this.mood = mood;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getExtra() {
		return extra;
	}
	public void setExtra(String extra) {
		this.extra = extra;
	}
	
}
