package com.io.silsub2.cotroller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.io.silsub2.model.dao.NoteDao;

public class NoteManager {
	private Scanner sc= new Scanner(System.in);
//	String yn = "";
	public void fileSave() {
		StringBuilder sb= new StringBuilder();
		
		System.out.print("파일에 저장할 내용을 입력");
		
		while(true) {
			String s = sc.nextLine();
			if(s.equals("exit")) {
				break;
			}
			sb.append(s+"\n");
		}
		System.out.print("저장하시겠습니까?(y/n): ");
		char yn = sc.nextLine().toUpperCase().charAt(0);
		if(yn=='Y') {
			System.out.print("저장할 파일명 입력: ");
			String fileName = sc.nextLine();
			
			NoteDao nd = new NoteDao();
			nd.fileSave(sb, fileName);
		}else {
			System.out.println("저장하지 않고 메뉴로 돌아갑니다.");
			return;
		}
		
//		do {
//			System.out.print("파일에 저장할 내용을 입력하시오:");
//			
//			String s = sc.nextLine();
//			
//			if(s.equals("exit")) {
//				System.out.print("저장하시겠습니까?(y/n): ");
//				char yn = sc.nextLine().toUpperCase().charAt(0);
//				if(yn=='Y') {
//					System.out.print("저장할 파일명을 입력하세요:");
//					String fileName = sc.nextLine();
//					
//					try {
//						FileWriter fw =new FileWriter(fileName);
//						NoteDao nd = new NoteDao();
//						nd.fileSave(sb, fileName);
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}else {
//					System.out.println("저장하지 않고 메뉴로 돌아갑니다.");
//					break;
//				}
//				
//			}else {
//				sb.append(s+ "\n");
//			}
//		}while(true);
		
		
		
		
		
		
//		try {
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			FileWriter fw = new FileWriter("silsub2.txt");
//			
//			String str = null;
//			do {
//				System.out.print("파일에 저장할 내용을 입력하세요:");
//				str = br.readLine();
//				
//				char[] ch =  str.toCharArray();
//				
//				if(ch.equals("exit")) {
//					break;
//				}
//				System.out.print("저장하시겠습니까? (y/n)");
//				yn = sc.nextLine();
//				if(yn.equals("n")||yn.equals("N"))
//					break;
//				
//			}while(yn.equals("Y")||yn.equals("y"));
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	public void fileOpen(String fileName) {
		System.out.print("열기 할 파일명을 입력하세요:");
		fileName = sc.nextLine();
		StringBuilder sb = new NoteDao().fileOpen(fileName);
		System.out.println(sb);
		
	}
}
