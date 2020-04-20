package com.io.silsub2.view;

import java.util.Scanner;

import com.io.silsub2.cotroller.NoteManager;

public class NoteMenu {
	public void menu() {
		NoteManager nm = new NoteManager();
		Scanner sc = new Scanner(System.in);
		System.err.println("******MyNote******");
		System.out.println("1.노트 새로 만들기");
		System.out.println("2.노트 열기");
		System.out.println("3.끝내기");
		
		System.out.print("메뉴선택:");
		int num = sc.nextInt();
		
		do {
			if(num==1) {
				
			}else if(num==2) {
				
			}else if(num==3) {
				break;
			}
			
		}while(true);
	}
}
