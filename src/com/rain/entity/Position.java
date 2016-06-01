package com.rain.entity;

public class Position {
	private int pno;
	private String pname;
	private String pinfo;
	private Double px;
	private Double py;
	private String pcss1;
	private String pcss2;
	private Double ppv;
	private Double pnv;
	private Double pcod;
	private Double pcom;
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
	public Double getPcom() {
		return pcom;
	}
	public void setPcom(Double pcom) {
		this.pcom = pcom;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPinfo() {
		return pinfo;
	}
	public void setPinfo(String pinfo) {
		this.pinfo = pinfo;
	}
	public String getPcss1() {
		return pcss1;
	}
	public void setPcss1(String pcss1) {
		this.pcss1 = pcss1;
	}
	public String getPcss2() {
		return pcss2;
	}
	public void setPcss2(String pcss2) {
		this.pcss2 = pcss2;
	}
	public Double getPx() {
		return px;
	}
	public void setPx(Double px) {
		this.px = px;
	}
	public Double getPy() {
		return py;
	}
	public void setPy(Double py) {
		this.py = py;
	}
	public Position(int pno, String pname, String pinfo, Double px, Double py) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.pinfo = pinfo;
		this.px = px;
		this.py = py;
	}
	
	public Position() {
		super();
	}
	
}
