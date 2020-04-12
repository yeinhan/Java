package com.poly.test.test06;

import java.util.Scanner;

public class Circle extends AreaImpl {

	@Override
	public void make() {	//상속받은 추상클래스의 추상메소드만 구현
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력해 주세요:");
		int r = sc.nextInt();
		
		double res = r*r*Math.PI;
		
		setRes(String.format("%f", res));	//실수 받아서 문자열로 변경해주겠다
	}
	
		@Override
		public void print() {
			System.out.printf("원의 ");
			super.print();
		}
		
}
