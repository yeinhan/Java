package com.thread.test01;

class MyThread implements Runnable {
	@Override 
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("i="+i);
			
		}
	}
}

public class Thread01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---- main start ----");
	
		
		for(int i=0; i<10; i++) {
			System.out.println("i= "+ i);
		}
		
		//thread가 아니다.
//		MyThread m1 = new MyThread();
//		m1.run();
		
		MyThread m1 = new MyThread();
		Thread t1 = new Thread(m1);
		t1.start();
		//Thread.start() -> 자동으로 run
		
		System.out.println("---- main stop ---");
	}

}
