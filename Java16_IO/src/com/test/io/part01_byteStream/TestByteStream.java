package com.test.io.part01_byteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestByteStream {
	public void fileSave() {
		FileOutputStream fout = null;	//파일로부터 바이트 단위로 저장! 할 때 사용
		
		try {
			fout = new FileOutputStream("sample.txt");
			//대상 파일이 존재 하지 않으면 자동으로 파일을 만든다.
			fout.write(97);	//97바이트 보냄
			byte[] bar = {98,99,100,101,102,10};
			fout.write(bar);
			fout.write(bar, 1, 3);
			
		} catch (FileNotFoundException e) {	//파일이 존재하지 않으면
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	}
	
	public void fileOpen() {
		FileInputStream fin = null;	//파일로부터 바이트 단위로 읽을! 때 사용
		
		try {
			fin = new FileInputStream("sample.txt");
			int fileSize = (int)new File("sample.txt").length();
			System.out.println(fileSize);
			
			//파일을 읽어서 저장할 파일 크기 만큼의 byte 배열 선언
			byte[] bar = new byte[fileSize];
			
			fin.read(bar);
			
			for(int i=0; i<bar.length; i++) {
				//System.out.print(bar[i]+" ");
				System.out.print(  (char)bar[i]+ " ");
			}
			
	
			for(int i=0; i<15; i++) {
				System.out.print( fin.read()+" " );
			}
			
//			int no;
//			while( (no = fin.read()) != -1) {
//				System.out.print((char)no+" ");
//			}
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
