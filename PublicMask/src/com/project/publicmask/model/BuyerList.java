package com.project.publicmask.model;

public class BuyerList {

	private String Pname;
	private String Pnum;
	private String Storename;
	
	public BuyerList() {}
	
	public BuyerList(String Pname, String Pnum, String Storename) {
		this.Pname = Pname;
		this.Pnum = Pnum;
		this.Storename = Storename;
	}
	
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public String getPnum() {
		return Pnum;
	}
	public void setPnum(String pnum) {
		Pnum = pnum;
	}
	public String getStorename() {
		return Storename;
	}
	public void setStorename(String storename) {
		Storename = storename;
	}
	
}
