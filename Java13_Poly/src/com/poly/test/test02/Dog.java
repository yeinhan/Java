package com.poly.test.test02;

public class Dog extends Base {
	@Override
	public void start() {
		System.out.println("강아지가 걷는다.");
	}
	@Override
	public void stop() {
		System.out.println("송아지가 멈췄다.");
	}
}
