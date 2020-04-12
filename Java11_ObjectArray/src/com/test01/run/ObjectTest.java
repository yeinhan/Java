package com.test01.run;

import java.util.Scanner;
import com.test01.mode.Book;

public class ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book bk1 = new Book("자바의 정석","홍길동","나무",27000);
		Book bk2 = new Book("C언어의 정석","홍길은","kh",13000);
		Book bk3 = new Book("프로그래밍","홍길금","꽃",20000);
		
		//출력
		System.out.println(bk1.info());
		System.out.println(bk2.info());
		System.out.println(bk3.info());
		
		//도서검색
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 제목 입력:");
		String sTitle = sc.nextLine();
		
		if(bk1.getTitle().equals(sTitle)) {
			System.out.println(bk1.info());
		}else if(bk2.getTitle().equals(sTitle)) {
			System.out.println(bk2.info());
		}else {
			System.out.println(bk3.info());
		}
	}

}
