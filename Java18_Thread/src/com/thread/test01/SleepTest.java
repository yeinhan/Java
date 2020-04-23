package com.thread.test01;

public class SleepTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<50; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("☞");
		}
	}

}
