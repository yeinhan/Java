package com.poly.test.test04;

public class Cat extends Animal {

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("야옹");
	}
	@Override
	public void eat(String feed) {
		System.out.println(feed+"먹는다");
	}
	

}
