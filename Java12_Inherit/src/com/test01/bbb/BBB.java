package com.test01.bbb;

import com.test01.aaa.AAA;

public class BBB extends AAA {

	private int b;
	
	public BBB( ) {
//		super(); 생략가능	//부모의 생성자-->AAA()
		System.out.println("BBB생성");
	}
	
	public BBB(int b) {
		super(b);
		this.b = b;
		System.out.println("BBB 생성(b 받아서 생성)");
	}
	
	public BBB(int abc, int b) {
		super(abc);
		this.b =b;
		System.out.println("BBB 생성(abc, b 받아서 생성)");
	}
	
	//getter & setter
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getSum() {
		int sum = super.getAbc() + this.getB();
		return sum;
	}
	@Override
	public void prn() {
		super.prn();
		System.out.println("BBB class의 prn()");
	}
}
