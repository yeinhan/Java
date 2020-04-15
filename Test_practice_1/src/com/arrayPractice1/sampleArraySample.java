package com.arrayPractice1;

public class sampleArraySample {
	public void test1()	{
		int sum=0;
		
		int num[]	= new int[10];
		for(int i=0; i<num.length; i++) {
			num[i]=(int)(Math.random()*100)+1;
			System.out.print(num[i]+" ");
		}
		for(int i=0; i<num.length; i++) {
			sum+=num[i];
		}
		System.out.println();
		System.out.println("합계:"+sum);
	}
}
