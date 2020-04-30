package com.test.io.part03_addStream.ch02_buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class TestStream{
	public void output() {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("sampllle2.txt"));){
			
			bw.write("안녕하세요");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void input() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("sampllle2.txt"));
			String str = "";
			
			try {
				while((str=br.readLine())!=null) {
					System.out.println(str);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
//public class TestStream {
//	public void output() {
//		//new 보조스트림(new 보조스트림(new 기반(외부자원)));
//		
//		try(BufferedWriter bw = new BufferedWriter(new FileWriter("sample2.txt"));) {
//			bw.write("안녕하세요\n");
//			bw.write("반갑습니다.\n");
//			bw.write("반갑습니다2222222.\n");
//			
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	public void input() {
//		//trywithresource
//		
//		try (BufferedReader br = new BufferedReader(new FileReader("sample2.txt"));){
//			
//			String tmp;
//			while((tmp=br.readLine()) !=null ) {	//null이 아닐경우에 데이터 가져옴
//				System.out.println(tmp);
//			}
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//	}
//}
