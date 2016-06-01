package com.rain.entity;

public class line {
	private int pno;
	private Double ppv;
	private Double pnv;
	private Double pcod;
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
	public line() {
		super();
		// TODO Auto-generated constructor stub
	}
	public line(int pno, Double ppv, Double pnv, Double pcod) {
		super();
		this.pno = pno;
		this.ppv = ppv;
		this.pnv = pnv;
		this.pcod = pcod;
	}

}
