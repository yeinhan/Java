package com.test.chap05_medthod.test02;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticMethodTest test = new NonStaticMethodTest();
		//매개변수 x 반환값 x
		test.method1();
		
		//매개변수 x 반환값 o 
//		String res = test.method2();
//		System.out.println(res);
		System.out.println(test.method2());
		
		//매개변수 o, 반환값 x
		test.method3(10,20);
		
		//매개변수 o, 반환값 o
		int res1 = test.method4(10, 20);
		System.out.println(res1);
		System.out.println("res1: "+test.method4(20, 20));
		System.out.println("===============================");
		StaticMethodTest.staticMethod1();
		System.out.println("합은 "+StaticMethodTest.staticMethod2());
		StaticMethodTest.staticMethod3("한예인");
		System.out.println(StaticMethodTest.staticMethod4("둘예인"));
		
		
	}

}
