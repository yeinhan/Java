package com.test.io.fileTest;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) {
		File file = new File("person.txt");
		
		System.out.println("파일명: " + file.getName());
		System.out.println("저장경로: "+ file.getPath());
		System.out.println("저장경로: "+ file.getAbsolutePath());
		System.out.println("파일용량: "+ file.length());
		
		try {
			//파일이 없을 경우 파일 생성하고 true값 리턴
			//파일이 있는 경우는 false를 리턴
			boolean b = file.createNewFile();	//새로운 파일 생성
			System.out.println(b);
			
			boolean b2 = file.delete();	//파일 또는 디렉토리 삭제
			System.out.println(b2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
