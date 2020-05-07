package com.project.publicmask.model;

public class Person {
	private String pName;
	private String pNum;
	
	public Person() {}
	public Person(String pName, String pNum) {
		this.pName = pName;
		this.pNum = pNum;
	}
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpNum() {
		return pNum;
	}
	public void setpNum(String pNum) {
		this.pNum = pNum;
	}
	
	@Override
	public String toString() {
		return "이름:" + pName + " 주민번호:"+pNum;
	}
}
