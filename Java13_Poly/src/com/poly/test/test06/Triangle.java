package com.poly.test.test06;

import java.util.Scanner;

public class Triangle extends AreaImpl{

	@Override
	public void make() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("밑변 입력해 주세요:");
		int x = sc.nextInt();
		
		System.out.print("눂이 입력해 주세요:");
		int y = sc.nextInt();
		
		double result = 0;
		
		result =(double)x *y /2;
		setRes(String.format("삼각형의 면적:%f", result));
	}
//	@Override
//	public void print() {
//		System.out.print("삼각형의 ");
//		
//	}

}
