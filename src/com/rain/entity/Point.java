package com.rain.entity;

public class Point {

	private int pno;
	private String pname;
	private Double rph;
	private Double rnh;
	private Double rkm;
	private Double rcod;
	private Double rdo;
	private Double rbod;
	private Double rwt;
	private Double rxf;
	private Double ryls;
	private Double rtn;
	private Double rtp;
	private Double px;
	private Double py;
	private String pcss1;
	private String pcss2;
	private int year;
	private int month;
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
	public Double getRph() {
		return rph;
	}
	public void setRph(Double rph) {
		this.rph = rph;
	}
	public Double getRnh() {
		return rnh;
	}
	public void setRnh(Double rnh) {
		this.rnh = rnh;
	}
	public Double getRkm() {
		return rkm;
	}
	public void setRkm(Double rkm) {
		this.rkm = rkm;
	}
	public Double getRcod() {
		return rcod;
	}
	public void setRcod(Double rcod) {
		this.rcod = rcod;
	}
	public Double getRdo() {
		return rdo;
	}
	public void setRdo(Double rdo) {
		this.rdo = rdo;
	}
	public Double getRbod() {
		return rbod;
	}
	public void setRbod(Double rbod) {
		this.rbod = rbod;
	}
	public Double getRwt() {
		return rwt;
	}
	public void setRwt(Double rwt) {
		this.rwt = rwt;
	}
	public Double getRxf() {
		return rxf;
	}
	public void setRxf(Double rxf) {
		this.rxf = rxf;
	}
	public Double getRyls() {
		return ryls;
	}
	public void setRyls(Double ryls) {
		this.ryls = ryls;
	}
	public Double getRtn() {
		return rtn;
	}
	public void setRtn(Double rtn) {
		this.rtn = rtn;
	}
	public Double getRtp() {
		return rtp;
	}
	public void setRtp(Double rtp) {
		this.rtp = rtp;
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
	public Point(int pno, String pname, Double rph, Double rnh, Double rkm, Double rcod, Double rdo, Double rbod,
			Double rwt, Double rxf, Double ryls, Double rtn, Double rtp, Double px, Double py, String pcss1,
			String pcss2, int year, int month) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.rph = rph;
		this.rnh = rnh;
		this.rkm = rkm;
		this.rcod = rcod;
		this.rdo = rdo;
		this.rbod = rbod;
		this.rwt = rwt;
		this.rxf = rxf;
		this.ryls = ryls;
		this.rtn = rtn;
		this.rtp = rtp;
		this.px = px;
		this.py = py;
		this.pcss1 = pcss1;
		this.pcss2 = pcss2;
		this.year = year;
		this.month = month;
	}
	public Point(int pno, Double rph, Double rnh, Double rkm, Double rcod, Double rdo, Double rbod, Double rwt,
			Double rxf, Double ryls, Double rtn, Double rtp, int year, int month) {
		super();
		this.pno = pno;
		this.rph = rph;
		this.rnh = rnh;
		this.rkm = rkm;
		this.rcod = rcod;
		this.rdo = rdo;
		this.rbod = rbod;
		this.rwt = rwt;
		this.rxf = rxf;
		this.ryls = ryls;
		this.rtn = rtn;
		this.rtp = rtp;
		this.year = year;
		this.month = month;
	}
	public Point() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
