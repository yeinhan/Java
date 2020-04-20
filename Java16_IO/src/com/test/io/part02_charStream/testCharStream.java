package com.test.io.part02_charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class testCharStream {
	public void fileSave() {
		FileWriter fw = null;	//텍스트 파일로부터 문자 단위로 저장할 때 사용
		
		try {
			fw = new FileWriter("sample.txt");
			fw.write("비가 안와");
			fw.write('A');
			fw.write(' ');
			char[] carr = {'a','b','c','d'};
			fw.write(carr);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	}
	public void fileOpen() {
		FileReader fr = null;
		
		try {
			fr = new FileReader("sample.txt");
			int val;
			while((val=fr.read()) !=-1 ) {
				System.out.print((char)val);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
