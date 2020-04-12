package com.inherit.part1_ingerit.model.vo;

import java.util.Date;

public class Television extends Product{
	//product 클래스 상속 받아 구현
	private int inchType;
	
	public Television() {
		//super(); 생략되어있음
	}

	public Television(String brand, String productNumber, String productCode, String productName, int price, Date date, int inchType) {
		super(brand,productNumber,productCode,productName,price,date);
		this.inchType = inchType;
		System.out.println("product를 상속받은 tv클래스의 생성자 호출");
	}
	
	//getter & setter
	public int getInchType() {
		return inchType;
	}
	public void setInchType(int inchType) {
		this.inchType = inchType;
	}
	@Override
	public String prnInfo() {
		return super.prnInfo()+", "+this.inchType;
	}
	

}
