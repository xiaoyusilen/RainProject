package com.rain.entity;

public class line {
	private int pno;
	private Double data;
	private String year;
	private String month;
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public Double getData() {
		return data;
	}
	public void setData(Double data) {
		this.data = data;
	}
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
	public line(int pno, Double data, String year, String month) {
		super();
		this.pno = pno;
		this.data = data;
		this.year = year;
		this.month = month;
	}
	public line() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
