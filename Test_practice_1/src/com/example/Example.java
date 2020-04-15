package com.example;

import java.util.Scanner;

public class Example {
	
	public void example3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력:");
		
		String str = sc.next();
		
		System.out.println("첫번째 문자:"+str.charAt(0));
		System.out.println("두번째 문자:"+str.charAt(1));
		System.out.println("세번쨰 문자:"+str.charAt(2));
		
	}
}
