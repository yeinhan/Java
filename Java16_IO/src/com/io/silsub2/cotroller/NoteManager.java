package com.io.silsub2.cotroller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NoteManager {
	private Scanner sc=null;
	String yn = "";
	public void fileSave() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			FileWriter fw = new FileWriter("silsub2.txt");
			
			String str = null;
			do {
				System.out.print("파일에 저장할 내용을 입력하세요:");
				str = br.readLine();
				
				char[] ch =  str.toCharArray();
				
				if(ch.equals("exit")) {
					break;
				}
				System.out.print("저장하시겠습니까? (y/n)");
				yn = sc.nextLine();
				if(yn.equals("n")||yn.equals("N"))
					break;
				
			}while(yn.equals("Y")||yn.equals("y"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void fileOpen() {
		
	}
}
