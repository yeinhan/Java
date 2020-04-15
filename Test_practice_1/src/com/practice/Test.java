package com.practice;

import java.util.Scanner;

public class Test {
	public void sample4() {
		int num;
		String str="";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력:");
		num = sc.nextInt();
		
		if(num%2==0) {
			str="짝수다";
		}else {
			str="홀수다";
		}
		System.out.println(str);
		
		switch(num) {
		case 1: System.out.println(num);
			break;
		case 2:
			System.out.println(num);
			break;
		}
	}
}
