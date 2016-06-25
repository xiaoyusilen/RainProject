package com.rain.entity;

public class Time {
	private String year;
	private String month;
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public Time(String year, String month) {
		super();
		this.year = year;
		this.month = month;
	}
	public Time() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
