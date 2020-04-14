package com.test.chap04_wrapperClass;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// boxing : 기본자료형 --> wrapper 클래스 객체
		// unboxing: wrapper 클래스 객체 --> 기본자료형

		// boxing
		Integer i = new Integer(10);
		Integer i2 = new Integer(15);
		Double d = new Double(10.0);

		System.out.println(i.equals(i2));
		System.out.println(i.compareTo(i2)); // 0-> 같을때, 양수면 i가 큰수일때, 음수면 i2가 큰수일떄

		// AutoBoxting
		Short i3 = 10;
		Integer i4 = 5;
		// Integer i4 = new Integer(5);

		// UnBoxting
		int pi = i.intValue();
		double pd = d.doubleValue();

		// AutoUnboxing
		int a = i;
		int b = i2;
		System.out.println(a + b);

		abox(a + b);
		// int >> (autoboxing) >> Integer >> Object

	}

	public static void abox(Object obj) {
//		System.out.println((int)obj);
		System.out.println((Integer) obj);
	}

}
