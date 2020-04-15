package com.silsub1.example;

import java.util.Scanner;

public class Munjae {
	public void test7() {
		int num;
		String str = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력:");
		num = sc.nextInt();
		
	
		if(num==0 || num<0) {
			System.out.println("학점 계산 불가능");
		}else if(num>=90) {
			str="A";
			System.out.println("점수:"+num+" 학점:"+str);
		}else if(num>=80 && num<90) {
			str="B";
			System.out.println("점수:"+num+" 학점:"+str);
		}else if(num>=70 && num<80) {
			str="C";
			System.out.println("점수:"+num+" 학점:"+str);
		}else if(num>=60 && num<70) {
			str="D";
			System.out.println("점수:"+num+" 학점:"+str);
		}else if(num<60) {
			str="F";
			System.out.println("점수:"+num+" 학점:"+str);
		}
	}
}
