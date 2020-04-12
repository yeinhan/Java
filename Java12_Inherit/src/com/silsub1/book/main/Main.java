package com.silsub1.book.main;

import com.silsub1.book.model.vo.Book;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("인생은 실전이다","한예인",15000);
		Book b2 = new Book("인생은 실전이 아니다","둘예인",16000);
		
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println("b1과 b2는 같은 객채? "+ b1.equals(b2));
		
		//얕은 복사
		Book b3 = b1;
		System.out.println("b1과 b3는 같은 객체? " +b1.equals(b3));
		
		Book b4 = new Book("인생은 실전이다","한예인",15000);
		System.out.println("b1과 b4는 같은 객체? " +b1.equals(b4));
		
		System.out.println("b1의 hashcode: "+b1.hashCode());
		System.out.println("b4의 hashcode: "+b4.hashCode());
		System.out.println("b2의 hashcode: "+b2.hashCode());
	
	}

}
