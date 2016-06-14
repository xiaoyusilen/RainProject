package com.rain.entity;

public class Point {

	private int pno;
	private String pname;
	private Double ph;
	private Double nh;
	private Double kmnp;
	private Double cod;
	private Double pdo;
	private Double bod5;
	private Double tem;
	private Double item;
	private Double yls;
	private Double tn;
	private Double tp;
	private Double px;
	private Double py;
	private String pcss1;
	private String pcss2;
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
	public Double getPh() {
		return ph;
	}
	public void setPh(Double ph) {
		this.ph = ph;
	}
	public Double getNh() {
		return nh;
	}
	public void setNh(Double nh) {
		this.nh = nh;
	}
	public Double getKmnp() {
		return kmnp;
	}
	public void setKmnp(Double kmnp) {
		this.kmnp = kmnp;
	}
	public Double getCod() {
		return cod;
	}
	public void setCod(Double cod) {
		this.cod = cod;
	}
	public Double getPdo() {
		return pdo;
	}
	public void setPdo(Double pdo) {
		this.pdo = pdo;
	}
	public Double getBod5() {
		return bod5;
	}
	public void setBod5(Double bod5) {
		this.bod5 = bod5;
	}
	public Double getTem() {
		return tem;
	}
	public void setTem(Double tem) {
		this.tem = tem;
	}
	public Double getItem() {
		return item;
	}
	public void setItem(Double item) {
		this.item = item;
	}
	public Double getYls() {
		return yls;
	}
	public void setYls(Double yls) {
		this.yls = yls;
	}
	public Double getTn() {
		return tn;
	}
	public void setTn(Double tn) {
		this.tn = tn;
	}
	public Double getTp() {
		return tp;
	}
	public void setTp(Double tp) {
		this.tp = tp;
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
	public Point(int pno, String pname, Double ph, Double nh, Double kmnp, Double cod, Double pdo, Double bod5,
			Double tem, Double item, Double yls, Double tn, Double tp, Double px, Double py, String pcss1,
			String pcss2) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.ph = ph;
		this.nh = nh;
		this.kmnp = kmnp;
		this.cod = cod;
		this.pdo = pdo;
		this.bod5 = bod5;
		this.tem = tem;
		this.item = item;
		this.yls = yls;
		this.tn = tn;
		this.tp = tp;
		this.px = px;
		this.py = py;
		this.pcss1 = pcss1;
		this.pcss2 = pcss2;
	}
	public Point() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
