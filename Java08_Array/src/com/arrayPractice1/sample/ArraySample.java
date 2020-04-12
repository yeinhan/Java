package com.arrayPractice1.sample;

import java.util.Random;
import java.util.Scanner;

public class ArraySample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraySample test = new ArraySample();
//		test.test1();
//		test.test2();
//		test.test3();
//		test.test4();
		test.test5();
	}
	public void test1() {
		int[] num = new int[10];
		Random r = new Random();
		int sum=0;
		
		for(int i=0; i<num.length; i++) {
			num[i]=r.nextInt(100)+1;	//1~100사이의 난수
			sum += num[i];
			System.out.println(i+"번방 값:"+num[i]);
		}
		
//		for(int i=0; i<num.length; i++) {
//			num[i] = (int)(Math.random()*100)+1;
//			sum += num[i];
//			System.out.println(i+"번쨰 난수: "+num[i]);
//		}
		System.out.println("sum:"+sum);
		
	}
	public void test2() {
		int[] num = new int[10];
		int max=1;
		int min=100;
		
		for(int i=0; i<num.length; i++) {
			num[i]=(int)(Math.random()*100)+1;
			System.out.print(num[i]+" ");
		}
		for(int i=0; i<num.length; i++) {
			if(max<num[i]) {
				max=num[i];
			}
			if(min>num[i]){
				min=num[i];
			}
		}
		System.out.println();
		System.out.println("최솟값:"+min);
		System.out.println("최대값:"+max);
		
	}
	
	public void test3() {
		byte num[]= new byte[10];
		Random r = new Random();
		int sum=0;
		
		for(int i=0; i<num.length; i++) {
			num[i]=(byte)(r.nextInt(10)+1);
			System.out.print(num[i] + " ");
			
			if(num[i]%2==0) {
				sum+=num[i];
			}
		}
		System.out.println();
		
		if(num[0]%2==0) {
			System.out.println("sum:"+sum);
		}
	}
	public void test4() {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		
		System.out.print("문자열을 입력하세요:");
		String str = sc.next();
		System.out.print("입력한 문자열:");
		
		if(str!=null && str.length()>0) {
			for(int i=0; i<str.length(); i++) {
				String s = str.substring(i,i+1);
				System.out.print(s+" ");
				int num= Integer.parseInt(s);
				
				sum += num;
			}
			System.out.println();
			System.out.println("합계:"+sum);
		}else {
			System.out.println("입력된 문자열이 없습니다.");
		}
	}
	public void test5() {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		
		System.out.print("문자열을 입력하세요:");
		String str = sc.next();
		System.out.print("입력한 문자열:");
		
		if(str!=null && str.length()>0) {
			for(int i=0; i<str.length(); i++) {
				System.out.print(((int)str.charAt(i)-48)+" ");
				sum += (int)str.charAt(i)-48;
			}
			
		}else {
			System.out.println("입력된 문자열이 없습니다.");
		}
		System.out.println();
		System.out.println("합계:"+sum);
	}
	

}
