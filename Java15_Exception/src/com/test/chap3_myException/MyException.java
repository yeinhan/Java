package com.test.chap3_myException;

public class MyException extends Exception{
	//Exception을 상속받아 예외클래스로 선언
	
	public MyException() {
		System.out.println("내가 만든 예외 클래스!");
	}
	
	public MyException(String msg) {
		super(msg);
	}
}
