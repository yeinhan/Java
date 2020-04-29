package com.project.publicmask.model;

public class Person {
	private String pName;
	private int pNum;
	
	public Person() {}
	public Person(String pName, int pNum) {
		this.pName = pName;
		this.pNum = pNum;
	}
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpNum() {
		return pNum;
	}
	public void setpNum(int pNum) {
		this.pNum = pNum;
	}
	
	@Override
	public String toString() {
		return "이름:" + pName + " 주민번호:"+pNum;
	}
}
