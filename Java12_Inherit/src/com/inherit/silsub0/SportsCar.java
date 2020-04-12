package com.inherit.silsub0;

public class SportsCar extends Car {
	
		public SportsCar() {
			super();
			System.out.println("sportcar생성");
		}
		public SportsCar(String color) {
			super(color);
			System.out.println(color);
			System.out.println(color+"색 sportcar 생성");
		}
		@Override
		public void accelPedal() {
			System.out.println("속도가 더 빨리 올라갑니다.");
			super.setSpeed(super.getSpeed()+30);
		}
		@Override
		public void breakPedal() {
			super.setSpeed(super.getSpeed()-30);
			if(super.getSpeed()>0) {
				System.out.println("속도가 더 빨리 줄어듭니다.");
			}else {
				super.setSpeed(0);
				System.out.println("멈췄습니다.");
			}
		}
		@Override
		public String toString() {
			return "스포츠카의 현재속도는"+getSpeed()+"입니다.";
		}
		
}
