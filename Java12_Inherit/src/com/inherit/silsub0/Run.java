package com.inherit.silsub0;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SportsCar c1 = new SportsCar("노란");
		c1.accelPedal();
		System.out.println(c1);
		c1.accelPedal();
		c1.accelPedal();
		System.out.println(c1);
		
		
		Car c2 = new SUV("검정");
		c2.accelPedal();
		System.out.println(c2);
		c2.accelPedal();
		c2.accelPedal();
		c2.accelPedal();
		c2.accelPedal();
		
		
		System.out.println(c2);
		c2.breakPedal();
		c2.breakPedal();
		c2.breakPedal();
		System.out.println(c2);
		
	}

}
