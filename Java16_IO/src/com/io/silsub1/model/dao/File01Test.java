package com.io.silsub1.model.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class File01Test {
	public static void main(String[] args) {
		File01Test test = new File01Test();
//		test.fileSave();
		test.FileRead();
	}
	
	
	public void fileSave() {
	
		BufferedReader br = null;
		FileWriter fw = null;
		String val="";
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("파일명 입력:");
			val = br.readLine();
			System.out.println("파일명:"+val);
			fw = new FileWriter(val);
			
			
			
			String str=null;
			while(true) {
				System.out.print("파일에 저장할 내용 입력:");
				str= br.readLine();
				

				
				char[] car=str.toCharArray();
				
				if(!str.equals("exit")) {
					fw.write(car);
					
				}else {
					System.out.println("파일에 성공적으로 저장!");
					break;
				}
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			try {
				fw.close();
				br.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	public void FileRead() {
//		BufferedReader br = null;
//		FileReader fr = null;
		
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
			System.out.print("찾을 파일 명 입력하세요:");
			String name = br.readLine();
			FileReader fr = new FileReader(name);
			
			int value;
			StringBuilder sb = new StringBuilder();
			while((value=fr.read())!=-1) {
				sb.append((char)value);	//char형으로 변환해서 sb에 저장
		
			}
			
			String str =null;
			str = sb.toString();	//String으로 변환
			System.out.println(str);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		try {
//			br = new BufferedReader(new InputStreamReader(System.in));
//			
//			System.out.print("읽을 파일 이름 입력:");
//			String fileName = br.readLine();
//			fr = new FileReader(fileName);
//			
//			int value;
//			
//			StringBuilder sb = new StringBuilder();
//			while((value=fr.read())!=-1) {
//				sb.append((char)value);
//			}
//			String str = sb.toString();
//			System.out.println(str);
//
//		}catch(IOException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				br.close();
//				fr.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	}
		
}
