package com.arrayPractice1.sample;

import java.util.Random;

public class ArraySample {
	public void test1() {
		int[] num = new int[10];
		int sum=0;
		
		for(int i=0; i<10; i++) {
			num[i] = (int)(Math.random()*100)+1;
			System.out.print(num[i]+" ");
			sum += num[i];
		}
		System.out.println();
		System.out.println("합:"+sum);
	}
	public void test2() {
		int num[] = new int[10];
		int max=0;
		int min=100;
		for(int i=0; i<10; i++) {
			num[i] = (int)(Math.random()*100)+1;
			System.out.print(num[i]+" ");
		}
		for(int i=0; i<10; i++) {
			if(min>num[i]) {
				min = num[i];
			}
			if(num[i]>max) {
				max  = num[i];
			}
		}
		System.out.println();
		System.out.println("최댓값:"+max+" 최솟값:"+min);
	}
	public void test3() {
		byte[] num = new byte[10];
		Random r = new Random();
		
		for(int i=0; i<num.length; i++) {
			num[i] = (byte)(r.nextInt(10)+1);
		}
	}
}
