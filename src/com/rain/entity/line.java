package com.rain.entity;

public class line {
	private int pno;
	private Double ppv;
	private Double pnv;
	private Double pcod;
	private int year;
	private int month;
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public Double getPpv() {
		return ppv;
	}
	public void setPpv(Double ppv) {
		this.ppv = ppv;
	}
	public Double getPnv() {
		return pnv;
	}
	public void setPnv(Double pnv) {
		this.pnv = pnv;
	}
	public Double getPcod() {
		return pcod;
	}
	public void setPcod(Double pcod) {
		this.pcod = pcod;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public line(int pno, Double ppv, Double pnv, Double pcod, int year, int month) {
		super();
		this.pno = pno;
		this.ppv = ppv;
		this.pnv = pnv;
		this.pcod = pcod;
		this.year = year;
		this.month = month;
	}
	public line() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
