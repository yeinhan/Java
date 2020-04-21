package com.io.silsub2.view;

import java.util.Scanner;

import com.io.silsub2.cotroller.NoteManager;

public class NoteMenu {
	private String fileName;

	public void menu() {
		NoteManager nm = new NoteManager();
		Scanner sc = new Scanner(System.in);

		System.err.println("******MyNote******");
		
		do {
			System.out.println("1.노트 새로 만들기");
			System.out.println("2.노트 열기");
			System.out.println("3.끝내기");
			
			System.out.print("메뉴선택:");
			int num = sc.nextInt();
				
			switch(num) {
			case 1:
				nm.fileSave();
				break;
			case 2:
				nm.fileOpen(fileName);
				break;
				
			case 3:
				System.out.println("종료~"); return;
				default:
					System.out.println("번호를 잘못 입력했습니다");
					System.out.println("다시 선택하세용");
					continue;
			}
			
		}while(true);
	}
}
