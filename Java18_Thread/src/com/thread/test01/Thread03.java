package com.thread.test01;

public class Thread03 {
	public static void main(String[] args) {
		
		MyThread02 m1 =new MyThread02("야옹");
		MyThread02 m2 = new MyThread02("멍멍");
		
		long start_time = System.currentTimeMillis();
		
		m1.start();
		try {
			m1.join();
			//m1 thread가 종료 될 때까지
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		m2.start();
		long end_time=System.currentTimeMillis();
		
		System.out.println("실행시간: "+ (end_time-start_time));
		
	}
}
