package com.test01.bbb;

import com.test01.aaa.AAA;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BBB test = new BBB();
		
		test.setAbc(1);
		test.setB(2);
		
		System.out.println(test.getAbc()+"+"+test.getB()+"="+test.getSum());
		
		BBB b2 = new BBB(3);
		b2.setB(4);
		System.out.println(b2.getAbc()+"+"+b2.getB()+"="+b2.getSum());
		
		BBB b3 = new BBB(5,6);
		System.out.println(b3.getAbc()+"+"+b3.getB()+"="+b3.getSum());
		
		System.out.println("----------------------------");
		
		AAA a = new AAA();
		BBB b = new BBB();
		
		a.prn();
		b.prn();
		
	}

}
