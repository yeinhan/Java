package com.poly.test.test01;

public class Dog extends Animal {
	@Override	//부모 클래스에서 추상메소드라 꼭 오버라이딩 해줘야함
	public void bark() {
		System.out.println("멍멍");
	}
	
	public void eat(String animal) {
		super.eat(animal);
		System.out.println("dog eat!!");
	}
}
