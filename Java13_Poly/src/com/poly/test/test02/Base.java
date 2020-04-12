package com.poly.test.test02;

public abstract class Base {
	//기본 생성자
	public Base() {
		System.out.println("base 생성");
	}
	
	public abstract void start();
	public abstract void stop();
}
