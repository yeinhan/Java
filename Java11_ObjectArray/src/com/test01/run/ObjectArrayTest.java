package com.test01.run;

import java.util.Scanner;

import com.test01.mode.Book;

public class ObjectArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		//객체 배열 선언 및 할당
//		Book[] bk = new Book[3];
//		//초기화
//		bk[0]=new Book();
//		bk[1]=new Book();
//		bk[2]= new Book();
		
		Book[] bk = {
				new Book("자바의 정석","홍길동","나무",27000),
				new Book("C언어의 정석","홍길은","kh",13000),
				new Book("프로그래밍","홍길금","꽃",13000)};
		
//		System.out.println(bk);
//		System.out.println(bk[0]);
//		System.out.println(bk[0].getPublisher());
		
		//도서 출력
		System.out.println("도서 갯수:"+bk.length);
		//도서정보출력
		for(int i=0; i<bk.length; i++ ) {
			System.out.println(bk[i].info());
		}
		
		//도서 검색
		Scanner sc= new Scanner(System.in);
		System.out.print("검색할 책 제목: ");
		String sTitle = sc.nextLine();
		
		for(int i=0; i<bk.length; i++) {
			if(bk[i].getTitle().contentEquals(sTitle)) {
				System.out.println(bk[i].info());
			}
		}
		
	}

}
