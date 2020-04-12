package com.poly.test.test03;

public class Dog implements Animal{

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");
	}

	@Override
	public void eat(String feed) {
		// TODO Auto-generated method stub
		System.out.println(feed+"먹는다");
	}

}
