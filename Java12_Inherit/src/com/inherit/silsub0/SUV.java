package com.inherit.silsub0;

public class SUV extends Car{
	
	public SUV() {
		System.out.println("SUV생성");
	}
	
	public SUV(String color) {
		super(color);
		System.out.println(color);
		System.out.println(color+"색 SUV 생성");
	}
	@Override
	public void accelPedal() {
		System.out.println("속도가 적당히 올라갑니다.");
		super.setSpeed(super.getSpeed()+15);
	}
	@Override
	public void breakPedal() {
		super.setSpeed(super.getSpeed()-15);
		if(super.getSpeed()>0) {
			System.out.println("속도가 적당히 줄어듭니다.");
		}else {
			super.setSpeed(0);
			System.out.println("속도가 멈췄습니다.");
		}
	}
	@Override
	public String toString() {
		return "SUV의 현재 속소는"+getSpeed()+"입니다.";
	}
}
